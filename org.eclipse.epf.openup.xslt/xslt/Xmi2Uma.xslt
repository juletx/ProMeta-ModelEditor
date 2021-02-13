<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:org.eclipse.epf.uma="http://www.eclipse.org/epf/uma/1.0.6/uma.ecore" xmlns:org.eclipse.epf.uma.resourcemanager="http:///org/eclipse/epf/uma/resourcemanager.ecore">
    <!--identity template copies everything forward by default-->
    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
    <!--href-->
    <xsl:template match="@href">
        <xsl:param name="resourceDescriptors" select="/*/org.eclipse.epf.uma.resourcemanager:ResourceManager/resourceDescriptors"/>
        <xsl:param name="id" select="substring-after(., '#')"/>
        <xsl:param name="xmi" select="$resourceDescriptors[@id=$id]/@uri"/>
        <xsl:param name="name" select="substring-before($xmi, '.xmi')"/>
        <xsl:param name="uma" select="concat($name, '.uma')"/>
        <xsl:choose>
            <xsl:when test="$xmi != ''">
                <xsl:attribute name="href">
                    <xsl:value-of select="concat($uma, concat('#', $id))"/>
                </xsl:attribute>
            </xsl:when>
            <xsl:otherwise>
                <xsl:attribute name="href">
                    <xsl:value-of select="."/>
                </xsl:attribute>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    <!--resourcemanager template-->
    <xsl:template match="org.eclipse.epf.uma.resourcemanager:ResourceManager"/>
</xsl:transform>