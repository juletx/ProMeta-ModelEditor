/*
 * generated by Xtext 2.24.0
 */
package org.eclipse.xtext.uma.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.uma.services.UmalGrammarAccess
import org.eclipse.epf.uma.Constraint
import org.eclipse.epf.uma.MethodLibrary

class UmalFormatter extends AbstractFormatter2 {
	
	@Inject extension UmalGrammarAccess

	def dispatch void format(MethodLibrary methodLibrary, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (constraint : methodLibrary.ownedRules) {
			constraint.format
		}
		for (methodElementProperty : methodLibrary.methodElementProperty) {
			methodElementProperty.format
		}
		for (methodPlugin : methodLibrary.methodPlugins) {
			methodPlugin.format
		}
		for (methodConfiguration : methodLibrary.predefinedConfigurations) {
			methodConfiguration.format
		}
	}

	def dispatch void format(Constraint constraint, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (_constraint : constraint.ownedRules) {
			_constraint.format
		}
		for (methodElementProperty : constraint.methodElementProperty) {
			methodElementProperty.format
		}
	}
	
	// TODO: implement for Kind, SupportingMaterial, MethodPlugin, MethodConfiguration, ContentDescription, Concept, Checklist, Guideline, Example, ReusableAsset, TermDefinition, Section, ArtifactDescription, WorkProductDescription, DeliverableDescription, RoleDescription, TaskDescription, GuidanceDescription, PracticeDescription, BreakdownElementDescription, ActivityDescription, DeliveryProcessDescription, ProcessDescription, DescriptorDescription, Step, Artifact, WorkProduct, Report, Template, ToolMentor, EstimationConsiderations, Deliverable, Outcome, Whitepaper, Task, Role, RoleSet, Domain, WorkProductType, DisciplineGrouping, Discipline, Activity, Roadmap, Tool, RoleSetGrouping, CustomCategory, Iteration, Phase, DeliveryProcess, CapabilityPattern, ProcessPlanningTemplate, Practice, FulfillableElement, PlanningData, WorkOrder, Milestone, WorkProductDescriptor, TeamProfile, RoleDescriptor, TaskDescriptor, CompositeRole, ProcessComponentDescriptor, ProcessComponentInterface, ProcessComponent, Diagram, ContentPackage, ProcessPackage, Reference, Property, DiagramLink, GraphConnector, GraphNode, GraphEdge, SimpleSemanticModelElement, UMASemanticModelBridge, CoreSemanticModelBridge, TextElement, Image, Polyline, Ellipse, ProcessFamily
}
