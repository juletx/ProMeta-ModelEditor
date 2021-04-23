package org.eclipse.xtext.uma.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.epf.uma.Activity
import org.eclipse.epf.uma.Artifact
import org.eclipse.epf.uma.CapabilityPattern
import org.eclipse.epf.uma.Deliverable
import org.eclipse.epf.uma.DeliveryProcess
import org.eclipse.epf.uma.Discipline
import org.eclipse.epf.uma.Domain
import org.eclipse.epf.uma.GuidanceDescription
import org.eclipse.epf.uma.Iteration
import org.eclipse.epf.uma.MethodConfiguration
import org.eclipse.epf.uma.MethodLibrary
import org.eclipse.epf.uma.Phase
import org.eclipse.epf.uma.Practice
import org.eclipse.epf.uma.Role
import org.eclipse.epf.uma.RoleSet
import org.eclipse.epf.uma.Section
import org.eclipse.epf.uma.Task
import org.eclipse.epf.uma.TaskDescriptor
import org.eclipse.epf.uma.Template
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.XtextResourceSet

import static extension org.eclipse.emf.common.util.URI.createPlatformResourceURI

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
		return input.allContents.toIterable.filter(MethodConfiguration).reject[name=="all_epf_practices"]
	}
	
	def Iterable<RoleSet> getRoleSets(Resource input) {
		return input.allContents.toIterable.filter(RoleSet).reject[roles.isEmpty]
	}
	
	def Iterable<Role> getRoles(RoleSet roleSet) {
		return roleSet.roles.reject[presentationName.isEmpty]
	}
	
	def Iterable<Role> getRoles(Resource input) {
		return input.allContents.toIterable.filter(Role).reject[responsibleFor.isEmpty]
	}
	
	def Iterable<DeliveryProcess> getDeliveryProcesses(Resource input) {
		return input.allContents.toIterable.filter(DeliveryProcess)
	}
	
	def Iterable<Phase> getPhases(Resource input) {
		return input.allContents.toIterable.filter(Phase).reject[briefDescription.isEmpty]
	}
	
	def Iterable<Domain> getDomains(Resource input) {
		return input.allContents.toIterable.filter(Domain).filter[equals(variabilityBasedOnElement)]
	}
	
	def Iterable<Discipline> getDisciplines(Resource input) {
		return input.allContents.toIterable.filter(Discipline).filter[equals(variabilityBasedOnElement)]
	}
	
	def Iterable<Practice> getPractices(Resource input) {
		return input.allContents.toIterable.filter(Practice).reject[briefDescription.isEmpty]
	}
	
	def Iterable<Activity> getActivities(Resource input) {
		return input.allContents.toIterable.filter(Activity).reject(DeliveryProcess).reject(Phase).reject(CapabilityPattern).reject(Iteration)
	}
	
	def Iterable<Activity> getActivities(Phase phase) {
		return phase.breakdownElements.filter(Activity).reject(Iteration).reject(CapabilityPattern)
	}
	
	def Iterable<Activity> getActivities(Iteration iteration) {
		if (iteration.variabilityBasedOnElement instanceof CapabilityPattern) {
			val capabilityPattern = iteration.variabilityBasedOnElement as CapabilityPattern
			return capabilityPattern.breakdownElements.filter(Activity).reject(CapabilityPattern)
		}
		else {
			return iteration.breakdownElements.filter(Activity).reject(CapabilityPattern)
		}
	}
	
	def Iterable<TaskDescriptor> getTaskDescriptors(Phase phase) {
		return phase.breakdownElements.filter(TaskDescriptor)
	}
	
	def Iterable<TaskDescriptor> getTaskDescriptors(Iteration iteration) {
		return iteration.breakdownElements.filter(TaskDescriptor)
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
	
	def Iterable<Task> getTasks(Resource input) {
		return input.allContents.toIterable.filter(Task).filter[performedBy.isEmpty]
	}
	
	def Iterable<Task> getTasksRole(Resource input) {
		return input.allContents.toIterable.filter(Task).reject[performedBy.isEmpty]
	}
	
	def Iterable<Section> getSections(Task task) {
		if (task.presentation !== null) {
			return task.presentation.sections
		}
		else {
			return newArrayList
		}
	}
	
	def Iterable<Artifact> getArtifacts(Resource input) {
		return input.allContents.toIterable.filter(Artifact).reject[presentationName.isEmpty]
	}
	
	def Iterable<Template> getTemplates(Resource input) {
		return input.allContents.toIterable.filter(Template)
	}
	
	def Iterable<Deliverable> getDeliverables(Resource input) {
		return input.allContents.toIterable.filter(Deliverable)
	}
	
	def Domain getDomain(Resource input, Artifact artifact) {
		val domain = input.allContents.toIterable.filter(Domain).filter[workProducts.contains(artifact)].head
		if (domain !== null) {
			return domain.variabilityBasedOnElement as Domain
		}
		else {
			return null
		}
	}
	
	def Domain getDomain(Resource input, Deliverable deliverable) {
		val domain = input.allContents.toIterable.filter(Domain).filter[workProducts.contains(deliverable)].head
		if (domain !== null) {
			return domain.variabilityBasedOnElement as Domain
		}
		else {
			return null
		}
	}
	
	def Discipline getDiscipline(Resource input, Task task) {
		val discipline = input.allContents.toIterable.filter(Discipline).filter[tasks.contains(task)].head
		if (discipline !== null) {
			return discipline.variabilityBasedOnElement as Discipline
		}
		else {
			return null
		}
	}
	
	def String getAttachments(Template template) {
		val presentation = template.presentation as GuidanceDescription
		return presentation.attachments
	}
	
	def compile(Resource input) '''
		«FOR methodConfiguration: input.getMethodConfigurations»
		INSERT INTO methodologies VALUES (
			"«methodConfiguration.guid»",
			"«methodConfiguration.name»",
			"«methodConfiguration.presentationName»",
			"«methodConfiguration.briefDescription»",
			"«methodConfiguration.version»"
		);
		«ENDFOR»
		
		«FOR roleSet: input.getRoleSets»
		INSERT INTO role_sets VALUES (
			"«roleSet.guid»",
			"«roleSet.name»",
			"«roleSet.presentationName»",
			"«roleSet.briefDescription»",
			«IF roleSet.name == "brd_role_set"»
			"_PFU-AMVeEd2n6fDcl3UsZg"
			«ELSE»
			"_QN3nQBEHEdyM7Iu0sxfrPA"
			«ENDIF»
		);
		
		«FOR role: roleSet.getRoles» 
		INSERT INTO roles VALUES (
			"«role.guid»",
			"«role.name»",
			"«role.presentationName»",
			"«role.briefDescription.replaceAll("\"","\\\\\"")»",
			"«roleSet.guid»"
		);
		
		«ENDFOR»
		
		«ENDFOR»
		
		«FOR practice: input.getPractices»
		INSERT INTO practices VALUES (
			"«practice.guid»",
			"«practice.name»",
			"«practice.presentationName»",
			"«practice.briefDescription.replaceAll("\"","\\\\\"")»",
			«IF practice.name == "abrd"»
			"_PFU-AMVeEd2n6fDcl3UsZg"
			«ELSE»
			"_QN3nQBEHEdyM7Iu0sxfrPA"
			«ENDIF»
		);
		«ENDFOR»
		
		«FOR domain: input.getDomains»
		INSERT INTO domains VALUES (
			"«domain.guid»",
			"«domain.name»",
			"«domain.presentationName»",
			"«domain.briefDescription.replaceAll("\"","\\\\\"")»",
			«IF domain.briefDescription.isEmpty || domain.name == "brd_domains"»
			"_PFU-AMVeEd2n6fDcl3UsZg"
			«ELSE»
			"_QN3nQBEHEdyM7Iu0sxfrPA"
			«ENDIF»
		);
		
		«ENDFOR»
		
		«FOR template: input.getTemplates»
		INSERT INTO templates VALUES (
			"«template.guid»",
			"«template.name»",
			"«template.presentationName»",
			"«template.briefDescription.replaceAll("\"","\\\\\"")»",
			"«template.getAttachments»"
		);
		«ENDFOR»
		
		«FOR artifact: input.getArtifacts»
		INSERT INTO artifacts VALUES (
			"«artifact.guid»",
			"«artifact.name»",
			"«artifact.presentationName»",
			"«artifact.briefDescription.replaceAll("\"","\\\\\"")»",
			«IF getDomain(input, artifact) !== null»
			"«getDomain(input, artifact).guid»",
			«ELSE»
			NULL,
			«ENDIF»
			«IF !artifact.templates.isEmpty»
			"«artifact.templates.head.guid»"
			«ELSE»
			NULL
			«ENDIF»		
		);	
		«ENDFOR»
		
		«FOR artifact: input.getDeliverables»
		INSERT INTO artifacts VALUES (
			"«artifact.guid»",
			"«artifact.name»",
			"«artifact.presentationName»",
			"«artifact.briefDescription.replaceAll("\"","\\\\\"")»",
			«IF getDomain(input, artifact) !== null»
			"«getDomain(input, artifact).guid»",
			«ELSE»
			NULL,
			«ENDIF»
			NULL
		);
		«ENDFOR»
		
		«FOR role: input.getRoles»
		«FOR artifact: role.responsibleFor»
		«IF artifact.guid !== "" && !artifact.guid.equals("_Wn7HcNcEEdqz_d2XWoVt6Q")»
		INSERT INTO role_artifacts VALUES (
			"«role.variabilityBasedOnElement.guid»",
			"«artifact.guid»"
		);
		«ENDIF»
		«ENDFOR»
		«ENDFOR»
		INSERT INTO role_artifacts VALUES (
			"_0VxJsMlgEdmt3adZL5Dmdw",
			"_Wn7HcNcEEdqz_d2XWoVt6Q"
		);
		
		«FOR discipline: input.getDisciplines»
		INSERT INTO disciplines VALUES (
			"«discipline.guid»",
			"«discipline.name»",
			"«discipline.presentationName»",
			"«discipline.briefDescription.replaceAll("\"","\\\\\"")»",
			«IF discipline.briefDescription.isEmpty || discipline.name == "brd_disciplines" || discipline.name.startsWith("rule")»
			"_PFU-AMVeEd2n6fDcl3UsZg"
			«ELSE»
			"_QN3nQBEHEdyM7Iu0sxfrPA"
			«ENDIF»
		);
		«ENDFOR»
		
		«FOR task: input.getTasks»
		INSERT INTO tasks VALUES (
			"«task.guid»",
			"«task.name»",
			"«task.presentationName»",
			"«task.briefDescription.replaceAll("\"","\\\\\"")»",
			«IF getDiscipline(input, task) !== null»
			"«getDiscipline(input, task).guid»"
			«ELSE»
			NULL
			«ENDIF»
		);
		
		«FOR section: task.getSections»
		INSERT INTO task_sections VALUES (
			"«section.guid»",
			"«section.name.replaceAll("\"","\\\\\"")»",
			"«section.name.replaceAll("\"","\\\\\"")»",
			"«section.sectionDescription.replaceAll("\"","\\\\\"")»",
			"«task.guid»"
		);
		«ENDFOR»
		
		«FOR artifact: task.mandatoryInput»
		INSERT INTO input_artifacts VALUES (
			"«task.guid»",
			"«artifact.guid»"
		);
		«ENDFOR»
		
		«FOR artifact: task.output»
		INSERT INTO output_artifacts VALUES (
			"«task.guid»",
			"«artifact.guid»"
		);
		«ENDFOR»
		
		«ENDFOR»
		
		«FOR task: input.getTasksRole»
		«FOR role: task.performedBy»
		INSERT INTO role_tasks VALUES (
			"«role.variabilityBasedOnElement.guid»",
			"«task.variabilityBasedOnElement.guid»"
		);
		«ENDFOR»
		«ENDFOR»
		
		«FOR activity: input.getActivities»
		INSERT INTO activities VALUES (
			"«activity.guid»",
			"«activity.name»",
			"«activity.variabilityBasedOnElement.presentationName»",
			"«activity.variabilityBasedOnElement.briefDescription»"
		);
		«ENDFOR»
		
		«FOR deliveryProcess: input.deliveryProcesses»
		INSERT INTO processes VALUES (
			"«deliveryProcess.guid»",
			"«deliveryProcess.name»",
			"«deliveryProcess.presentationName»",
			"«deliveryProcess.briefDescription»",
			«IF deliveryProcess.briefDescription.isEmpty || deliveryProcess.name == "openUp_abrd"»
			"_PFU-AMVeEd2n6fDcl3UsZg"
			«ELSE»
			"_QN3nQBEHEdyM7Iu0sxfrPA"
			«ENDIF»
		);
		
		«FOR phase: deliveryProcess.breakdownElements.filter(Phase)»
		INSERT INTO phases VALUES (
			"«phase.guid»",
			"«phase.name»",
			"«phase.presentationName»",
			"«phase.briefDescription»",
			"«deliveryProcess.guid»"
		);
		
		«FOR iteration: phase.breakdownElements.filter(Iteration)»
		INSERT INTO iterations VALUES (
			"«iteration.guid»",
			"«iteration.name»",
			"«iteration.variabilityBasedOnElement.presentationName»",
			"«iteration.variabilityBasedOnElement.briefDescription»",
			"«phase.guid»"
		);
		
		«FOR activity: iteration.getActivities»
		INSERT INTO iteration_activities VALUES (
			"«iteration.guid»",
			"«activity.guid»"
		);
		
		«FOR taskDescriptor: activity.getTaskDescriptors»
		INSERT INTO activity_tasks VALUES (
			"«activity.guid»",
			"«taskDescriptor.task.guid»"
		);
		«ENDFOR»
		«ENDFOR»
		«FOR taskDescriptor: iteration.getTaskDescriptors»
		INSERT INTO iteration_tasks VALUES (
			"«iteration.guid»",
			"«taskDescriptor.task.guid»"
		);
		«ENDFOR»
		«ENDFOR»
		
		«FOR activity: phase.getActivities»
		INSERT INTO phase_activities VALUES (
			"«phase.guid»",
			"«activity.guid»"
		);
		
		«FOR taskDescriptor: activity.getTaskDescriptors»
		INSERT INTO activity_tasks VALUES (
			"«activity.guid»",
			"«taskDescriptor.task.guid»"
		);
		«ENDFOR»
		
		«ENDFOR»
		
		«FOR taskDescriptor: phase.getTaskDescriptors»
		INSERT INTO phase_tasks VALUES (
			"«phase.guid»",
			"«taskDescriptor.task.guid»"
		);
		«ENDFOR»
		
		«ENDFOR»
		«ENDFOR»
		'''
}