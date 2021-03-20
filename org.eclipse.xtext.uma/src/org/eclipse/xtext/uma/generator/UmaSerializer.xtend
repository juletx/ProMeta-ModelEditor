package org.eclipse.xtext.uma.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.epf.uma.MethodLibrary
import org.eclipse.epf.uma.Role
import org.eclipse.epf.uma.MethodConfiguration

import static extension org.eclipse.emf.common.util.URI.createPlatformResourceURI
import org.eclipse.epf.uma.RoleSet
import org.eclipse.epf.uma.DeliveryProcess
import org.eclipse.epf.uma.Phase
import org.eclipse.epf.uma.Iteration
import org.eclipse.epf.uma.CapabilityPattern
import org.eclipse.epf.uma.Activity
import org.eclipse.epf.uma.TaskDescriptor
import org.eclipse.epf.uma.WorkProductDescriptor

class UmaSerializer extends AbstractGenerator {

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("openup.sql", input.compile)
		serialize(input.toOutputURI, (input.contents.head as MethodLibrary))
	}

	private def serialize(URI outputURI, MethodLibrary methodLibrary) {
		val resource = new XtextResourceSet().createResource(outputURI)
		resource.contents += methodLibrary
		resource.save(newHashMap)
	}

	private def toOutputURI(Resource input) {
		val inputUri = input.URI
		val outputUri = inputUri.trimFileExtension.appendFileExtension("umal")
		var outputPath = outputUri.toPlatformString(true)
		outputPath.createPlatformResourceURI(true)
	}
	
	def Iterable<MethodConfiguration> getMethodConfigurations(Resource input) {
		return input.allContents.toIterable.filter(MethodConfiguration)
	}
	
	def Iterable<RoleSet> getRoleSets(Resource input) {
		return input.allContents.toIterable.filter(RoleSet).reject[roles.isEmpty]
	}
	
	def Iterable<Role> getRoles(RoleSet input) {
		return input.roles.reject[presentationName.isEmpty]
	}
	
	def Iterable<DeliveryProcess> getDeliveryProcesses(Resource input) {
		return input.allContents.toIterable.filter(DeliveryProcess).reject[name=="abrd_governance" || name=="abrd_process" || name=="openUp_abrd"]
	}
	
	def Iterable<Phase> getPhases(Resource input) {
		return input.allContents.toIterable.filter(Phase).reject[briefDescription.isEmpty]
	}
	
	def Iterable<Activity> getActivities(Iteration iteration) {
		if (iteration.variabilityBasedOnElement instanceof CapabilityPattern) {
			val capabilityPattern = iteration.variabilityBasedOnElement as CapabilityPattern
			return capabilityPattern.breakdownElements.filter(Activity).
		}
		else {
			return iteration.breakdownElements.filter(Activity)
		}
	}
	
	def Iterable<TaskDescriptor> getTaskDescriptors(Activity activity) {
		if (activity.variabilityBasedOnElement instanceof CapabilityPattern) {
			val capabilityPattern = activity.variabilityBasedOnElement as CapabilityPattern
			return capabilityPattern.breakdownElements.filter(TaskDescriptor)
		}
		else {
			return activity.breakdownElements.filter(TaskDescriptor)
		}
	}
	
	def Iterable<WorkProductDescriptor> getWorkProductDescriptors(TaskDescriptor taskDescriptor) {
		return taskDescriptor.output
	}
	
	def compile(Resource input) '''
		�FOR methodConfiguration: input.getMethodConfigurations�
		INSERT INTO method_configurations VALUES (
			"�methodConfiguration.guid�",
			"�methodConfiguration.name�",
			"�methodConfiguration.presentationName�",
			"�methodConfiguration.briefDescription�",
			"�methodConfiguration.version�"
		);
		�ENDFOR�
		
		�FOR roleSet: input.getRoleSets�
		INSERT INTO role_sets VALUES (
			"�roleSet.guid�",
			"�roleSet.name�",
			"�roleSet.presentationName�",
			"�roleSet.briefDescription�"
		);
		
		��� BEFORE "(\n" SEPARATOR "\n),(" AFTER ");\n"
		�FOR role: roleSet.getRoles� 
		INSERT INTO roles VALUES (
			"�role.guid�",
			"�role.name�",
			"�role.presentationName�",
			"�role.briefDescription.replaceAll("\"","\\\\\"")�",
			"�roleSet.guid�"
		);
		
		�ENDFOR�
		
		�ENDFOR�
		
		�FOR deliveryProcess: input.deliveryProcesses�
		INSERT INTO delivery_processes VALUES (
			"�deliveryProcess.guid�",
			"�deliveryProcess.name�",
			"�deliveryProcess.presentationName�",
			"�deliveryProcess.briefDescription�",
			"�deliveryProcess.defaultContext.guid�"
		);
		
		�FOR phase: deliveryProcess.breakdownElements.filter(Phase)�
		INSERT INTO phases VALUES (
			"�phase.guid�",
			"�phase.name�",
			"�phase.presentationName�",
			"�phase.briefDescription�",
			"�deliveryProcess.guid�"
		);
		
		�FOR iteration: phase.breakdownElements.filter(Iteration)�
		INSERT INTO iterations VALUES (
			"�iteration.guid�",
			"�iteration.name�",
			"�iteration.variabilityBasedOnElement.presentationName�",
			"�iteration.variabilityBasedOnElement.briefDescription�",
			"�phase.guid�"
		);
		
		�FOR activity: iteration.getActivities�
		INSERT INTO activities VALUES (
			"�activity.guid�",
			"�activity.name�",
			"�activity.variabilityBasedOnElement.presentationName�",
			"�activity.variabilityBasedOnElement.briefDescription�"
		);
		
		INSERT INTO iteration_activities VALUES (
			"�iteration.guid�",
			"�activity.guid�"
		);
		
		�FOR taskDescriptor: activity.getTaskDescriptors�
		INSERT INTO tasks VALUES (
			"�taskDescriptor.guid�",
			"�taskDescriptor.name�",
			"�taskDescriptor.presentationName�",
			"�taskDescriptor.briefDescription.replaceAll("\"","\\\\\"")�",
			"�activity.guid�",
			NULL
		);
		
		�FOR section: taskDescriptor.selectedSteps�
		INSERT INTO sections VALUES (
			"�section.guid�",
			"�section.name�",
			"�section.name�",
			"�section.sectionDescription.replaceAll("\"","\\\\\"")�",
			"�taskDescriptor.guid�"
		);
		
		�FOR workProductDescriptor: taskDescriptor.output�
		INSERT INTO artifacts VALUES (
			"�workProductDescriptor.guid�",
			"�workProductDescriptor.name�",
			"�workProductDescriptor.presentationName�",
			"�workProductDescriptor.briefDescription�"
		);
		
		INSERT INTO task_artifacts VALUES (
			"�taskDescriptor.guid�",
			"�workProductDescriptor.guid�"
		);
		�ENDFOR�
		�ENDFOR�
		�ENDFOR�
		�ENDFOR�
		�ENDFOR�
		�ENDFOR�
		�ENDFOR�
		'''
}