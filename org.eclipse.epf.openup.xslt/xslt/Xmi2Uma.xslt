<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:org.eclipse.epf.uma="http://www.eclipse.org/epf/uma/1.0.6/uma.ecore" xmlns:org.eclipse.epf.uma.resourcemanager="http:///org/eclipse/epf/uma/resourcemanager.ecore">
    <!--Identity-->
    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
    <!--Root-->
    <xsl:variable name="root" select="'/org.eclipse.epf.openup.uma/src/'"/>
    <!--ResourceManager-->
    <xsl:template match="org.eclipse.epf.uma.resourcemanager:ResourceManager"/>
    <!--MethodLibrary-->
    <xsl:template match="org.eclipse.epf.uma:MethodLibrary">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        	<xsl:element name="predefinedConfigurations">
                <xsl:attribute name="href">
                    <xsl:value-of select="'configurations/openup.uma#_QN3nQBEHEdyM7Iu0sxfrPA'"/>
                </xsl:attribute>
            </xsl:element>
        </xsl:copy>
    </xsl:template>
    <!--@variabilityBasedOnElement-->
    <xsl:template match="contentElements|sections|processElements[@xsi:type='org.eclipse.epf.uma:Phase' or @xsi:type='org.eclipse.epf.uma:Iteration' or @xsi:type='org.eclipse.epf.uma:Activity']">
        <xsl:copy>
            <xsl:if test="not(variabilityBasedOnElement)">
                <xsl:attribute name="variabilityBasedOnElement">
                    <xsl:value-of select="@guid"/>
                </xsl:attribute>
            </xsl:if>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
    <!--@longPresentationName-->
    <xsl:variable name="descriptions" select="*[matches(name(), 'org\.eclipse\.epf\.uma:.*Description$')]"/>
    <xsl:template match="$descriptions">
        <xsl:copy>
            <xsl:if test="not(@longPresentationName)">
                <xsl:attribute name="longPresentationName">
                    <xsl:value-of select="@name"/>
                </xsl:attribute>
            </xsl:if>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
    <xsl:template match="org.eclipse.epf.uma:ActivityDescription|org.eclipse.epf.uma:DescriptorDescription|org.eclipse.epf.uma:ProcessDescription">
        <xsl:copy>
            <xsl:if test="not(@longPresentationName)">
                <xsl:attribute name="longPresentationName">
                    <xsl:value-of select="@name"/>
                </xsl:attribute>
            </xsl:if>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
    <!--ProcessComponent-->
    <xsl:template match="org.eclipse.epf.uma:ProcessComponent">
        <xsl:param name="guid" select="generate-id()"/>
        <xsl:param name="breakdownElements" select="concat(process/@breakdownElements, concat(' ', process/@guid))"/>
        <xsl:copy>
            <xsl:attribute name="interfaces">
                <xsl:value-of select="$guid"/>
            </xsl:attribute>
            <xsl:apply-templates select="@*|node()[not(name()='process')]"/>
            <xsl:element name="process">
                <xsl:if test="not(process/variabilityBasedOnElement)">
                    <xsl:attribute name="variabilityBasedOnElement">
                        <xsl:value-of select="process/@guid"/>
                    </xsl:attribute>
                </xsl:if>
                <xsl:if test="not(process/@superActivities)">
                    <xsl:attribute name="superActivities">
                        <xsl:value-of select="process/@guid"/>
                    </xsl:attribute>
                </xsl:if>
                <xsl:attribute name="breakdownElements">
                    <xsl:value-of select="concat($breakdownElements, concat(' ', $guid))"/>
                </xsl:attribute>
                <xsl:attribute name="defaultContext">
                    <xsl:value-of select="concat($root, 'configurations/openup.uma#_QN3nQBEHEdyM7Iu0sxfrPA')"/>
                </xsl:attribute>
                <xsl:apply-templates select="process/@*[not(name()='breakdownElements')]|process/node()"/>
            </xsl:element>
            <xsl:element name="processElements">
                <xsl:attribute name="xsi:type">
                    <xsl:value-of select="'org.eclipse.epf.uma:ProcessComponentInterface'"/>
                </xsl:attribute>
                <xsl:attribute name="superActivities">
                    <xsl:value-of select="process/@guid"/>
                </xsl:attribute>
                <xsl:attribute name="guid">
                    <xsl:value-of select="$guid"/>
                </xsl:attribute>
            </xsl:element>
        </xsl:copy>
    </xsl:template>
    <!--processElements-->
    <xsl:template match="processElements[@xsi:type='org.eclipse.epf.uma:Milestone']">
        <xsl:copy>
            <xsl:if test="not(@superActivities)">
                <xsl:attribute name="superActivities">
                    <xsl:value-of select="@guid"/>
                </xsl:attribute>
            </xsl:if>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
    <!--@value-->
    <xsl:template match="details/@value">
        <xsl:param name="proxy" select="substring-before(., '#')"/>
        <xsl:param name="id" select="substring-after(., '#')"/>
        <xsl:param name="hid" select="concat('#', $id)"/>
        <xsl:attribute name="value">
            <xsl:choose>
                <xsl:when test="$proxy='uma://_SKnAwOL9EdyM47cGD2jiaQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.risk_value_lifecycle.base\capabilitypatterns\risk_value_lifecycle_phases\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_RQi0ANONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\construction_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_RXGooNOFEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\develop_solution\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_aUsVENONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\elaboration_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_h0Gs8NONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\inception_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_pzQU0NONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\transition_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_SuWj4NOPEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\deliveryprocesses\openup_lifecycle\model.uma', $hid))"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="."/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:attribute>
    </xsl:template>
    <!--@href-->
    <xsl:template match="@href">
        <xsl:param name="resourceDescriptors" select="/*/org.eclipse.epf.uma.resourcemanager:ResourceManager/resourceDescriptors"/>
        <xsl:param name="proxy" select="substring-before(., '#')"/>
        <xsl:param name="id" select="substring-after(., '#')"/>
        <xsl:param name="xmi" select="$resourceDescriptors[@id=$id]/@uri"/>
        <xsl:param name="name" select="substring-before($xmi, '.xmi')"/>
        <xsl:param name="hid" select="concat('#', $id)"/>
        <xsl:param name="uma" select="concat($name, '.uma')"/>
        <xsl:attribute name="href">
            <xsl:choose>
                <xsl:when test="$xmi != ''">
                    <xsl:value-of select="concat($uma, $hid)"/>
                </xsl:when>
                <!--plugins-->
                <xsl:when test="$proxy='uma://_MRPloEFXEdy9ENCpSugIjA'">
                    <xsl:value-of select="concat($root, concat('core.default.cat_def.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_vsno4EKmEdyrauqpmnA8jQ'">
                    <xsl:value-of select="concat($root, concat('core.default.nav_view.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_iVydgENdEdy245g62lfWcA'">
                    <xsl:value-of select="concat($root, concat('core.default.release_copyright.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_A118oMYaEdyXeo04os5BOw'">
                    <xsl:value-of select="concat($root, concat('core.default.role_def.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_fRdVEMYbEdyXeo04os5BOw'">
                    <xsl:value-of select="concat($root, concat('core.default.tool_def.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_WCUhAO8KEdmKSqa_gSYthg'">
                    <xsl:value-of select="concat($root, concat('core.default.uma_concept.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_14Ft0M3pEdyuBO4ZIzcyig'">
                    <xsl:value-of select="concat($root, concat('core.gen.common.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_ji3-gEMXEdyP_Jn83ylwUQ'">
                    <xsl:value-of select="concat($root, concat('core.gen.common.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_CX-9AM3qEdyuBO4ZIzcyig'">
                    <xsl:value-of select="concat($root, concat('core.mgmt.common.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Q_mBoGphEd24CboUCnKL3A'">
                    <xsl:value-of select="concat($root, concat('core.mgmt.common.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_0TmecJ-VEdy3Nc4rvuj7bA'">
                    <xsl:value-of select="concat($root, concat('core.mgmt.common.extend_supp/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_vJYucEfUEdyiPI8btkmvmw'">
                    <xsl:value-of select="concat($root, concat('core.mgmt.slot.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_LdRtkM3qEdyuBO4ZIzcyig'">
                    <xsl:value-of select="concat($root, concat('core.tech.common.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Qyp8YGpiEd24CboUCnKL3A'">
                    <xsl:value-of select="concat($root, concat('core.tech.common.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_OOB2AAouEdyhlpBPrduOMw'">
                    <xsl:value-of select="concat($root, concat('core.tech.common.extend_supp/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_-bv0ELXuEduGP_98XMd0fg'">
                    <xsl:value-of select="concat($root, concat('core.tech.slot.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_p0w9wJlfEeGlkdGl1HQlDA'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_wDZIUOCFEeC1y_NExchKwQ'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_XOu58JljEeGlkdGl1HQlDA'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_mYfo8OCIEeC1y_NExchKwQ'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_iNwFsMhNEdygFZkm1d5NtQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.iterative_dev.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_qqyzAJ6WEdyQN-zRFaRrCQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.iterative_dev.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_7uMwYDIWEd-YE6CeBfCofg'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.project_process_tailoring.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_NOBspSZLEd-QuZFPf_YdqQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.project_process_tailoring.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_NBRHwMh3EdygFZkm1d5NtQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.release_planning.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_nKS10J6YEdyQN-zRFaRrCQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.release_planning.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_4gXdoL8BEdyWX5Yd-9QZ1A'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.risk_value_lifecycle.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_ugihsOxXEdyCFeiQwJE7Vg'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.team_change_mgmt.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_44o4AOvVEdyp6czxLiQq9g'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.team_change_mgmt.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_vtUfcEIuEd2GCesTWQms8Q'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.whole_team.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_40sbAJ6YEdyQN-zRFaRrCQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.whole_team.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_IItp4MuXEdyLOriywSJkoQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.concurrent_testing.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Hz9OMG5KEdyAHIxjZ9kpqw'">
                    <xsl:value-of select="concat($root, concat('practice.tech.concurrent_testing.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_h_9roM3PEdyKkus0T68H3Q'">
                    <xsl:value-of select="concat($root, concat('practice.tech.continuous_integration.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_D-ExQMktEdygFZkm1d5NtQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.continuous_integration.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_GxBjAM2sEdym_ZFqrJcXUg'">
                    <xsl:value-of select="concat($root, concat('practice.tech.evolutionary_arch.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_4gaS4LPREduocbW-TPTq7A'">
                    <xsl:value-of select="concat($root, concat('practice.tech.evolutionary_arch.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_XPLD8MudEdyRPtFYRAKVDg'">
                    <xsl:value-of select="concat($root, concat('practice.tech.evolutionary_design.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Z2cK0LPPEduocbW-TPTq7A'">
                    <xsl:value-of select="concat($root, concat('practice.tech.evolutionary_design.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_NjNCEMrmEdyd6uFrFHNXhA'">
                    <xsl:value-of select="concat($root, concat('practice.tech.shared_vision.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Y9TKMLS9EduDY8LNbMCDBA'">
                    <xsl:value-of select="concat($root, concat('practice.tech.shared_vision.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_00zMMMt1EdyRPtFYRAKVDg'">
                    <xsl:value-of select="concat($root, concat('practice.tech.test_driven_development.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_DZ1rEI7-Edy7q8CKc_B8eg'">
                    <xsl:value-of select="concat($root, concat('practice.tech.test_driven_development.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_HYAA4MriEdyd6uFrFHNXhA'">
                    <xsl:value-of select="concat($root, concat('practice.tech.use_case_driven_dev.assign/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_GbYfULPaEduocbW-TPTq7A'">
                    <xsl:value-of select="concat($root, concat('practice.tech.use_case_driven_dev.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Z7teANQ1EdyQ89W1tgswSQ'">
                    <xsl:value-of select="concat($root, concat('process.openup.base/plugin.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_4ulTgMg7EdyXeo04os5BOw'">
                    <xsl:value-of select="concat($root, concat('publish.openup.base/plugin.uma', $hid))"/>
                </xsl:when>
                <!--others-->
                <xsl:when test="$proxy='uma://_SKnAwOL9EdyM47cGD2jiaQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.risk_value_lifecycle.base\capabilitypatterns\risk_value_lifecycle_phases\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_qDRSULBKEdm7Eph_l9Cn9w'">
                    <xsl:value-of select="concat($root, concat('practice.tech.evolutionary_arch.base\tasks\envision_the_arch.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_NrbRUKeqEdmKDbQuyzCoqQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.concurrent_testing.base\tasks\implement_tests.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_rUis8LBKEdm7Eph_l9Cn9w'">
                    <xsl:value-of select="concat($root, concat('practice.tech.evolutionary_arch.base\tasks\refine_the_arch.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Nr0S4KeqEdmKDbQuyzCoqQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.team_change_mgmt.base\tasks\request_change.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_5rJ78Lj3Edmy88CC3LfB_w'">
                    <xsl:value-of select="concat($root, concat('practice.tech.shared_vision.base\tasks\develop_technical_vision.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_NrbRUqeqEdmKDbQuyzCoqQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.concurrent_testing.base\tasks\run_tests.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-w4UHaO9nSn7-q_CMq-Ofog'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.base\tasks\deliver_end_user_training.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-xCz7FMvINdv3zLvonMDolQ'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.base\tasks\deliver_support_training.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-fBwPDexzVTCxcEM5H1ljeQ'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\package_the_release.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-PPEUOk6Gija0ckrWlDdCxA'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\execute_deployment_plan.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-chKviPT1F1yq5Y_KL9ET9g'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\verify_successful_deployment.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-mHGd7nm4EywKy0UPe9dZhg'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\execute_backout_plan.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-HIQR9GY0lX3xDuTpeslNtg'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\deliver_release_communications.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_P9iS8PV_EdmdHa9MmVPgqQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.use_case_driven_dev.base\tasks\identify_and_outline_requirements.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-oFAa8Uu6tr_GkE_E0iycdQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.use_case_driven_dev.base\tasks\detail_use_case_scenarios.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-9sNgONA1WJCxf12B40uDgw'">
                    <xsl:value-of select="concat($root, concat('practice.tech.use_case_driven_dev.base\tasks\detail_system_wide_requirements.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_NrVKsKeqEdmKDbQuyzCoqQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.concurrent_testing.base\tasks\create_test_cases.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_fPbdIKe2Edmzde8VFK5bxg'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.release_planning.base\tasks\plan_the_project.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_RXGooNOFEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\develop_solution\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_NrC20qeqEdmKDbQuyzCoqQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.evolutionary_design.base\tasks\design_solution.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-UW-yTFk3AppqcGGU-Px63A'">
                    <xsl:value-of select="concat($root, concat('practice.tech.test_driven_development.base\tasks\implement_developer_tests.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-UaDGd7K2rQIFMwCrDuqQKQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.test_driven_development.base\tasks\implement_solution.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-H6ob8eA7gz_mOsk8ulSFMQ'">
                    <xsl:value-of select="concat($root, concat('practice.tech.test_driven_development.base\tasks\run_developer_tests.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-01L_eCnHjKmBPsGcdk8XTg'">
                    <xsl:value-of select="concat($root, concat('practice.tech.continuous_integration.base\tasks\integrate_and_create_build.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_oZgCsNOEEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\plan_manage_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-QqCVewwu8buOCXKRukpf5g'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\plan_deployment.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_buG4sNOFEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\test_solution\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://__ZInMNOEEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\ongoing_tasks\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_y7a0KpiLEeGOvpP1fVrVNA'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\prep_doc_trng\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_xxcpgNOEEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\identify_and_refine_requirements\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_KaeNsNOFEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\develop_architecture\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_eWxZgNOEEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\initiate_project\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_4ouDUNOEEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\agree_technical_approach\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-dWzB4mHRr5uSP98BqAOy1g'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.project_process_tailoring.base\tasks\deploy_process.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-QSekP8qxW4BdpikByUiCUg'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.project_process_tailoring.base\tasks\tailor_process.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-5i4nbMLokgXzl8E2LT94uQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.project_process_tailoring.base\tasks\setup_tools.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-YTA7QOxZpdM-is9Zx_tJXQ'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.project_process_tailoring.base\tasks\verify_tool_config_installation.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_Wk7noKe1EdmGSrcKGOYDGg'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.iterative_dev.base\tasks\plan_iteration.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-PbfqVxB_j9KN-Jx39_pEUA'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.iterative_dev.base\tasks\manage_iteration.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_a3uz4LBYEdm7Eph_l9Cn9w'">
                    <xsl:value-of select="concat($root, concat('practice.mgmt.iterative_dev.base\tasks\assess_results.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-Msu85VH5rLUfl0OEAnZdIQ'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.base\tasks\develop_product_documentation.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-bkoNpaQhWX6FBG-iOZkRPg'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.base\tasks\develop_user_documentation.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-jWMpCvzhJPOglJcxCiAYjA'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.base\tasks\develop_support_documentation.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-IfcWgUklth25pRzdNTE8LA'">
                    <xsl:value-of select="concat($root, concat('practice.gen.doc_trng.base\tasks\develop_training_materials.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-SLY9_MQQ_ykBIaLojfgzBQ'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\install_validate_infrastructure.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-Z_sfrl6NWP_8GKlFeHrrgg'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\develop_backout_plan.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-FWdvN43s5ux00S-GVpDH-w'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\develop_release_communications.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://-zT8t7LcbcrgIhYd_XUi6DA'">
                    <xsl:value-of select="concat($root, concat('practice.gen.production_release.base\tasks\review_conform_to_release_controls.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_y7az-ZiLEeGOvpP1fVrVNA'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\prepare_for_release\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_y7a0FpiLEeGOvpP1fVrVNA'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\deploy_release_to_production\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_y7az6piLEeGOvpP1fVrVNA'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\provide_product_training\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_h0Gs8NONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\inception_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_aUsVENONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\elaboration_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_RQi0ANONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\construction_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_pzQU0NONEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\capabilitypatterns\transition_phase_iteration\model.uma', $hid))"/>
                </xsl:when>
                <xsl:when test="$proxy='uma://_SuWj4NOPEdyqlogshP8l4g'">
                    <xsl:value-of select="concat($root, concat('process.openup.base\deliveryprocesses\openup_lifecycle\model.uma', $hid))"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="."/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:attribute>
    </xsl:template>
</xsl:transform>