<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:uma="http://www.eclipse.org/epf/uma/1.0.6/" xmlns:org.eclipse.epf.uma="http://www.eclipse.org/epf/uma/1.0.6/uma.ecore">
    <!--identity template copies everything forward by default-->
    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
    <!--root template-->
    <xsl:template match="/*">
        <xsl:element name="org.eclipse.epf.uma:MethodLibrary" namespace="http://www.eclipse.org/epf/uma/1.0.6/uma.ecore">
            <xsl:attribute name="xmi:version">2.0</xsl:attribute>
            <xsl:attribute name="xsi:schemaLocation">http://www.eclipse.org/epf/uma/1.0.6/uma.ecore uma.ecore</xsl:attribute>
            <xsl:apply-templates select="@*[not(name()='tool')]|node()" />
        </xsl:element>
    </xsl:template>
    <!--replace id with guid-->
    <xsl:template match="@id">
        <xsl:attribute name="guid">
            <xsl:value-of select="."/>
        </xsl:attribute>
    </xsl:template>
    <!--replace xsi:type namespace-->
    <xsl:template match="@xsi:type">
        <xsl:attribute name="xsi:type">
            <xsl:value-of select="concat('org.eclipse.epf.uma:', substring(., 5))"/>
        </xsl:attribute>
    </xsl:template>
    <!--templates to rename elements-->
    <xsl:template match="MethodElementProperty">
        <xsl:element name="{lower-case(substring(name(), 1, 1))}{substring(name(), 2)}">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <xsl:template match="/*/MethodPlugin">
        <xsl:element name="methodPlugins">
            <xsl:attribute name="copyrightStatement">
                <xsl:value-of select="Copyright"/>
            </xsl:attribute>
            <xsl:attribute name="bases">
                <xsl:value-of select="ReferencedMethodPlugin"/>
            </xsl:attribute>
            <xsl:apply-templates select="@*|node()[not(name()='Copyright' or name()='ReferencedMethodPlugin') ]"/>
        </xsl:element>
    </xsl:template>
    <xsl:template match="/*/MethodPlugin/MethodPackage">
        <xsl:element name="methodPackages">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <!--Method Configuration--> 
    <xsl:template match="MethodConfiguration">
        <xsl:element name="predefinedConfigurations">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <xsl:template match="MethodPluginSelection">
        <xsl:element name="methodPluginSelection">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <xsl:template match="MethodPackageSelection">
        <xsl:element name="methodPackageSelection">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <xsl:template match="DefaultView">
        <xsl:element name="defaultView">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <xsl:template match="ProcessView">
        <xsl:element name="processViews">
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <!--Content Description-->
    <xsl:template match="ContentDesciption">
        <xsl:attribute name="mainDescrition">
            <xsl:value-of select="MainDesciption"/>
        </xsl:attribute>
        <xsl:attribute name="sections">
            <xsl:value-of select="Section"/>
        </xsl:attribute>
        <xsl:attribute name="keyConsiderations">
            <xsl:value-of select="KeyConsiderations"/>
        </xsl:attribute>
        <xsl:attribute name="longPresentationName">
            <xsl:value-of select="LongPresentationName"/>
        </xsl:attribute>
    </xsl:template>
    <!--Content Element-->
    <xsl:template match="SupportingMaterial|Concept|Checklist|Guideline|Example|ReusableAsset|TermDefinition"/>
    <xsl:template match="ContentElement">
        <xsl:element name="contentElements">
            <xsl:attribute name="supportingMaterials">
                <xsl:value-of select="SupportingMaterial"/>
            </xsl:attribute>
            <xsl:attribute name="conceptsAndPapers">
                <xsl:value-of select="Concept"/>
            </xsl:attribute>
            <xsl:attribute name="checklists">
                <xsl:value-of select="Checklist"/>
            </xsl:attribute>
            <xsl:attribute name="guidelines">
                <xsl:value-of select="Guideline"/>
            </xsl:attribute>
            <xsl:attribute name="examples">
                <xsl:value-of select="Example"/>
            </xsl:attribute>
            <xsl:attribute name="assets">
                <xsl:value-of select="ReusableAsset"/>
            </xsl:attribute>
            <xsl:attribute name="termdefinition">
                <xsl:value-of select="TermDefinition"/>
            </xsl:attribute>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:element>
    </xsl:template>
    <!--ArtifactDescription-->
    <xsl:template match="ContentElement[@xsi:type='uma:ArtifactDescription']">
        <xsl:attribute name="briefOutline">
            <xsl:value-of select="BriefOutline"/>
        </xsl:attribute>
        <xsl:attribute name="representationOptions">
            <xsl:value-of select="RepresentationOptions"/>
        </xsl:attribute>
        <xsl:attribute name="representation">
            <xsl:value-of select="Representation"/>
        </xsl:attribute>
        <xsl:attribute name="notation">
            <xsl:value-of select="Notation"/>
        </xsl:attribute>
        <xsl:apply-templates select="@*|node()"/>
    </xsl:template>
    <!--WorkProductDescription-->
    <xsl:template match="ContentElement[@xsi:type='uma:WorkProductDescription']">
        <xsl:attribute name="purpose">
            <xsl:value-of select="Purpose"/>
        </xsl:attribute>
        <xsl:attribute name="impactOfNotHaving">
            <xsl:value-of select="ImpactOfNotHaving"/>
        </xsl:attribute>
        <xsl:attribute name="reasonsForNotNeeding">
            <xsl:value-of select="ReasonsForNotNeeding"/>
        </xsl:attribute>
        <xsl:apply-templates select="@*|node()"/>
    </xsl:template>
    <!--DeliverableDescription-->
    <xsl:template match="ContentElement[@xsi:type='uma:WorkProductDescription']">
        <xsl:attribute name="externalDescription">
            <xsl:value-of select="ExternalDescription"/>
        </xsl:attribute>
        <xsl:attribute name="packagingGuidance">
            <xsl:value-of select="PackagingGuidance"/>
        </xsl:attribute>
        <xsl:apply-templates select="@*|node()"/>
    </xsl:template>
    <!--RoleDescription-->
    <xsl:template match="ContentElement[@xsi:type='uma:RoleDescription']">
        <xsl:attribute name="skills">
            <xsl:value-of select="Skills"/>
        </xsl:attribute>
        <xsl:attribute name="assignmentApproaches">
            <xsl:value-of select="AssignmentApproaches"/>
        </xsl:attribute>
        <xsl:attribute name="synomyms">
            <xsl:value-of select="Synonyms"/>
        </xsl:attribute>
        <xsl:apply-templates select="@*|node()"/>
    </xsl:template>
</xsl:transform>