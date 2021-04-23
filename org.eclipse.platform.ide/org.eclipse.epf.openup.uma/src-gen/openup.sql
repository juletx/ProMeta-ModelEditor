INSERT INTO methodologies VALUES (
	"_QN3nQBEHEdyM7Iu0sxfrPA",
	"openup",
	"OpenUP",
	"OpenUP is a lean Unified Process that applies iterative and incremental approaches within a structured lifecycle. ",
	"1.0.0"
);
INSERT INTO methodologies VALUES (
	"_PFU-AMVeEd2n6fDcl3UsZg",
	"tech.abrd",
	"Agile Business Rules Development",
	"This configuration publishes the Agile Business Rules Development practice.",
	"7.5.0"
);

INSERT INTO role_sets VALUES (
	"_SHN90MYaEdyXeo04os5BOw",
	"basic_role_set",
	"Basic Roles",
	"This is the list of basic software development roles.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO roles VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"analyst",
	"Analyst",
	"The person in this role represents customer and end-user concerns by gathering input from stakeholders to understand the problem to be solved and by capturing and setting priorities for requirements.",
	"_SHN90MYaEdyXeo04os5BOw"
);

INSERT INTO roles VALUES (
	"_0dsWoMlgEdmt3adZL5Dmdw",
	"any_role",
	"Any Role",
	"Anyone on a team can fill this role of performing general tasks.",
	"_SHN90MYaEdyXeo04os5BOw"
);

INSERT INTO roles VALUES (
	"_0X9iEMlgEdmt3adZL5Dmdw",
	"architect",
	"Architect",
	"The Architect is responsible for defining the software architecture, which includes making the key technical decisions that constrain the overall design and implementation of the system.",
	"_SHN90MYaEdyXeo04os5BOw"
);

INSERT INTO roles VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"developer",
	"Developer",
	"The Developer is responsible for developing a part of the system, including designing it to fit into the architecture, possibly prototyping the user interface, and then implementing, unit-testing, and integrating the components that are part of the solution.",
	"_SHN90MYaEdyXeo04os5BOw"
);

INSERT INTO roles VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"project_manager",
	"Project Manager",
	"The Project Manager leads the planning of the project, coordinates interactions with the stakeholders, and keeps the project team focused on meeting the project objectives.",
	"_SHN90MYaEdyXeo04os5BOw"
);

INSERT INTO roles VALUES (
	"_dTa6gMAYEdqX-s4mWhkyqQ",
	"stakeholder",
	"Stakeholder",
	"This role represents interest groups whose needs must be satisfied by the project. It is a role that may be played by anyone who is (or potentially will be) materially affected by the outcome of the project.",
	"_SHN90MYaEdyXeo04os5BOw"
);

INSERT INTO roles VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"tester",
	"Tester",
	"The Tester is responsible for the core activities of the test effort. Those activities include identifying, defining, implementing, and conducting the necessary tests, as well as logging the outcomes of the testing and analyzing the results.",
	"_SHN90MYaEdyXeo04os5BOw"
);


INSERT INTO role_sets VALUES (
	"_A5XTkKr-Ed-4oa5dU5v0Eg",
	"brd_role_set",
	"Business Rules Development",
	"List of roles which are involved in business rules development.",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO roles VALUES (
	"_Xh-X4AqBEdyPCr4G1Tb79A",
	"business_analyst",
	"Business Analyst",
	"The Business Analyst (BA) acts as the bridge between the business and IT departments. He understands the IT technologies benefits such as BPM and BRMS and how he can use them. He has a good understanding of the business needs and problems.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);

INSERT INTO roles VALUES (
	"_5h_uoKcyEd-VK6zqjMaiPQ",
	"business_process_analyst",
	"Business Process Analyst",
	"The role of the Business Process Analyst is to build consensus among the different stakeholders on the as-is and to-be process models, and to look for opportunities to improve the current business process.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);

INSERT INTO roles VALUES (
	"_XiII4QqBEdyPCr4G1Tb79A",
	"rule_administrator",
	"Rule Administrator",
	"The Rule Administrator manages the rule authoring and deployment. He executes the business rule management process and ensure the integrity of the rule set by using the rule life cycle and rule set life cycle.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);

INSERT INTO roles VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"rule_analyst",
	"Rule Analyst",
	"The Rule Analyst is responsible for putting in place the rule approach and the rule stewardship. He is responsible for the execution of the rule management process, and helps extract and write the business rules.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);

INSERT INTO roles VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"rule_architect",
	"Rule Architect",
	"The Rule Architect is responsible for defining and maintaining the structure of the rule-based application.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);

INSERT INTO roles VALUES (
	"_bYUkIJyiEd23W8_-Tub7Ww",
	"rule_steward",
	"Rule Steward",
	"Develops and maintains a comprehensive management plan for the business rule management group activities, and drives the definition of the rule governance processes.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);

INSERT INTO roles VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"rule_writer",
	"Rule Writer",
	"The Rule Writer writes rules using an authoring environment.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);

INSERT INTO roles VALUES (
	"_XiII5AqBEdyPCr4G1Tb79A",
	"subject_matter_expert",
	"Subject Matter Expert",
	"The Subject Matter Expert (SME) is responsible for defining the business processes, the business policies and the application requirements. He leads the business rules acquisition activities as a domain expert and uses the Rules Management Application as reviewer.",
	"_A5XTkKr-Ed-4oa5dU5v0Eg"
);


INSERT INTO role_sets VALUES (
	"_Wi8j4L9yEd-AG_DXKKgAXg",
	"environment_roles_list",
	"Environment",
	"This standard category lists all environment roles in software development.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO roles VALUES (
	"_jmrVYL9xEd-AG_DXKKgAXg",
	"process_engineer",
	"Process Engineer",
	"This role equips the project team with an appropriate development process, and makes sure that the team members are not hindered in doing their jobs.",
	"_Wi8j4L9yEd-AG_DXKKgAXg"
);

INSERT INTO roles VALUES (
	"_jmrVYb9xEd-AG_DXKKgAXg",
	"tool_specialist",
	"Tool Specialist",
	"This role supports the tools used by the project and provides technical assistance to the project. This includes selecting and acquiring tools, configuring and setting them up, and verifying that they work.",
	"_Wi8j4L9yEd-AG_DXKKgAXg"
);


INSERT INTO role_sets VALUES (
	"_5H4hQJoJEeGnJt_Qpwdfdg",
	"deployment_roles_list",
	"Deployment",
	"This standard category lists all deployment roles in software development.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO roles VALUES (
	"_-zf1teB8EeC1y_NExchKwQ",
	"technical_writer",
	"Technical Writer",
	"A Technical Writer often helps a development team member complete the documentation needed for the Product Owner, End Users, and support personnel to understand and to be able to use the delivered features.",
	"_5H4hQJoJEeGnJt_Qpwdfdg"
);

INSERT INTO roles VALUES (
	"_cQjSAPWkEeC0T_-ipt2c0Q",
	"course_developer",
	"Course Developer",
	"A Course Developer creates training materials for delivery either to End Users of the system or to the production support personnel who are responsible for maintaining the system.",
	"_5H4hQJoJEeGnJt_Qpwdfdg"
);

INSERT INTO roles VALUES (
	"_-zenk-B8EeC1y_NExchKwQ",
	"trainer",
	"Trainer",
	"A Trainer delivers training either to End Users of the system or to the production support personnel who are responsible for maintaining the system.",
	"_5H4hQJoJEeGnJt_Qpwdfdg"
);

INSERT INTO roles VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"deployment_engineer",
	"Deployment Engineer",
	"A Deployment Engineer is responsible to the Deployment Manager for the safe deployment of one or more releases into the production environment.",
	"_5H4hQJoJEeGnJt_Qpwdfdg"
);

INSERT INTO roles VALUES (
	"_L-A1kOCFEeC1y_NExchKwQ",
	"deployment_manager",
	"Deployment Manager",
	"This role is responsible for managing and scheduling synchronized releases across one or more programs and/or product lines.",
	"_5H4hQJoJEeGnJt_Qpwdfdg"
);

INSERT INTO roles VALUES (
	"_-a85MeCEEeC1y_NExchKwQ",
	"product_owner",
	"Product Owner",
	"The Product Owner represents the End User's needs and defines the \"work\" in the project. This team member typically is co-located with a development team.",
	"_5H4hQJoJEeGnJt_Qpwdfdg"
);



INSERT INTO practices VALUES (
	"_lFYasFImEd-S-5uzDh9e9Q",
	"method_development",
	"Method Development",
	"This practice describes a method to develop method content.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_LR_g4J9WEdy3Nc4rvuj7bA",
	"iterative_development",
	"Iterative Development",
	"Create a solution in increments. Each increment is completed in a fixed period of time, an iteration.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_NOBsuiZLEd-QuZFPf_YdqQ",
	"project_process_tailoring",
	"Project Process Tailoring",
	"This practice describes how to select tools and an appropriate process and perform the typical tailoring required for use on a specific project.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_ijFkcB4sEd2bS8fFOQ7WWA",
	"release_planning",
	"Release Planning",
	"The Release Planning practice embodies the concept of high-level planning for the complete project scope (macro-) and low-level (micro-) planning for the immediate and next increments or iterations.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_9FqrQB4sEd2bS8fFOQ7WWA",
	"risk_value_lifecycle",
	"Risk-Value Lifecycle",
	"The risk-value lifecycle practice supplements the iterative development and release planning practices with the unified process lifecycle. This lifecycle identifies four phases, each of which attempts to balance value provided against risk mitigation appropriate to the phase.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_tz6tkB4uEd2bS8fFOQ7WWA",
	"team_change_mgmt",
	"Team Change Management",
	"This is a practice for capturing change requests that are managed as part of work item management.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_6C4sMB4rEd2bS8fFOQ7WWA",
	"whole_team",
	"Whole Team",
	"The Whole Team practice describes how a development team organizes itself to enable it to work effectively.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_MuX6YKcnEd-VK6zqjMaiPQ",
	"abrd",
	"Agile Business Rule Development",
	"Agile Business Rule Development is a practice to implement business application using business rule management system and rule engine technology.",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO practices VALUES (
	"_9z1PgJ6NEdyQN-zRFaRrCQ",
	"concurrent_testing",
	"Concurrent Testing",
	"This practice describes how to fold testing into agile development.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_rJNiMB4rEd2bS8fFOQ7WWA",
	"continous_integration",
	"Continuous Integration",
	"In a Continuous Integration practice, team members integrate their work frequently (at least daily).",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_uVnpQB4qEd2bS8fFOQ7WWA",
	"evolutionary_arch",
	"Evolutionary Architecture",
	"Analyze the major technical concerns that affect the solution, and capture those architectural decisions to ensure that those decisions are assessed and communicated.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_aSVhIB4qEd2bS8fFOQ7WWA",
	"evolutionary_design",
	"Evolutionary Design",
	"This practice describes an approach to design that assumes that the design will evolve over time, minimizing documentation while still providing guidance for making design decisions and communicating those decisions.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_a7qSUB4nEd2bS8fFOQ7WWA",
	"shared_vision",
	"Shared Vision",
	"This practice supports defining and communicating an overall vision for the project.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_FUDtMB4mEd2bS8fFOQ7WWA",
	"test_driven_dev",
	"Test Driven Development",
	"This practice describes an approach to development in which test cases are defined first, then code is developed to pass the tests.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_w1JD4B4jEd2bS8fFOQ7WWA",
	"use_case_driven_dev_practice",
	"Use Case Driven Development",
	"This practice describes how to capture requirements with a combination of use cases and system-wide requirements, and then drive development and testing from those use cases.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_-zdZceB8EeC1y_NExchKwQ",
	"documentation_and_training",
	"Documentation and Training",
	"This practice describes how to prepare documentation for a product release and how that documentation might be used to prepare and deliver training to end users and support personnel.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO practices VALUES (
	"_IAG5wOB-EeC1y_NExchKwQ",
	"production_release",
	"Production Release",
	"This practice describes how to prepare and execute the release of a product (or subset thereof) into the production environment.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_1r0bcK80Edy9cPK11VzBuQ",
	"architecture_domain",
	"Architecture",
	"This is the list of work products related to the architecture domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_5JQLoK80Edy9cPK11VzBuQ",
	"development_domain",
	"Development",
	"This is the list of work products related to the development domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_8M6J4K80Edy9cPK11VzBuQ",
	"project_management_domain",
	"Project Management",
	"This is the list of work products related to the project management domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_AIcLUK81Edy9cPK11VzBuQ",
	"requirements_domain",
	"Requirements",
	"This is the list of work products related to the requirements domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_CsgDgK81Edy9cPK11VzBuQ",
	"test_domain",
	"Test",
	"This is the list of work products related to the test domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_UtGCIKsREd-4oa5dU5v0Eg",
	"brd_domains",
	"Business Rules Development",
	"This is the list of work products in business rules development organized by domains.",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO domains VALUES (
	"_Fpj0ALrUEd-0rKmWr1vEGQ",
	"environment_domain",
	"Environment",
	"This is the list of work products related to the Environment domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	"deployment_domain",
	"Deployment",
	"This is the list of work products related to the deployment domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_fp7oAKRdEd2fX-RO52WAtA",
	"architecture",
	"Architecture",
	"This is the list of work products related to BRMS architecture domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO domains VALUES (
	"_fp7oAaRdEd2fX-RO52WAtA",
	"rule_analysis",
	"Rule Analysis",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO domains VALUES (
	"_fp7oAqRdEd2fX-RO52WAtA",
	"rule_authoring",
	"Rule Authoring",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO domains VALUES (
	"_fp7oA6RdEd2fX-RO52WAtA",
	"rule_discovery",
	"Rule Discovery",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO domains VALUES (
	"_fp7oBKRdEd2fX-RO52WAtA",
	"rule_governance",
	"Rule Governance",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO domains VALUES (
	"_fp7oBaRdEd2fX-RO52WAtA",
	"rule_validation",
	"Rule Validation",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO domains VALUES (
	"_RTHwEKyYEd2-Ve_PZdE8yA",
	"rule_deployment",
	"Rule Deployment",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO domains VALUES (
	"_WPotYKyYEd2-Ve_PZdE8yA",
	"rule_design",
	"Rule Design",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);


INSERT INTO templates VALUES (
	"_MIUO0C8FEduzydamRseoUw",
	"risk_list",
	"Risk List",
	"A list or table containing risk attributes. As it is usual to rank risks by priority, spreadsheets may be an alternative to capture risks",
	"resources/risk_list_tpl.xls"
);
INSERT INTO templates VALUES (
	"_QwUJYDg0Edu4E8ZdmlYjtA",
	"work_items_list",
	"Work Items List",
	"This is a spreadsheet suggested for representing a work items list. Alternative templates would be usage of a specific tool or database with similar information.",
	"resources/work_items_list_tpl.xls"
);
INSERT INTO templates VALUES (
	"_m7p-AI5fEdyO5aWob1UGDA",
	"systemwide_requirements_specification",
	"System-Wide Requirements Specification",
	"This is the template suggested for specifying requirements and constraints in accordance with the FURPS+ classification.",
	"resources/systemwide_req_spec.dot"
);
INSERT INTO templates VALUES (
	"_3Y3XUI5fEdyO5aWob1UGDA",
	"use_case_specification",
	"Use-Case Specification",
	"This is the informal template suggested for representing a use case specification.",
	"resources/uc_specification_tpl.dot"
);
INSERT INTO templates VALUES (
	"_DtlRQI5gEdyO5aWob1UGDA",
	"vision",
	"Vision",
	"This is the informal template suggested for representing the Vision document.",
	"resources/vision_tpl.dot"
);
INSERT INTO templates VALUES (
	"_yZtgQI5gEdyO5aWob1UGDA",
	"test_script",
	"Test Script",
	"This is the informal template suggested for test scripts.",
	"resources/test_script_tpl.dot"
);
INSERT INTO templates VALUES (
	"_yWaKEI5fEdyO5aWob1UGDA",
	"test_case",
	"Test Case",
	"This is the informal template suggested for representing test cases.",
	"resources/test_cases.dot"
);
INSERT INTO templates VALUES (
	"_0dBoQMlgEdmt3adZL5Dmdw",
	"iteration_plan",
	"Iteration Plan",
	"This is a template for an iteration plan.",
	"resources/iteration_plan_tpl.dot"
);
INSERT INTO templates VALUES (
	"_vb78EF3dEd-8pIBWBGuz7w",
	"development_case",
	"Development Case",
	"This is a template for the tailored process that a project is to follow in order to produce the project's desired results.",
	""
);
INSERT INTO templates VALUES (
	"_0c7hoMlgEdmt3adZL5Dmdw",
	"project_plan",
	"Project Plan",
	"This is the informal template for representing the project plan.",
	"resources/project_plan_tpl.dot"
);
INSERT INTO templates VALUES (
	"_sruW0gjqEdyj5bYZ0eCR5g",
	"bom",
	"Business Object Model",
	"This template should be used to define the Rule Business Object Model in details, especially the verbalizations used to offer high level language of the business terms used in the rules.",
	"resources/abrd_tmpl_bom.dot"
);
INSERT INTO templates VALUES (
	"_sruW1wjqEdyj5bYZ0eCR5g",
	"business_glossary",
	"Business Terms Glossary",
	"This is a template. From our project experience it seems a real value for the business users and IT people to get this kind of common definition of terms. Some organization already define this kind of glossary, and even it is possible to use some industry standard. But standards are always adapted by the organization so it is important to develop this kind of glossary during the project life cycle. ",
	"resources/abrd_tmpl_businessglossary.dot"
);
INSERT INTO templates VALUES (
	"_kRoWgBDFEdyJtJ3PbfdVDw",
	"decision_point_table",
	"Decision Point Table",
	"This template is used during the inception phase of the project or when executing some business modeling task.",
	"resources/abrd_tmpl_decisionpointtable.dot"
);
INSERT INTO templates VALUES (
	"_sruW2QjqEdyj5bYZ0eCR5g",
	"rule_discovery_roadmap",
	"Rule Discovery Roadmap",
	"This table template  has to be used during the Define roadmap task. Use one table per rule class",
	"resources/abrd_tmpl_rulediscoveryroadmap.dot"
);
INSERT INTO templates VALUES (
	"_sruW0wjqEdyj5bYZ0eCR5g",
	"rule_discovery_invite",
	"Rule Discovery Workshop Invite",
	"Invite letter to send to the analyst team member",
	"resources/abrd_tmpl_rulediscoveryinvite.dot"
);
INSERT INTO templates VALUES (
	"_srklxAjqEdyj5bYZ0eCR5g",
	"rule_template_for_workflow_project",
	"Rule Template for Workflow Project",
	"This template should be used for project based on a discovery roadmap using business process or workflow process. The implementation of the business application will use a workflow engine.",
	"resources/abrd_tmpl_workflowprocessanalysis.dot"
);
INSERT INTO templates VALUES (
	"_srklxQjqEdyj5bYZ0eCR5g",
	"rule_templates",
	"Rule Templates",
	"These templates are used to document business rules during the rule discovery workshop. In the word template, the first rule template allows a more business-centric description than the second. The excel file is a simplified version of the first template to collect rules as a list, a more convenient way for certain cases.",
	"resources/abrd_tmpl_ruletemplate.dot|resources/abrd_tmpl_rulelist.xls"
);
INSERT INTO templates VALUES (
	"_mqnOETmsEdy8N6BRpa8ByQ",
	"rule_set_table",
	"Rule Set Table",
	"This template is used to describe all the rule sets of the business application or at the enterprise level, with the team ownership and access permissions.",
	"resources/abrd_tmpl_rulesettable.dot"
);
INSERT INTO templates VALUES (
	"_me8WcAANEdyRS9uciXlZ6g",
	"architecture_notebook",
	"Architecture Notebook",
	"Template for describing the architecture.",
	"resources/architecture_notebook_tpl.dot"
);
INSERT INTO templates VALUES (
	"_EOPcMAMUEdylNddAObilIA",
	"design",
	"Design",
	"This is the informal template suggested for representing design.A requirements realization is a part of the design that shows how one or more
	requirements is implemented.",
	""
);

INSERT INTO artifacts VALUES (
	"_Wn7HcNcEEdqz_d2XWoVt6Q",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project.",
	"_AIcLUK81Edy9cPK11VzBuQ",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_Ckay8Cc_EduIsqH1Q6ZuqA",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions.",
	"_8M6J4K80Edy9cPK11VzBuQ",
	"_MIUO0C8FEduzydamRseoUw"
);	
INSERT INTO artifacts VALUES (
	"_rGNWsCbSEdqh1LYUOGRh2A",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item.",
	"_8M6J4K80Edy9cPK11VzBuQ",
	"_QwUJYDg0Edu4E8ZdmlYjtA"
);	
INSERT INTO artifacts VALUES (
	"_2CEzsLrREd-0rKmWr1vEGQ",
	"project_defined_process",
	"Project Defined Process",
	"This work product describes the process that a project is to follow in order to produce the project's desired results.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_RJMUcNpUEdyzZqGyZ7hwdw",
	"project_definition_and_scope_slot",
	"[Project Definition and Scope]",
	"This slot serves as an abstraction of high-level artifacts that define the project and its scope. Typical examples of such artifacts could be a project definition, and a high-level project schedule identifying major milestones and major deliverables.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_kf7foNpUEdyzZqGyZ7hwdw",
	"project_status_slot",
	"[Project Status]",
	"This slot serves as an abstraction for any type of status report or assessment of the project's progress. This includes both internal assessments, as well as those of interest to the project sponsors.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_0TkXgNpUEdyzZqGyZ7hwdw",
	"project_risk_slot",
	"[Project Risk]",
	"This slot serves as an abstraction for artifacts that list, track, and manage project risk, such as a risk list or risk log.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_1QZI8EfUEdyiPI8btkmvmw",
	"project_work_slot",
	"[Project Work]",
	"This slot serves as an abstraction for any type of work being done on the project. It could be represented as a work items list, an operational schedule, a work breakdown structure, and so on.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_0WVxcMlgEdmt3adZL5Dmdw",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system.",
	"_AIcLUK81Edy9cPK11VzBuQ",
	"_DtlRQI5gEdyO5aWob1UGDA"
);	
INSERT INTO artifacts VALUES (
	"_BVh9cL-CEdqb7N6KIeDL8Q",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements.",
	"_AIcLUK81Edy9cPK11VzBuQ",
	"_m7p-AI5fEdyO5aWob1UGDA"
);	
INSERT INTO artifacts VALUES (
	"_0VGbUMlgEdmt3adZL5Dmdw",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system.",
	"_AIcLUK81Edy9cPK11VzBuQ",
	"_3Y3XUI5fEdyO5aWob1UGDA"
);	
INSERT INTO artifacts VALUES (
	"_W2SgEDR5EdutE_HNDTJk5Q",
	"use_case_model",
	"Use-Case Model",
	"This artifact captures a model of the intended functions and environment of the system and serves as a contract between the customer and the team.",
	"_AIcLUK81Edy9cPK11VzBuQ",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_0ZS-0MlgEdmt3adZL5Dmdw",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario.",
	"_CsgDgK81Edy9cPK11VzBuQ",
	"_yWaKEI5fEdyO5aWob1UGDA"
);	
INSERT INTO artifacts VALUES (
	"_0ZfMEMlgEdmt3adZL5Dmdw",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing.",
	"_CsgDgK81Edy9cPK11VzBuQ",
	"_yZtgQI5gEdyO5aWob1UGDA"
);	
INSERT INTO artifacts VALUES (
	"_0ZlSsMlgEdmt3adZL5Dmdw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run.",
	"_CsgDgK81Edy9cPK11VzBuQ",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_JqYbgJ01EdyQ3oTO93enUw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built.",
	"_5JQLoK80Edy9cPK11VzBuQ",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_kh9FcJ02EdyQ3oTO93enUw",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element.",
	"_5JQLoK80Edy9cPK11VzBuQ",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_0YuXEMlgEdmt3adZL5Dmdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product.",
	"_5JQLoK80Edy9cPK11VzBuQ",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_8OD-cLPTEduocbW-TPTq7A",
	"technical_architecture_slot",
	"[Technical Architecture]",
	"This slot serves as an abstraction of high level artifacts that represent the documentation of the architecture.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_i3vkoLS-EduDY8LNbMCDBA",
	"technical_specification_slot",
	"[Technical Specification]",
	"This slot serves as an abstraction of high-level artifacts that describe requirements, constraints, and goals for the solution.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_Vux8UEfUEdyiPI8btkmvmw",
	"technical_implementation_slot",
	"[Technical Implementation]",
	"This slot holds the artifacts that represent a technical implementation.  This can include source code, executable code, data, and software/hardware configurations.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_fahB0EfUEdyiPI8btkmvmw",
	"technical_test_results_slot",
	"[Technical Test Results]",
	"This slot serves as an abstraction of high level artifacts that define the results of testing the hardware and software for the system being developed.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_IcQOUEqdEdyi3_jfs__bIQ",
	"technical_design_slot",
	"[Technical Design]",
	"This slot serves as an abstraction of high-level artifacts that describe the realization of required system functionality, and serves as an abstraction of the solution.",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_0aQBEslgEdmt3adZL5Dmdw",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration.",
	"_8M6J4K80Edy9cPK11VzBuQ",
	"_0dBoQMlgEdmt3adZL5Dmdw"
);	
INSERT INTO artifacts VALUES (
	"_AeUr0EmiEd-UYMQAaXd4fQ",
	"tools",
	"Tools",
	"These work products are the tools needed to support the software development effort. ",
	"_Fpj0ALrUEd-0rKmWr1vEGQ",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_0a6vcMlgEdmt3adZL5Dmdw",
	"project_plan",
	"Project Plan",
	"This artifact gathers all of the information required to manage the project on a strategic level. Its main part consists of a coarse-grained plan, identifying project iterations and their goals.",
	"_8M6J4K80Edy9cPK11VzBuQ",
	"_0c7hoMlgEdmt3adZL5Dmdw"
);	
INSERT INTO artifacts VALUES (
	"_sruW1QjqEdyj5bYZ0eCR5g",
	"rule_discovery_roadmap",
	"Rule Discovery Roadmap",
	"",
	"_fp7oA6RdEd2fX-RO52WAtA",
	"_sruW2QjqEdyj5bYZ0eCR5g"
);	
INSERT INTO artifacts VALUES (
	"_srklwQjqEdyj5bYZ0eCR5g",
	"discovery_workshop_itinerary",
	"Rule Discovery Workshop Itinerary",
	"",
	"_fp7oA6RdEd2fX-RO52WAtA",
	"_sruW0wjqEdyj5bYZ0eCR5g"
);	
INSERT INTO artifacts VALUES (
	"_sruW2gjqEdyj5bYZ0eCR5g",
	"rule_description_doc",
	"Rule Description Document",
	"This document formalize the rule discovery by logging the major rules of a decision point in one document. ",
	"_fp7oA6RdEd2fX-RO52WAtA",
	"_srklxAjqEdyj5bYZ0eCR5g"
);	
INSERT INTO artifacts VALUES (
	"_srklygjqEdyj5bYZ0eCR5g",
	"business_terms_glossary",
	"Business Terms Glossary",
	"Log in one document the terms and their definition as used by the business user",
	"_fp7oA6RdEd2fX-RO52WAtA",
	"_sruW1wjqEdyj5bYZ0eCR5g"
);	
INSERT INTO artifacts VALUES (
	"_SlELAAsbEdyPCr4G1Tb79A",
	"decision_point_table",
	"Decision Point Table",
	"",
	"_fp7oA6RdEd2fX-RO52WAtA",
	"_kRoWgBDFEdyJtJ3PbfdVDw"
);	
INSERT INTO artifacts VALUES (
	"_Uw8aYBDGEdyJtJ3PbfdVDw",
	"business_process_map",
	"Business Process Map",
	"A Process map describes graphically using Business Process Management Notation (BPMN) the business process under scope.",
	"_fp7oA6RdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_hYc8UHr9Ed2l9d4UccBrvQ",
	"conceptual_data_model",
	"Conceptual Data Model",
	"",
	"_fp7oA6RdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_HSrrgGhiEd-FVuzXjnvIWA",
	"business_event_description",
	"Business Event Description",
	"Logging the business events source of business process execution helps to drive rule discovery.",
	"_fp7oA6RdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_csL3wHrMEd2o_5d3MWaNxQ",
	"fact_model",
	"Fact Model",
	"",
	"_fp7oAaRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_sruW2AjqEdyj5bYZ0eCR5g",
	"logical_data_model",
	"Logical Data Model",
	"Logical Data Model represents the organization business-domain concepts in a set of diagram and logical schema. The choice of representation will depend of the design approach and the target audience. It could be relational (Table - columns, association), object oriented  (class - attribute association) or XML (tags) defined.",
	"_fp7oAaRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_6BE7QAp_EdyPCr4G1Tb79A",
	"decision_service_architecture",
	"Decision Service Architecture",
	"A decision service is a piece of logic which uses a decision engine like a rule engine in order to infer actions on the input data.",
	"_fp7oAKRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_U003IIm4Ed2cL6yqw-_-uA",
	"executable_object_model",
	"Executable Object Model",
	"A Java, .Net or XML schema implementation of the logical data model",
	"_fp7oAKRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_vjWPcDzEEdyA6a_I80swHw",
	"ruleset",
	"Ruleset",
	"Set of rule as a standalone component executed by a rule engine. ",
	"_fp7oAqRdEd2fX-RO52WAtA",
	"_mqnOETmsEdy8N6BRpa8ByQ"
);	
INSERT INTO artifacts VALUES (
	"_jqxtYFttEdykEsBjRsVfZw",
	"rule_repository_in_db",
	"Rule Repository in DB",
	"",
	"_RTHwEKyYEd2-Ve_PZdE8yA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_DmUjsFH8Edy72tV0zV7--Q",
	"rule_life_cycle",
	"Rule Life Cycle",
	"",
	"_fp7oBKRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"__hcZYGDrEdyKlZvvtnMrMg",
	"brms_organization_chart",
	"Organization Chart",
	"",
	"_fp7oBKRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_VzXG0GDtEdyKlZvvtnMrMg",
	"rule_governance_actors",
	"Rule Governance Actors",
	"",
	"_fp7oBKRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_GkaEUKR5Ed2fX-RO52WAtA",
	"rule_set_life_cycle",
	"Rule Set Life Cycle",
	"",
	"_fp7oBKRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_GapYYLIxEd-Pl5C2Q7Ib_Q",
	"rule_set_table",
	"Rule Set Table",
	"One or more tables to describe rule sets and related information such goals, parameters, ownership and access control.",
	"_fp7oBKRdEd2fX-RO52WAtA",
	"_mqnOETmsEdy8N6BRpa8ByQ"
);	
INSERT INTO artifacts VALUES (
	"_arqeoEtZEdyEE-k1R6LmOA",
	"rsm_report",
	"RSM Report",
	"",
	"_fp7oBaRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_arqeoUtZEdyEE-k1R6LmOA",
	"rule_report",
	"Rule Report",
	"",
	"_fp7oBaRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_BnlgsEtaEdyEE-k1R6LmOA",
	"sme_recommendations",
	"SME Recommendations",
	"",
	"_fp7oBaRdEd2fX-RO52WAtA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_oz2LcDmsEdy8N6BRpa8ByQ",
	"rule_meta_properties",
	"Rule Meta Properties",
	"",
	"_WPotYKyYEd2-Ve_PZdE8yA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_BMI-QDmoEdy8N6BRpa8ByQ",
	"rule_repository",
	"Rule Repository",
	"The rule repository is a structural model for rule project artifacts coupled with a persistence mechanism to control the life cycle of the rule projects and the rules within the projects.",
	"_WPotYKyYEd2-Ve_PZdE8yA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_oz2LcTmsEdy8N6BRpa8ByQ",
	"ruleset_table",
	"Ruleset Table",
	"The ruleset table is used during the analysis and design activities of the project to list the different rule sets, the parameters, object model the business application will use, completed with the type of exception or errors it may create, and how it will be deployed.",
	"_WPotYKyYEd2-Ve_PZdE8yA",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_0XAf0MlgEdmt3adZL5Dmdw",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture.",
	"_1r0bcK80Edy9cPK11VzBuQ",
	"_me8WcAANEdyRS9uciXlZ6g"
);	
INSERT INTO artifacts VALUES (
	"_0WuL8slgEdmt3adZL5Dmdw",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code.",
	"_5JQLoK80Edy9cPK11VzBuQ",
	"_EOPcMAMUEdylNddAObilIA"
);	
INSERT INTO artifacts VALUES (
	"_ZTGAYL3uEdqLRJZPGVbHDA",
	"design.vm",
	"(was design_vm)",
	"",
	NULL,
	NULL
);	
INSERT INTO artifacts VALUES (
	"_-zf1tuB8EeC1y_NExchKwQ",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_-zfOreB8EeC1y_NExchKwQ",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_-zf1tOB8EeC1y_NExchKwQ",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the end users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_-zeAguB8EeC1y_NExchKwQ",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train end users and production support personnel on the features and inner workings of a product for a particular release.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_IAJWA-B-EeC1y_NExchKwQ",
	"release_controls",
	"Release Controls",
	"Release controls normally are established by IT management and enforced by the deployment manager.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_IAJ9EOB-EeC1y_NExchKwQ",
	"infrastructure",
	"Infrastructure",
	"In reference to a release sprint, infrastructure refers to all the hardware, software, and network facilities necessary to support a deployed release.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_IAJ9FeB-EeC1y_NExchKwQ",
	"deployment_plan",
	"Deployment Plan",
	"A deployment plan is used to document all the information needed by deployment engineers to deploy a release successfully.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_IAHg2eB-EeC1y_NExchKwQ",
	"backout_plan",
	"Backout Plan",
	"A backout plan defines the criteria and procedures to be followed if a release into production needs to be rolled back.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	
INSERT INTO artifacts VALUES (
	"_IAIH4OB-EeC1y_NExchKwQ",
	"release_communications",
	"Release Communications",
	"This artifact provides information to concerned parties that a product (or subset) has been placed into production.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);	

INSERT INTO artifacts VALUES (
	"_EopWMPddEeCG79QDqBlPXg",
	"release",
	"Release",
	"A release is the transition of an increment of potentially shippable product from the development group into routine use by customers based on a successful placement of a release sprint's output into the production environment.",
	"_fEIy4JoGEeGnJt_Qpwdfdg",
	NULL
);

INSERT INTO role_artifacts VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_0aQBEslgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_Ckay8Cc_EduIsqH1Q6ZuqA"
);
INSERT INTO role_artifacts VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);
INSERT INTO role_artifacts VALUES (
	"_jmrVYb9xEd-AG_DXKKgAXg",
	"_AeUr0EmiEd-UYMQAaXd4fQ"
);
INSERT INTO role_artifacts VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_0a6vcMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_csL3wHrMEd2o_5d3MWaNxQ"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_oz2LcDmsEdy8N6BRpa8ByQ"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_oz2LcTmsEdy8N6BRpa8ByQ"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_srklygjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_SlELAAsbEdyPCr4G1Tb79A"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_srklwQjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_sruW1QjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_DmUjsFH8Edy72tV0zV7--Q"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_hYc8UHr9Ed2l9d4UccBrvQ"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_vjWPcDzEEdyA6a_I80swHw"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_jqxtYFttEdykEsBjRsVfZw"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_BMI-QDmoEdy8N6BRpa8ByQ"
);
INSERT INTO role_artifacts VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_arqeoUtZEdyEE-k1R6LmOA"
);
INSERT INTO role_artifacts VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_6BE7QAp_EdyPCr4G1Tb79A"
);
INSERT INTO role_artifacts VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_U003IIm4Ed2cL6yqw-_-uA"
);
INSERT INTO role_artifacts VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_0ZS-0MlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_0ZlSsMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_0ZfMEMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_0YuXEMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0X9iEMlgEdmt3adZL5Dmdw",
	"_0XAf0MlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_0WuL8slgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_0WVxcMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_kh9FcJ02EdyQ3oTO93enUw"
);
INSERT INTO role_artifacts VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_JqYbgJ01EdyQ3oTO93enUw"
);
INSERT INTO role_artifacts VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_BVh9cL-CEdqb7N6KIeDL8Q"
);
INSERT INTO role_artifacts VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_W2SgEDR5EdutE_HNDTJk5Q"
);
INSERT INTO role_artifacts VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_0VGbUMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_artifacts VALUES (
	"_cQjSAPWkEeC0T_-ipt2c0Q",
	"_-zeAguB8EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_-zf1teB8EeC1y_NExchKwQ",
	"_-zf1tuB8EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_-zf1teB8EeC1y_NExchKwQ",
	"_-zfOreB8EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_-zf1teB8EeC1y_NExchKwQ",
	"_-zf1tOB8EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAHg2eB-EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAJ9FeB-EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_EopWMPddEeCG79QDqBlPXg"
);
INSERT INTO role_artifacts VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAIH4OB-EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_L-A1kOCFEeC1y_NExchKwQ",
	"_IAJWA-B-EeC1y_NExchKwQ"
);
INSERT INTO role_artifacts VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_Wn7HcNcEEdqz_d2XWoVt6Q"
);

INSERT INTO disciplines VALUES (
	"_iGSHsFZ-EdyIUdvDLLUdeg",
	"architecture_discipline",
	"Architecture",
	"This discipline explains how to create software architecture from architecturally significant requirements. The architecture is built in the Development discipline.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_iGSHsVZ-EdyIUdvDLLUdeg",
	"development_discipline",
	"Development",
	"This discipline explains how to design and implement a technical solution that conforms to the architecture and supports the requirements.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_iGSHtFZ-EdyIUdvDLLUdeg",
	"project_management_discipline",
	"Project Management",
	"This discipline explains how to coach, facilitate, and support the team, helping it to deal with risk and obstacles found when building software.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_iGSHtVZ-EdyIUdvDLLUdeg",
	"requirements_discipline",
	"Requirements",
	"This discipline explains how to elicit, analyze, specify, validate, and manage the requirements for the system to be developed.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_iGSHtlZ-EdyIUdvDLLUdeg",
	"test_discipline",
	"Test",
	"This discipline explains how to provide feedback about the maturing system by designing, implementing, running, and evaluating tests.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_g-STsKshEd-4oa5dU5v0Eg",
	"brd_disciplines",
	"Business Rules Development",
	"This is a group of disciplines under business rules development.",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_qtv_gLtwEd-0rKmWr1vEGQ",
	"environment_discipline",
	"Environment",
	"This discipline explains how to customize process and tools for a project or organization.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_OjzNEJoGEeGnJt_Qpwdfdg",
	"deployment_discipline",
	"Deployment",
	"This discipline explains how to plan for and deploy a solution.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_1QK4gKshEd-4oa5dU5v0Eg",
	"architecture",
	"BRMS Architecture",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_1QK4gashEd-4oa5dU5v0Eg",
	"rule_analysis",
	"Rule Analysis",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_1QK4gqshEd-4oa5dU5v0Eg",
	"rule_authoring",
	"Rule Authoring",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_1QK4g6shEd-4oa5dU5v0Eg",
	"rule_deployment",
	"Rule Deployment",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_1QK4hKshEd-4oa5dU5v0Eg",
	"rule_design",
	"Rule Design",
	"Group all the activities related to the design of the rule set.",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_1QK4hqshEd-4oa5dU5v0Eg",
	"rule_governance",
	"Rule Governance",
	"When a BRMS approach is introduced, the business rule management moves from IT team into the business unit team. Formal process needs to be developed.
	Business rules are exposed, separated, stated in formal terms and managed for change against a formal governance processes that span among business and IT.
	",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_1QK4h6shEd-4oa5dU5v0Eg",
	"rule_validation",
	"Rule Validation",
	"Validation will involve testing the rules and get Subject Matter Expert feedbacks to improve the quality of the rules. A set of tools are available in high end BRMS platform to do some rule conflict analysis, testing, and executing complex queries to understand how rules are impacting others rules result.
	The tasks are following a TDD approach, where data scenarios are defined as early as the rule discovery, and tests are developed to integrate the data definition to trigger rule execution in the context of the rule set deployed. 
	",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"__u-KMLRXEd-0GaneRZjjRw",
	"rule_discovery",
	"Rule Discovery",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_IAGSsuB-EeC1y_NExchKwQ",
	"to_delete_2",
	"To Delete 2",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_IAGSsOB-EeC1y_NExchKwQ",
	"to_delete",
	"To Delete",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO tasks VALUES (
	"_0l53cMlgEdmt3adZL5Dmdw",
	"assess_results",
	"Assess Results",
	"Determine success or failure of the iteration. Apply the lessons learned to modify the project or improve the process.",
	"_iGSHtFZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_o28GgMMsEdmdo9HxCRR_Gw",
	"Prepare for iteration assessment",
	"Prepare for iteration assessment",
	"<p>
	    Towards the end of the iteration, the team jointly assesses whether the objectives and evaluation criteria established
	    in the Iteration Plan were met, and whether the team adhered to the plan and completed all of the work items committed
	    to the iteration. The team makes use of objective measures to the greatest extent possible. To assess that a given work
	    item is completed, the team ensures that the corresponding test cases were successfully run against it.
	</p>
	<p>
	    The team prepares a demonstration of the features implemented at that point, so that during the iteration assessment
	    stakeholders can have a real sense of progress made. The team decides whether each developer should demonstrate the
	    features that they implemented, or if the project manager or senior developer demonstrates it all, with other team
	    members present to answer questions.
	</p>
	<p>
	    In addition to the demonstration,&nbsp;prepare reports that show project status, such as work burndown and test case
	    reports.
	</p>
	<p>
	    These activities happen in preparation for the iteration assessment meeting with stakeholders that occurs on the last
	    day of the iteration.
	</p>",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_iSiDEIx4Edyzd4h-mxj9YA",
	"Demonstrate value and gather feedback",
	"Demonstrate value and gather feedback",
	"<p>
	    The team demonstrates the product to customers, end-users, and other stakeholders to collect their feedback or, better
	    yet, have end users use the product themselves. This can be done throughout the iteration, but at least during the
	    iteration assessment that occurs at the end of the iteration (see <a class=\"elementLinkWithType\"
	    href=\"./../../practice.mgmt.iterative_dev.base/guidances/guidelines/iteration_assessment_E27E9DDE.html\"
	    guid=\"_FekBAC4IEdyhZrtGEIITGQ\">Guideline: Iteration Assessment</a>). Work that is not completed should not be
	    demonstrated.
	</p>
	<p>
	    Record resulting knowledge (such as new functionality, requested changes, and defects) in the <a class=\"elementLink\"
	    href=\"./../../core.mgmt.common.extend_supp/workproducts/work_items_list_39D03CC8.html\"
	    guid=\"_rGNWsCbSEdqh1LYUOGRh2A\">Work Items List</a>, so that project priorities, scope, and duration can be refined in
	    the next iteration planning.
	</p>",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_iL7cQEpqEdup0IY9DKDPkg",
	"Perform a retrospective",
	"Perform a retrospective",
	"<p>
	    Review with the team the approach taken to development and collaboration, the effectiveness of the development
	    environment, the suitability of the working environment, and other factors. Discuss what things went well, what could
	    have gone better, and how things could be changed to deliver better results. Capture in the current Iteration Plan the
	    assessment results, stakeholder feedback, and actions to be taken to improve the development approach for the next
	    iteration. Record lessons learned in this iteration with a collection of lessons learned for the entire project.
	</p>",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_1YHH8DLqEdueZPye-FaNgA",
	"Close-out project",
	"Close-out project",
	"<p>
	    Perform this step when the iteration review coincides with the end of the project. Involve the team and stakeholders in
	    a final assessment for project acceptance which, if successful, marks the point when the customer accepts ownership of
	    the software product. Complete the close-out of the project by disposing of the remaining assets and reassigning the
	    remaining staff.
	</p>",
	"_0l53cMlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0l53cMlgEdmt3adZL5Dmdw",
	"_0aQBEslgEdmt3adZL5Dmdw"
);
INSERT INTO input_artifacts VALUES (
	"_0l53cMlgEdmt3adZL5Dmdw",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);

INSERT INTO output_artifacts VALUES (
	"_0l53cMlgEdmt3adZL5Dmdw",
	"_0aQBEslgEdmt3adZL5Dmdw"
);
INSERT INTO output_artifacts VALUES (
	"_0l53cMlgEdmt3adZL5Dmdw",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);

INSERT INTO tasks VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"manage_iteration",
	"Manage Iteration",
	"Assess project status and identify any blocking issues and opportunities. Identify and manage exceptions, problems, and risks. Communicate project status.",
	"_iGSHtFZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_OE65ICuxEdqTIKp3l5PtzQ",
	"Track current iteration progress",
	"Track current iteration progress",
	"<p>
	    Continuously monitor the iteration to ensure that it is progressing appropriately. Track the progress of the current
	    iteration by maintaining visibility on the status of the items that are being worked on during the iteration. In
	    particular, it is important to be able to understand how quickly the team is moving through the work scheduled for the
	    iteration, and how accurate the estimates were <a class=\"elementlinkwithusertext\"
	    href=\"./../../core.mgmt.common.base/guidances/supportingmaterials/references.mgmt_D80619F3.html#LEF07\"
	    guid=\"_JlTPUM6aEdyuBO4ZIzcyig\">[LEF07]</a>.
	</p>
	<p>
	    Share information about the progress being made by having quick, frequent meetings with the entire project team. These
	    meetings are useful to understand what team members have accomplished since the last meeting, and what they plan to
	    accomplish before the next meeting. It also allows the team to identify any blocking issues. See <a class=\"elementLink\"
	    href=\"./../../core.mgmt.slot.base/guidances/guidelines/collaboration_guidance_slot_D3B8DD40.html\"
	    guid=\"_68JUYN8-Edyhmsbt0Xyl8A\">[Collaboration Guidance]</a> for more information.
	</p>
	<p>
	    Track the status of each work item by using visual indicators of state information (for example: defined, completed,
	    accepted) in a wall or automated tool. Since iterations are typically fixed in duration, another primary way to gauge
	    progress is to continuously monitor current status and also estimate how much work remains. Plot an iteration burndown
	    chart on a daily basis in order to visualize progress on a given iteration. This chart is plotted with the total
	    estimates for all the items that are not yet started and the estimated remaining effort for any item in progress. See
	    <a class=\"elementLinkWithType\"
	    href=\"./../../practice.mgmt.iterative_dev.base/guidances/reports/iteration_burndown_9C1C96F5.html\"
	    guid=\"_uAzgkDg3Edu4E8ZdmlYjtA\">Report: Iteration Burndown</a> for more information.
	</p>
	<p>
	    Take corrective actions to adjust the course of the iteration if the burndown chart shows that the work will not be
	    finished as planned.
	</p>",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO task_sections VALUES (
	"_urvQkGSyEd2DNqLAFatITA",
	"Capture and communicate project status",
	"Capture and communicate project status",
	"<p>
	    Because outside stakeholders do not participate in the daily activities of the team, it is important that the status of
	    the project should be communicated to them as often as possible. This communication significantly lowers the risk of
	    disconnect between the development team and the stakeholders. The status provides the team with data they can use to
	    improve their development process.
	</p>
	<p>
	    Besides the iteration status, the overall project status can be captured and communicated in a burndown report for the
	    whole project. This report should show the progress toward the release date, and should be updated at the end of every
	    iteration (when metrics, such as the team's velocity, can also be provided). This allows the team to predict what it
	    can accomplish on the remaining project iterations. Other metrics (such as number of test cases passed) can also be
	    used to present iteration and project status.
	</p>
	<p>
	    Keep the status information visible to stakeholders and the project team at all times in a project workspace (walls or
	    automated tool), where stakeholders can come and experience first-hand the progress being made by the team.
	</p>",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO task_sections VALUES (
	"_oIZdkCbZEdqh1LYUOGRh2A",
	"Handle exceptions and problems",
	"Handle exceptions and problems",
	"<p>
	    Know about the team's problems and issues and&nbsp;focus on problems that are blocking progress. A quick, daily meeting
	    is usually a good way to monitor those problems and issues. Keep&nbsp;a record of issues that have to be solved within
	    the team in the <a class=\"elementLink\"
	    href=\"./../../practice.mgmt.iterative_dev.base/workproducts/iteration_plan_B46FED39.html\"
	    guid=\"_0aQBEslgEdmt3adZL5Dmdw\">Iteration Plan</a><font color=\"#003399\">.</font> If a critical problem or issue is
	    likely to take a lot of time to solve, capture it in the Work Items List so that it can be assigned to an individual.
	</p>
	<p>
	    Identify the cause and impact of problems and exceptions as they arise. Identify possible solutions for problems that
	    have an immediate impact on the short-term goals and objectives. Identify who needs to be involved in implementing the
	    solution. Define the corrective actions and implement them.
	</p>",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO task_sections VALUES (
	"_xiFJwCbZEdqh1LYUOGRh2A",
	"Identify and manage risks",
	"Identify and manage risks",
	"<p>
	    Identify risks as soon as the project starts, and continue identifying and managing risks throughout the project.
	    Revisit the <a class=\"elementLink\" href=\"./../../core.mgmt.common.extend_supp/workproducts/risk_list_C4B6F290.html\"
	    guid=\"_Ckay8Cc_EduIsqH1Q6ZuqA\">Risk List</a> weekly, or at a minimum once per iteration. Involve the entire team in
	    identifying and mitigating risks.
	</p>",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO task_sections VALUES (
	"_Br6VECuxEdqTIKp3l5PtzQ",
	"Manage objectives",
	"Manage objectives",
	"When a team is falling significantly behind, or critical problems occur that prevent the team from meeting the iteration
	objectives, it may be necessary to descope work to ensure that the team delivers a useful product increment by the end of
	the iteration, while maximizing stakeholder value. Work with the team and stakeholders to revise the Iteration Plan and, as
	necessary, reduce the emphasis on less critical tasks by postponing them to a subsequent iteration. In rare cases, if the
	iteration objectives still seem impossible to meet, the team might consider terminating the iteration or reformulating the
	iteration to a new objective.",
	"_8S2aICbYEdqh1LYUOGRh2A"
);

INSERT INTO input_artifacts VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"_0aQBEslgEdmt3adZL5Dmdw"
);
INSERT INTO input_artifacts VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"_Ckay8Cc_EduIsqH1Q6ZuqA"
);
INSERT INTO input_artifacts VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);
INSERT INTO input_artifacts VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"_RJMUcNpUEdyzZqGyZ7hwdw"
);

INSERT INTO output_artifacts VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"_0aQBEslgEdmt3adZL5Dmdw"
);
INSERT INTO output_artifacts VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"_Ckay8Cc_EduIsqH1Q6ZuqA"
);
INSERT INTO output_artifacts VALUES (
	"_8S2aICbYEdqh1LYUOGRh2A",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);

INSERT INTO tasks VALUES (
	"_0keUEMlgEdmt3adZL5Dmdw",
	"plan_iteration",
	"Plan Iteration",
	"Plan the scope and responsibilities for a single iteration.",
	"_iGSHtFZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_7bz7AIyAEdyhZb-MhCJrlA",
	"Prioritize Work Items List",
	"Prioritize Work Items List",
	"Prioritize the work items list before you plan the next iteration. Consider what has changed since the last iteration plan
	(such as new change requests, shifting priorities of your stakeholders, or new risks that have been encountered).",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_CtKCMMBHEdqSgKaj2SZBmg",
	"Define iteration objectives",
	"Define iteration objectives",
	"<p>
	    Work with the team to refine the iteration objectives found in the project definition and scope, and document them in
	    the iteration plan in order to provide high-level direction to what should be targeted for the iteration. The
	    objectives should be driven based on stakeholder priorities, and will be revised as the iteration plan is finalized.
	    Those objectives are usually defined as high-level capabilities or scenarios, which need to be implemented and tested
	    during the iteration in order to deliver increased value to the customer.<br />
	</p>",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_HzNVgIyBEdyhZb-MhCJrlA",
	"Identify and review risks",
	"Identify and review risks",
	"<p>
	    Throughout the project, new assumptions and concerns may arise. Help the team identify and prioritize new risks as part
	    of iteration planning, updating the risk list. Add risk responses to the work items list, influencing the work that is
	    being planned for that iteration.
	</p>",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_307v0MMsEdmdo9HxCRR_Gw",
	"Commit work to the iteration",
	"Commit work to the iteration",
	"<p>
	    Work with the team, and especially the project stakeholders, to identify the high-priority work items from the work
	    items list to be addressed. The high-level objectives provide guidance on what work items should be considered. The
	    iteration plan from previous iteration should include an assessment of the results, and can also be used as input to
	    the current iteration planning. The team reviews its velocity and determines the amount of work that can be done within
	    the iteration. The team breaks down into tasks those work items that are assigned to the iteration, and estimates the
	    effort to complete each task. Typical tasks range from half a day to two days in length, and are captured in the work
	    items list. See <a class=\"elementLinkWithType\"
	    href=\"./../../core.mgmt.common.extend_supp/guidances/guidelines/agile_estimation_A4EF42B3.html\"
	    guid=\"_CGHskBEdEdqY7JB6N6CW2w\">Guideline: Agile Estimation</a> for more information.
	</p>
	<p>
	    When the team has decided to take on a work item, it will assign the work to one or several team members. Ideally, this
	    is done by team members signing up to do the work, since this makes people motivated and committed to doing the job.
	    However, based on your culture, you may instead assign the work to team members.<br />
	</p>",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_7Hqr4MMsEdmdo9HxCRR_Gw",
	"Define evaluation criteria",
	"Define evaluation criteria",
	"<p>
	    Each iteration should include testing as a part of the evaluation, as well as the test objectives and test cases that
	    need to be detailed. Other evaluation criteria may include successful demonstrations to key stakeholders, or favorable
	    usage by a small group of target users. Document evaluation criteria in the iteration plan.
	</p>",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_-tp18FHjEd2IaYFd32DrjQ",
	"Refine project definition and scope",
	"Refine project definition and scope",
	"<p>
	    Depending on the results of the previous iteration assessment, update the project definition work products as needed.
	    Necessary changes can encompass the need to acquire new resources, to absorb an unplanned effort increase, or to
	    implement a specific change request. If a change affects defined project milestones, consult with the stakeholders
	    before committing to it.
	</p>",
	"_0keUEMlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0keUEMlgEdmt3adZL5Dmdw",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);

INSERT INTO output_artifacts VALUES (
	"_0keUEMlgEdmt3adZL5Dmdw",
	"_Ckay8Cc_EduIsqH1Q6ZuqA"
);
INSERT INTO output_artifacts VALUES (
	"_0keUEMlgEdmt3adZL5Dmdw",
	"_0aQBEslgEdmt3adZL5Dmdw"
);
INSERT INTO output_artifacts VALUES (
	"_0keUEMlgEdmt3adZL5Dmdw",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);

INSERT INTO tasks VALUES (
	"_NOBsuCZLEd-QuZFPf_YdqQ",
	"tailor_process",
	"Tailor the Process",
	"This task describes how to tailor a process for a project.",
	"_qtv_gLtwEd-0rKmWr1vEGQ"
);

INSERT INTO task_sections VALUES (
	"_NOBsuSZLEd-QuZFPf_YdqQ",
	"Define the scope of the tailoring effort",
	"Define the scope of the tailoring effort",
	"<p>
	    Determine what processes and tools are mandated by the organization. Determine which process areas to document or
	    tailor. You may choose to divide this task into separate tasks for each process area. See guidelines for typical
	    process areas.
	</p>",
	"_NOBsuCZLEd-QuZFPf_YdqQ"
);
INSERT INTO task_sections VALUES (
	"_o6-UwCZLEd-QuZFPf_YdqQ",
	"Involve appropriate stakeholders",
	"Involve appropriate stakeholders",
	"Depending on the process areas you intend to tailor, you will want to involve the affected team members. For example,
	changes to coding guidelines should involve coders, changes to governance guidelines should involve stakeholders that
	govern the project, project acceptance procedures should involve the customer, etc.",
	"_NOBsuCZLEd-QuZFPf_YdqQ"
);
INSERT INTO task_sections VALUES (
	"_vXIf4CZLEd-QuZFPf_YdqQ",
	"Decide how the process will be documented",
	"Decide how the process will be documented",
	"You can use Rational Method Composer configurations, process documents such as a Development Case, RACI tables, and so
	on.<br />
	See guidelines on documenting the project process.",
	"_NOBsuCZLEd-QuZFPf_YdqQ"
);
INSERT INTO task_sections VALUES (
	"_2WBkoCZLEd-QuZFPf_YdqQ",
	"Develop project-specific content",
	"Develop project-specific content",
	"Identify reusable processes/process assets including applicable practices, guidelines, and examples.",
	"_NOBsuCZLEd-QuZFPf_YdqQ"
);
INSERT INTO task_sections VALUES (
	"_LMrkQCZpEd-XKYR2S73PfQ",
	"Decide which tools will be used to create and maintain work products",
	"Decide which tools will be used to create and maintain work products",
	"",
	"_NOBsuCZLEd-QuZFPf_YdqQ"
);
INSERT INTO task_sections VALUES (
	"_VXSXECZpEd-XKYR2S73PfQ",
	"Review and approve the process",
	"Review and approve the process",
	"",
	"_NOBsuCZLEd-QuZFPf_YdqQ"
);

INSERT INTO input_artifacts VALUES (
	"_NOBsuCZLEd-QuZFPf_YdqQ",
	"_2CEzsLrREd-0rKmWr1vEGQ"
);

INSERT INTO output_artifacts VALUES (
	"_NOBsuCZLEd-QuZFPf_YdqQ",
	"_2CEzsLrREd-0rKmWr1vEGQ"
);

INSERT INTO tasks VALUES (
	"_XlJ80CZpEd-XKYR2S73PfQ",
	"deploy_process",
	"Deploy the Process",
	"This task describes how to rollout a development process to the project team.",
	"_qtv_gLtwEd-0rKmWr1vEGQ"
);

INSERT INTO task_sections VALUES (
	"_kPN0oCZpEd-XKYR2S73PfQ",
	"Make the changes public",
	"Make the changes public",
	"Inform all project members about any significant updates.",
	"_XlJ80CZpEd-XKYR2S73PfQ"
);
INSERT INTO task_sections VALUES (
	"_nGNP4CZpEd-XKYR2S73PfQ",
	"Educate project members",
	"Educate project members",
	"<p>
	    Unless the change is trivial, you need to educate the project members about the new Development Process, including any
	    guidelines, templates and/or tools. This can vary from an informal 2 hour presentation to more formal training,
	    depending on the size of the project and the project members' familiarity with similar development processes.<br />
	    The following are commonly used ways to educate the project members:
	</p>
	<ul>
	    <li>
	        Briefing<br />
	        If the change is small or easy to understand a briefing to the team may be sufficient.
	    </li>
	    <li>
	        Mentors<br />
	        Having experienced mentors or consultants on the project or available to the project is an effective way to provide
	        guidance on an as-needed basis.
	    </li>
	    <li>
	        Workshop<br />
	        A one day process adoption workshop (PAW) for all project members can help \"kick-start\" a new or significantly
	        changed process. See Guidelines: Process Adoption Workshop
	    </li>
	    <li>
	        Customized training courses.<br />
	        If the project member have not attended the standard training courses in process and tools, an alternative is to
	        customize the standard training courses, to cover the project's development process, including guidelines,
	        templates and tools. However, it can be expensive to customize training courses. Generic process training, like an
	        introductory course to the Process or one or more practices, should be conducted prior to project startup, or in
	        the early days of the project. More specialized training in techniques, methods or technologies, is often conducted
	        \"just-in-time\". This means that the training is given shortly before the method or technique is to be applied in
	        the project, to ensure that new knowledge is fresh in mind. \"Boot-camps\".
	    </li>
	    <li>
	        1-5 weeks of concentrated hands-on training. Not many organizations can afford to arrange these kinds of
	        boot-camps, but they have proven to be efficient if there are many new factors for the people in the project. A
	        boot-camp is typically a mixture of seminars, training courses and hands-on work with the process and tools.
	    </li>
	</ul>",
	"_XlJ80CZpEd-XKYR2S73PfQ"
);
INSERT INTO task_sections VALUES (
	"_8rmD8CZpEd-XKYR2S73PfQ",
	"Collect feedback",
	"Collect feedback",
	"",
	"_XlJ80CZpEd-XKYR2S73PfQ"
);

INSERT INTO input_artifacts VALUES (
	"_XlJ80CZpEd-XKYR2S73PfQ",
	"_2CEzsLrREd-0rKmWr1vEGQ"
);

INSERT INTO output_artifacts VALUES (
	"_XlJ80CZpEd-XKYR2S73PfQ",
	"_2CEzsLrREd-0rKmWr1vEGQ"
);

INSERT INTO tasks VALUES (
	"_okIOcEmfEd-UYMQAaXd4fQ",
	"setup_tools",
	"Set Up Tools",
	"",
	"_qtv_gLtwEd-0rKmWr1vEGQ"
);

INSERT INTO task_sections VALUES (
	"_ZUv10NnnEdmO6L4XMImrsA",
	" Install the Tool on the Server ",
	" Install the Tool on the Server ",
	"<a id=\"Install the Tool on the Server\" name=\"Install the Tool on the Server\"></a> 
	<p>
	    Identify what other software is required for the specific tool to work, and install this software.&nbsp;For example, a
	    tool may require a database management system (DBMS) be installed first.&nbsp;
	</p>
	<p>
	    When you have installed the support software, you can install the tool on the server.
	</p>",
	"_okIOcEmfEd-UYMQAaXd4fQ"
);
INSERT INTO task_sections VALUES (
	"_ZUv10dnnEdmO6L4XMImrsA",
	" Customize the Tool",
	" Customize the Tool",
	"<a id=\"Customize the Tool (on the Server)\" name=\"Customize the Tool (on the Server)\"></a> 
	<p>
	    Decide how to customize the tool so that it supports the&nbsp;<a class=\"elementLink\"
	    href=\"./../../core.mgmt.common.base/workproducts/project_defined_process_8BF5845B.html\"
	    guid=\"_2CEzsLrREd-0rKmWr1vEGQ\">Project Defined Process</a>&nbsp;in the best way.&nbsp;&nbsp;
	</p>
	<p>
	    In addition to customizing the tools, you should set up user groups and access rights on the server.&nbsp; In some
	    cases, a tool may provide its own mechanisms for this.&nbsp; In other cases, user groups and access rights are defined
	    using the operating system.&nbsp; The configuration of user groups and access rights affects how the tools can be used.
	    For example, you can set constraints on what parts of a repository certain users will have access to.&nbsp;&nbsp;
	</p>
	<p>
	    Document the customizations in project-specific guidelines.&nbsp;
	</p>",
	"_okIOcEmfEd-UYMQAaXd4fQ"
);
INSERT INTO task_sections VALUES (
	"_ZUv109nnEdmO6L4XMImrsA",
	" Integrate with Other Tools ",
	" Integrate with Other Tools ",
	"<a id=\"Integrate With Other Tools\" name=\"Integrate With Other Tools\"></a> 
	<p>
	    Integrate the tool with other tools to make it easier to use. An integration between tools is in most cases in the form
	    of an extension to one or several tools. An 'integration extension' to a tool typically:
	</p>
	<ul>
	    <li>
	        Synchronize data between the different tools. It automates the creation and maintenance of related items in
	        development projects
	    </li>
	    <li>
	        Automatically adds traceability between related items in different tools.&nbsp;
	    </li>
	    <li>
	        Allow the user to add traceability between items in different tools.&nbsp;
	    </li>
	    <li>
	        Allow the user to navigate between tools. For example, access an item in a test tool from a requirements management
	        tool.&nbsp;
	    </li>
	    <li>
	        Allow the user to run certain functionality from one tool. For example, the possibility to create items in another
	        tool.
	    </li>
	    <li>
	        Allow the user to version a tool's items in a configuration management tool.&nbsp;&nbsp;&nbsp;
	    </li>
	</ul>
	<p>
	    Most tools offer ready-to-use extensions to integrate tools with each other.&nbsp;
	</p>
	<p>
	    Describe how the tools are integrated with each other in the project-specific guidelines.&nbsp;
	</p>",
	"_okIOcEmfEd-UYMQAaXd4fQ"
);
INSERT INTO task_sections VALUES (
	"_ZUv11NnnEdmO6L4XMImrsA",
	" Install and Customize Tools on Clients ",
	" Install and Customize Tools on Clients ",
	"<a id=\"Install Tools on Clients\" name=\"Install Tools on Clients\"></a> 
	<p>
	    Install the tool on each client. The least that is needed to do when installing a tool on the client side, is to set up
	    the connection to the repository on the server.&nbsp;
	</p>
	<p>
	    Customize the tool on the clients, just as you customized the tool on the server:&nbsp;
	</p>
	<ul>
	    <li>
	        In some cases you do not have to do anything with the client. For example, if the client is a web-interface it is
	        enough that the clients get the address to the application on the server. Some tools allow you to do all
	        customization on the server side. When the users access the repository on the server, they automatically get the
	        correct settings.&nbsp;&nbsp;
	    </li>
	    <li>
	        In other cases you customize the tool on the client by installing software that customizes the tool, or installing
	        files with customization information.&nbsp;&nbsp;
	    </li>
	</ul>
	<p>
	    It may be necessary to install 'integration software' on the client. Place the 'integration software' on a server and
	    allow the users to download and install it on their computers.&nbsp;
	</p>
	<p>
	    If it possible you should automate the tool installation, and the tool customization for the users. The benefit of
	    creating installation programs is that it allows you to set up the tools so that the clients get all the right
	    settings, extensions, and connections to the repository.&nbsp; You create installation (and customization) programs,
	    and place them on a server. Then the users download these programs and run them to install and customize the tool in
	    their computer.&nbsp;<br />
	</p>",
	"_okIOcEmfEd-UYMQAaXd4fQ"
);

INSERT INTO input_artifacts VALUES (
	"_okIOcEmfEd-UYMQAaXd4fQ",
	"_AeUr0EmiEd-UYMQAaXd4fQ"
);

INSERT INTO output_artifacts VALUES (
	"_okIOcEmfEd-UYMQAaXd4fQ",
	"_AeUr0EmiEd-UYMQAaXd4fQ"
);

INSERT INTO tasks VALUES (
	"_jcjbMEmgEd-UYMQAaXd4fQ",
	"verify_tool_config_installation",
	"Verify Tool Configuration and Installation",
	"This task describes how to verify that the Development Configuration is ready to be used by the project.",
	"_qtv_gLtwEd-0rKmWr1vEGQ"
);

INSERT INTO task_sections VALUES (
	"_tJ7fcEmgEd-UYMQAaXd4fQ",
	"Verify the Environment  ",
	"Verify the Environment  ",
	"Verify the environment contains the correct hardware, software, and data. Verify that the correct hardware is installed.
	This may be done visually or through a tool (such as using Windows Properties for My Computer).&nbsp;",
	"_jcjbMEmgEd-UYMQAaXd4fQ"
);
INSERT INTO task_sections VALUES (
	"_tcICsEmgEd-UYMQAaXd4fQ",
	"Verify the Tools ",
	"Verify the Tools ",
	"Verify that the correct software configuration is installed. This may be done by looking at the registry settings, 'ini'
	files, or by launching the tool and looking at some information options or configuration options.",
	"_jcjbMEmgEd-UYMQAaXd4fQ"
);
INSERT INTO task_sections VALUES (
	"_u7Q6MEmgEd-UYMQAaXd4fQ",
	"Verify Data",
	"Verify Data",
	"Verify the data contains the appropriate data. Verifying data may require using tools to visually inspect the data, or
	using an application to display the data. At some point, one or more use cases may be selected and executed (one or more
	scenarios) for each tool to ensure the tool and the results of using the tool are consistent with the need.",
	"_jcjbMEmgEd-UYMQAaXd4fQ"
);
INSERT INTO task_sections VALUES (
	"_xHb20EmgEd-UYMQAaXd4fQ",
	"Run the Tools",
	"Run the Tools",
	"<p>
	    Assemble a small team of people who know the <a class=\"elementLink\"
	    href=\"./../../practice.mgmt.project_process_tailoring.base/workproducts/tools_FA0BCC4E.html\"
	    guid=\"_AeUr0EmiEd-UYMQAaXd4fQ\">Tools</a>and the&nbsp;<a class=\"elementLink\"
	    href=\"./../../core.mgmt.common.base/workproducts/project_defined_process_8BF5845B.html\"
	    guid=\"_2CEzsLrREd-0rKmWr1vEGQ\">Project Defined Process</a>&nbsp;well, and let them run the tools.&nbsp;
	</p>
	<ul>
	    <li>
	        Test multi site, many colliding users
	    </li>
	    <li>
	        At least one use case scenario for each tool has been executed to verify the appropriate installation and
	        configuration of the tools.&nbsp;
	    </li>
	    <li>
	        Try the normal scenarios of the development process and in the tool guidelines.&nbsp;&nbsp;
	    </li>
	    <li>
	        Test the integration between different tools.&nbsp;
	    </li>
	</ul>
	<p>
	    Issue change requests if necessary.&nbsp;
	</p>",
	"_jcjbMEmgEd-UYMQAaXd4fQ"
);

INSERT INTO input_artifacts VALUES (
	"_jcjbMEmgEd-UYMQAaXd4fQ",
	"_AeUr0EmiEd-UYMQAaXd4fQ"
);

INSERT INTO output_artifacts VALUES (
	"_jcjbMEmgEd-UYMQAaXd4fQ",
	"_AeUr0EmiEd-UYMQAaXd4fQ"
);

INSERT INTO tasks VALUES (
	"_0lC70MlgEdmt3adZL5Dmdw",
	"plan_the_project",
	"Plan Project",
	"A collaborative task that outlines an initial agreement on how the project will achieve its goals. The resulting project plan provides a summary-level overview of the project.",
	"_iGSHtFZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_gu-PgIyBEdyhZb-MhCJrlA",
	"Identify a cohesive team",
	"Identify a cohesive team",
	"Revisit the resourcing for the project.&nbsp;Identify gaps and initiate hiring or re-allocation of resources as needed.
	Discuss with the team who plays which roles, and have them agree on their responsibilities.",
	"_0lC70MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_jknm8IyBEdyhZb-MhCJrlA",
	"Estimate project size",
	"Estimate project size",
	"<p>
	    The&nbsp;team produces rough size estimates for each work item&nbsp;found in the <a class=\"elementLink\"
	    href=\"./../../core.mgmt.slot.base/workproducts/project_work_slot_F12BAC46.html\" guid=\"_1QZI8EfUEdyiPI8btkmvmw\">[Project
	    Work]</a>.
	</p>
	<p>
	    Discuss with stakeholders to&nbsp;determine what is realistic to develop within the constraints of the
	    project.&nbsp;Use stakeholder priorities and estimates from the team to guide these discussions.
	</p>",
	"_0lC70MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_4Xg3QOFpEdyhmsbt0Xyl8A",
	"Forecast project velocity and duration",
	"Forecast project velocity and duration",
	"<p>
	    Define the iteration length and use it to assess target velocity. The number of items to be delivered in each iteration
	    will be set by the velocity of the team and the estimates for each item.
	</p>
	<p>
	    If the project is feature-driven, the team uses the <a class=\"elementLink\"
	    href=\"./../../core.mgmt.slot.base/workproducts/project_work_slot_F12BAC46.html\" guid=\"_1QZI8EfUEdyiPI8btkmvmw\">[Project
	    Work]</a>&nbsp;and target velocity to forecast the number of iterations required to complete the project. If the
	    project instead is date-driven, the team assesses (using the known velocity of the&nbsp;team) roughly how much work can
	    be done in the given time-frame. Out-of-scope work can be considered&nbsp;for future releases.
	</p>
	<p>
	    The team should not spend too much time&nbsp;doing this planning. The project plan should document only&nbsp;a brief
	    summary of&nbsp;project milestones&nbsp;and between one and three objectives for each iteration. Do not commit
	    individual work items to the plan, because this will force too much re-planning. The goal is just to create a
	    high-level plan outlining how&nbsp;the team&nbsp;can build the resulting application in the given set of iterations.
	    Extra levels of detail will be achieved in other planning sessions throughout the project (for example, when planning
	    iterations). You may need to revisit&nbsp;this plan&nbsp;later to adapt it based on what you will
	    learn&nbsp;by&nbsp;running&nbsp;the iterations.
	</p>",
	"_0lC70MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_lrYj0MBAEdqSgKaj2SZBmg",
	"Evaluate risks",
	"Evaluate risks",
	"<p>
	    The team identifies project risks, performs a qualitative risk analysis to assess their order of magnitude, and updates
	    the&nbsp;<a class=\"elementLink\" href=\"./../../core.mgmt.slot.base/workproducts/project_risk_slot_FC0351C4.html\"
	    guid=\"_0TkXgNpUEdyzZqGyZ7hwdw\">[Project Risk]</a>. The project manager facilitates the team decision about which risks
	    they should respond to, and which risks they should watch for.
	</p>
	<p>
	    Responses may include avoiding or mitigating risks, exploring opportunities, or increasing the probability and positive
	    impacts of the risk. Depending on the case, work items may have to be added or removed from the <a class=\"elementLink\"
	    href=\"./../../core.mgmt.slot.base/workproducts/project_work_slot_F12BAC46.html\" guid=\"_1QZI8EfUEdyiPI8btkmvmw\">[Project
	    Work]</a> to make sure that responses will be prioritized and handled by the team along with other project work.
	    Because it is not feasible to plan responses for all identified risks, the team&nbsp;may decide to accept some of them.
	    Keep the risks to watch in the risks list, and communicate them to stakeholders.&nbsp;Determine actions only if they
	    occur.
	</p>",
	"_0lC70MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_xWBhUIyBEdyhZb-MhCJrlA",
	"Establish costs and articulate value",
	"Establish costs and articulate value",
	"<p>
	    Develop a rough order of magnitude estimate for the costs of resources needed to complete project work items.&nbsp;A
	    simplified project costing model&nbsp;can be&nbsp;applied by&nbsp;multiplying the approximate cost per person for the
	    entire team by the length of an iteration to derive ongoing financial impact (that is, cost per iteration). This first
	    round of planning should keep things very rough and flexible. The goal is just to articulate value against the budget
	    constraints of the project, and to help stakeholders decide whether it is worth moving forward with the project or not.
	    If necessary, propose options to decrease costs, such as removing low-value and high-cost work items from the scope .
	</p>",
	"_0lC70MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_zeN84IyBEdyhZb-MhCJrlA",
	"Plan deployment",
	"Plan deployment",
	"<p>
	    Plan the strategy for deploying the software (and its updates) into the production environment as early as possible,
	    because it may impact the <a class=\"elementLink\"
	    href=\"./../../core.mgmt.slot.base/workproducts/project_work_slot_F12BAC46.html\" guid=\"_1QZI8EfUEdyiPI8btkmvmw\">[Project
	    Work]</a>. The team may need to discuss the release timeframe with the operations and support departments to ensure
	    that the project fits into the overall corporate deployment system.
	</p>
	<p>
	    Whenever possible, the team should consider deploying small releases (release cycles of three to four months at most).
	    Releasing software into production frequently is a good way to&nbsp;get early feedback from the users, in order
	    to&nbsp;enhance the overall product quality.
	</p>
	<p>
	    Capture the objectives for deployment and release dates in the <a class=\"elementLink\"
	    href=\"./../../practice.mgmt.release_planning.base/workproducts/project_plan_1CDBB7E4.html\"
	    guid=\"_0a6vcMlgEdmt3adZL5Dmdw\">Project Plan</a>.
	</p>",
	"_0lC70MlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0lC70MlgEdmt3adZL5Dmdw",
	"_i3vkoLS-EduDY8LNbMCDBA"
);
INSERT INTO input_artifacts VALUES (
	"_0lC70MlgEdmt3adZL5Dmdw",
	"_1QZI8EfUEdyiPI8btkmvmw"
);

INSERT INTO output_artifacts VALUES (
	"_0lC70MlgEdmt3adZL5Dmdw",
	"_0a6vcMlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_g4iB8L8HEdyWX5Yd-9QZ1A",
	"assess_results.additions",
	"",
	"",
	NULL
);

INSERT INTO task_sections VALUES (
	"_uYLJAOFYEdyhmsbt0Xyl8A",
	"Perform a retrospective (end of phase)",
	"Perform a retrospective (end of phase)",
	"<p>
	    When the assessment period coincides with the end of a phase, the corresponding milestone review takes place. These are
	    informal reviews of the work accomplished where the team and stakeholders agree on moving the project on to the next
	    phase, spanning a set of iterations with a new common goal in accordance with the emphasis of the following phase. For
	    more information, see <a class=\"elementLinkWithType\"
	    href=\"./../../practice.mgmt.risk_value_lifecycle.base/guidances/concepts/phase_milestones_5678231E.html\"
	    guid=\"_HNxbwMBJEdqSgKaj2SZBmg\">Concept: Phase Milestones</a>.
	</p>",
	"_g4iB8L8HEdyWX5Yd-9QZ1A"
);



INSERT INTO tasks VALUES (
	"_yKWvEL8HEdyWX5Yd-9QZ1A",
	"plan_the_project.additions",
	"",
	"",
	NULL
);

INSERT INTO task_sections VALUES (
	"_X63B4OFtEdyhmsbt0Xyl8A",
	"Outline project lifecycle",
	"Outline project lifecycle",
	"<p>
	    Organize&nbsp;iterations into a set of phases. Each phase in the project lifecycle will end with a milestone aimed at
	    providing stakeholders with&nbsp;oversight and steering mechanisms to control project funding, scope, risk exposure,
	    value provided, and other aspects of the process (see <a class=\"elementLinkWithType\"
	    href=\"./../../practice.mgmt.risk_value_lifecycle.base/guidances/concepts/project_lifecycle_203F87.html\"
	    guid=\"_nSfVwCNYEdyCq8v2ZO4QcA\">Concept: Project Lifecycle</a>).
	</p>",
	"_yKWvEL8HEdyWX5Yd-9QZ1A"
);



INSERT INTO tasks VALUES (
	"_0mwzEclgEdmt3adZL5Dmdw",
	"request_change",
	"Request Change",
	"Capture and record change requests.",
	"_iGSHtFZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_qEkewKuoEdmEGLSmmpF1Sg",
	"Gather change request information",
	"Gather change request information",
	"<p>
	    Gather the information required to describe the change request. This should include a description of the requested
	    change, the reason for the change (defect or enhancement), the&nbsp;artifact&nbsp;affected (including&nbsp;the
	    version), and&nbsp;the priority of the change. If possible,&nbsp;provide an estimate of the effort required to
	    implement the change.
	</p>",
	"_0mwzEclgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_r2aP0KuoEdmEGLSmmpF1Sg",
	"Update the Work Item List",
	"Update the Work Item List",
	"Update the <a class=\"elementLinkWithType\"
	href=\"./../../core.mgmt.common.extend_supp/workproducts/work_items_list_39D03CC8.html\"
	guid=\"_rGNWsCbSEdqh1LYUOGRh2A\">Artifact: Work Items List</a>&nbsp;to&nbsp;document the information that you gathered in the
	previous step.",
	"_0mwzEclgEdmt3adZL5Dmdw"
);


INSERT INTO output_artifacts VALUES (
	"_0mwzEclgEdmt3adZL5Dmdw",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);

INSERT INTO tasks VALUES (
	"_srklxgjqEdyj5bYZ0eCR5g",
	"define_discovery_roadmap",
	"Define Discovery Roadmap",
	"The definition of the discovery roadmap is an important step to understand how the development team will extract the rules from the different kind of sources. There are multiple types of roadmaps according to the different starting points and rule sources.",
	"__u-KMLRXEd-0GaneRZjjRw"
);

INSERT INTO task_sections VALUES (
	"_srklyQjqEdyj5bYZ0eCR5g",
	"Review the decision points  table with stakeholders and prioritize them",
	"Review the decision points  table with stakeholders and prioritize them",
	"<p style=\"MARGIN-LEFT: 36pt; TEXT-INDENT: -18pt; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	    <i style=\"mso-bidi-font-style: normal\"><span style=\"mso-bidi-language: HE\">Review the decision points with the
	    stakeholders and set the priority</span></i> <span style=\"mso-bidi-language: HE\">on each decision point.</span>
	    Depending of the complexity of the business process the team should prioritize which rule harvesting&nbsp;to tackle
	    first. A good practice is to start with a simple, well understood decision point, to help training the team on the
	    practice, but keep also in mind that the management wants to see the business value of what the team is working on. So
	    a decision point that is important by bringing a value, should be in the top of the list.
	</p>
	<p style=\"MARGIN-LEFT: 36pt; TEXT-INDENT: -18pt; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	    If needed review the business context to keep the business needs and reassess the priority accordingly. It is important
	    to start by extracting rules that is bringing immediate value to the business users, to get their buy in, and
	    motivation to continue to do this painful work. It may be relevant&nbsp;to start&nbsp;with the most complex business
	    scenario. It helps convincing business users and rapidly enriches the conceptual data model. It is important to set the
	    expectation among the stakeholders that not all the rules will be discovered during this phase. The goal is to complete
	    a rule set up to 40-60% to have some tangible decision on standard business event to process. The rule writers or the
	    development team will enhance the <a class=\"elementLink\"
	    href=\"./../../practice.tech.abrd.base/guidances/termdefinitions/rule_set_4D4C8DB1.html\"
	    guid=\"_DdvcwBCQEdyJtJ3PbfdVDw\">Rule Set</a> later on.
	</p>
	<p>
	    <span
	    style=\"FONT-SIZE: 10pt; FONT-FAMILY: Arial; mso-fareast-font-family: 'Times New Roman'; mso-bidi-font-family: 'Times New Roman'; mso-bidi-language: AR-SA; mso-bidi-font-size: 12.0pt; mso-ansi-language: EN-US; mso-fareast-language: EN-US\">One
	    good practice is to implement the decision logic using rules for the main stream of business processing, letting the
	    exceptions to the human. It will be always possible to add rules to manage some newly discovered exception later
	    on.&nbsp; A typical case is in the underwriting type of rules. An expert will quickly extract some basic rules that
	    always need to be true to accept the Application. As soon as the discussions start to be around the \"but there is a
	    case where ...\" a lot of new rules will arrive.</span>
	</p>",
	"_srklxgjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_srklxwjqEdyj5bYZ0eCR5g",
	"Select acquisition process according to the source of rule.",
	"Select acquisition process according to the source of rule.",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	    <span style=\"FONT-SIZE: 10pt; FONT-FAMILY: Arial\"><span style=\"mso-bidi-language: HE\">Select the acquisition process
	    according to the source of rule: Map the rule source to a suitable acquisition process:</span></span>
	</p>
	<ul>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	            <span style=\"mso-bidi-language: HE\">Human&nbsp;&nbsp; =&gt; workshop session</span>
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	            <span style=\"mso-bidi-language: HE\">Documentation (legal)&nbsp;&nbsp; =&gt;&nbsp;&nbsp; Active
	            reading&nbsp;followed and Q&amp; A sessions</span>
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	            <span style=\"mso-bidi-language: HE\">Code&nbsp;&nbsp; =&gt;&nbsp; Mining followed Q&amp;A sessions and design
	            sessions</span>
	        </div>
	    </li>
	</ul>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	    <span style=\"mso-bidi-language: HE\">When the source is people we need to start individual interview to get the core of
	    the knowledge and then follow up with workshops to resolve outstanding issues and process exception paths with the
	    team.</span>
	</p>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	    <span style=\"mso-bidi-language: HE\"><br />
	    </span><span style=\"mso-bidi-language: HE\">Modify for each decision point in the table the acquisition process chosen
	    and the owner of the process</span>
	</p>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 36.0pt; mso-list: l0 level1 lfo1\">
	    <span style=\"mso-bidi-language: HE\"><br />
	    &nbsp;</span>
	</p><br class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; tab-stops: list 72.0pt; mso-list: l0 level2 lfo1\" />
	<br />",
	"_srklxgjqEdyj5bYZ0eCR5g"
);

INSERT INTO input_artifacts VALUES (
	"_srklxgjqEdyj5bYZ0eCR5g",
	"_SlELAAsbEdyPCr4G1Tb79A"
);

INSERT INTO output_artifacts VALUES (
	"_srklxgjqEdyj5bYZ0eCR5g",
	"_sruW1QjqEdyj5bYZ0eCR5g"
);

INSERT INTO tasks VALUES (
	"_sruWxAjqEdyj5bYZ0eCR5g",
	"organise_workshop",
	"Organize Workshop",
	"In case of human source for the rule the team needs to organize elicitation workshops",
	"__u-KMLRXEd-0GaneRZjjRw"
);

INSERT INTO task_sections VALUES (
	"_sruWyQjqEdyj5bYZ0eCR5g",
	"Select a decision point",
	"Select a decision point",
	"",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruWxwjqEdyj5bYZ0eCR5g",
	"Set the agenda",
	"Set the agenda",
	"",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruWxgjqEdyj5bYZ0eCR5g",
	"Name a moderator",
	"Name a moderator",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    To organize the session the project team may need to name a moderator responsible of managing the meeting and keeping
	    the team on track. His other roles are:
	</p>
	<ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Establish professional and objective tone to the meeting.
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Start and stop the meeting on time.
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Establish and enforce the \"rules\" for the meeting.
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Introduce the goals and agenda for the meeting.
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Facilitate a process of decision and consensus making, but avoid participating in the content.
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Make certain that all stakeholders participate and have their input heard.
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Control disruptive or unproductive behavior.
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l1 level1 lfo2; tab-stops: list 36.0pt\">
	        Gather \"Open Points\" and follow up actions between sessions (use a simple Excel sheet for instance or \"Meeting
	        Minutes\" template document.
	    </li>
	</ul>",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruWyAjqEdyj5bYZ0eCR5g",
	"Define the rules of execution of each workshop session",
	"Define the rules of execution of each workshop session",
	"",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruWxQjqEdyj5bYZ0eCR5g",
	"Send invite",
	"Send invite",
	"",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);

INSERT INTO input_artifacts VALUES (
	"_sruWxAjqEdyj5bYZ0eCR5g",
	"_sruW1QjqEdyj5bYZ0eCR5g"
);

INSERT INTO output_artifacts VALUES (
	"_sruWxAjqEdyj5bYZ0eCR5g",
	"_srklwQjqEdyj5bYZ0eCR5g"
);

INSERT INTO tasks VALUES (
	"_sruWzAjqEdyj5bYZ0eCR5g",
	"review_decision_point_table",
	"Review Decision Point Table, Business Process Map, Use Case Model",
	"After the business modeling activity of the Inception Phase the project team should have a decision point table document as a source for the rule discovery phase. A review of each decision point is needed. If this table is not present the team can start by the current business process description and then layouts this DP table.",
	"__u-KMLRXEd-0GaneRZjjRw"
);

INSERT INTO task_sections VALUES (
	"_sruWzQjqEdyj5bYZ0eCR5g",
	"Get the decision point table",
	"Get the decision point table",
	"<p>
	    &nbsp;Get the&nbsp;decision point table and persist it in a project workbook. If there is no decision point table, the
	    team should develop it during this step.
	</p>
	<p>
	    If the team needs to develop a decision point table the following simple process can be done:
	</p>
	<ul>
	    <li>
	        From the business process description in BPM map or use case format, study the task or activity description and
	        search for verb&nbsp;which involves mental processing or thinking.
	    </li>
	    <li>
	        Work with the Subject Matter Expert or with the business analyst responsible to document the Business Process, and
	        address with them&nbsp;how&nbsp;decisions on those activities are taken. If there is some type of rule based
	        decision, log in a table the task reference, it forms a decision point.
	    </li>
	</ul>",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_XA_IIHrPEd2o_5d3MWaNxQ",
	"Define the source of rule for the discovery",
	"Define the source of rule for the discovery",
	"<p>
	    There are at least three kinds of source to harvest the rules from:
	</p>
	<ul>
	    <li>
	        Human: A Subject Matter Expert who has the knowledge of the business process and the decisions to take to process a
	        given event. Also a person doing the day today activity is a very good source for rule discovery and business
	        process exception management. The process to extract rule from human source will be done by using elicitation
	        workshop.
	    </li>
	    <li>
	        Documentation: legal, internal policies, procedure. Gather the documents with the reference on version, date of
	        validity... The elicitation is based on reading and Question and Answer workshop sessions.
	    </li>
	    <li>
	        Code: procedure code, SQL procedures, listing... The elicitation is based on reading the code, executes it, getting
	        data and expected results. Some care has to be taken in this case. Sometime the \"business rules\" implemented in
	        procedural code are loosing their context of execution as soon as we extract them, so code review should always be
	        complemented by workshop sessions for Q&amp;A. A rule in a system done some years ago may not apply in current
	        business context.
	    </li>
	</ul>",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruWzwjqEdyj5bYZ0eCR5g",
	"Complete the table",
	"Complete the table",
	"If from the Inception phase the table is not completed, it is important to do it before starting the pure discovery phase.",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruW0AjqEdyj5bYZ0eCR5g",
	"Gather the related documents",
	"Gather the related documents",
	"For the rule discovery based on document or code try to get all the needed documents or at least understand how
	to&nbsp;access to them. If there is no document management in place may be it is a good timing to propose something.",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_1KxREHrNEd2o_5d3MWaNxQ",
	"Set priority",
	"Set priority",
	"Review the decision points with the stakeholders and set the priority for rule harvesting at each decision point level. You
	may want to start with a simple one to train on the elicitation process and on the methodology.",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruWzgjqEdyj5bYZ0eCR5g",
	"Study some of the decision points",
	"Study some of the decision points",
	"<p>
	    Study some of the decision point and the related documents to evaluate what will be the best rule harvesting
	    process.<br />
	    To complete this section, you may need to get answers to at least the following questions:
	</p>
	<ul>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	            What is the rule type involved in this decision point? Are they underwriting rules, scoring rules, pricing
	            rules, data validation or, compliance rules?
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	            Are there any other dimension to classify the rule such as&nbsp;country/geography or product?
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	            Do the rule needs to be localized?
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	            What is the number of rules forecasted?
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	            What are examples of actual rules?
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	            What is the current process to define, document, implement, test and up-date the business rules?
	        </div>
	    </li>
	    <li>
	        <div class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	            Is there a rule sharing policy?
	        </div>
	    </li>
	</ul>",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);

INSERT INTO input_artifacts VALUES (
	"_sruWzAjqEdyj5bYZ0eCR5g",
	"_Uw8aYBDGEdyJtJ3PbfdVDw"
);

INSERT INTO output_artifacts VALUES (
	"_sruWzAjqEdyj5bYZ0eCR5g",
	"_SlELAAsbEdyPCr4G1Tb79A"
);

INSERT INTO tasks VALUES (
	"_sruW3AjqEdyj5bYZ0eCR5g",
	"execute_rule_discovery_roadmap",
	"Execute Rule Discovery Roadmap",
	"This activity or task includes the three types of rule discovery: business users and experts workshop session, document study, legacy code mining. Even if the main source of rules are documents or code, it is still important to come back to a SME to get feedbacks on the team findings.",
	"__u-KMLRXEd-0GaneRZjjRw"
);

INSERT INTO task_sections VALUES (
	"_sruW4QjqEdyj5bYZ0eCR5g",
	"Discover rule from Subject Matter Expert",
	"Discover rule from Subject Matter Expert",
	"Discover rules from Subject Matter Expert using workshop sessions. There are two types of interactions: interviews and
	analysis workshop. For interview the typical number of people in the same room is around two or three. Workshop implies a
	bigger logistic with six to ten persons involved.<span style=\"mso-bidi-language: HE\">The requirements workshop is perhaps
	the most powerful technique for eliciting requirements. It gathers all key stakeholders together for a short but intensely
	focused period. The use of an outside facilitator experienced in requirements management can ensure the success of the
	workshop. Brainstorming is the most efficient techniques used during the sessions.</span>",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruW4AjqEdyj5bYZ0eCR5g",
	"Discover rule from documentation",
	"Discover rule from documentation",
	"<p>
	    Discover rules from legal document or from policies description. When using electronic document annotate it on anything
	    that needs some future discussion, copy and paste the business policy to the rule template to clearly isolate it for
	    future analysis.
	</p>
	<p>
	    <span
	    style=\"FONT-SIZE: 10pt; FONT-FAMILY: Arial; mso-bidi-language: AR-SA; mso-bidi-font-size: 12.0pt; mso-fareast-font-family: 'Times New Roman'; mso-bidi-font-family: 'Times New Roman'; mso-ansi-language: EN-US; mso-fareast-language: EN-US\">One
	    risk with this approach is that the reader is making his own interpretation of the context, the document may not
	    include all the cases and rules, it is some time difficult to get some of the business motivation.</span>
	</p>
	<p>
	    So we recommend a strong discipline to be able to achieve the following goal:
	</p>
	<ul>
	    <li>
	        Get an exhaustive list of the business events under scope: log them in a table
	    </li>
	    <li>
	        Get the activities, tasks, processes that support the processing of those business events
	    </li>
	    <li>
	        Get the business motivation behind the rules
	    </li>
	    <li>
	        Get explanation on rule if they are unclear, ambiguous.
	    </li>
	    <li>
	        Try to extract the object model under scope, domain values
	    </li>
	</ul>",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruW3gjqEdyj5bYZ0eCR5g",
	"Discover rule from code",
	"Discover rule from code",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    <span style=\"mso-bidi-font-size: 10.0pt; mso-bidi-font-family: Arial\">Discover rules from current application code.
	    This elicitation method is time consuming and does not lead to great results. The analyst needs to study a lot of line
	    of codes, and procedures (most of the time in old computer language) to find some if statement that are linked to
	    business decision. Depending of the design and code structure of the application this work can take time. It is
	    important to do not forget the context of execution of the application when the if statement is executed, some
	    variables have can be set that may change the implemented \"business rules\". The different variable names set for a
	    concept may lead to difficulties to understand a rule.</span>
	</p>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    <span style=\"mso-bidi-font-size: 10.0pt; mso-bidi-font-family: Arial\">Code mining tools exist on the market which help
	    to extract if statement and the variables meaning. It is important to keep in mind that rule written in the past may
	    not be relevant any more.</span>
	</p>",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);
INSERT INTO task_sections VALUES (
	"_sruW3QjqEdyj5bYZ0eCR5g",
	"Document the business rules with some first level of  meta data",
	"Document the business rules with some first level of  meta data",
	"<p>
	    Use template for writing rule description during the discovery phase.
	</p>
	<p>
	    <span style=\"FONT-SIZE: 10pt; FONT-FAMILY: Arial\"><span
	    style=\"mso-bidi-font-size: 10.0pt; mso-bidi-font-family: Arial; mso-bidi-font-weight: bold\">To document the rule try to
	    use the language of the business (\"problem domain\") rather than the language of the technology (\"solution
	    domain\")</span></span>
	</p>
	<p class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt; tab-stops: 54.0pt\">
	    <span style=\"mso-bidi-font-size: 10.0pt; mso-bidi-font-family: Arial\">The following rule is as stated by a business
	    user in a car rental industry:</span>
	</p>
	<div
	style=\"BORDER-RIGHT: medium none; PADDING-RIGHT: 0cm; BORDER-TOP: medium none; PADDING-LEFT: 3pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0cm; MARGIN-LEFT: 36pt; BORDER-LEFT: gray 1.5pt solid; MARGIN-RIGHT: 0cm; PADDING-TOP: 0cm; BORDER-BOTTOM: medium none; mso-element: para-border-div\">
	    <p class=\"ISISCodeParagraph\" style=\"BACKGROUND: #f3f3f3; MARGIN: 6pt 0cm; mso-add-space: auto\">
	        <font face=\"Courier\">\"Each driver authorized to drive a car of group K must be over 29\"</font>
	    </p>
	</div><br class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\" />
	<br />
	<p class=\"MsoNormal\" style=\"MARGIN: 0cm 0cm 0pt\">
	    <span style=\"mso-bidi-font-size: 10.0pt; mso-bidi-font-family: Arial\">A rule developer may better think to document the
	    rule as</span>
	</p>
	<div
	style=\"BORDER-RIGHT: medium none; PADDING-RIGHT: 0cm; BORDER-TOP: medium none; PADDING-LEFT: 3pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0cm; MARGIN-LEFT: 36pt; BORDER-LEFT: gray 1.5pt solid; MARGIN-RIGHT: 0cm; PADDING-TOP: 0cm; BORDER-BOTTOM: medium none; mso-element: para-border-div\">
	    <p class=\"ISISCodeParagraph\" style=\"BACKGROUND: #f3f3f3; MARGIN: 6pt 0cm; mso-add-space: auto\">
	        <font face=\"Courier\">If the age of the driver is less than 29 and the requested group of the reservation is K,
	        modify the authorized attribute of the driver accordingly</font>
	    </p>
	</div>",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);

INSERT INTO input_artifacts VALUES (
	"_sruW3AjqEdyj5bYZ0eCR5g",
	"_Uw8aYBDGEdyJtJ3PbfdVDw"
);
INSERT INTO input_artifacts VALUES (
	"_sruW3AjqEdyj5bYZ0eCR5g",
	"_SlELAAsbEdyPCr4G1Tb79A"
);

INSERT INTO output_artifacts VALUES (
	"_sruW3AjqEdyj5bYZ0eCR5g",
	"_srklygjqEdyj5bYZ0eCR5g"
);
INSERT INTO output_artifacts VALUES (
	"_sruW3AjqEdyj5bYZ0eCR5g",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);
INSERT INTO output_artifacts VALUES (
	"_sruW3AjqEdyj5bYZ0eCR5g",
	"_hYc8UHr9Ed2l9d4UccBrvQ"
);

INSERT INTO tasks VALUES (
	"_A2d5sCyQEd-ER8gMc_Ftrw",
	"identify_decision_point",
	"Identify Decision Points",
	"Decision points are points of variability and decision in a business process. The goal of this task is to list the potential decision points in scope for the project.",
	"__u-KMLRXEd-0GaneRZjjRw"
);



INSERT INTO output_artifacts VALUES (
	"_A2d5sCyQEd-ER8gMc_Ftrw",
	"_SlELAAsbEdyPCr4G1Tb79A"
);
INSERT INTO output_artifacts VALUES (
	"_A2d5sCyQEd-ER8gMc_Ftrw",
	"_HSrrgGhiEd-FVuzXjnvIWA"
);

INSERT INTO tasks VALUES (
	"_8mZw8DmhEdy8N6BRpa8ByQ",
	"transform_rules",
	"Transform Rules",
	"Transform the rule to avoid ambiguity and make them more atomic",
	"_1QK4gashEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_7HEPsDmiEdy8N6BRpa8ByQ",
	"Refine Rule as Atomic",
	"Refine Rule as Atomic",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\" type=\"disc\">
	    <span
	    style=\"FONT-SIZE: 10pt; FONT-FAMILY: Arial; mso-fareast-font-family: 'Times New Roman'; mso-ansi-language: EN-US; mso-fareast-language: EN-US; mso-bidi-language: AR-SA\">A
	    rule is atomic if it cannot be further decomposed without losing meaning. Atomicity is desired for understandability,
	    ease of maintenance</span>
	</p>
	<div style=\"MARGIN-TOP: 0cm; MARGIN-LEFT: 2em\" type=\"disc\">
	    <ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Make sure each rule has one result
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            When expressed an inference rule or an action enabler, do not allow ANDs on the right hand side; break the rule
	        </li>
	        <li style=\"LIST-STYLE-TYPE: none\">
	            <ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	                <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level3 lfo1; tab-stops: list 108.0pt\">
	                    IF A THEN do(B) AND do(C)<span style=\"mso-spacerun: yes\">&nbsp;&nbsp;</span> can be rewritten as two
	                    rules IF A THEN do(B) and IF A THEN do(C)
	                </li>
	            </ul>
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            When expressing an inference rule or an action enabler, do not allow ORs on the left hand side; break the rule
	        </li>
	        <li style=\"LIST-STYLE-TYPE: none\">
	            <ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	                <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level3 lfo1; tab-stops: list 108.0pt\">
	                    IF A OR B THEN do(C) can be rewritten as two rules IF A THEN do(C) and IF B THEN do(C)
	                </li>
	            </ul>
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            When expressing constraints and guidelines, do not allow for ANDs
	        </li>
	        <li style=\"LIST-STYLE-TYPE: none\">
	            <ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	                <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level3 lfo1; tab-stops: list 108.0pt\">
	                    A driver must be 25 years old or older AND must have good credit rating
	                </li>
	                <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level3 lfo1; tab-stops: list 108.0pt\">
	                    A driver must be 25 years old or older; a driver must have good credit rating
	                </li>
	            </ul>
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Make sure that each rule contains only necessary conditions; don't over-constrain the rule applicability
	        </li>
	    </ul>
	</div>",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_tFwpYDmoEdy8N6BRpa8ByQ",
	"Remove redundant rules",
	"Remove redundant rules",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm 3pt 18pt\">
	    This step is important to avoid developing complex rule sets. Redundant rules are
	</p>
	<div style=\"MARGIN-TOP: 0cm; MARGIN-LEFT: 2em\" type=\"disc\">
	    <ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Duplicated rules
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Duplicated through some transformations (renaming, inversion of conditions, etc.)
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Redundancies among rules that create a common data value or a common truth value, or initiate a common action
	        </li>
	    </ul>
	</div>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    <span lang=\"EN-CA\" style=\"mso-ansi-language: EN-CA\"><span style=\"mso-spacerun: yes\">&nbsp;&nbsp;&nbsp;&nbsp;</span>
	    This step is made simpler if we make the rules atomic, for otherwise, we will be lost in the equivalence of complex
	    logical formulas (e.g. If NOT (A AND B) is equivalent to<span style=\"mso-spacerun: yes\">&nbsp;</span> IF (NOT A) OR
	    (NOT B)). There are for sure more subtle forms of redundancy: IF A AND B THEN C is equivalent to IF (NOT C) THEN (NOT
	    A) OR (NOT B). Some time changing the order of conditions can help to highlight same rules: <span
	    style=\"mso-spacerun: yes\">&nbsp;</span>IF A AND B THEN C is the same as IF B AND A THEN C</span>
	</p>",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_vMBLQDmoEdy8N6BRpa8ByQ",
	"Remove inconsistency rules",
	"Remove inconsistency rules",
	"<p>
	    <span
	    style=\"FONT-SIZE: 10pt; FONT-FAMILY: Arial; mso-fareast-font-family: 'Times New Roman'; mso-ansi-language: EN-US; mso-fareast-language: EN-US; mso-bidi-language: AR-SA\">Overlapping
	    rules are partially redundant because they are not semantically equivalent but they point to problems: One rule may say
	    IF A AND B THEN C, the other says IF A THEN C. The question is, is B really needed to infer C? One of the two rules
	    should be eliminated.</span>
	</p>
	<p>
	    It is also possible to get semantically equivalent conditions, contradictory conclusions: two rules like IF A THEN B;
	    and IF A THEN NOT(B) are leading us to have two conflicting rules, probably coming from two different sources.
	    Typically, this is symptomatic of the fact that we are missing some necessary conditions in either rule (or both, e.g.:
	    IF A AND C THEN B; IF A AND D THEN NOT(B))
	</p>
	<p>
	    Another standard case is around the same conclusions derived from contradictory conditions: rules like IF A THEN B;
	    <span style=\"mso-spacerun: yes\">&nbsp;</span>and IF NOT (A) THEN B: Logically, this means that the conclusions should
	    always be true. This is symptomatic of the fact that the condition is really not relevant to the conclusion
	</p><br />
	<br />",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_LmcIADmqEdy8N6BRpa8ByQ",
	"Ensure completeness among rules",
	"Ensure completeness among rules",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	    We are often considering three kinds of completeness:
	</p>
	<div style=\"MARGIN-TOP: 0cm; MARGIN-LEFT: 2em\" type=\"disc\">
	    <ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Make sure that all the possibilities are covered for a given rule pattern. If you have a rule that says \"loans
	            for value greater than 250,000 $ should be approved by the branch manager\", it does not tell us who must/can
	            approve loans of value less than 250,000 $
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Make sure that all derived data in the object model has corresponding computation or inference rules. This
	            involves computed attributes, qualifications (e.g. customer status, account type, etc.)
	        </li>
	        <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level2 lfo1; tab-stops: list 72.0pt\">
	            Make sure that integrity and cardinality constraints are somehow represented. Either in the object model or in
	            rules
	        </li>
	    </ul>
	</div>",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_w3cyUDmoEdy8N6BRpa8ByQ",
	"Analyze rule volatility",
	"Analyze rule volatility",
	"<span
	style=\"FONT-SIZE: 10pt; FONT-FAMILY: Arial; mso-fareast-font-family: 'Times New Roman'; mso-ansi-language: EN-US; mso-fareast-language: EN-US; mso-bidi-language: AR-SA\">This
	a good timing to ask the business user how often the rule will change once we did the rule transformation.</span>",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_0-T6ADmoEdy8N6BRpa8ByQ",
	"Understand rule dependencies, rule sharing",
	"Understand rule dependencies, rule sharing",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	    A rule R1 depends on a rule R2 if the enforcement of R2 results into a situation where R1 is relevant (or needs to be
	    enforced). A simple common example, is a rule R2 which is creating new data, or is modifying existing data that is
	    tested by R1.
	</p><br class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\" />
	<br />
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	    Understanding dependencies help determine the likely \"execution\" sequence of rules. The execution sequence is useful
	    for rule analysis to detect undesirable dependencies to plan rule testing. For the implementation the execution
	    sequence is useful to understand how the results will look like: some rule engine tools&nbsp;will determine that
	    sequence automatically, and on the fly (chaining). If we implement business rules in a procedural fashion, we need to
	    understand the execution sequence to enforce it
	</p>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	    <span lang=\"EN-CA\" style=\"mso-ansi-language: EN-CA\">Some of the undesirable dependencies include circular dependencies
	    leading to infinite loops. Others will cause us to re-evaluate rule jurisdiction</span>
	</p><br class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\" />
	<br />
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	    <span lang=\"EN-CA\" style=\"mso-ansi-language: EN-CA\">When the work is done the last step is to look at how rule can be
	    shared between process flow. Rule sharing is an important step of the analysis. It can be done once we have progressed
	    in the rule set implementation. Rule re-factoring activity can help on implementing some rule sharing pattern.</span>
	</p>",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);

INSERT INTO input_artifacts VALUES (
	"_8mZw8DmhEdy8N6BRpa8ByQ",
	"_csL3wHrMEd2o_5d3MWaNxQ"
);
INSERT INTO input_artifacts VALUES (
	"_8mZw8DmhEdy8N6BRpa8ByQ",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);
INSERT INTO input_artifacts VALUES (
	"_8mZw8DmhEdy8N6BRpa8ByQ",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);

INSERT INTO output_artifacts VALUES (
	"_8mZw8DmhEdy8N6BRpa8ByQ",
	"_csL3wHrMEd2o_5d3MWaNxQ"
);
INSERT INTO output_artifacts VALUES (
	"_8mZw8DmhEdy8N6BRpa8ByQ",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);
INSERT INTO output_artifacts VALUES (
	"_8mZw8DmhEdy8N6BRpa8ByQ",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);

INSERT INTO tasks VALUES (
	"_prtzIDmiEdy8N6BRpa8ByQ",
	"synchronize_data_model",
	"Synchronize Data Models",
	"Ensure the terms and entities used in the rule march element in the different date models used by the IT components",
	"_1QK4gashEd-4oa5dU5v0Eg"
);


INSERT INTO input_artifacts VALUES (
	"_prtzIDmiEdy8N6BRpa8ByQ",
	"_csL3wHrMEd2o_5d3MWaNxQ"
);
INSERT INTO input_artifacts VALUES (
	"_prtzIDmiEdy8N6BRpa8ByQ",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);
INSERT INTO input_artifacts VALUES (
	"_prtzIDmiEdy8N6BRpa8ByQ",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);

INSERT INTO output_artifacts VALUES (
	"_prtzIDmiEdy8N6BRpa8ByQ",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);
INSERT INTO output_artifacts VALUES (
	"_prtzIDmiEdy8N6BRpa8ByQ",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);

INSERT INTO tasks VALUES (
	"_o19QgF2BEd2T6cNSe41mOg",
	"extract_rule_meaning",
	"Extract Rule Meaning",
	"Extract the semantic of the rule to prepare for a data model and to remove any ambiguity and redundancy.",
	"_1QK4gashEd-4oa5dU5v0Eg"
);


INSERT INTO input_artifacts VALUES (
	"_o19QgF2BEd2T6cNSe41mOg",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);

INSERT INTO output_artifacts VALUES (
	"_o19QgF2BEd2T6cNSe41mOg",
	"_csL3wHrMEd2o_5d3MWaNxQ"
);
INSERT INTO output_artifacts VALUES (
	"_o19QgF2BEd2T6cNSe41mOg",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);

INSERT INTO tasks VALUES (
	"_1dlWkH3GEd2sJcA0evSBQw",
	"build_test_scenario",
	"Build Test Scenarios",
	"Work with analysis team to define concrete scenario with real data so that we can later on test the process and the rules.",
	"_1QK4gashEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_nOQHsAp6EdyPCr4G1Tb79A",
	"develop_architecture",
	"Develop Business Rule Application Architecture",
	"The purpose of the architecture activities is to support the following major items:
	•	Integrate the Rule Engine into the business application
	•	Deploy Business Rules Management System into the business and IT organizations.",
	"_1QK4gKshEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_RMRccChaEd2bfOOTyXGWkw",
	"Analyze business and technical requirements",
	"Analyze business and technical requirements",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO task_sections VALUES (
	"_yIEJ4Ap6EdyPCr4G1Tb79A",
	"Design the decision service interface",
	"Design the decision service interface",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO task_sections VALUES (
	"_r5SRoChaEd2bfOOTyXGWkw",
	"Implement the interface with POJO / EJB or .Net classes",
	"Implement the interface with POJO / EJB or .Net classes",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO task_sections VALUES (
	"_venZkChaEd2bfOOTyXGWkw",
	"Add the connection code to the BRE",
	"Add the connection code to the BRE",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO task_sections VALUES (
	"_yFzeQChaEd2bfOOTyXGWkw",
	"Design the control parameters to add to the context of the rule execution",
	"Design the control parameters to add to the context of the rule execution",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO task_sections VALUES (
	"_HDD68Im5Ed2cL6yqw-_-uA",
	"Design the transaction propagation",
	"Design the transaction propagation",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO task_sections VALUES (
	"_04xVIChaEd2bfOOTyXGWkw",
	"Design the exception reporting",
	"Design the exception reporting",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO task_sections VALUES (
	"_27c-kChaEd2bfOOTyXGWkw",
	"Assess Performance",
	"Assess Performance",
	"",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);

INSERT INTO input_artifacts VALUES (
	"_nOQHsAp6EdyPCr4G1Tb79A",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);
INSERT INTO input_artifacts VALUES (
	"_nOQHsAp6EdyPCr4G1Tb79A",
	"_SlELAAsbEdyPCr4G1Tb79A"
);

INSERT INTO output_artifacts VALUES (
	"_nOQHsAp6EdyPCr4G1Tb79A",
	"_6BE7QAp_EdyPCr4G1Tb79A"
);

INSERT INTO tasks VALUES (
	"_lYC2IGDAEdyKlZvvtnMrMg",
	"design_models_for_bre",
	"Design Business Object Models for Rule Engine Processing",
	"Design the object model to be processed by the rule engine. ",
	"_1QK4gKshEd-4oa5dU5v0Eg"
);


INSERT INTO input_artifacts VALUES (
	"_lYC2IGDAEdyKlZvvtnMrMg",
	"_csL3wHrMEd2o_5d3MWaNxQ"
);
INSERT INTO input_artifacts VALUES (
	"_lYC2IGDAEdyKlZvvtnMrMg",
	"_sruW2AjqEdyj5bYZ0eCR5g"
);

INSERT INTO output_artifacts VALUES (
	"_lYC2IGDAEdyKlZvvtnMrMg",
	"_U003IIm4Ed2cL6yqw-_-uA"
);

INSERT INTO tasks VALUES (
	"_HMQasGDFEdyKlZvvtnMrMg",
	"design_reference_data_integration",
	"Design Integration to Reference Data",
	"Reference data are everywhere in business application, from basic enumeration value like the US sates to business codes with business meaning (like medical code). Those references data should be managed in a central Data Base or repository. The Rule engine needs to access them at execution but also during the authoring phase.",
	"_1QK4gKshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_6-p2EH_BEd2YWI_0AZcMOA",
	"integrate_bre",
	"Integrate BRE within Service Layer",
	"The integration of the rule engine can be done in different approaches depending of the type of application, and architecture.",
	"_1QK4gKshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_Y2CxEDzEEdyA6a_I80swHw",
	"develop_rules",
	"Develop Rules",
	"This task is about developing each rule in the rule project.",
	"_1QK4gqshEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_bsPp8ErtEdyEE-k1R6LmOA",
	"Develop Business Rules",
	"Develop Business Rules",
	"Using template or not, the rule writer write the rule as described during the rule discovery and analysis.",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"_qfzk4ErtEdyEE-k1R6LmOA",
	"Develop Decision Tables",
	"Develop Decision Tables",
	"See also <a class=\"elementLink\"
	href=\"./../../practice.tech.abrd.base/guidances/termdefinitions/decision_table_57A218C1.html\"
	guid=\"_iDLJcBCaEdyJtJ3PbfdVDw\">Decision table</a>",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"_tdNKIErtEdyEE-k1R6LmOA",
	"Develop Decision Tree",
	"Develop Decision Tree",
	"See <a class=\"elementLink\" href=\"./../../practice.tech.abrd.base/guidances/termdefinitions/decision_tree_D98E94D4.html\"
	guid=\"_dVXOsEbNEdySHMdInS9eGA\">Decision tree</a>",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"_zAvrMErtEdyEE-k1R6LmOA",
	"Develop Technical Rules",
	"Develop Technical Rules",
	"Technical rules are not exposed to the business user, but are needed for rule execution efficiency. Part of this categories
	are rules that loop on a collection and assert all the object in the working memory. Technical rules leverage the full
	power of the rule language and the programming language",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"_GvK9oEruEdyEE-k1R6LmOA",
	"Develop external helper functions",
	"Develop external helper functions",
	"To improve performance, or accessibility or to simplify rule writing, it may make sense to implement some reusable logic
	in&nbsp;helper classes and methods instead of rules. Example of such methods are logger of trace, or sorting policies, or
	delegate the call&nbsp;to more complex reusable services.",
	"_Y2CxEDzEEdyA6a_I80swHw"
);


INSERT INTO output_artifacts VALUES (
	"_Y2CxEDzEEdyA6a_I80swHw",
	"_vjWPcDzEEdyA6a_I80swHw"
);

INSERT INTO tasks VALUES (
	"_ioCPkDzEEdyA6a_I80swHw",
	"develop_unit_tests",
	"Develop Rule Unit Tests",
	"The goal of this task is to track down anomalies in the rules such as conflicts, redundancies or overlaps.
	",
	"_1QK4gqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_JCHfMEXhEdy14e5PT9v3HQ",
	"execute_rule_set",
	"Execute Rule Set",
	"Execute the tests to trigger the rule execution. Analyze the output logs. Report issues.",
	"_1QK4gqshEd-4oa5dU5v0Eg"
);



INSERT INTO output_artifacts VALUES (
	"_JCHfMEXhEdy14e5PT9v3HQ",
	"_vjWPcDzEEdyA6a_I80swHw"
);

INSERT INTO tasks VALUES (
	"_yGbYIEb0EdySHMdInS9eGA",
	"log_issue",
	"Log Issue",
	"",
	"_1QK4gqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_UXrv8Eb3EdySHMdInS9eGA",
	"enhance_object_models",
	"Enhance Object Models",
	"The data model is started during the analysis and design tasks. But it will involve over time. So this activity supports the enhancement of the object models.",
	"_1QK4gqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_AgQVAD5QEdyA6a_I80swHw",
	"deploy_rules",
	"Deploy Rules",
	"Deploy rule set in the integrated core application",
	"_1QK4g6shEd-4oa5dU5v0Eg"
);


INSERT INTO input_artifacts VALUES (
	"_AgQVAD5QEdyA6a_I80swHw",
	"_vjWPcDzEEdyA6a_I80swHw"
);

INSERT INTO output_artifacts VALUES (
	"_AgQVAD5QEdyA6a_I80swHw",
	"_vjWPcDzEEdyA6a_I80swHw"
);

INSERT INTO tasks VALUES (
	"_YkGwYFtsEdykEsBjRsVfZw",
	"synchronize_with_wrms",
	"Synchronize with Web-Based Rule Management System",
	"",
	"_1QK4g6shEd-4oa5dU5v0Eg"
);



INSERT INTO output_artifacts VALUES (
	"_YkGwYFtsEdykEsBjRsVfZw",
	"_jqxtYFttEdykEsBjRsVfZw"
);

INSERT INTO tasks VALUES (
	"_RBu1YFH7Edy72tV0zV7--Q",
	"define_rule_life_cycle",
	"Define Rule Life Cycle",
	"",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);



INSERT INTO output_artifacts VALUES (
	"_RBu1YFH7Edy72tV0zV7--Q",
	"_DmUjsFH8Edy72tV0zV7--Q"
);

INSERT INTO tasks VALUES (
	"_RBu1YVH7Edy72tV0zV7--Q",
	"define_ruleset_life_cycle",
	"Define Rule Set Life Cycle ",
	"",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_z9ORcKnrEdyzmOHu2kw1UA",
	"maintain_rules",
	"Maintain Rules",
	"The goal of this task is to maintain the rules in order to correct faults or improve performance.",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);


INSERT INTO input_artifacts VALUES (
	"_z9ORcKnrEdyzmOHu2kw1UA",
	"_vjWPcDzEEdyA6a_I80swHw"
);
INSERT INTO input_artifacts VALUES (
	"_z9ORcKnrEdyzmOHu2kw1UA",
	"_jqxtYFttEdykEsBjRsVfZw"
);

INSERT INTO output_artifacts VALUES (
	"_z9ORcKnrEdyzmOHu2kw1UA",
	"_vjWPcDzEEdyA6a_I80swHw"
);
INSERT INTO output_artifacts VALUES (
	"_z9ORcKnrEdyzmOHu2kw1UA",
	"_jqxtYFttEdykEsBjRsVfZw"
);

INSERT INTO tasks VALUES (
	"_IFeJQKveEd2Pv_z50upsAg",
	"develop_organization_map",
	"Develop Organization Map",
	"The first task in rule governance consists in understanding the enterprise's organizational structure to help in defining the adequate rule governance actors and the Rule Management Team.",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"__8xccKvgEd2Pv_z50upsAg",
	"Understand Enterprise's Organizational Model",
	"Understand Enterprise's Organizational Model",
	"<p>
	    Understanding the enterprise's organizational structure is essential to identify the groups involved in the project
	    (internal and external), understand their relationships, define the flow of information between these groups and define
	    the necessary review steps in the flow with regarding to rule management.
	</p>",
	"_IFeJQKveEd2Pv_z50upsAg"
);
INSERT INTO task_sections VALUES (
	"_MJLScKviEd2Pv_z50upsAg",
	"Define Rule Governance Actors",
	"Define Rule Governance Actors",
	"Identify the actors of the rule governance processes, their role, their responsibility, and department/unit to which they
	belong.",
	"_IFeJQKveEd2Pv_z50upsAg"
);
INSERT INTO task_sections VALUES (
	"_U7ZWAKviEd2Pv_z50upsAg",
	"Define Rule Management Team",
	"Define Rule Management Team",
	"Set up a dedicated group to manage the rules at the enterprise level and to define and execute the governance processes.
	This group can be named \"Rule Management Team\".",
	"_IFeJQKveEd2Pv_z50upsAg"
);


INSERT INTO output_artifacts VALUES (
	"_IFeJQKveEd2Pv_z50upsAg",
	"__hcZYGDrEdyKlZvvtnMrMg"
);
INSERT INTO output_artifacts VALUES (
	"_IFeJQKveEd2Pv_z50upsAg",
	"_VzXG0GDtEdyKlZvvtnMrMg"
);

INSERT INTO tasks VALUES (
	"_O93X4KvzEd2Pv_z50upsAg",
	"define_ruleset_ownership",
	"Define Rule Set Ownership and Access Control",
	"For each rule set it has to be defined one owner and access control for team members and others. ",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_tzUvgKv7Ed2Pv_z50upsAg",
	"define_policy_change_templates",
	"Define Business Policy Change Templates",
	"Define an inventory of probable ways in which the policies may or will change and with which frequency.",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_E5968Kv8Ed2Pv_z50upsAg",
	"plan_deployment",
	"Plan Deployment",
	"Plan deployment procedures for the different platforms: testing, staging and production. Also plan for production monitoring. ",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_deyUkKv8Ed2Pv_z50upsAg",
	"develop_process_maps",
	"Develop Process Maps",
	"For each of the rule development and management processes, the architect should develop a process map to be followed during rule governance.",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_9jqRIKy-Ed2aLdlF48Bk1g",
	"Develop Rule Change Management Process Map",
	"Develop Rule Change Management Process Map",
	"Describes the tasks and actors involved in rule change management.",
	"_deyUkKv8Ed2Pv_z50upsAg"
);
INSERT INTO task_sections VALUES (
	"_K4JmAKy_Ed2aLdlF48Bk1g",
	"Develop Rule Authoring Process Map",
	"Develop Rule Authoring Process Map",
	"Describes the tasks and actors involved in rule authoring.",
	"_deyUkKv8Ed2Pv_z50upsAg"
);
INSERT INTO task_sections VALUES (
	"_aZ6DsKy_Ed2aLdlF48Bk1g",
	"Develop Rule Testing Process Map",
	"Develop Rule Testing Process Map",
	"Describes the tasks and actors involved in rule testing.",
	"_deyUkKv8Ed2Pv_z50upsAg"
);
INSERT INTO task_sections VALUES (
	"_lmDzEKy_Ed2aLdlF48Bk1g",
	"Develop Rule Deployment Process Map",
	"Develop Rule Deployment Process Map",
	"Describes the tasks and actors involved in rule deployment.",
	"_deyUkKv8Ed2Pv_z50upsAg"
);
INSERT INTO task_sections VALUES (
	"_rMlWsKy_Ed2aLdlF48Bk1g",
	"Develop Rule Execution Process Map",
	"Develop Rule Execution Process Map",
	"Describes the tasks and actors involved in rule execution.",
	"_deyUkKv8Ed2Pv_z50upsAg"
);
INSERT INTO task_sections VALUES (
	"__pNL4Ky_Ed2aLdlF48Bk1g",
	"Develop Rule Retirement Process Map",
	"Develop Rule Retirement Process Map",
	"Describes the tasks and actors involved in rule retirement.",
	"_deyUkKv8Ed2Pv_z50upsAg"
);



INSERT INTO tasks VALUES (
	"_w0x40KzAEd2aLdlF48Bk1g",
	"monitor_improve_process",
	"Monitor and Improve Process",
	"Rule governance process should be monitored and improved to achieve better efficiency.",
	"_1QK4hqshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_cik88EtZEdyEE-k1R6LmOA",
	"test_analysis",
	"Test Analysis",
	"",
	"_1QK4h6shEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_cik88UtZEdyEE-k1R6LmOA",
	"Analyze what rules fired and their effect on objects",
	"Analyze what rules fired and their effect on objects",
	"",
	"_cik88EtZEdyEE-k1R6LmOA"
);
INSERT INTO task_sections VALUES (
	"_cik880tZEdyEE-k1R6LmOA",
	"Analyze what assertions failed",
	"Analyze what assertions failed",
	"",
	"_cik88EtZEdyEE-k1R6LmOA"
);
INSERT INTO task_sections VALUES (
	"_cik88ktZEdyEE-k1R6LmOA",
	"Analyze what's the impact on the business",
	"Analyze what's the impact on the business",
	"",
	"_cik88EtZEdyEE-k1R6LmOA"
);

INSERT INTO input_artifacts VALUES (
	"_cik88EtZEdyEE-k1R6LmOA",
	"_arqeoEtZEdyEE-k1R6LmOA"
);
INSERT INTO input_artifacts VALUES (
	"_cik88EtZEdyEE-k1R6LmOA",
	"_arqeoUtZEdyEE-k1R6LmOA"
);


INSERT INTO tasks VALUES (
	"_CmBe4EtaEdyEE-k1R6LmOA",
	"get_sme_feedback",
	"Get SME Feedback",
	"",
	"_1QK4h6shEd-4oa5dU5v0Eg"
);


INSERT INTO input_artifacts VALUES (
	"_CmBe4EtaEdyEE-k1R6LmOA",
	"_arqeoUtZEdyEE-k1R6LmOA"
);

INSERT INTO output_artifacts VALUES (
	"_CmBe4EtaEdyEE-k1R6LmOA",
	"_BnlgsEtaEdyEE-k1R6LmOA"
);

INSERT INTO tasks VALUES (
	"_euAb8FtuEdykEsBjRsVfZw",
	"execute_ruleset_functional_test",
	"Execute Rule Set Functional Tests",
	"Validate the function supported by the rule set with end to end scenarios. This involve client code calling the rule service.",
	"_1QK4h6shEd-4oa5dU5v0Eg"
);


INSERT INTO input_artifacts VALUES (
	"_euAb8FtuEdykEsBjRsVfZw",
	"_vjWPcDzEEdyA6a_I80swHw"
);


INSERT INTO tasks VALUES (
	"_LGd_MFtvEdykEsBjRsVfZw",
	"get_rule_set_reports",
	"Get Rule Set Reports",
	"",
	"_1QK4h6shEd-4oa5dU5v0Eg"
);



INSERT INTO output_artifacts VALUES (
	"_LGd_MFtvEdykEsBjRsVfZw",
	"_arqeoUtZEdyEE-k1R6LmOA"
);

INSERT INTO tasks VALUES (
	"_eAWtgFv3EdykEsBjRsVfZw",
	"define_data_scenario",
	"Define Data Scenarios to Test Rule",
	"This task supports the definition of the data used to trigger the rule execution in scope for validating the rule set quality.",
	"_1QK4h6shEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_mDL5YGhkEd-FVuzXjnvIWA",
	"define_ruleset_testing",
	"Define Rule Testing Approach",
	"Rule testing has been a crucial and intensive task within rule development, due to the nature of a lot of business rules working together.",
	"_1QK4h6shEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_ZffcIDmiEdy8N6BRpa8ByQ",
	"build_object_models",
	"Build Object Models",
	"",
	"_1QK4hKshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_O92DQDV5EdyTBtGu8YeFfg",
	"build_rule_project_structure",
	"Build Rule Project Structure",
	"Designing and building how the rule will be managed is an important activity of a BRMS project. This task describes how to build the set of rule and non rules projects that support the business application.",
	"_1QK4hKshEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_OBfOkDuhEdy8N6BRpa8ByQ",
	"Create projects structure",
	"Create projects structure",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    <span style=\"mso-bidi-language: HE\"><span style=\"mso-bidi-language: HE\">Using Eclipse for Java project or Visual Studio
	    for .Net development, the developer needs <span style=\"mso-spacerun: yes\">&nbsp;</span>to create the project structure
	    with at least the following projects:</span></span>
	</p>
	<ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">A java project for the Executable object model that supports the Domain Object
	        Model as described in the Logical Data Model</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">Rule projects. By design the rule project, the architect needs to try to map
	        one rule set per rule project.</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">A java project for the Core business application, including service interface
	        definition of the rule services</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">GUI project like web interface using the code business application</span>
	    </li>
	</ul>
	<p>
	    <span style=\"mso-bidi-language: HE\">Within a rule project defines:</span>
	</p>
	<ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">The rule set parameters</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">The references to the object model used</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">The rule flow structure, at least a first simple version that will be enhanced
	        during the future iterations</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">Some initialization method or function to be able to unit test the rule
	        project</span>
	    </li>
	</ul>",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO task_sections VALUES (
	"_RVoYoDyNEdyA6a_I80swHw",
	"For each rule projects, specify the objects to be manipulated by the ruleset",
	"For each rule projects, specify the objects to be manipulated by the ruleset",
	"This includes rule set parameters, but also the underlying object model used by the rules.",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO task_sections VALUES (
	"_3jNuADyNEdyA6a_I80swHw",
	"Create a Natural Language Layer on top of the data model",
	"Create a Natural Language Layer on top of the data model",
	"",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO task_sections VALUES (
	"_O92DQTV5EdyTBtGu8YeFfg",
	"Define rule meta properties",
	"Define rule meta properties",
	"<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    <span style=\"mso-bidi-language: HE\">The development team need to define each rule's meta properties to be used during
	    rule management and rule execution (filtering of rules or reporting on rule execution.</span>
	</p>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    <span style=\"mso-bidi-language: HE\">The common properties are:</span>
	</p>
	<ul style=\"MARGIN-TOP: 0cm\" type=\"disc\">
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">Rule ID, author, owner: to trace the rule changes</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">Expiration date, Effective date: to filter the rule according to time</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">The status to manage the rule life cycle to avoid deploying rule in development
	        stages</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">Business motivation, Policy reference, requirement reference: to reference rule
	        back to the requirements</span>
	    </li>
	    <li class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm; mso-list: l0 level1 lfo1; tab-stops: list 36.0pt\">
	        <span style=\"mso-bidi-language: HE\">Product reference, states, geographies: to manage rule per type of deployment
	        or other dimension of application</span>
	    </li>
	</ul>
	<p class=\"MsoNormal\" style=\"MARGIN: 3pt 0cm\">
	    <span style=\"mso-bidi-language: HE\">&nbsp;The following tables lists some example of properties an analyst can design
	    to manage a rule:</span>
	</p><br class=\"MsoNormal\" style=\"MARGIN: 3pt 0in\" />
	<br />
	<div align=\"center\">
	    <table class=\"MsoNormalTable\" style=\"WIDTH: 468.9pt; BORDER-COLLAPSE: collapse; mso-padding-alt: 0in 0in 0in 0in\"
	    cellspacing=\"0\" cellpadding=\"0\" width=\"625\" border=\"0\">
	        <tbody>
	            <tr style=\"HEIGHT: 18.75pt; mso-yfti-irow: 0; mso-yfti-firstrow: yes\">
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: gray 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Property name</span></i></b>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Type</span></i></b>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"71\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Possible Value</span></i></b>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Description</span></i></b>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Null able</span></i></b>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Changeable</span></i></b>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Extractable</span></i></b>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: gray 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: gray 1pt solid; PADDING-LEFT: 5.4pt; BACKGROUND: #f3f3f3; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: gray 1pt solid; HEIGHT: 18.75pt\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in; TEXT-ALIGN: center\" align=\"center\">
	                        <b><i><span lang=\"EN\" style=\"COLOR: #005da0; mso-ansi-language: EN\">Required</span></i></b>
	                    </p>
	                </td>
	            </tr>
	            <tr style=\"HEIGHT: 25.5pt; mso-yfti-irow: 1\">
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: silver 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Rule ID</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Int or string</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"71\">
	                    <br class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\" />
	                    <br />
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Unique identifier for the
	                        rules</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">Yes</span>
	                    </p>
	                </td>
	            </tr>
	            <tr style=\"HEIGHT: 25.5pt; mso-yfti-irow: 2\">
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: silver 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">BusinessMotivation</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">String</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"71\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">\"\"</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Link the rule to the business
	                        motivation</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">&nbsp;No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">&nbsp;No</span>
	                    </p>
	                </td>
	            </tr>
	            <tr style=\"HEIGHT: 25.5pt; mso-yfti-irow: 3\">
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: silver 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">PolicyReference</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">String</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"71\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">\"\"</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Link the rule to a business
	                        policy</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">&nbsp;No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">&nbsp;No</span>
	                    </p>
	                </td>
	            </tr>
	            <tr style=\"HEIGHT: 25.5pt; mso-yfti-irow: 4\">
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: silver 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">Status</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">String</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"71\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">New, Defined, Deployable, Deployed</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">Support the life cycle of the rule</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">&nbsp;</span><span lang=\"EN\"
	                        style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	            </tr>
	            <tr style=\"HEIGHT: 25.5pt; mso-yfti-irow: 5\">
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: silver 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Rule Owner</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">String</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"71\">
	                    <br class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\" />
	                    <br />
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Department team – no named
	                        person</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">&nbsp;No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">&nbsp;</span><span lang=\"EN\"
	                        style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	            </tr>
	            <tr style=\"HEIGHT: 25.5pt; mso-yfti-irow: 6\">
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: silver 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Expiration Date</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Date</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"71\">
	                    <br class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\" />
	                    <br />
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Date when the rule will not be
	                        extracted</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 25.5pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">No</span>
	                    </p>
	                </td>
	            </tr>
	            <tr style=\"HEIGHT: 5.85pt; mso-yfti-irow: 7; mso-yfti-lastrow: yes\">
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: silver 1pt solid; WIDTH: 79.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"106\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Effective Date</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 34.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"46\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Date</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 53.05pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"71\">
	                    <br class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\" />
	                    <br />
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 84.7pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"113\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Date from when the rule will be
	                        extracted</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 30.85pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"41\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 67.5pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"90\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span lang=\"EN\" style=\"FONT-SIZE: 8pt; mso-ansi-language: EN\">Yes</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 64.75pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"86\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">No</span>
	                    </p>
	                </td>
	                <td
	                style=\"BORDER-RIGHT: silver 1pt solid; PADDING-RIGHT: 5.4pt; BORDER-TOP: #ece9d8; PADDING-LEFT: 5.4pt; PADDING-BOTTOM: 0in; BORDER-LEFT: #ece9d8; WIDTH: 54.15pt; PADDING-TOP: 0in; BORDER-BOTTOM: silver 1pt solid; HEIGHT: 5.85pt; BACKGROUND-COLOR: transparent; mso-border-top-alt: solid silver 1.0pt\"
	                 valign=\"top\" width=\"72\">
	                    <p class=\"msonormalcxspmiddle\" style=\"MARGIN: auto 0in\">
	                        <span style=\"FONT-SIZE: 8pt\">No</span>
	                    </p>
	                </td>
	            </tr>
	        </tbody>
	    </table>
	</div><br class=\"MsoNormal\" style=\"MARGIN: 3pt 0in\" />
	<br />",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO task_sections VALUES (
	"_94ET8DugEdy8N6BRpa8ByQ",
	"Document Rule Set interface",
	"Document Rule Set interface",
	"Use the rule set table template to present how the rule services are designed",
	"_O92DQDV5EdyTBtGu8YeFfg"
);



INSERT INTO tasks VALUES (
	"_qzveUBk5Edyoe_hnDlTB5A",
	"determine_rule_implementation",
	"Determine Rule Implementation",
	"This task tries to answer the question of where to implement the business rules that have been discovered.",
	"_1QK4hKshEd-4oa5dU5v0Eg"
);




INSERT INTO tasks VALUES (
	"_dds-IDmiEdy8N6BRpa8ByQ",
	"prototype_rules",
	"Prototype Rules",
	"Prototyping rules is an important step of the rule analysis, as it is when we are really coding that issues arrived. Paper work is fine, but working rules is far better.",
	"_1QK4hKshEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_tA5YEDyIEdyA6a_I80swHw",
	"Create a simple rule flow",
	"Create a simple rule flow",
	"<a id=\"1086688\" name=\"1086688\">The ruleflow defines the execution order of rule artifacts within the context of a larger
	decision.</a>",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_usf-QDyIEdyA6a_I80swHw",
	"Prepare a simple unit test code",
	"Prepare a simple unit test code",
	"<p>
	    The unit test should prepare the input parameter(s) and other related data to trigger the rule execution under
	    development. Rule writer should work with the business user to define test data and scenario. Using the IDE to author
	    and test rules the rule testing framework can be created, executed, tuned in the same environment to quickly write and
	    test rules. As Agile method we recommend to use a Test Driven Development approach.
	</p>",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_6OjFIDyIEdyA6a_I80swHw",
	"Code the rule under test",
	"Code the rule under test",
	"",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_8RaUwDyIEdyA6a_I80swHw",
	"Validate the execution",
	"Validate the execution",
	"",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);
INSERT INTO task_sections VALUES (
	"_-ThWcDyIEdyA6a_I80swHw",
	"Report any issue, questions, concerns for the next discovery meeting",
	"Report any issue, questions, concerns for the next discovery meeting",
	"",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);



INSERT INTO tasks VALUES (
	"_7L2MIDyOEdyA6a_I80swHw",
	"define_ruleset",
	"Define Rule Set",
	"",
	"_1QK4hKshEd-4oa5dU5v0Eg"
);

INSERT INTO task_sections VALUES (
	"_uGtsEErrEdyEE-k1R6LmOA",
	"Define rule set parameters",
	"Define rule set parameters",
	"",
	"_7L2MIDyOEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"_pIE9sEafEdySHMdInS9eGA",
	"Develop or enhance prototyped Rule Flow",
	"Develop or enhance prototyped Rule Flow",
	"Organize the tasks with the business logic and the technical rules needed to prepare the rule execution. There are always a
	need to have some functions, technical rules, or asserting type of rules (rule without conditions which are asserting
	object in working memory) that needs to be included in pre or post processing of the rule flow.",
	"_7L2MIDyOEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"__SG24DyOEdyA6a_I80swHw",
	"Selecting and Extracting the Rule Artifacts that Go Into the Ruleset",
	"Selecting and Extracting the Rule Artifacts that Go Into the Ruleset",
	"",
	"_7L2MIDyOEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"_vYhSMErrEdyEE-k1R6LmOA",
	"Work on the rule execution sequence",
	"Work on the rule execution sequence",
	"",
	"_7L2MIDyOEdyA6a_I80swHw"
);
INSERT INTO task_sections VALUES (
	"_4V6rAErrEdyEE-k1R6LmOA",
	"Define when a rule is part or not of a rule set",
	"Define when a rule is part or not of a rule set",
	"",
	"_7L2MIDyOEdyA6a_I80swHw"
);

INSERT INTO input_artifacts VALUES (
	"_7L2MIDyOEdyA6a_I80swHw",
	"_SlELAAsbEdyPCr4G1Tb79A"
);
INSERT INTO input_artifacts VALUES (
	"_7L2MIDyOEdyA6a_I80swHw",
	"_sruW2gjqEdyj5bYZ0eCR5g"
);

INSERT INTO output_artifacts VALUES (
	"_7L2MIDyOEdyA6a_I80swHw",
	"_vjWPcDzEEdyA6a_I80swHw"
);

INSERT INTO tasks VALUES (
	"_0iwc0clgEdmt3adZL5Dmdw",
	"create_test_cases",
	"Create Test Cases",
	"Develop the test cases and test data for the requirements to be tested.",
	"_iGSHtlZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_IJFSsKuSEdmhFZtkg1nakg",
	"Review the requirements to be tested",
	"Review the requirements to be tested",
	"<p>
	    Work with analysts and developers&nbsp;to identify which scenarios and requirements&nbsp;need new or additional test
	    cases. Review the Plans&nbsp;to ensure you understand the scope of development for the current iteration.<br />
	</p>",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_aDe_ILGcEdubqf8m_Zrvvg",
	"Identify relevant Test Cases",
	"Identify relevant Test Cases",
	"<p>
	    Identify paths through the scenario as unique test conditions.&nbsp; Consider alternative or exception paths from both
	    a positive and negative perspective.&nbsp;&nbsp;Review the test ideas list for patterns of test cases that apply to the
	    scenario.
	</p>
	<p>
	    Discuss the requirement with&nbsp;stakeholders to identify other conditions of satisfaction for the requirement.
	</p>
	<p>
	    List the test cases with a unique name that identifies the condition they evaluate or their expected result.
	</p>",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_LpbM8KuSEdmhFZtkg1nakg",
	"Outline the Test Cases",
	"Outline the Test Cases",
	"<p>
	    For each test case, write a brief description with an expected result.&nbsp; Ensure that a casual reader can clearly
	    understand the difference between test cases.&nbsp; Note the logical pre-conditions and post-conditions that apply to
	    each test case. Optionally, outline steps for the test case.
	</p>
	<p>
	    Verify that test cases meet the <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/checklists/test_case_9D3F2E96.html\"
	    guid=\"_0Zxf8MlgEdmt3adZL5Dmdw\">Checklist: Test Case</a>&nbsp;guidelines.
	</p>",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_NK18YKuSEdmhFZtkg1nakg",
	"Identify test data needs",
	"Identify test data needs",
	"<p>
	    Review each test case and note where data input or output might be required. Identify the type, quantity, and
	    uniqueness of the required data, and add these observations to the test case. Focus on articulating the data needed and
	    not on creating specific data.
	</p>
	<p>
	    For more information on test data selection, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/checklists/test_data_48E804D.html\"
	    guid=\"_KZQJMBhBEduxCP6DVVLxsA\">Checklist: Test Data</a>.
	</p>",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_Ok_mMKuSEdmhFZtkg1nakg",
	"Share and evaluate the Test Cases",
	"Share and evaluate the Test Cases",
	"<p>
	    Walk through the test cases with the analysts and developers&nbsp;responsible for the related
	    scenario.&nbsp;&nbsp;Ideally, the stakeholders will&nbsp;also participate.
	</p>
	<p>
	    Ask the participants to agree that if <em>these test cases pass</em>, they will consider these requirements
	    implemented.&nbsp; Elicit additional test ideas from Analysts and stakeholders to ensure you understand the expected
	    behavior of the scenario.
	</p>
	<p>
	    During the walkthrough, ensure that:
	</p>
	<ul>
	    <li>
	        The requirements&nbsp;planned for the current iteration have test cases.
	    </li>
	    <li>
	        All the participants agree with the expected results of the test cases.
	    </li>
	    <li>
	        There are no&nbsp;<em>other</em> conditions of satisfaction for the requirement being tested, which indicates
	        either a missing test case or a missing requirement.
	    </li>
	</ul>
	<p>
	    Optionally, capture new patterns of test cases&nbsp;in&nbsp;the test ideas list (see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/test_ideas_ED562B58.html\"
	    guid=\"_0jnYcMlgEdmt3adZL5Dmdw\">Concept: Test Ideas</a>).
	</p>",
	"_0iwc0clgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0iwc0clgEdmt3adZL5Dmdw",
	"_i3vkoLS-EduDY8LNbMCDBA"
);

INSERT INTO output_artifacts VALUES (
	"_0iwc0clgEdmt3adZL5Dmdw",
	"_0ZS-0MlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_0jO98MlgEdmt3adZL5Dmdw",
	"implement_tests",
	"Implement Tests",
	"Implement Test Scripts to validate a Build of the solution. Organize Test Scripts into suites, and collaborate to ensure appropriate depth and breadth of test feedback.",
	"_iGSHtlZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_A56NkKRKEdyLP-jEVj8Kyw",
	"Select Test Cases to implement",
	"Select Test Cases to implement",
	"<p>
	    Select a set of Test Cases to develop into detailed, executable Test Scripts.&nbsp;
	</p>
	<p>
	    Work with project managers and developers to determine which Test Cases need detailed Test Scripts during the current
	    iteration. At a minimum, select Test Cases for requirements that are planned in the current or next iteration.
	</p>
	<p>
	    Perform each subsequent step in this task for each Test Script.
	</p>",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_WucQ4KRKEdyLP-jEVj8Kyw",
	"Design the Test Script",
	"Design the Test Script",
	"<p>
	    Sketch an outline of the Test Script as a logical sequence of steps. Review the data requirements of the Test Case, and
	    determine if existing data sets are sufficient, or if you need to develop new test data for this Test Script. Examine
	    system-wide requirements that apply to this Test Script, and note where they affect the expected results of a step.
	</p>
	<p>
	    If available, review a build that implements the scenario, or demonstrates similar functionality.
	</p>Select an implementation technique for this design. At a minimum, determine if the Test Script will be manual or
	automated. If the Test Case is well understood, it's best to implement an automated Test Script without first writing a
	manual procedure. However, if the Test Case is new or novel, writing a manual Test Script can help validate the design of
	the test and aid collaboration with other team members. See <a class=\"elementLinkWithType\"
	href=\"./../../core.tech.common.extend_supp/guidances/guidelines/programming_automated_tests_7DA10019.html\"
	guid=\"_0j5sUMlgEdmt3adZL5Dmdw\">Guideline: Programming Automated Tests</a> for more details about this decision.",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_VN5M0KuSEdmhFZtkg1nakg",
	"Implement the executable Test Script",
	"Implement the executable Test Script",
	"<p>
	    Develop a detailed, procedural Test Script based on your design. Use a request-response style that declares an exact
	    input, and expects an exact output.
	</p>
	<p>
	    Explain the pre-conditions that must be met before running this Test Script. Use temporary test data or put parameters
	    in your script for data values. Ensure that each post-condition in the Test Case is evaluated by steps in the Test
	    Script.
	</p>",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_WvBoYKuSEdmhFZtkg1nakg",
	"Define specific test data",
	"Define specific test data",
	"<p>
	    Specify data values that are specific to the Test Script or reference existing test data. For example, instead of
	    specifying \"a prime number\", indicate an actual value such as \"3.\"
	</p>
	<p>
	    If the Test Script uses a dataset (such as a file or database), add the new test data to it and parameterize the Test
	    Script to retrieve values from the dataset. Otherwise, add executable test data values to the steps of the Test Script.
	    This applies to both manual and automated scripts.
	</p>
	<p>
	    Identify and minimize dependencies between test data used or modified by other Test Scripts. Note dependencies in the
	    Test Script.
	</p>
	<p>
	    If necessary, create containers for your test data sets, and separate the production data from generated data.
	</p>",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_2IA70KRKEdyLP-jEVj8Kyw",
	"Organize Test Scripts into suites",
	"Organize Test Scripts into suites",
	"<p>
	    Collect tests into related groups. The grouping you use depends on your test environment. Since the system under test
	    is undergoing its own evolution, create your test suites to facilitate regression testing, as well as system
	    configuration identification.
	</p>
	<p>
	    For help with test suite organization, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/guidelines/test_suite_D54EEBED.html\"
	    guid=\"_0aDz0MlgEdmt3adZL5Dmdw\">Guideline: Test Suite</a>.
	</p>",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_X0dmcKuSEdmhFZtkg1nakg",
	"Verify Test implementation",
	"Verify Test implementation",
	"<p>
	    Run the Test Script to verify that it implements the Test Case correctly. For manual testing, conduct a walkthrough of
	    the Test Script. For automated tests, verify that the Test Script executes correctly and produces the expected result.
	</p>
	<p>
	    Verify that the Test Script meets the criteria in <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/checklists/test_script_FBB4524E.html\"
	    guid=\"_0Z9tMMlgEdmt3adZL5Dmdw\">Checklist: Test Script</a>.
	</p>
	<p>
	    Add or update the Test Script(s) in configuration management.
	</p>",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_ABwoIKRLEdyLP-jEVj8Kyw",
	"Share and evaluate Test Scripts",
	"Share and evaluate Test Scripts",
	"<p>
	    Walk through the new or refined Test Scripts with the developers responsible for the related
	    scenarios.&nbsp;Optionally, the&nbsp;analysts and the stakeholders&nbsp;also participate.
	</p>
	<p>
	    Seek agreement that the Test Scripts correctly evaluate the expected results of the test, and that you understand the
	    implementation of the requirements. If the scenario is already implemented (such as in a developer workspace), walk
	    through a representative set of the Test Scripts using an implementation of the system.
	</p>",
	"_0jO98MlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0jO98MlgEdmt3adZL5Dmdw",
	"_0ZS-0MlgEdmt3adZL5Dmdw"
);

INSERT INTO output_artifacts VALUES (
	"_0jO98MlgEdmt3adZL5Dmdw",
	"_0ZfMEMlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_0jVEkMlgEdmt3adZL5Dmdw",
	"run_tests",
	"Run Tests",
	"Run the appropriate tests scripts, analyze results, articulate issues, and communicate test results to the team.",
	"_iGSHtlZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_xVhnwKRLEdyLP-jEVj8Kyw",
	"Review work items completed in the build",
	"Review work items completed in the build",
	"Review work items that were integrated into the build since the last test cycle. Focus on identifying any previously
	unimplemented or failing requirements are now expected to meet the conditions of satisfaction.",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_1L1yAKRLEdyLP-jEVj8Kyw",
	"Select Test Scripts",
	"Select Test Scripts",
	"<p>
	    Select test scripts related to work items completed in the build.
	</p>
	<p>
	    Ideally, each test cycle should execute all test scripts, but some types of tests are too time-consuming to include in
	    each test cycle. For manual or time-intensive tests, include test scripts that will provide the most useful feedback
	    about the maturing solution based on the objectives of the iteration.
	</p>
	<p>
	    Plan with test suites to&nbsp;simplify the process of selecting tests for each build (see <a
	    class=\"elementLinkWithType\" href=\"./../../core.tech.common.extend_supp/guidances/guidelines/test_suite_D54EEBED.html\"
	    guid=\"_0aDz0MlgEdmt3adZL5Dmdw\">Guideline: Test Suite</a>).
	</p>",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_gV408KuSEdmhFZtkg1nakg",
	"Execute Test Scripts against the build",
	"Execute Test Scripts against the build",
	"<p>
	    Run the tests using the step-by-step procedure in the <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/workproducts/test_script_39A30BA2.html\" guid=\"_0ZfMEMlgEdmt3adZL5Dmdw\">Test
	    Script</a>.
	</p>
	<p>
	    For automated test scripts, initiate the test execution.&nbsp;Automated test scripts should run in suites in the
	    correct sequence, and collect results in the Test Log.
	</p>
	<p>
	    To execute a manual test script, establish its preconditions, perform the steps while logging results in the <a
	    class=\"elementLink\" href=\"./../../core.tech.common.extend_supp/workproducts/test_log_CBA2FDF4.html\"
	    guid=\"_0ZlSsMlgEdmt3adZL5Dmdw\">Test Log</a>, and perform any teardown steps.
	</p>",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_sQaC4DO2EduqsLmIADMQ9g",
	"Analyze and communicate test results",
	"Analyze and communicate test results",
	"<p>
	    Post the test results in a conspicuous place that is accessible to the entire team, such as a white board or Wiki.
	</p>
	<p>
	    For each failing test script, analyze the Test Log to identify the cause of the test failure. Begin with failing tests
	    that you expected to begin passing against this build, which may indicate newly delivered work items that do not meet
	    the conditions of satisfaction. Then review previously passing test scripts that are now failing, which may indicate
	    regressive issues in the build.
	</p>
	<ul>
	    <li>
	        If a test failed because the solution does not meet the conditions of satisfaction for the test case, log the issue
	        in the Work Items List. In the work item, clearly identify the observed behavior, the expected behavior, and steps
	        to repeat the issue. Note which failing test initially discovered the issue.
	    </li>
	    <li>
	        If a test failed because of a change in the system (such as a user-interface change), but the implementation still
	        meets the conditions of satisfaction in the test case, update the test script to pass with the new implementation.
	    </li>
	    <li>
	        If a test failed because the test script is incorrect (a false negative result) or passed when it was expected to
	        fail (a false positive result), update the test script to correctly implement the conditions of satisfaction in the
	        test case. If the test case for a requirement is invalid, create a request change to modify the conditions of
	        satisfaction for the requirement.&nbsp;
	    </li>
	</ul>
	<p>
	    It's best to update test scripts as quickly and continuously as possible. If the change to the test script is trivial,
	    update the test while analyzing the test results. If the change is a non-trivial task, submit it to the Work Items List
	    so it can be prioritized against other tasks.
	</p>",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_3t6oADO2EduqsLmIADMQ9g",
	"Provide feedback to the team",
	"Provide feedback to the team",
	"<p>
	    Summarize and provide feedback to the team about how well the build satisfies the requirements planned to the
	    iteration. Focus on measuring progress in terms of passing tests.
	</p>
	<p>
	    Explain the results for the test cycle&nbsp;in the context of overall trends:
	</p>
	<ul>
	    <li>
	        How many tests were selected for the build, and what&nbsp;are their statuses (pass, fail, blocked, not run, etc.)?
	    </li>
	    <li>
	        How many issues were added to the Work Items List, and what are their statuses and severities?
	    </li>
	    <li>
	        For test scripts that were blocked or skipped, what are the main reasons (such as known issues)?
	    </li>
	</ul>",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0jVEkMlgEdmt3adZL5Dmdw",
	"_0ZfMEMlgEdmt3adZL5Dmdw"
);
INSERT INTO input_artifacts VALUES (
	"_0jVEkMlgEdmt3adZL5Dmdw",
	"_Vux8UEfUEdyiPI8btkmvmw"
);

INSERT INTO output_artifacts VALUES (
	"_0jVEkMlgEdmt3adZL5Dmdw",
	"_0ZlSsMlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_kkZBgJOKEdyaRbFYa4AN4A",
	"integrate_and_create_build",
	"Integrate and Create Build",
	"This task describes how to integrate all changes made by developers into the code base and perform the minimal testing to validate the build.",
	"_iGSHsVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_kkZBhZOKEdyaRbFYa4AN4A",
	"Integrate implemented elements",
	"Integrate implemented elements",
	"<p>
	    In&nbsp;the relevant&nbsp;<a class=\"elementLink\"
	    href=\"./../../practice.tech.continuous_integration.base/guidances/concepts/workspace_722BBA90.html\"
	    guid=\"_0cEmAMlgEdmt3adZL5Dmdw\">Workspace</a>, combine all completed&nbsp;<a class=\"elementLink\"
	    href=\"./../../core.mgmt.common.extend_supp/guidances/concepts/change_set_430BF233.html\"
	    guid=\"_1QU9MAIoEdyLh7vsrHZ4YA\">Change Set</a>s that are not in the latest baseline. Resolve any conflicting versions of
	    the artifacts by either removing one of the change sets that created the conflict&nbsp;or by creating a new change set
	    that includes merged versions of the conflicting artifacts.
	</p>",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO task_sections VALUES (
	"_kkZBgpOKEdyaRbFYa4AN4A",
	"Create build",
	"Create build",
	"<p>
	    Create the build.&nbsp;The details of this step depend upon the implementation language and development environment and
	    may involve compiling and linking (in the case of compiled languages) and/or other processes that result in an
	    executable increment of the system.
	</p>
	<p>
	    Examples of these steps&nbsp;include:
	</p>
	<ol>
	    <li>
	        Compiling and linking the source artifacts to create an executable
	    </li>
	    <li>
	        Loading binary objects on a test bench or simulator
	    </li>
	    <li>
	        Running a script to load/update database schemas
	    </li>
	    <li>
	        Packaging and deploying web applications<br />
	    </li>
	</ol>",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO task_sections VALUES (
	"_kkZBhJOKEdyaRbFYa4AN4A",
	"Test integrated elements",
	"Test integrated elements",
	"<p>
	    Re-run the developer tests against the integrated elements to verify that they behave the same as they did in
	    isolation. Ensure that the scope of these&nbsp;tests is as broad as possible, which ensures that the latest change sets
	    did not cause failing developer tests in other areas of the system.
	</p>",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO task_sections VALUES (
	"_kkZBg5OKEdyaRbFYa4AN4A",
	"Run \"Smoke Tests\"",
	"Run \"Smoke Tests\"",
	"<p>
	    Several builds will be created in each iteration. For each build, this step is performed only when change sets have
	    been delivered to satisfy the requirements of that build.
	</p>
	<p>
	    Execute a sub-set of the system tests to ensure that the build is suitable prior to committing resources to the full
	    scope of system testing.&nbsp;While the level of testing will vary, focus on gaining confidence that the increment is
	    of sufficient quality to establish a baseline for system testing.
	</p>",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO task_sections VALUES (
	"_kkZBgZOKEdyaRbFYa4AN4A",
	"Make changes available",
	"Make changes available",
	"<p>
	    When tests are successfully completed and the build is considered \"good,\" the results&nbsp;are made available to the
	    rest of the team by <a class=\"elementLink\"
	    href=\"./../../practice.tech.continuous_integration.base/guidances/guidelines/promoting_changes_9087B764.html\"
	    guid=\"_SM4YIL6dEdqti4GwqTkbsQ\">Promoting Changes</a>.&nbsp;The details of this step depend on the configuration
	    management tools in use, but in general this involves committing&nbsp;a tested change set to the CM repository so that
	    it&nbsp;serves as the basis of development for the next increment of the system.&nbsp; This is the essence of <a
	    class=\"elementLink\"
	    href=\"./../../practice.tech.continuous_integration.base/guidances/guidelines/continuous_integration_13C1A8CA.html\"
	    guid=\"_i8bUEL6cEdqti4GwqTkbsQ\">Continuous Integration</a>.
	</p>",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);

INSERT INTO input_artifacts VALUES (
	"_kkZBgJOKEdyaRbFYa4AN4A",
	"_0ZfMEMlgEdmt3adZL5Dmdw"
);
INSERT INTO input_artifacts VALUES (
	"_kkZBgJOKEdyaRbFYa4AN4A",
	"_Vux8UEfUEdyiPI8btkmvmw"
);

INSERT INTO output_artifacts VALUES (
	"_kkZBgJOKEdyaRbFYa4AN4A",
	"_0YuXEMlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_s4ojQNqREdy88NBoQgfGyg",
	"envision_the_arch.vm",
	"",
	"",
	NULL
);




INSERT INTO tasks VALUES (
	"_1kmN0NqREdy88NBoQgfGyg",
	"refine_the_arch.vm",
	"",
	"",
	NULL
);




INSERT INTO tasks VALUES (
	"_0f-1oMlgEdmt3adZL5Dmdw",
	"envision_the_arch",
	"Envision the Architecture",
	"This task is where the \"vision\" for the architecture is developed through analysis of the architecturally significant requirements and identification of architectural constraints, decisions and objectives.",
	"_iGSHsFZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_3nMQQA3rEduibvKwrGxWxA",
	"Identify architectural goals",
	"Identify architectural goals",
	"<p>
	    Work with the team to describe the remaining goals for the architecture and identify which ones are appropriate to
	    address for this iteration.&nbsp;Look at&nbsp;the requirements and speak to the people asking for them to
	    make&nbsp;sure that the&nbsp;critical goals for this iteration are well understood. These goals will prioritize and
	    guide the approach to important technical decisions.<br />
	</p>
	<p>
	    It's important to regularly review the status of these goals throughout the project to make sure that they are still
	    valid and that the system is on track to deliver them.
	</p>
	<p>
	    For more information, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_goals_CB41D8AE.html\"
	    guid=\"_HlRqANpbEdyP58ppo1Ieaw\">Concept: Architectural Goals</a>.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_f0y2kM25Edym_ZFqrJcXUg",
	"Identify architecturally significant requirements",
	"Identify architecturally significant requirements",
	"<p>
	    Identify which of the current requirements are architecturally significant.&nbsp;Explore and refine those that must be
	    implemented in order to realize the architectural goals for the current iteration. See <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_significant_requirements_1EE5D757.html\"
	    guid=\"_HrZGIA4MEduibvKwrGxWxA\">Concept: Architecturally Significant Requirements</a>&nbsp;for more information.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_9o6Z4CSCEdqDjNgZyGMf5w",
	"Identify constraints on the architecture",
	"Identify constraints on the architecture",
	"<p>
	    List any constraints on the architecture and any trade-offs between competing requirements and resources. Decide how
	    the architecture will meet these issues. Justify each of the decisions made and capture this information. Regularly
	    review the list of constraints to make sure that they are still valid and that no new ones have appeared.<br />
	</p>
	<p>
	    For more information, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_constraints_AE56B662.html\"
	    guid=\"_jdKSsNpiEdyP58ppo1Ieaw\">Concept: Architectural Constraints</a>.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_I32E4MP2EdmWKcx6ixEiwg",
	"Identify key abstractions",
	"Identify key abstractions",
	"<p>
	    Identify the key concepts and abstractions that the system needs to handle. The requirements are good sources for key
	    abstractions.&nbsp; Don't spend too much time describing&nbsp;abstractions in detail at this initial stage, because
	    there is a risk that spending too much time will result in identifying classes and relationships that the solution does
	    not actually need.
	</p>
	<p>
	    When&nbsp;identifying&nbsp;key abstractions, it can be useful to also define any obvious relationships that exist
	    between them.&nbsp;These can be captured in a table or&nbsp;in diagrams (in a tool or whiteboard.&nbsp;In general, it
	    is not worth agonizing over defining a highly detailed set of relationships at this early stage in design. The
	    relationships will become more concrete and detailed later and will&nbsp;probably modify&nbsp;these
	    early&nbsp;assumptions.&nbsp;
	</p>
	<p>
	    For more information, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/key_abstractions_1474DBF2.html\"
	    guid=\"_pLEGUNqGEdy88NBoQgfGyg\">Concept: Key Abstractions</a>.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_B899cMP2EdmWKcx6ixEiwg",
	"Identify reuse opportunities",
	"Identify reuse opportunities",
	"<p>
	    Survey, assess, and select available assets.&nbsp; Identify assets from other areas that may be reused in the current
	    architecture. For more information, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/guidelines/software_reuse_B6B04C26.html\"
	    guid=\"_vO2uoO0OEduUpsu85bVhiQ\">Guideline: Software Reuse</a>.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_FVrlsMP2EdmWKcx6ixEiwg",
	"Define approach for partitioning the system",
	"Define approach for partitioning the system",
	"<p>
	    Decide how to partition the software, both in logical and physical terms. Partitioning your system helps you manage its
	    complexity by using the well-known \"divide and conquer\" strategy. By breaking the process into smaller and more
	    manageable pieces, you make development easier.
	</p>
	<p>
	    As a minimum, decide on:
	</p>
	<ul>
	    <li>
	        How to partition the software when managing development (the use of layering as a partitioning strategy, for
	        example).&nbsp; For more information, see <a class=\"elementLinkWithType\"
	        href=\"./../../core.tech.common.extend_supp/guidances/guidelines/layering_F169CF07.html\"
	        guid=\"_0gpkAMlgEdmt3adZL5Dmdw\">Guideline: Layering</a>.
	    </li>
	    <li>
	        How the software will be composed at run time.
	    </li>
	</ul>
	<p>
	    For each software partition, briefly describe
	</p>
	<ul>
	    <li>
	        Its name and purpose.
	    </li>
	    <li>
	        Its relationships to other partitions.
	    </li>
	</ul>
	<p>
	    At this point, you do not need to identify the elements that should be placed in each of these partitions.&nbsp;
	    Instead, you define how many partitions you will need and how they should be related. Later, during&nbsp;design
	    activities, you decide which elements will populate these partitions.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_tmvWwE5cEducxZ_XZXh-vw",
	"Define approach for deploying the system",
	"Define approach for deploying the system",
	"<p>
	    Outline how the software will deploy over the nodes on the network. Work with stakeholders such as network support and
	    deployment teams to ensure that the proposed approach is a good fit for the wider technical environment.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_KBAsYMP2EdmWKcx6ixEiwg",
	"Identify architectural mechanisms",
	"Identify architectural mechanisms",
	"<p>
	    Make a list of the&nbsp;technical services that the system needs to provide and capture some basic information about
	    each item on the list. It's generally a good idea to make an initial&nbsp;list of all the mechanisms required for the
	    project and then prioritize the development of those that need to be&nbsp;delivered to achieve the architectural goals.
	</p>
	<p>
	    At this point, usually only the analysis mechanisms are defined.&nbsp; However, specific <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_constraints_AE56B662.html\"
	    guid=\"_jdKSsNpiEdyP58ppo1Ieaw\">Architectural Constraints</a>&nbsp;may mean that some of those mechanisms can be
	    described as design mechanisms (even at this early stage).
	</p>
	<p>
	    For more information on architectural mechanisms, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_mechanism_2932DFB6.html\"
	    guid=\"_mzxI0A4LEduibvKwrGxWxA\">Concept: Architectural Mechanism</a>.&nbsp;
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_RKSLsNp3EdyItewP9R0w7Q",
	"Identify interfaces to external systems",
	"Identify interfaces to external systems",
	"<p>
	    At this point, identify the external systems with which this system must interact.&nbsp; An external system may be
	    anything from software to hardware units that the current system will use, such as printers, terminals, alarm devices,
	    and sensors.
	</p>
	<p>
	    Describe those interfaces at a high level, concentrating on the information that must pass between the systems.
	</p>",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_Q2PRIFHSEd2zrOgIte8oWg",
	"Verify architectural consistency",
	"Verify architectural consistency",
	"Work with the team&nbsp;to verify that the architecture is consistent with the requirements and that the descriptions of
	the architecture are complete, meaningful, and clear.",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_Xia1QFHSEd2zrOgIte8oWg",
	"Capture and communicate architectural decisions",
	"Capture and communicate architectural decisions",
	"Capture important decisions about the architecture in the <a class=\"elementLink\"
	href=\"./../../practice.tech.evolutionary_arch.base/workproducts/architecture_notebook_9BB92433.html\"
	guid=\"_0XAf0MlgEdmt3adZL5Dmdw\">Architecture Notebook</a>&nbsp;for future reference. Make sure that&nbsp;the team
	understands the architecture&nbsp;and can deliver it.",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0f-1oMlgEdmt3adZL5Dmdw",
	"_i3vkoLS-EduDY8LNbMCDBA"
);

INSERT INTO output_artifacts VALUES (
	"_0f-1oMlgEdmt3adZL5Dmdw",
	"_0XAf0MlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_0gRJgMlgEdmt3adZL5Dmdw",
	"refine_the_arch",
	"Refine the Architecture",
	"Refine the architecture to an appropriate level of detail to support development.",
	"_iGSHsFZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_l92AYNpaEdyP58ppo1Ieaw",
	"Refine the architectural goals and architecturally-significant requirements",
	"Refine the architectural goals and architecturally-significant requirements",
	"<p>
	    Work with the team, especially the stakeholders and the requirements team, to review the status of the <a
	    class=\"elementLink\" href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_goals_CB41D8AE.html\"
	    guid=\"_HlRqANpbEdyP58ppo1Ieaw\">Architectural Goals</a>&nbsp;and <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_significant_requirements_1EE5D757.html\"
	    guid=\"_HrZGIA4MEduibvKwrGxWxA\">Architecturally Significant Requirements</a>&nbsp;and refine them as needed. It may be
	    that some new architecturally-significant requirements have been introduced or your architectural goals and priorities
	    may have changed.
	</p>
	<p>
	    The development work performed so far will also inform the decisions and goals you've identified. Use information from
	    designing and implementing the system so far to adjust and refined those decisions and goals.
	</p>",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_G_k1kBaqEduSTJywppIxVQ",
	"Identify architecturally significant design elements",
	"Identify architecturally significant design elements",
	"<p align=\"left\">
	    Identify concrete&nbsp;design elements (such as <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/component_CB167D48.html\"
	    guid=\"_0YP18MlgEdmt3adZL5Dmdw\">Component</a>s, classes and&nbsp;subsystems)&nbsp;and provide at least a name and brief
	    description for each.
	</p>
	<p align=\"left\">
	    The following are some good sources for design elements:
	</p>
	<ul>
	    <li>
	        <div align=\"left\">
	            <div align=\"left\">
	                <a class=\"elementLink\"
	                href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_significant_requirements_1EE5D757.html\"
	                guid=\"_HrZGIA4MEduibvKwrGxWxA\">Architecturally Significant Requirements</a>. Highlight the areas of the
	                architecture that participate in realizing, or implementing, the requirements.
	            </div>
	        </div>
	    </li>
	    <li>
	        <div align=\"left\">
	            <div align=\"left\">
	                <a class=\"elementLink\"
	                href=\"./../../core.tech.common.extend_supp/guidances/concepts/key_abstractions_1474DBF2.html\"
	                guid=\"_pLEGUNqGEdy88NBoQgfGyg\">Key Abstractions</a>
	            </div>
	        </div>
	    </li>
	    <li>
	        <div align=\"left\">
	            <div align=\"left\">
	                Components that encapsulate the system's interface with external systems.&nbsp; For more information, see
	                <a class=\"elementLinkWithType\"
	                href=\"./../../core.tech.common.extend_supp/guidances/guidelines/repres_interfaces_to_ext_systems_51A34F6E.html\"
	                 guid=\"_0gjdYMlgEdmt3adZL5Dmdw\">Guideline: Representing Interfaces to External Systems</a>
	            </div>
	        </div>
	    </li>
	    <li>
	        Components that implement the <a class=\"elementLink\"
	        href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_mechanism_2932DFB6.html\"
	        guid=\"_mzxI0A4LEduibvKwrGxWxA\">Architectural Mechanism</a>s
	    </li>
	    <li>
	        Architectural and key design <a class=\"elementLink\"
	        href=\"./../../core.tech.common.extend_supp/guidances/concepts/pattern_10BE6D96.html\"
	        guid=\"_0YJvUMlgEdmt3adZL5Dmdw\">Pattern</a>s. Apply the chosen patterns to define a new set of elements that conform
	        to the patterns.
	    </li>
	</ul>
	<p>
	    Identifying components will help hide the complexity of the system and help you work at a higher level. Components need
	    to be internally cohesive and to provide external services through a limited interface.&nbsp; At this point, interfaces
	    do not need to be as detailed as a signature, but they do need to document what the elements need, what they can use,
	    and what they can depend on.
	</p>
	<p>
	    Component identification can be&nbsp;based on architectural layers, deployment choices, or key abstractions. Ask
	    yourself these questions:
	</p>
	<ul>
	    <li>
	        What is logically or functionally related (same use case or service, for example)?
	    </li>
	    <li>
	        What entities provide services to multiple others?
	    </li>
	    <li>
	        What entities depend on each other? Strongly or weakly?
	    </li>
	    <li>
	        What entities should you be able to exchange independently from others?
	    </li>
	    <li>
	        What will run on the same processor or network node?
	    </li>
	    <li>
	        What parts are constrained by similar performance requirements?
	    </li>
	</ul>
	<p>
	    When you identify a component be sure to briefly describe the functionality that should be allocated to the components.
	</p>",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_0qoQ8CikEduQBKSg5n118w",
	"Refine architectural mechanisms",
	"Refine architectural mechanisms",
	"<p>
	    Refine&nbsp;the applicable <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_mechanism_2932DFB6.html\"
	    guid=\"_mzxI0A4LEduibvKwrGxWxA\">Architectural Mechanism</a>s, as needed to support the design.&nbsp; For example,
	    refining an analysis mechanism into a design mechanism and/or refining a design mechanism into an implementation
	    mechanism.&nbsp;<br />
	</p>",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_82iI0FHOEd2zrOgIte8oWg",
	"Define development architecture and test architecture",
	"Define development architecture and test architecture",
	"Ensure that the development and test architectures are defined. Note any architecturally significant differences between
	these environments and work with the team to devise strategies to mitigate any risks these may introduce.",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_Vdln8MP3EdmWKcx6ixEiwg",
	"Identify additional reuse opportunities",
	"Identify additional reuse opportunities",
	"<p dir=\"ltr\" style=\"MARGIN-RIGHT: 0px\">
	    Continue to look for more opportunities to reuse existing assets.&nbsp; Where applicable, identify existing components
	    that could be built to be reused.
	</p>
	<p dir=\"ltr\" style=\"MARGIN-RIGHT: 0px\">
	    For more information, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/guidelines/software_reuse_B6B04C26.html\"
	    guid=\"_vO2uoO0OEduUpsu85bVhiQ\">Guideline: Software Reuse</a>.
	</p>",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_GFLpsFHPEd2zrOgIte8oWg",
	"Validate the architecture",
	"Validate the architecture",
	"Make sure that the architecture supports the requirements and the needs of the team. <br />
	<br />
	Development work should be performed to produce just enough working software to show that the architecture is viable. This
	should provide the definitive basis for validating the suitability of the architecture. As the software should be developed
	iteratively, more than one increment of the build may be required to prove the architecture. During the early stages of the
	project it may be acceptable for the software to have a incomplete or prototypical feel, as it will be primarily concerned
	with baselining the architecture to provide a stable foundation for the remaining development work.",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_xIIVkMUbEdu5GrwIlTJV7g",
	"Map the software to the hardware",
	"Map the software to the hardware",
	"<p align=\"left\">
	    Map the architecturally significant design elements to the target deployment environment. Work with hardware and
	    network specialists to ensure that the hardware is sufficient to meet the needs of the system; and that any new
	    hardware is available in time.
	</p>",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_pyyVoFHPEd2zrOgIte8oWg",
	"Communicate decisions",
	"Communicate decisions",
	"Ensure that those who need to act upon the architectural work understand it and are able to work with it. Make sure that
	the description of the architecture clearly conveys not only the solution but also the motivation and objectives related to
	the decisions that have been made in shaping the architecture. This will make it easier for others to understand the
	architecture and to adapt it over time.",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0gRJgMlgEdmt3adZL5Dmdw",
	"_i3vkoLS-EduDY8LNbMCDBA"
);
INSERT INTO input_artifacts VALUES (
	"_0gRJgMlgEdmt3adZL5Dmdw",
	"_0XAf0MlgEdmt3adZL5Dmdw"
);

INSERT INTO output_artifacts VALUES (
	"_0gRJgMlgEdmt3adZL5Dmdw",
	"_0XAf0MlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_0fshwMlgEdmt3adZL5Dmdw",
	"design_solution",
	"Design the Solution",
	"Identify the elements and devise the interactions, behavior, relations, and data necessary to realize some functionality.",
	"_iGSHsVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_4Z7WYKuKEdmhFZtkg1nakg",
	"Understand requirement details",
	"Understand requirement details",
	"<p>
	    Examine the relevant&nbsp;<a class=\"elementLink\"
	    href=\"./../../core.tech.slot.base/workproducts/technical_specification_slot_2812F7EF.html\"
	    guid=\"_i3vkoLS-EduDY8LNbMCDBA\">[Technical Specification]</a>&nbsp;to understand the scope of the design task and the
	    expectations on the <a class=\"elementLink\"
	    href=\"./../../practice.tech.evolutionary_design.base/workproducts/design_D677D182.html\"
	    guid=\"_0WuL8slgEdmt3adZL5Dmdw\">Design</a>. Work with the stakeholder and Analyst to clarify ambiguous or missing
	    information.
	</p>
	<p>
	    If the requirements are not represented in some sort of scenario form (for example a non-functional requirement might
	    not have a scenario associated with it), a scenario will have to be identified that appropriately exercises the
	    requirements under consideration.
	</p>
	<p>
	    If the requirements are&nbsp;determined to be&nbsp;incomplete or incorrect, work with the analyst to get the
	    requirements improved and possibly submit a change request against the requirements.
	</p>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_Ci7aYFixEdusJoWkvSRO9Q",
	"Understand the architecture",
	"Understand the architecture",
	"<p>
	    Review the Architecture Notebook to identify changes and additions to the architecture. See&nbsp;<a
	    class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.evolutionary_design.base/guidances/guidelines/evolve_the_design_3C9D6965.html\"
	    guid=\"_C4U9QPTeEduDKIuqTXQ8SA\">Guideline: Evolve the Design</a>&nbsp;for more information. Work with the architect if
	    there is any uncertainty on the understanding of relevant parts of the architecture or of the conformance of the design
	    strategy.
	</p>
	<p>
	    This step can be skipped if there were no changes to the&nbsp;architecture in the previous iteration
	</p>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_--6tYKuKEdmhFZtkg1nakg",
	"Identify design elements",
	"Identify design elements",
	"<p>
	    Identify the elements that collaborate together to provide the required behavior. This can start with the key
	    abstractions identified in the Architecture Notebook, design, domain analysis, and classical analysis of the
	    requirements (noun filtering) to derive the elements that would be required to fulfill them. The <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/guidances/guidelines/entity_control_boundary_pattern_C4047897.html\"
	    guid=\"_uF-QYEAhEdq_UJTvM1DM2Q\">Entity-Control-Boundary Pattern</a> provides a good start for identifying elements. Also
	    see <a class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.evolutionary_design.base/guidances/guidelines/analyze_the_design_4C4750C0.html\"
	    guid=\"__MnggPTdEduDKIuqTXQ8SA\">Guideline: Analyze the Design</a>.
	</p>
	<p>
	    Existing elements of the design should be examined to see if they should participate in the collaboration. It is a
	    mistake to create all new elements in each execution of this task.
	</p>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_A_LU8KuLEdmhFZtkg1nakg",
	"Determine how elements collaborate to realize the scenario",
	"Determine how elements collaborate to realize the scenario",
	"<p>
	    Walk through the scenario distributing responsibilities to the participating elements and ensuring that the elements
	    have the relationships required to collaborate.
	</p>
	<p>
	    These responsibilities can be simple statements of behavior assigned to elements; they need not be detailed operation
	    specifications with parameters, etc. Similarly, the relationships can just be defined at this step. This step is about
	    ensuring that a quality model is being created that is robust enough to support the requirements. See <a
	    class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.evolutionary_design.base/guidances/guidelines/analyze_the_design_4C4750C0.html\"
	    guid=\"__MnggPTdEduDKIuqTXQ8SA\">Guideline: Analyze the Design</a>.
	</p>
	<p>
	    Look to the architecture and previous design work to create a consistent collaboration. Work with the architect to
	    understand the details and motivations of the architecture. Look to reuse existing behavior and relations or to apply
	    similar structure to simplify the design of the overall system.&nbsp; For more information, see&nbsp; <a
	    class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/guidelines/software_reuse_B6B04C26.html\"
	    guid=\"_vO2uoO0OEduUpsu85bVhiQ\">Guideline: Software Reuse</a>.
	</p>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_ENwJwKuLEdmhFZtkg1nakg",
	"Refine design decisions",
	"Refine design decisions",
	"<p>
	    Refine the design to an appropriate level of detail to drive implementation and to ensure that it fits into the
	    architecture. In this step the design can take into consideration the actual implementation language and other
	    technical decisions. Revisit the identification of the elements and the collaborations that realize the scenarios if
	    necessary as this refinement takes into consideration details at a lower level of abstraction. Discuss testability
	    issues, such as design elements that are difficult to test or critical performance areas, with the tester and
	    architect.
	</p>
	<p>
	    Evolve the design by examining recent changes in the larger context of the design and determine if refactoring and
	    redesigning techniques will improve the robustness, flexibility, and understandability of the design. See&nbsp;<a
	    class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.evolutionary_design.base/guidances/guidelines/evolve_the_design_3C9D6965.html\"
	    guid=\"_C4U9QPTeEduDKIuqTXQ8SA\">Guideline: Evolve the Design</a> for guidance specific design decisions and on making
	    design improvements just when they're needed.
	</p>
	<p>
	    Incorporate <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_mechanism_2932DFB6.html\"
	    guid=\"_mzxI0A4LEduibvKwrGxWxA\">Architectural Mechanism</a>s from the architecture. Apply consistent structure of the
	    elements and organization of the behavior as in other areas of the design and use patterns identified in the
	    architecture.
	</p>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_KNZYAKuLEdmhFZtkg1nakg",
	"Design internals (for large or complex elements)",
	"Design internals (for large or complex elements)",
	"<p>
	    Design large or complex elements or some complex internal behavior in more detail.
	</p>
	<p>
	    This might just involve devising an algorithm that could be performed to produce the desired behavior. Add additional
	    operations, attributes, and relationships to support the expectations of an element.
	</p>
	<p>
	    Design the state of the element over the course of its lifetime to ensure its proper behavior in various circumstances.
	    It may be useful to describe a state machine for elements with complex states.
	</p>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_OGYbwKuLEdmhFZtkg1nakg",
	"Communicate the design",
	"Communicate the design",
	"<p>
	    Communicate&nbsp;the system's design to&nbsp;those who need to understand it. Though this is described here toward the
	    end of the task, communication should be going on throughout the steps. Working collaboratively is always better than
	    reviewing the work after it is complete.
	</p>
	<p>
	    Here are some ways to communicate&nbsp;the design:
	</p>
	<ul>
	    <li>
	        Formal models&nbsp;specified in UML.
	    </li>
	    <li>
	        Informal diagrams that render static structure and capture&nbsp;dynamic behavior.
	    </li>
	    <li>
	        Annotated code that communicates information about the static structure. This can be&nbsp;supplemented with textual
	        descriptions of collaborative behavior across code modules.
	    </li>
	    <li>
	        Data models to describe the database schema.
	    </li>
	</ul>
	<p>
	    Here are some examples of individuals&nbsp;who will need to understand the design of the system:
	</p>
	<ul>
	    <li>
	        Developers&nbsp;who will implement a solution based on the design.
	    </li>
	    <li>
	        Architects who can review the design to ensure that it conforms to the architecture or who might examine the design
	        for opportunities to improve the architecture.
	    </li>
	    <li>
	        Other designers who can examine the design for applicability to other parts of the system.
	    </li>
	    <li>
	        Developers or other designers who will be working on other parts of the system that will&nbsp;depend on the
	        elements designed in this task.
	    </li>
	    <li>
	        Other reviewers&nbsp;who will review the design for quality and adherence to standards.
	    </li>
	</ul>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_mUVt8BfnEduD353bkQ4frw",
	"Evaluate the design",
	"Evaluate the design",
	"<p>
	    Evaluate the object design for coupling, cohesion, and other quality design measurements.
	</p>
	<p>
	    Consider the design from various angles to ensure that it is a high-quality, communicable design. Work with other
	    technical team members; an independent party can provide a fresh perspective. Use the tester and architect to provide
	    perspectives on design quality and adherence to the architecture. However, when identifying potential reviewers keep in
	    mind that if someone can add value by reviewing the design, then perhaps they could have added even more value by
	    actively participating in the design effort itself. If design flaws are identified, improve the design.
	</p>
	<p>
	    See <a class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.evolutionary_design.base/guidances/concepts/design_E36137FA.html\"
	    guid=\"_bFjlAPTYEduDKIuqTXQ8SA\">Concept: Design</a>, <a class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.evolutionary_design.base/guidances/guidelines/analyze_the_design_4C4750C0.html\"
	    guid=\"__MnggPTdEduDKIuqTXQ8SA\">Guideline: Analyze the Design</a>, and <a class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.evolutionary_design.base/guidances/guidelines/evolve_the_design_3C9D6965.html\"
	    guid=\"_C4U9QPTeEduDKIuqTXQ8SA\">Guideline: Evolve the Design</a>&nbsp;for more information.
	</p>",
	"_0fshwMlgEdmt3adZL5Dmdw"
);

INSERT INTO input_artifacts VALUES (
	"_0fshwMlgEdmt3adZL5Dmdw",
	"_8OD-cLPTEduocbW-TPTq7A"
);
INSERT INTO input_artifacts VALUES (
	"_0fshwMlgEdmt3adZL5Dmdw",
	"_i3vkoLS-EduDY8LNbMCDBA"
);

INSERT INTO output_artifacts VALUES (
	"_0fshwMlgEdmt3adZL5Dmdw",
	"_0WuL8slgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_T8WvwL3vEdqLRJZPGVbHDA",
	"design_solution.vm",
	"(was design_solution_vm)",
	"Render the design visually to aid in solving the problem and communicating the  solution.",
	NULL
);




INSERT INTO tasks VALUES (
	"_0fOAoMlgEdmt3adZL5Dmdw",
	"develop_technical_vision",
	"Develop Technical Vision",
	"Define the vision for the future system. Describe the problem and features based on stakeholder requests.",
	"_iGSHtVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_ceK-UED2EdyoefaQkqWN_Q",
	"Identify stakeholders",
	"Identify stakeholders",
	"Identify the stakeholders: decision-makers, customers, potential users, partners, domain experts, industry analysts and
	other interested parties. Briefly describe what stakeholders do and what their responsibilities are with regard to the
	system being developed.",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_h7AacED2EdyoefaQkqWN_Q",
	"Gain agreement on the problem to be solved",
	"Gain agreement on the problem to be solved",
	"<p>
	    Avoid rushing into defining the solution. First, gain agreement on the definition of the problem by asking the
	    stakeholders what they see as the problem. Then search for root causes, or the \"problem behind the problem\".
	    Use&nbsp;appropriate requirements gathering techniques. Formulate the problem statement. The purpose of this is to help
	    you distinguish solutions and answers from problems and questions.
	</p>",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_vbkccED2EdyoefaQkqWN_Q",
	"Gather stakeholder requests",
	"Gather stakeholder requests",
	"<p>
	    Use the most appropriate technique to help you on requirements gathering.&nbsp;Each technique is applicable in a
	    particular situation or to a certain type of stakeholder.
	</p>
	<p>
	    If you can meet stakeholders in person, then you can conduct an interview or a brainstorming session. This face-to-face
	    collaboration is extremely valuable and reduces the chances of the project team misunderstanding the needs of the
	    stakeholders.
	</p>
	<p>
	    Some requirements&nbsp;might already be documented in other work products (such as in change requests or work
	    items).&nbsp; This can often be used as a solid starting position from which a full set of requirements can be created.
	</p>",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_yeVC0ED2EdyoefaQkqWN_Q",
	"Define the scope of the solution",
	"Define the scope of the solution",
	"<p>
	    Analyze the scope in terms of processes, organizations, and systems.
	</p>",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_6uIV0ED2EdyoefaQkqWN_Q",
	"Define features of the system",
	"Define features of the system",
	"<p>
	    Work with stakeholders to capture&nbsp;a list&nbsp;of&nbsp;<a class=\"elementlinkwithusertext\"
	    href=\"./../../practice.tech.shared_vision.base/guidances/termdefinitions/feature_4ED64AEE.html\"
	    guid=\"_PgYREAeYEduWycDgioo5rg\">features</a> that stakeholders want in the system, briefly describing them and giving <a
	    class=\"elementLinkWithUserText\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/requirement_attributes_4AC73153.html\"
	    guid=\"_VQ268O0KEdqHTdbLTmC5IQ\">attributes</a> to help define their general status and priority in the project.
	</p>",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"__nDMkED2EdyoefaQkqWN_Q",
	"Achieve concurrence",
	"Achieve concurrence",
	"Conduct an effective requirements&nbsp;review&nbsp;with stakeholders and the development team&nbsp;to ensure agreement on
	the project vision, assess quality, and identify required changes.",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO task_sections VALUES (
	"_Af_gUEIMEd2omsDpG-BNng",
	"Capture a common vocabulary",
	"Capture a common vocabulary",
	"Every project has its own specialized terminology that everyone on the team must understand well to communicate effectively
	with stakeholders.&nbsp; Work with stakeholders to create a glossary that defines acronyms, abbreviations, and relevant
	business and technical terms.&nbsp; Work with stakeholders to continually expand and refine the glossary throughout the
	project lifecycle.",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);


INSERT INTO output_artifacts VALUES (
	"_0fOAoMlgEdmt3adZL5Dmdw",
	"_0WVxcMlgEdmt3adZL5Dmdw"
);
INSERT INTO output_artifacts VALUES (
	"_0fOAoMlgEdmt3adZL5Dmdw",
	"_Wn7HcNcEEdqz_d2XWoVt6Q"
);

INSERT INTO tasks VALUES (
	"_znlIcJR9EdyVKbgqUOtqQA",
	"implement_developer_tests",
	"Implement Developer Tests",
	"Implement one or more tests to verify an implementation element.",
	"_iGSHsVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_C_j_EJR-EdyVKbgqUOtqQA",
	"Refine scope and identify the test(s)",
	"Refine scope and identify the test(s)",
	"<p>
	    Select the increment of work to be tested and identify developer test(s)&nbsp;to verify that the software
	    implementation&nbsp;being developed behaves correctly. One source for the expected behavior for an implementation
	    element is the software design.
	</p>
	<p>
	    In identifying the&nbsp;tests or in any other part of this task, consider collaborating with a team member who is
	    well-versed in the issues of testing.
	</p>",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO task_sections VALUES (
	"_Es64wJR-EdyVKbgqUOtqQA",
	"Write the test setup",
	"Write the test setup",
	"To successfully run a test the system must be in a known state so that the correct behavior can be defined. Implement the
	setup logic that must be performed as part of the developer test.",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO task_sections VALUES (
	"_Fm4moJR-EdyVKbgqUOtqQA",
	"Define the expected results",
	"Define the expected results",
	"<p>
	    Define the expected results of each test so that it can be verified.
	</p>
	<p>
	    After a test runs, you need to be able to compare the results of running the test against what was expected to happen.
	    The test is successful when the actual results match the expected results.
	</p>",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO task_sections VALUES (
	"_GZaPwJR-EdyVKbgqUOtqQA",
	"Write the test logic",
	"Write the test logic",
	"Write the steps that perform the actual test(s).",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO task_sections VALUES (
	"_IMxq0JR-EdyVKbgqUOtqQA",
	"Define the test response",
	"Define the test response",
	"Define the information the test(s) must produce to successfully indicate success or failure. Consider if a response of True
	or False is sufficient, or if a detailed message should be logged as well.",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO task_sections VALUES (
	"_JAiqEJR-EdyVKbgqUOtqQA",
	"Write clean-up code",
	"Write clean-up code",
	"Identify, and then implement, the steps to be followed in order to restore the environment to the original state for each
	test. The goal is to ensure that there are no side effects from running the tests.",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO task_sections VALUES (
	"_KkDrQJR-EdyVKbgqUOtqQA",
	"Test the test",
	"Test the test",
	"<p>
	    Verify that each developer test works correctly. To do this:
	</p>
	<ul>
	    <li>
	        Run the test(s), observe their behavior, and fix any defects in the tests.
	    </li>
	    <li>
	        Ensure that the expected results are defined properly and that they're being checked correctly.
	    </li>
	    <li>
	        Check the clean-up logic for each test.
	    </li>
	    <li>
	        Ensure that each developer test works within your test suite framework.
	    </li>
	</ul>",
	"_znlIcJR9EdyVKbgqUOtqQA"
);

INSERT INTO input_artifacts VALUES (
	"_znlIcJR9EdyVKbgqUOtqQA",
	"_Vux8UEfUEdyiPI8btkmvmw"
);

INSERT INTO output_artifacts VALUES (
	"_znlIcJR9EdyVKbgqUOtqQA",
	"_kh9FcJ02EdyQ3oTO93enUw"
);

INSERT INTO tasks VALUES (
	"_R7atwJfIEdyZkIR-s-Y8wQ",
	"run_developer_tests",
	"Run Developer Tests",
	"Run tests against the individual implementation elements to verify that their internal structures work as specified.",
	"_iGSHsVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_gjLBUJfIEdyZkIR-s-Y8wQ",
	"Run developer tests",
	"Run developer tests",
	"<p>
	    Run the developer tests.&nbsp;The procedure will vary, depending on whether the test is manual or automated and whether
	    additional test components are necessary,&nbsp;such as&nbsp;drivers or stubs.
	</p>
	<p>
	    To run the tests, you need to make sure that you have initialized the test environment with all necessary elements,
	    such as software, hardware, tools, data, and so on.
	</p>
	<p>
	    Automated tests will often update a test results&nbsp;which you can evaluate to determine where your tests went wrong.
	</p>",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_haRocJfIEdyZkIR-s-Y8wQ",
	"Evaluate test execution",
	"Evaluate test execution",
	"<p>
	    Evaluate the test execution by analyzing the test run.&nbsp;
	</p>
	<p>
	    Testing will&nbsp;complete either&nbsp;normally or abnormally.&nbsp; For correctly implemented tests, a normal
	    completion represents a passed test, though it could warrant additional examination of the test results log to
	    ensure&nbsp;the test&nbsp;ran as expected.&nbsp; Abnormal termination could be premature termination or just a test
	    that does not complete as intended.
	</p>
	<p>
	    Review the test log to understand any reported failures, warnings, or unexpected results. The cause of the problem(s)
	    might be that the implementation&nbsp;element being tested is faulty, a problem with the developer tests, or a problem
	    with the environment.
	</p>",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_itj1QJfIEdyZkIR-s-Y8wQ",
	"Respond to test results",
	"Respond to test results",
	"<p>
	    Determine the appropriate corrective action to recover from a \"failed\" developer test run. If the implementation
	    element under test is faulty, fix the problem if possible and rerun the tests. If the problem is serious and cannot be
	    immediately addressed, report the defect. If the developer test is faulty fix the test and rerun the tests. If there
	    was a problem with the environment, resolve it and then rerun&nbsp;the tests.
	</p>",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_C0_fYFQAEd2ECfw27om6fw",
	"Promote changes for integration test",
	"Promote changes for integration test",
	"<p>
	    When the developer tests pass and no further work is need to complete the change set, promote the changes for
	    integration test. If the passing of these tests represent completion of a requirement update the status of the work
	    item.
	</p>",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);

INSERT INTO input_artifacts VALUES (
	"_R7atwJfIEdyZkIR-s-Y8wQ",
	"_Vux8UEfUEdyiPI8btkmvmw"
);
INSERT INTO input_artifacts VALUES (
	"_R7atwJfIEdyZkIR-s-Y8wQ",
	"_kh9FcJ02EdyQ3oTO93enUw"
);

INSERT INTO output_artifacts VALUES (
	"_R7atwJfIEdyZkIR-s-Y8wQ",
	"_0ZlSsMlgEdmt3adZL5Dmdw"
);

INSERT INTO tasks VALUES (
	"_Ht-z8JfJEdyZkIR-s-Y8wQ",
	"implement_solution",
	"Implement Solution",
	"Implement source code to provide new functionality or fix defects.",
	"_iGSHsVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_RiBg4JfJEdyZkIR-s-Y8wQ",
	"Determine a strategy",
	"Determine a strategy",
	"<p>
	    Determine a strategy based on the software design and developer tests&nbsp;for how you are going to implement the
	    solution. The fundamental options are:
	</p>
	<ol>
	    <li>
	        Apply existing, reusable assets.
	    </li>
	    <li>
	        Model the design in detail and generate the source code (by model transformation).
	    </li>
	    <li>
	        Write the source code.
	    </li>
	    <li>
	        Any combination of the above.
	    </li>
	</ol>",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_SW1pAJfJEdyZkIR-s-Y8wQ",
	"Identify opportunities for reuse",
	"Identify opportunities for reuse",
	"<p>
	    Identify existing code or other implementation elements that can be reused in the portion of the implementation that
	    you are creating or changing. A comprehensive understanding of the overall design is helpful, because it is best to
	    leverage reuse opportunities when you have a thorough understanding of the proposed solution.
	</p>",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_IVaTAJ-uEdyHNcWzRYqQMg",
	"Transform design into implementation",
	"Transform design into implementation",
	"<p>
	    If you are using sophisticated modeling tools, you should be able to generate a portion of the required source code
	    from the model. Note that programming is&nbsp;commonly required to complete the implementation after the design model
	    has been transformed into code.
	</p>
	<p>
	    Even without tools, there is&nbsp;typically some amount of code that can be created by rote by examining the design and
	    developer tests.
	</p>",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_TadCIJfJEdyZkIR-s-Y8wQ",
	"Write source code",
	"Write source code",
	"<p>
	    Write the source code to make the implementation conform to the design and expected behavior. You should strive to
	    reuse and/or generate code wherever possible, but you will still need to do some programming. To do so, consider the
	    following:
	</p>
	<ul>
	    <li>
	        Examine the technical requirements. Because some requirement information does not translate directly into your
	        design you should examine the requirement(s) to ensure that they are fully realized in the implementation.
	    </li>
	    <li>
	        Refactor your code to improve its design. Refactoring is a technique where you improve the quality of your code via
	        small, safe changes.
	    </li>
	    <li>
	        Tune the results of the existing implementation by improving performance, the user interface, security, and other
	        nonfunctional areas.
	    </li>
	    <li>
	        Add missing details, such as completing the logic of operations or adding supporting classes and data structures
	    </li>
	    <li>
	        Handle boundary conditions.
	    </li>
	    <li>
	        Deal with unusual circumstances or error states.
	    </li>
	    <li>
	        Restrict behavior (preventing users or client code from executing illegal flows, scenarios, or combinations of
	        options).
	    </li>
	    <li>
	        Add critical sections for multi-threaded or re-entrant code.
	    </li>
	</ul>
	<p>
	    Though many different considerations are listed here, there is one clear way to know when the source code is done. The
	    solution has been implemented when it passes the developer tests. Any other considerations can be taken care of in a
	    refactoring pass over the code to improve it once it is complete and correct.
	</p>",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_WpB28JfJEdyZkIR-s-Y8wQ",
	"Evaluate the implementation",
	"Evaluate the implementation",
	"<p>
	    Verify that the implementation is fit for its purpose. Examine the code for its suitability to perform its intended
	    function. This is a quality assurance step that you perform in addition to testing which is described in other tasks.
	    Consider these strategies:
	</p>
	<ul>
	    <li>
	        Pair programming. By pairing to implement the code in the first place, you effectively evaluate the code as its
	        being written.
	    </li>
	    <li>
	        Read through the code for common mistakes. Consider keeping a checklist of common mistakes that you make, as a
	        reminder reference.
	    </li>
	    <li>
	        Use tools to check for implementation errors and inappropriate code. For example, use a static code rule checker or
	        set the compiler to the most detailed warning level.
	    </li>
	    <li>
	        Use tools that can visualize the code. Code visualization, such as the UML visualizations in the Eclipse IDE, help
	        developers identify issues such as excessive coupling or circular dependencies.
	    </li>
	    <li>
	        Perform informal, targeted code inspections. Ask colleagues to review small critical sections of code and code with
	        significant churn. Avoid reviewing large sections of code.
	    </li>
	    <li>
	        Use&nbsp;a tester to ensure the implementation is testable and understandable to testing resources.
	    </li>
	</ul>
	<p>
	    Improve the implementation based on the results of these evaluations.
	</p>",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO task_sections VALUES (
	"_XjAL4JfJEdyZkIR-s-Y8wQ",
	"Communicate significant decisions",
	"Communicate significant decisions",
	"<p>
	    Communicate the impact of unexpected changes to the design and requirements.
	</p>
	<p>
	    The issues and constraints that you uncover when you implement the system must be communicated to the team. The impact
	    of issues discovered during implementation must be incorporated into future decisions. If appropriate, use&nbsp; the
	    change management process to reflect ambiguities that you identified and resolved in the implementation so they can be
	    tested and you can manage&nbsp;stakeholder expectations appropriately. Similarly,&nbsp;leverage the design process to
	    update the design to reflect new constraints and issues uncovered during implementation to be sure that the new
	    information is communicated to other developers.
	</p>
	<p>
	    Usually, there is no need for a change request if the required change is small and the same person is designing and
	    implementing the code element. That individual can make the design change directly. If the required change has a broad
	    impact, it may be necessary to communicate that change to the other team members through a change request.
	</p>",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);

INSERT INTO input_artifacts VALUES (
	"_Ht-z8JfJEdyZkIR-s-Y8wQ",
	"_IcQOUEqdEdyi3_jfs__bIQ"
);
INSERT INTO input_artifacts VALUES (
	"_Ht-z8JfJEdyZkIR-s-Y8wQ",
	"_i3vkoLS-EduDY8LNbMCDBA"
);

INSERT INTO output_artifacts VALUES (
	"_Ht-z8JfJEdyZkIR-s-Y8wQ",
	"_JqYbgJ01EdyQ3oTO93enUw"
);

INSERT INTO tasks VALUES (
	"_-pOLIEbEEdyx8quJU3Grxg",
	"detail_use_case_scenarios.ucm",
	"",
	"",
	NULL
);

INSERT INTO task_sections VALUES (
	"_-pOLIUbEEdyx8quJU3Grxg",
	"Update Use-Case Model",
	"Update Use-Case Model",
	"<p>
	    Based on your work detailing use cases and scenarios, update the <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/workproducts/use_case_model_85965D1B.html\"
	    guid=\"_W2SgEDR5EdutE_HNDTJk5Q\">Use-Case Model</a>.&nbsp;Add, remove or update&nbsp;<a class=\"elementLinkWithUserText\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/actor_411726C.html\"
	    guid=\"_zGqO0MDpEduTGJ8i4u8TMw\">Actors</a> and <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/workproducts/use_case_22BE66E2.html\" guid=\"_0VGbUMlgEdmt3adZL5Dmdw\">Use
	    Case</a>s as required.&nbsp;<br />
	    For more information on creating and structuring your use case model see <a class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.use_case_driven_dev.base/guidances/guidelines/use_case_model_4C64E97D.html\"
	    guid=\"_0VAUsMlgEdmt3adZL5Dmdw\">Guideline: Use-Case Model</a>.&nbsp;For assistance in assessing the quality of your
	    use-case model see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/checklists/use_case_model_27A2D1CF.html\"
	    guid=\"_0U6OEMlgEdmt3adZL5Dmdw\">Checklist: Use-Case Model</a>.
	</p>",
	"_-pOLIEbEEdyx8quJU3Grxg"
);


INSERT INTO output_artifacts VALUES (
	"_-pOLIEbEEdyx8quJU3Grxg",
	"_W2SgEDR5EdutE_HNDTJk5Q"
);

INSERT INTO tasks VALUES (
	"_txpV0AFmEduDPKiaP0pu-Q",
	"identify_and_outline_requirements.ucm",
	"",
	"",
	NULL
);

INSERT INTO task_sections VALUES (
	"_N66nkApAEdyT57ElgMr6TA",
	"Identify and capture Use Cases and Actors in a Use-Case Model",
	"Identify and capture Use Cases and Actors in a Use-Case Model",
	"<p>
	    Find and define the line that divides the solution and the real world that surrounds the solution. Collaborate with the
	    project manager&nbsp;and architect, because decisions concerning system boundaries will have a major impact on cost,
	    schedule and system architecture.
	</p>
	<p>
	    Collaborate&nbsp;with stakeholders to identify interfaces, as well as input and output information exchanged with
	    users, machines, or systems. Identify and capture&nbsp;the <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/actor_411726C.html\"
	    guid=\"_zGqO0MDpEduTGJ8i4u8TMw\">Actor</a>s and <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/workproducts/use_case_22BE66E2.html\" guid=\"_0VGbUMlgEdmt3adZL5Dmdw\">Use
	    Case</a>s in the <a class=\"elementLink\"
	    href=\"./../../core.tech.common.extend_supp/workproducts/use_case_model_85965D1B.html\"
	    guid=\"_W2SgEDR5EdutE_HNDTJk5Q\">Use-Case Model</a>. See <a class=\"elementLinkWithType\"
	    href=\"./../../practice.tech.use_case_driven_dev.base/guidances/guidelines/identify_and_outline_actors_and_ucs_BB5516A9.html\"
	     guid=\"_eyL0wCu-EdqSxKAVa9kmvA\">Guideline: Identify and Outline Actors and Use Cases</a>&nbsp;for more information.
	</p>",
	"_txpV0AFmEduDPKiaP0pu-Q"
);


INSERT INTO output_artifacts VALUES (
	"_txpV0AFmEduDPKiaP0pu-Q",
	"_W2SgEDR5EdutE_HNDTJk5Q"
);

INSERT INTO tasks VALUES (
	"_4z8Z0EbEEdyx8quJU3Grxg",
	"detail_system_wide_requirements",
	"Detail System-Wide Requirements",
	"This task details one or more requirement that does not apply to a specific use case.",
	"_iGSHtVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_4z8Z1EbEEdyx8quJU3Grxg",
	"Detail system-wide requirements",
	"Detail system-wide requirements",
	"<p>
	    Some&nbsp;system-wide requirements&nbsp;might need to be clarified or described in more detail.&nbsp;New
	    requirements&nbsp;may&nbsp;be discovered&nbsp;while the use cases and scenarios are detailed, and new requirements may
	    have been submitted as change requests.&nbsp;Collaborate with stakeholders to capture, refine and validate those
	    requirements that will have an impact on near term, planned&nbsp;work or are deemed architecturally significant.&nbsp;
	</p><br />",
	"_4z8Z0EbEEdyx8quJU3Grxg"
);
INSERT INTO task_sections VALUES (
	"_4z8Z0UbEEdyx8quJU3Grxg",
	"Detail glossary terms",
	"Detail glossary terms",
	"Review the system-wide requirements and collaborate with stakeholders to ensure that you define newly discovered domain
	terms, or ambiguous terms properly in the glossary. If your understanding of the domain has improved, refine existing
	glossary terms.",
	"_4z8Z0EbEEdyx8quJU3Grxg"
);
INSERT INTO task_sections VALUES (
	"_4z8Z0kbEEdyx8quJU3Grxg",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed system-wide requirements with relevant stakeholders and the development team to ensure
	    consistency with the&nbsp;agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_4z8Z0EbEEdyx8quJU3Grxg"
);

INSERT INTO input_artifacts VALUES (
	"_4z8Z0EbEEdyx8quJU3Grxg",
	"_BVh9cL-CEdqb7N6KIeDL8Q"
);

INSERT INTO output_artifacts VALUES (
	"_4z8Z0EbEEdyx8quJU3Grxg",
	"_BVh9cL-CEdqb7N6KIeDL8Q"
);
INSERT INTO output_artifacts VALUES (
	"_4z8Z0EbEEdyx8quJU3Grxg",
	"_Wn7HcNcEEdqz_d2XWoVt6Q"
);

INSERT INTO tasks VALUES (
	"_SL7N0LPdEduocbW-TPTq7A",
	"detail_use_case_scenarios",
	"Detail Use-Case Scenarios",
	"This task describes how to detail a use-case scenarios for the system.",
	"_iGSHtVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_fAWPkJLZEdyk6dG0ehkW5Q",
	"Detail use cases and scenarios",
	"Detail use cases and scenarios",
	"<p>
	    Some&nbsp;use cases and scenarios&nbsp;might need to be described in more detail to validate the understanding of the
	    requirements and to permit software development to begin. This does not imply that all&nbsp;use cases and scenarios
	    will be detailed prior to commencing implementation on them. The level of detail captured will vary depending upon the
	    needs of the project and the complexity of the use case.&nbsp;Capture the use case and scenarios details in the use
	    case specification.
	</p>",
	"_SL7N0LPdEduocbW-TPTq7A"
);
INSERT INTO task_sections VALUES (
	"_iEvYMJLaEdyk6dG0ehkW5Q",
	"Detail glossary terms",
	"Detail glossary terms",
	"<p>
	    Review the flow of the use case or scenario. If information is exchanged, be specific about what is passed back and
	    forth. Collaborate with stakeholders to ensure that you define newly discovered domain terms, or ambiguous terms
	    properly in the&nbsp;glossary. If your understanding of the domain has improved, refine existing glossary terms.
	</p>",
	"_SL7N0LPdEduocbW-TPTq7A"
);
INSERT INTO task_sections VALUES (
	"_kojt4JLcEdyk6dG0ehkW5Q",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed use case and scenarios with relevant stakeholders and the development team to ensure
	    consistency with the agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_SL7N0LPdEduocbW-TPTq7A"
);

INSERT INTO input_artifacts VALUES (
	"_SL7N0LPdEduocbW-TPTq7A",
	"_0VGbUMlgEdmt3adZL5Dmdw"
);

INSERT INTO output_artifacts VALUES (
	"_SL7N0LPdEduocbW-TPTq7A",
	"_0VGbUMlgEdmt3adZL5Dmdw"
);
INSERT INTO output_artifacts VALUES (
	"_SL7N0LPdEduocbW-TPTq7A",
	"_Wn7HcNcEEdqz_d2XWoVt6Q"
);

INSERT INTO tasks VALUES (
	"_P9cMUPV_EdmdHa9MmVPgqQ",
	"identify_and_outline_requirements",
	"Identify and Outline Requirements",
	"This task describes how to identify and outline the requirements for the system so that the scope of work can be determined.",
	"_iGSHtVZ-EdyIUdvDLLUdeg"
);

INSERT INTO task_sections VALUES (
	"_ckG-cCY-EdqNHcQ-rAojXw",
	"Gather information",
	"Gather information",
	"<p>
	    Use various techniques to make gathering requirements easier. Face-to-face meetings with stakeholders is the most
	    effective way to understand stakeholder needs and to gather and validate requirements, but you must prepare in order
	    for these meetings to run efficiently.
	</p>
	<p>
	    Be prepared by gathering and reviewing information related to the problem domain, problem statement, business
	    environment and key stakeholders. Most of this information&nbsp;must be available in the vision.&nbsp;Also review the
	    existing requirements repository for stakeholder requests.
	</p>",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO task_sections VALUES (
	"_GAr3IOz3Edq2wJOsmRwmhg",
	"Identify and capture domain terms",
	"Identify and capture domain terms",
	"If there are ambiguous or domain-specific terms that need to be clearly defined, make sure you work closely with
	stakeholders&nbsp;to capture these&nbsp;terms in the glossary and that you use these terms consistently.",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO task_sections VALUES (
	"_fDbgkCY-EdqNHcQ-rAojXw",
	"Identify the types of requirements relevant to your system",
	"Identify the types of requirements relevant to your system",
	"<p>
	    Requirements can be broadly classified as either functional or non-functional requirements. The former specify what the
	    system must do. The latter specify constraints on the solution such as usability, reliability, performance,
	    supportability, interfaces with legacy systems, etc. Depending upon the domain there&nbsp;might be regulatory
	    requirements that apply.
	</p>
	<p>
	    Collaborate with stakeholders to identify the types of requirements relevant to your system. This will help you assess
	    the completeness of your requirement set.
	</p>",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO task_sections VALUES (
	"_CD_a8JJKEdyk6dG0ehkW5Q",
	"Identify and capture use cases and scenarios",
	"Identify and capture use cases and scenarios",
	"<p>
	    Collaborate with stakeholders to identify and capture&nbsp;the use cases and scenarios relevant&nbsp;to your system.
	    Capture references to these requirements with other project to-do items&nbsp;in the <a class=\"elementLink\"
	    href=\"./../../core.mgmt.common.extend_supp/workproducts/work_items_list_39D03CC8.html\"
	    guid=\"_rGNWsCbSEdqh1LYUOGRh2A\">Work Items List</a>&nbsp;so that you can prioritize the work.
	</p>
	<p>
	    See&nbsp;<a class=\"elementLink\"
	    href=\"./../../practice.tech.use_case_driven_dev.base/guidances/guidelines/identify_and_outline_actors_and_ucs_BB5516A9.html\"
	     guid=\"_eyL0wCu-EdqSxKAVa9kmvA\">Identify and Outline Actors and Use Cases</a> for more information.
	</p>",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO task_sections VALUES (
	"_Ql45gEI6Edyrh7YaMjqrlA",
	"Identify and capture system-wide requirements",
	"Identify and capture system-wide requirements",
	"<p>
	    Collaborate with stakeholders to identify and capture&nbsp;the system-wide requirements relevant&nbsp;to your system.
	    Capture references to these requirements with other project to-do items in the&nbsp;<a class=\"elementLink\"
	    href=\"./../../core.mgmt.common.extend_supp/workproducts/work_items_list_39D03CC8.html\"
	    guid=\"_rGNWsCbSEdqh1LYUOGRh2A\">Work Items List</a> so that you can prioritize the work.
	</p>
	<p>
	    See&nbsp;<a class=\"elementLink\"
	    href=\"./../../practice.tech.use_case_driven_dev.base/guidances/guidelines/system_wide_requirements_8ED0BB6B.html\"
	    guid=\"_wr24gNcGEdqz_d2XWoVt6Q\">Developing System-Wide Requirements Specification</a> for more information.
	</p>",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO task_sections VALUES (
	"_0WhHsN-eEdqiM_wFaqLjNg",
	"Achieve concurrence",
	"Achieve concurrence",
	"Conduct a review&nbsp;of the&nbsp;requirements with relevant stakeholders and the development team to ensure consistency
	with the agreed vision, assess quality, and identify any required changes.",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);


INSERT INTO output_artifacts VALUES (
	"_P9cMUPV_EdmdHa9MmVPgqQ",
	"_BVh9cL-CEdqb7N6KIeDL8Q"
);
INSERT INTO output_artifacts VALUES (
	"_P9cMUPV_EdmdHa9MmVPgqQ",
	"_0VGbUMlgEdmt3adZL5Dmdw"
);
INSERT INTO output_artifacts VALUES (
	"_P9cMUPV_EdmdHa9MmVPgqQ",
	"_Wn7HcNcEEdqz_d2XWoVt6Q"
);
INSERT INTO output_artifacts VALUES (
	"_P9cMUPV_EdmdHa9MmVPgqQ",
	"_rGNWsCbSEdqh1LYUOGRh2A"
);

INSERT INTO tasks VALUES (
	"_-zfOruB8EeC1y_NExchKwQ",
	"develop_product_documentation",
	"Develop Product Documentation",
	"Because product documentation continues to be used after a development effort ends, it is important to ensure that the features developed within a particular release are clearly documented while the functionality is still fresh in the minds of team members.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_-zf1suB8EeC1y_NExchKwQ",
	"Identify features of current release",
	"Identify features of current release",
	"<p>
	    Every release will contain a set of features that were developed during the preceding feature development sprint or
	    iterations. This list should drive the table of contents of the product documentation. It also is possible that some
	    nonfunctional requirements should be documented as well.
	</p>
	<p>
	    While the product documentation will not be used directly as user documentation, it will become the basis for the user
	    documentation. That foundation of information is why this step is important.
	</p>",
	"_-zfOruB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zf1seB8EeC1y_NExchKwQ",
	"Document each feature",
	"Document each feature",
	"Write a comprehensive description of each feature and include appropriate screen shots as well as relevant information
	about how the feature was developed.",
	"_-zfOruB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zf1s-B8EeC1y_NExchKwQ",
	"Review product documentation with stakeholders",
	"Review product documentation with stakeholders",
	"Schedule a review session with key stakeholders to ensure that the product documentation is adequate and that it contains
	the level of detail needed by the product customer. If more detail is required, elicit one or more examples from the
	stakeholders that show how they would like the documentation to be prepared.",
	"_-zfOruB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOr-B8EeC1y_NExchKwQ",
	"Update product documentation as necessary",
	"Update product documentation as necessary",
	"Based on the outcome of the review session, update the product documentation so that it can receive the proper approval on
	delivery.",
	"_-zfOruB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zf1sOB8EeC1y_NExchKwQ",
	"Deliver product documentation",
	"Deliver product documentation",
	"For this release, deliver the final product documentation to the customer and key stakeholders. Obtain their formal
	approval if necessary.",
	"_-zfOruB8EeC1y_NExchKwQ"
);


INSERT INTO output_artifacts VALUES (
	"_-zfOruB8EeC1y_NExchKwQ",
	"_-zf1tuB8EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_-zfOp-B8EeC1y_NExchKwQ",
	"develop_support_documentation",
	"Develop Support Documentation",
	"This type of documentation is used by production support and IT operations personnel on a regular basis to answer end users' questions about a particular product, to troubleshoot issues, or to determine if an incident is a result of a defect or missed requirements.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_-zfOquB8EeC1y_NExchKwQ",
	"Determine support documentation contents",
	"Determine support documentation contents",
	"<p>
	    This step is often challenging for development teams because they must put themselves in the position of IT support
	    personnel to develop the right kind and right amount of useful content. It is advantageous to visit the support
	    organization and ask them what types of documentation they would want delivered to them at each Release. You might be
	    surprised at what they say, and it could make your documentation tasks easier if you know exactly what type of
	    information they want.
	</p>
	<p>
	    Because every product is different, and because each program or IT support organization has unique needs, it is
	    impossible to list recommended contents for support documentation. However, each program should create support
	    documentation standards for the development teams that support its program.
	</p>",
	"_-zfOp-B8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOq-B8EeC1y_NExchKwQ",
	"Leverage available materials",
	"Leverage available materials",
	"<p>
	    Use the development team's Release Plan as a mechanism to define the scope of the support documentation. Source
	    materials that can contribute effectively to support documentation content include:
	</p>
	<ul>
	    <li>
	        Component Design Specifications
	    </li>
	    <li>
	        Architecture Notebook
	    </li>
	    <li>
	        User Stories
	    </li>
	    <li>
	        Test Cases
	    </li>
	    <li>
	        Test Scenarios
	    </li>
	    <li>
	        Storyboards and Wireframes
	    </li>
	    <li>
	        Defect Records
	    </li>
	    <li>
	        Lessons Learned
	    </li>
	    <li>
	        Data Dictionary
	    </li>
	    <li>
	        Logical and Physical Data Models
	    </li>
	    <li>
	        Coding Standards
	    </li>
	    <li>
	        Acceptance Tests
	    </li>
	    <li>
	        Test Harness
	    </li>
	</ul>",
	"_-zfOp-B8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOqeB8EeC1y_NExchKwQ",
	"Write support documentation",
	"Write support documentation",
	"Based on the previous steps, write the support documentation. One way to do this is to assign sections of the document
	(determined in the step \"Determine Support Documentation Contents\" above) to development team members as sprint/iteration
	tasks in the release sprint/iteration.",
	"_-zfOp-B8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOrOB8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As the support documentation is integrated, plan and conduct a quality review during the release sprint/iteration to ensure
	that the documentation is of sufficient quantity and quality. Update and improve the support documentation based on the
	results of the quality review.",
	"_-zfOp-B8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOqOB8EeC1y_NExchKwQ",
	"Deliver support documentation",
	"Deliver support documentation",
	"At the end of a release, deliver the completed support documentation to the deployment manager. Ensure that the program has
	a plan for communicating the support documentation to the IT operations support organization in a timely manner.",
	"_-zfOp-B8EeC1y_NExchKwQ"
);


INSERT INTO output_artifacts VALUES (
	"_-zfOp-B8EeC1y_NExchKwQ",
	"_-zfOreB8EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_-zfOoOB8EeC1y_NExchKwQ",
	"develop_user_documentation",
	"Develop User Documentation",
	"User documentation must be developed and maintained for each Release so that the product's end users will know how to operate the system effectively.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_-zfOo-B8EeC1y_NExchKwQ",
	"Determine user documentation contents",
	"Determine user documentation contents",
	"<p>
	    User documentation often consists of a wide variety of content such as:
	</p>
	<ul>
	    <li>
	        User manuals (electronic or paper-based)
	    </li>
	    <li>
	        Tutorials
	    </li>
	    <li>
	        Frequently asked questions (FAQs)
	    </li>
	    <li>
	        On-line Help Files
	    </li>
	    <li>
	        Installation and configuration instructions
	    </li>
	    <li>
	        Operational procedures (or job aids)
	    </li>
	</ul>
	<p>
	    For your product and for this release, determine which of these types of user documentation your team will develop and
	    deliver.
	</p>",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOpeB8EeC1y_NExchKwQ",
	"Leverage product documentation",
	"Leverage product documentation",
	"Re-use whatever material you can from the product documentation that your team has created. If adequate time and attention
	was given to product documentation, you should be able to leverage a significant amount of it to develop the user
	documentation. Because only features (and possibly some nonfunctional requirements) were documented for the product, only
	that amount can be leveraged. However, it often provides a nice framework for the user documentation.",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOpOB8EeC1y_NExchKwQ",
	"Leverage other materials",
	"Leverage other materials",
	"<p>
	    Other materials developed in the course of the Release might provide excellent input into the user documentation such
	    as:
	</p>
	<ul>
	    <li>
	        User Stories
	    </li>
	    <li>
	        Test Cases
	    </li>
	    <li>
	        Storyboards
	    </li>
	    <li>
	        Test Scenarios
	    </li>
	    <li>
	        Architecture Notebook
	    </li>
	    <li>
	        Previously developed training materials
	    </li>
	</ul>
	<p>
	    Each of these may contain content that you do not need to re-create. Use your imagination to find other source
	    materials that can help your team document the system for end users.
	</p>",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOouB8EeC1y_NExchKwQ",
	"Write user documentation content",
	"Write user documentation content",
	"Based on the previous steps, write the user documentation. One way to do this is to assign sections of the document
	(described in the step \"Determine User Documentation Contents\" above) to Development team members as Sprint/Iteration Tasks
	in the Release Sprint/Iteration.",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOoeB8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As the user documentation is integrated, plan and conduct a quality review during the Release Sprint/Iteration to ensure
	that the documentation is of sufficient quantity and quality. Update and improve the user documentation based on the
	results of the quality review.",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zfOpuB8EeC1y_NExchKwQ",
	"Deliver user documentation",
	"Deliver user documentation",
	"Before or at the end of a release, deliver the completed user documentation to the deployment manager. Ensure that the
	program has a plan for communicating the user documentation to end users.",
	"_-zfOoOB8EeC1y_NExchKwQ"
);


INSERT INTO output_artifacts VALUES (
	"_-zfOoOB8EeC1y_NExchKwQ",
	"_-zf1tOB8EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_-zenmeB8EeC1y_NExchKwQ",
	"develop_training_materials",
	"Develop Training Materials",
	"This task is used to develop quality audio/visual materials that can be used to train end users and IT production support personnel.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_-zennOB8EeC1y_NExchKwQ",
	"Determine scope of training materials",
	"Determine scope of training materials",
	"<p>
	    Consult the program manager and deployment manager to determine the extent of training materials required for this
	    release. Depending on the contents of the release, more or fewer training materials might be needed to support both end
	    users and IT operations support personnel.
	</p>
	<p>
	    Training materials generally consist of a combination of:
	</p>
	<ul>
	    <li>
	        Presentation slides
	    </li>
	    <li>
	        Handouts
	    </li>
	    <li>
	        Training aids
	    </li>
	    <li>
	        Hands-on labs and/or exercises
	    </li>
	    <li>
	        Quizzes or tests
	    </li>
	    <li>
	        Practical application workshops
	    </li>
	</ul>
	<p>
	    Training materials often are grouped into modules, each with a set of learning objectives and competency assessments.
	</p>",
	"_-zenmeB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenm-B8EeC1y_NExchKwQ",
	"Develop user training materials",
	"Develop user training materials",
	"<p>
	    Leverage all the user documentation that has been prepared previously or is in the process of being prepared. The table
	    of contents of the user documentation will provide a starting point for developing a training course framework and a
	    lesson plan.
	</p>
	<p>
	    First identify the learning objectives of each training module, then reuse as much user documentation as is possible.
	    If tutorials were documented within either user or support documentation, they are a good source of content for
	    training modules.
	</p>",
	"_-zenmeB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenmuB8EeC1y_NExchKwQ",
	"Develop support training materials",
	"Develop support training materials",
	"<p>
	    In many cases, IT support personnel are experienced enough to require minimal training on a product release. However,
	    where the product is new to the support organization, or the support personnel themselves are inexperienced or
	    unfamiliar with a particular technology, support training becomes very important to the success of the product rollout.
	</p>
	<p>
	    Using the support documentation as a guideline, identify the parts of the product on which IT support personnel will
	    need to be trained. Identify training modules and document learning objectives for each module, then leverage as much
	    of the support documentation content as you can to create your training materials.
	</p>",
	"_-zenmeB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenn-B8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As user and support training materials are developed, plan and conduct a quality review during the release sprint/iteration
	to ensure that the materials are of sufficient quantity and quality. Update and improve the training materials based on the
	results of the quality review.",
	"_-zenmeB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zennuB8EeC1y_NExchKwQ",
	"Perform dry run",
	"Perform dry run",
	"Before formally delivering the user or support training, plan a sprint/iteration task in which representatives of both the
	user and support communities are invited to participate in a dry run of the training materials. Use the feedback obtained
	from these sessions to improve the training materials during the release sprint/iteration.",
	"_-zenmeB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenneB8EeC1y_NExchKwQ",
	"Deliver training materials",
	"Deliver training materials",
	"When the final user and support training materials are complete, deliver them to the deployment manager for integration
	with the training materials from the other teams participating in the program.",
	"_-zenmeB8EeC1y_NExchKwQ"
);


INSERT INTO output_artifacts VALUES (
	"_-zenmeB8EeC1y_NExchKwQ",
	"_-zeAguB8EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_-zenlOB8EeC1y_NExchKwQ",
	"deliver_support_training",
	"Deliver Support Training",
	"Personnel who support an application need training so they can perform their jobs effectively.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_-zenmOB8EeC1y_NExchKwQ",
	"Validate support training logistics",
	"Validate support training logistics",
	"<p>
	    Before actually delivering the training to support personnel, ensure that you have all the necessary components of the
	    training course, including:
	</p>
	<ul>
	    <li>
	        Presentation slides
	    </li>
	    <li>
	        Handouts
	    </li>
	    <li>
	        Training aids
	    </li>
	    <li>
	        Hands-on labs and/or exercises
	    </li>
	    <li>
	        Quizzes or tests
	    </li>
	    <li>
	        Feedback and/or instructor assessment forms
	    </li>
	</ul>
	<p>
	    Ensure that the classes have been scheduled correctly and that attendees have been identified. Also, validate that the
	    facilities where you will deliver the training have been properly booked and are furnished to accommodate the training
	    content and audience. If possible, send a reminder notice to the attendees several days (or a week) before the delivery
	    date.
	</p>",
	"_-zenlOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenl-B8EeC1y_NExchKwQ",
	"Prepare for support training delivery",
	"Prepare for support training delivery",
	"Review the training materials so that you are familiar with them. If you encounter any areas where you are unsure or
	tentative, engage experts from the development team or program who can help you understand the material. Then, update the
	training materials accordingly and create instructor notes to help you remember key points as you deliver the training.
	Instructor notes that you write will not only help you but might assist other instructors in the future who have not had
	the benefit of working with the development team or program.",
	"_-zenlOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenluB8EeC1y_NExchKwQ",
	"deliver support training and gather feedback",
	"deliver support training and gather feedback",
	"On the prescribed day(s) and time(s), deliver the training as planned. When each course is completed, solicit feedback from
	the attendees about the course material, its organization and flow, the learning objectives, how well the instructor
	delivered the content, and whether the course met their expectations.",
	"_-zenlOB8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenleB8EeC1y_NExchKwQ",
	"Provide feedback to the program",
	"Provide feedback to the program",
	"Consolidate the feedback from the courses delivered and provide it to the program manager or their delegate for review.",
	"_-zenlOB8EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_-zenlOB8EeC1y_NExchKwQ",
	"_-zeAguB8EeC1y_NExchKwQ"
);
INSERT INTO input_artifacts VALUES (
	"_-zenlOB8EeC1y_NExchKwQ",
	"_-zfOreB8EeC1y_NExchKwQ"
);


INSERT INTO tasks VALUES (
	"_-zeAg-B8EeC1y_NExchKwQ",
	"deliver_end_user_training",
	"Deliver end user Training",
	"In most cases, end users of a system require training to use the application effectively.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_-zeAhOB8EeC1y_NExchKwQ",
	"Validate user training logistics",
	"Validate user training logistics",
	"<p>
	    Before actually delivering the training to end users, ensure that you have all the necessary components of the training
	    course, including:
	</p>
	<ul>
	    <li>
	        Presentation slides
	    </li>
	    <li>
	        Handouts
	    </li>
	    <li>
	        Training aids
	    </li>
	    <li>
	        Hands-on labs and/or exercises
	    </li>
	    <li>
	        Quizzes or tests
	    </li>
	    <li>
	        Feedback and/or instructor assessment forms
	    </li>
	</ul>
	<p>
	    Ensure the classes have been scheduled correctly and attendees have been identified. Verify that the facilities where
	    you will deliver the training have been properly booked and are furnished to accommodate the training content and
	    audience. If possible, send a reminder notice to the attendees several days (or a week) before the delivery date.
	</p>",
	"_-zeAg-B8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenkuB8EeC1y_NExchKwQ",
	"Prepare for user training delivery",
	"Prepare for user training delivery",
	"Review the training materials so that you are familiar with them. If you encounter any areas in which you are unsure or
	tentative about, engage experts from the development team or program who can help you understand the material. Then, update
	the training materials accordingly and create instructor notes to help you remember key points as you deliver the training.
	Instructor notes that you author will not only help you, but they might assist other instructors in the future who have not
	had the benefit of working with the development team or program.",
	"_-zeAg-B8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenkeB8EeC1y_NExchKwQ",
	"Deliver user training and gather feedback",
	"Deliver user training and gather feedback",
	"On the prescribed day(s) and time(s), deliver the training as planned. When each course is completed, solicit feedback from
	the attendees on the course material, its organization and flow, the learning objectives, how well the instructor delivered
	the content, and whether the course met their expectations.",
	"_-zeAg-B8EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_-zenkOB8EeC1y_NExchKwQ",
	"Provide feedback to the program level",
	"Provide feedback to the program level",
	"Consolidate the feedback from the courses delivered and provide it to the program manager or their delegate for review.",
	"_-zeAg-B8EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_-zeAg-B8EeC1y_NExchKwQ",
	"_-zf1tOB8EeC1y_NExchKwQ"
);
INSERT INTO input_artifacts VALUES (
	"_-zeAg-B8EeC1y_NExchKwQ",
	"_-zeAguB8EeC1y_NExchKwQ"
);


INSERT INTO tasks VALUES (
	"_IAIH4eB-EeC1y_NExchKwQ",
	"install_validate_infrastructure",
	"Install and Validate Infrastructure",
	"Any infrastructure components needed to support a release must be procured, installed, and tested.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAIH4-B-EeC1y_NExchKwQ",
	"Identify infrastructure needs",
	"Identify infrastructure needs",
	"Identify and describe all the components of the infrastructure that are needed to support the upcoming release. These
	requirements should be based completely on the feature set that is about to be deployed, not on intended future needs.",
	"_IAIH4eB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAIu8eB-EeC1y_NExchKwQ",
	"Procure components",
	"Procure components",
	"Determine how long it will reasonably take to procure the needed components and to engage the appropriate division in the
	organization to place the order. Be sure to work with the procurement agency to track the order and to identify any issues
	with that order. Ultimately, the development team, not the procurement agency, is responsible for ensuring that the correct
	infrastructure components are in place.",
	"_IAIH4eB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAIH5OB-EeC1y_NExchKwQ",
	"Schedule components for installation",
	"Schedule components for installation",
	"After the procured components arrive, schedule to have them installed by the IT operations group(s) that control the
	production environment. The development team should be developing tests to confirm the correct installation at this time.",
	"_IAIH4eB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAIH4uB-EeC1y_NExchKwQ",
	"Install and test components",
	"Install and test components",
	"When the components have been installed, be prepared to run the validation tests developed in the previous step. These
	tests should not only verify the individual components' readiness, but also should validate their integration with each
	other and with legacy components.",
	"_IAIH4eB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAIu8OB-EeC1y_NExchKwQ",
	"Validate other component aspects",
	"Validate other component aspects",
	"<p>
	    As the validation testing is underway, the development team also should consider how the newly installed components
	    impact overall system security, whether or not database connectivity and security have been compromised, and what
	    impact they have on the configuration management database that contains an inventory of CIs.
	</p>
	<p>
	    Also reconcile any licensing issues for the new components with the division that is responsible for documenting and
	    tracking enterprise licenses.
	</p>",
	"_IAIH4eB-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IAIH4eB-EeC1y_NExchKwQ",
	"_IAJ9FeB-EeC1y_NExchKwQ"
);

INSERT INTO output_artifacts VALUES (
	"_IAIH4eB-EeC1y_NExchKwQ",
	"_IAJ9EOB-EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_IAIu9uB-EeC1y_NExchKwQ",
	"review_conform_to_release_controls",
	"Review and Conform to Release Controls",
	"Release controls normally are specified by the deployment manager. These controls document the requirements to which all releases must conform before being placed into the production environment.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAJWAuB-EeC1y_NExchKwQ",
	"Locate release controls",
	"Locate release controls",
	"If the program's release controls are not readily available, the development team must engage the deployment manager and/or
	their deployment engineers to know where to find the release controls and be able to comply with them.",
	"_IAIu9uB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAJWAeB-EeC1y_NExchKwQ",
	"Review release controls",
	"Review release controls",
	"The development team should thoroughly review the release controls so that it understands what is expected before a release
	is accepted into the production environment. If the team has any questions or issues with the controls, team members should
	communicate directly with the deployment manager or the deployment engineer to understand the issues.",
	"_IAIu9uB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAJWAOB-EeC1y_NExchKwQ",
	"Ensure the team release conforms to the controls",
	"Ensure the team release conforms to the controls",
	"<p>
	    Coordinated releases at the program level are very formal processes. They are formal for a very good reason - namely,
	    the company's production environment could be corrupted and serious business ramifications could result, including:
	</p>
	<ul>
	    <li>
	        Lost revenue
	    </li>
	    <li>
	        customer dissatisfaction
	    </li>
	    <li>
	        Fines resulting from legal noncompliance
	    </li>
	    <li>
	        Lost employee productivity
	    </li>
	</ul>
	<p>
	    All development team members that contribute to a release are expected to adhere to all the controls defined at the
	    program level. Non-compliance could result in multiple impacts:
	</p>
	<ul>
	    <li>
	        The entire release being abandoned, which could lead to customer or end user dissatisfaction
	    </li>
	    <li>
	        The results of multiple feature development Sprint/Iterations not being included in the release
	    </li>
	    <li>
	        Embarrassment on the part of the development team member that did not comply with the controls
	    </li>
	    <li>
	        Loss of funding for that development team
	    </li>
	</ul>",
	"_IAIu9uB-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IAIu9uB-EeC1y_NExchKwQ",
	"_IAJWA-B-EeC1y_NExchKwQ"
);


INSERT INTO tasks VALUES (
	"_IAJ9EeB-EeC1y_NExchKwQ",
	"plan_deployment",
	"Plan Deployment",
	"If a deployment plan for the project already exists, update it to reflect the nature of this release. If this document does not exist, develop a deployment plan to indicate how this release will be rolled out to the production environment.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAJ9E-B-EeC1y_NExchKwQ",
	"Determine if deployment plan exists",
	"Determine if deployment plan exists",
	"Determine whether the development team has a deployment plan already written for a previous release. If so, part of that
	plan might be reusable. If this is the development team's first release, another development team with a similar feature
	set might have a plan that can be used as a starting point.",
	"_IAJ9EeB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAJ9EuB-EeC1y_NExchKwQ",
	"Develop the deployment plan (if applicable)",
	"Develop the deployment plan (if applicable)",
	"If a deployment plan does not exist, or one cannot be found to be used as a starting point, use the recommended format
	documented in the <a class=\"elementLinkWithType\"
	href=\"./../../practice.gen.production_release.base/workproducts/deployment_plan_121938C3.html\"
	guid=\"_IAJ9FeB-EeC1y_NExchKwQ\">Artifact: Deployment Plan</a> and refer to the <a class=\"elementLinkWithType\"
	href=\"./../../practice.gen.production_release.base/guidances/checklists/deployment_plan_C4767691.html\"
	guid=\"_IAG5weB-EeC1y_NExchKwQ\">Checklist: Deployment Plan</a> to start and develop a deployment plan.",
	"_IAJ9EeB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAJ9FOB-EeC1y_NExchKwQ",
	"Update the deployment plan (if applicable)",
	"Update the deployment plan (if applicable)",
	"If a deployment plan does exist that can be used as a baseline, review that plan and update, add, or delete information as
	necessary. When the plan is done, it should reflect entirely the contents of the upcoming deployment only, not a release in
	the past or one in the future. In other words, the deployment plan should be specific only to this release.",
	"_IAJ9EeB-EeC1y_NExchKwQ"
);


INSERT INTO output_artifacts VALUES (
	"_IAJ9EeB-EeC1y_NExchKwQ",
	"_IAJ9FeB-EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_IAJWBOB-EeC1y_NExchKwQ",
	"develop_release_communications",
	"Develop Release Communications",
	"Stakeholders should be notified when a product (or feature set) is placed into production.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAJWBuB-EeC1y_NExchKwQ",
	"Identify stakeholders for this release",
	"Identify stakeholders for this release",
	"The development team should know exactly which stakeholder groups will benefit from the upcoming release. First, identify
	the stakeholders for this release. Next, determine how each stakeholder group is expected to benefit from the release based
	on the components that will be delivered to production.",
	"_IAJWBOB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAJWBeB-EeC1y_NExchKwQ",
	"Draft communique for each stakeholder group",
	"Draft communique for each stakeholder group",
	"<p>
	    For each stakeholder group, document the following:
	</p>
	<ul>
	    <li>
	        The features that will be deployed to production that those stakeholders are expected to benefit from
	    </li>
	    <li>
	        The business value that stakeholder group will obtain from the feature set being released
	    </li>
	    <li>
	        How, when, and where that stakeholder group will be able to access the new functionality and what special
	        credentials or permissions are required
	    </li>
	    <li>
	        Any additional constraints or information that the stakeholder group should be aware of, such as availability
	        restrictions, geographical restrictions, server limitations, regulatory requirements, etc.
	    </li>
	</ul>",
	"_IAJWBOB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAJWB-B-EeC1y_NExchKwQ",
	"Provide commiques to deployment manager",
	"Provide commiques to deployment manager",
	"After drafting the communiques for each stakeholder group, the development team should provide those drafts to the
	deployment manager. Typically, release communications are consolidated and released at the program level. The deployment
	manager and deployment engineers normally are responsible for ensuring that all release communications are consistent and
	concise. The deployment manager will determine the appropriate time to communicate information about the upcoming release
	to the appropriate stakeholders.",
	"_IAJWBOB-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IAJWBOB-EeC1y_NExchKwQ",
	"_IAJ9FeB-EeC1y_NExchKwQ"
);

INSERT INTO output_artifacts VALUES (
	"_IAJWBOB-EeC1y_NExchKwQ",
	"_IAIH4OB-EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_IAIu8uB-EeC1y_NExchKwQ",
	"develop_backout_plan",
	"Develop Backout Plan",
	"This task results in a plan to be used by the production support organization to roll back the release if there is a problem during or after deployment.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAIu9eB-EeC1y_NExchKwQ",
	"Determine if backout plan exists",
	"Determine if backout plan exists",
	"Determine whether the development team has a backout plan already written for a previous release. If so, part of that plan
	might be reusable. If this release is the development team's first, another development team with a similar feature set
	might have a plan that can be used as a starting point.",
	"_IAIu8uB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAIu8-B-EeC1y_NExchKwQ",
	"Develop the backout plan (if applicable)",
	"Develop the backout plan (if applicable)",
	"If a backout plan does not exist, or one cannot be found to be used as a starting point, answer the questions documented in
	the <a class=\"elementLinkWithType\"
	href=\"./../../practice.gen.production_release.base/workproducts/backout_plan_DC0D7247.html\"
	guid=\"_IAHg2eB-EeC1y_NExchKwQ\">Artifact: Backout Plan</a> to start and develop a backout plan.",
	"_IAIu8uB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAIu9OB-EeC1y_NExchKwQ",
	"Update the backout plan (if applicable)",
	"Update the backout plan (if applicable)",
	"If a backout plan does exist that can be used as a baseline, review that plan and update, add, or delete information as
	necessary. When the plan is completed, it should reflect entirely the contents of the upcoming deployment only, not a
	release in the past or one in the future. In other words, the backout plan should be specific only to this release.",
	"_IAIu8uB-EeC1y_NExchKwQ"
);


INSERT INTO output_artifacts VALUES (
	"_IAIu8uB-EeC1y_NExchKwQ",
	"_IAHg2eB-EeC1y_NExchKwQ"
);

INSERT INTO tasks VALUES (
	"_IAD2dOB-EeC1y_NExchKwQ",
	"execute_deployment_plan",
	"Execute Deployment Plan",
	"The deployment plan has all the unique instructions necessary to roll out a release.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAD2deB-EeC1y_NExchKwQ",
	"Review deployment plan",
	"Review deployment plan",
	"Review the contents of the deployment plan to ensure that the production environment has all the dependent components
	installed and that the system is in the correct state. Also ensure that the release window is ready to be achieved.",
	"_IAD2dOB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAD2duB-EeC1y_NExchKwQ",
	"Release code",
	"Release code",
	"<p>
	    When the preliminary review has been completed and the release window has started, deploy the release package into
	    production. Depending on the release script and the size of the package, this installation might take anywhere from a
	    few minutes to a few hours.
	</p>
	<p>
	    Monitor the release as the release script is run. Be prepared to terminate the script and back out the release if
	    significant errors are encountered.
	</p>",
	"_IAD2dOB-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IAD2dOB-EeC1y_NExchKwQ",
	"_IAJ9FeB-EeC1y_NExchKwQ"
);
INSERT INTO input_artifacts VALUES (
	"_IAD2dOB-EeC1y_NExchKwQ",
	"_IAJ9EOB-EeC1y_NExchKwQ"
);
INSERT INTO input_artifacts VALUES (
	"_IAD2dOB-EeC1y_NExchKwQ",
	"_EopWMPddEeCG79QDqBlPXg"
);


INSERT INTO tasks VALUES (
	"_IADPY-B-EeC1y_NExchKwQ",
	"execute_backout_plan",
	"Execute Backout Plan (if necessary)",
	"If a particular release into production goes wrong, the plan for cleanly reversing that deployment is executed.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAD2c-B-EeC1y_NExchKwQ",
	"Identify release problem(s)",
	"Identify release problem(s)",
	"<p>
	    In the event that the release to production experiences problems, either during or after deployment, the backout plan
	    should be invoked. However, the deployment engineer (or development team) must understand where the release went wrong
	    so that the code can be fixed before the next release attempt. This is a critical step, but it should be done quickly
	    so that the problematic release can be reversed before significant damage is done to the production environment.
	</p>
	<p>
	    Log the issues as critical defects as soon as possible and assign those defects to the appropriate team members for
	    resolution.
	</p>",
	"_IADPY-B-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAD2cOB-EeC1y_NExchKwQ",
	"Backout the release",
	"Backout the release",
	"Following the instructions in the backout plan, reverse the deployment. However, be aware that the backout plan
	instructions are a guide and should not always be taken literally. This interpretation is due to the fact that not every
	problematic condition can be documented in advance and because each real-world situation might be slightly different.",
	"_IADPY-B-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAD2cuB-EeC1y_NExchKwQ",
	"Determine if the backout was successful",
	"Determine if the backout was successful",
	"Ascertain whether the reversal was successful. If not, key members of the release team, development team, or program level
	agile system team might need to be engaged to find and fix the problem(s).",
	"_IADPY-B-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAD2ceB-EeC1y_NExchKwQ",
	"Communicate the backout",
	"Communicate the backout",
	"Ensure that all interested parties are aware of the failed release. Because releases often take place at odd hours to
	minimize end user impact, use beeper-based notifications judiciously. In most cases, an email to key stakeholders (such as
	the product owner and program manager) might suffice. Following up with a phone call also might be warranted.",
	"_IADPY-B-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IADPY-B-EeC1y_NExchKwQ",
	"_IAHg2eB-EeC1y_NExchKwQ"
);
INSERT INTO input_artifacts VALUES (
	"_IADPY-B-EeC1y_NExchKwQ",
	"_EopWMPddEeCG79QDqBlPXg"
);


INSERT INTO tasks VALUES (
	"_IAFEkuB-EeC1y_NExchKwQ",
	"verify_successful_deployment",
	"Verify Successful Deployment",
	"Determine whether the rollout of a particular release into production has been successful or not.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAFEleB-EeC1y_NExchKwQ",
	"Test production release",
	"Test production release",
	"In this step, automated smoke tests should be run to determine whether key components were deployed successfully. These
	tests should be brief but revealing enough to quickly determine the validity of the deployment.",
	"_IAFEkuB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAFEk-B-EeC1y_NExchKwQ",
	"Run manual tests",
	"Run manual tests",
	"If the automated smoke tests are successful, run several complex manual tests to simulate key end user behavior. These
	tests should be executed by development team members or stakeholders recruited specifically for this purpose.",
	"_IAFEkuB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAFElOB-EeC1y_NExchKwQ",
	"Determine if release should be reversed",
	"Determine if release should be reversed",
	"In some situations, problems with the release might be encountered but are not serious enough to reverse the deployment. If
	the problem(s) associated with the release can be fixed easily, and if they are not detrimental to the production
	environment, an emergency bug fix (EBF) might be the answer. In that case, the release is not backed out; rather, an EBF is
	scheduled to be executed as soon as possible.",
	"_IAFEkuB-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IAFEkuB-EeC1y_NExchKwQ",
	"_EopWMPddEeCG79QDqBlPXg"
);


INSERT INTO tasks VALUES (
	"_IAEdhuB-EeC1y_NExchKwQ",
	"deliver_release_communications",
	"Deliver Release Communications",
	"After a product release has been declared a success and is available for use, all relevant stakeholders should receive a communique stating that fact.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAFEkeB-EeC1y_NExchKwQ",
	"Validate the communiques",
	"Validate the communiques",
	"Ensure that the communiques designated for this release are correct, complete, and reflect all the stakeholder groups that
	must be informed.",
	"_IAEdhuB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAFEkOB-EeC1y_NExchKwQ",
	"Send release communications",
	"Send release communications",
	"Using a pre-planned script, send the communiques in the manner designated in the <a class=\"elementLinkWithType\"
	href=\"./../../practice.gen.production_release.base/workproducts/release_communications_7698226F.html\"
	guid=\"_IAIH4OB-EeC1y_NExchKwQ\">Artifact: Release Communications</a>. Most of the time, the preferred communication
	mechanism will be by email, but other methods could include beeper notification, telephone calls, a posting to an internal
	release website, live or pre-recorded presentations by senior management, etc.",
	"_IAEdhuB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAEdh-B-EeC1y_NExchKwQ",
	"Validate communications were received",
	"Validate communications were received",
	"If the communiques were sent by email, it may be prudent to request a receipt of delivery to ensure that the notices were
	received by the intended audience.",
	"_IAEdhuB-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IAEdhuB-EeC1y_NExchKwQ",
	"_IAIH4OB-EeC1y_NExchKwQ"
);


INSERT INTO tasks VALUES (
	"_IAEdgOB-EeC1y_NExchKwQ",
	"package_the_release",
	"Package the Release",
	"Each release should be built and packaged in a standard, controlled, and repeatable manner.",
	"_OjzNEJoGEeGnJt_Qpwdfdg"
);

INSERT INTO task_sections VALUES (
	"_IAEdheB-EeC1y_NExchKwQ",
	"Assemble components",
	"Assemble components",
	"Question all the developers on the development team to determine which components are ready for packaging. Only package
	those components that were completed and accepted during the previous feature development sprint/iterations. Components
	that were not finished or not accepted should not be bundled, unless the customer has granted an exception or they are
	infrastructure-related components.",
	"_IAEdgOB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAEdguB-EeC1y_NExchKwQ",
	"Test the release",
	"Test the release",
	"After the components have been packaged and built, that executable should be installed and run in a test environment that
	mimics the production environment. A \"staging\" environment usually is maintained for this purpose. Testing typically
	includes a \"smoke test\" in which key features are exercised to highlight any unplanned behavior.",
	"_IAEdgOB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAEdhOB-EeC1y_NExchKwQ",
	"Tag source code repository",
	"Tag source code repository",
	"In the team's configuration management (CM) tool, tag all the components that went into the release package so that the
	package can be reconstructed at a later date, if needed. This tag is known as the release \"baseline.\"",
	"_IAEdgOB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAEdg-B-EeC1y_NExchKwQ",
	"Package release documentation",
	"Package release documentation",
	"Gather all the product, user, and support documentation developed earlier in the production release sprint/iteration and
	add it to the release package.",
	"_IAEdgOB-EeC1y_NExchKwQ"
);
INSERT INTO task_sections VALUES (
	"_IAEdgeB-EeC1y_NExchKwQ",
	"Deliver release package",
	"Deliver release package",
	"When the entire release package, including documentation, is ready, deliver it to the deployment manager and the release
	team in a timely manner. Be prepared to answer questions from the deployment engineer, especially questions about
	conformity to release controls.",
	"_IAEdgOB-EeC1y_NExchKwQ"
);

INSERT INTO input_artifacts VALUES (
	"_IAEdgOB-EeC1y_NExchKwQ",
	"_IAJ9FeB-EeC1y_NExchKwQ"
);
INSERT INTO input_artifacts VALUES (
	"_IAEdgOB-EeC1y_NExchKwQ",
	"_IAJWA-B-EeC1y_NExchKwQ"
);

INSERT INTO output_artifacts VALUES (
	"_IAEdgOB-EeC1y_NExchKwQ",
	"_EopWMPddEeCG79QDqBlPXg"
);


INSERT INTO role_tasks VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO role_tasks VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_jmrVYL9xEd-AG_DXKKgAXg",
	"_XlJ80CZpEd-XKYR2S73PfQ"
);
INSERT INTO role_tasks VALUES (
	"_jmrVYL9xEd-AG_DXKKgAXg",
	"_NOBsuCZLEd-QuZFPf_YdqQ"
);
INSERT INTO role_tasks VALUES (
	"_jmrVYb9xEd-AG_DXKKgAXg",
	"_okIOcEmfEd-UYMQAaXd4fQ"
);
INSERT INTO role_tasks VALUES (
	"_jmrVYb9xEd-AG_DXKKgAXg",
	"_jcjbMEmgEd-UYMQAaXd4fQ"
);
INSERT INTO role_tasks VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_0lC70MlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0dsWoMlgEdmt3adZL5Dmdw",
	"_0mwzEclgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_tasks VALUES (
	"_5h_uoKcyEd-VK6zqjMaiPQ",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_srklxgjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_tasks VALUES (
	"_0a0o0MlgEdmt3adZL5Dmdw",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);
INSERT INTO role_tasks VALUES (
	"_Xh-X4AqBEdyPCr4G1Tb79A",
	"_o19QgF2BEd2T6cNSe41mOg"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_o19QgF2BEd2T6cNSe41mOg"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_1dlWkH3GEd2sJcA0evSBQw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_prtzIDmiEdy8N6BRpa8ByQ"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_qzveUBk5Edyoe_hnDlTB5A"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_qzveUBk5Edyoe_hnDlTB5A"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_ZffcIDmiEdy8N6BRpa8ByQ"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);
INSERT INTO role_tasks VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_YkGwYFtsEdykEsBjRsVfZw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4QqBEdyPCr4G1Tb79A",
	"_YkGwYFtsEdykEsBjRsVfZw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4QqBEdyPCr4G1Tb79A",
	"_AgQVAD5QEdyA6a_I80swHw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_AgQVAD5QEdyA6a_I80swHw"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_7L2MIDyOEdyA6a_I80swHw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_UXrv8Eb3EdySHMdInS9eGA"
);
INSERT INTO role_tasks VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_JCHfMEXhEdy14e5PT9v3HQ"
);
INSERT INTO role_tasks VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_yGbYIEb0EdySHMdInS9eGA"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_lYC2IGDAEdyKlZvvtnMrMg"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_HMQasGDFEdyKlZvvtnMrMg"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_6-p2EH_BEd2YWI_0AZcMOA"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_RBu1YFH7Edy72tV0zV7--Q"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_RBu1YVH7Edy72tV0zV7--Q"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_z9ORcKnrEdyzmOHu2kw1UA"
);
INSERT INTO role_tasks VALUES (
	"_XiII4wqBEdyPCr4G1Tb79A",
	"_z9ORcKnrEdyzmOHu2kw1UA"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_eAWtgFv3EdykEsBjRsVfZw"
);
INSERT INTO role_tasks VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_euAb8FtuEdykEsBjRsVfZw"
);
INSERT INTO role_tasks VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_LGd_MFtvEdykEsBjRsVfZw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_CmBe4EtaEdyEE-k1R6LmOA"
);
INSERT INTO role_tasks VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_cik88EtZEdyEE-k1R6LmOA"
);
INSERT INTO role_tasks VALUES (
	"_bYUkIJyiEd23W8_-Tub7Ww",
	"_IFeJQKveEd2Pv_z50upsAg"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_O93X4KvzEd2Pv_z50upsAg"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_tzUvgKv7Ed2Pv_z50upsAg"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_E5968Kv8Ed2Pv_z50upsAg"
);
INSERT INTO role_tasks VALUES (
	"_bYUkIJyiEd23W8_-Tub7Ww",
	"_deyUkKv8Ed2Pv_z50upsAg"
);
INSERT INTO role_tasks VALUES (
	"_bYUkIJyiEd23W8_-Tub7Ww",
	"_w0x40KzAEd2aLdlF48Bk1g"
);
INSERT INTO role_tasks VALUES (
	"_Xh-X4AqBEdyPCr4G1Tb79A",
	"_A2d5sCyQEd-ER8gMc_Ftrw"
);
INSERT INTO role_tasks VALUES (
	"_XiII4gqBEdyPCr4G1Tb79A",
	"_A2d5sCyQEd-ER8gMc_Ftrw"
);
INSERT INTO role_tasks VALUES (
	"_5h_uoKcyEd-VK6zqjMaiPQ",
	"_A2d5sCyQEd-ER8gMc_Ftrw"
);
INSERT INTO role_tasks VALUES (
	"_JkVWIApyEdyKK5Go8zejMw",
	"_mDL5YGhkEd-FVuzXjnvIWA"
);
INSERT INTO role_tasks VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0ZM4MclgEdmt3adZL5Dmdw",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO role_tasks VALUES (
	"_0X9iEMlgEdmt3adZL5Dmdw",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0X9iEMlgEdmt3adZL5Dmdw",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);
INSERT INTO role_tasks VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_4z8Z0EbEEdyx8quJU3Grxg"
);
INSERT INTO role_tasks VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_SL7N0LPdEduocbW-TPTq7A"
);
INSERT INTO role_tasks VALUES (
	"_0VxJsMlgEdmt3adZL5Dmdw",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO role_tasks VALUES (
	"_-zf1teB8EeC1y_NExchKwQ",
	"_-zfOruB8EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_-zf1teB8EeC1y_NExchKwQ",
	"_-zfOp-B8EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_-zf1teB8EeC1y_NExchKwQ",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_cQjSAPWkEeC0T_-ipt2c0Q",
	"_-zenmeB8EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_-zenk-B8EeC1y_NExchKwQ",
	"_-zenlOB8EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_-zenk-B8EeC1y_NExchKwQ",
	"_-zeAg-B8EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_IAIH4eB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAIH4eB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_IAIu9uB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAJ9EeB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAJWBOB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_IAIu8uB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAD2dOB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IADPY-B-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAFEkuB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_L-BcoOCFEeC1y_NExchKwQ",
	"_IAEdhuB-EeC1y_NExchKwQ"
);
INSERT INTO role_tasks VALUES (
	"_0YDosMlgEdmt3adZL5Dmdw",
	"_IAEdgOB-EeC1y_NExchKwQ"
);

INSERT INTO activities VALUES (
	"_nIvp5cVVEd2pfdXgw7I2qQ",
	"discover_business_rules",
	"Discover Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_s37aM8VVEd2pfdXgw7I2qQ",
	"analyze_business_rules",
	"Analyze Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_z0dHhcVVEd2pfdXgw7I2qQ",
	"discover_business_rules",
	"Discover Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_9s4lJcVVEd2pfdXgw7I2qQ",
	"analyze_business_rules",
	"Analyze Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_9s4lPcVVEd2pfdXgw7I2qQ",
	"design_bre_integration",
	"Design BRMS Integration",
	""
);
INSERT INTO activities VALUES (
	"_9s4lMcVVEd2pfdXgw7I2qQ",
	"author_business_rules",
	"Author Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_9s4lTMVVEd2pfdXgw7I2qQ",
	"develop__bre_architecture",
	"Develop BRMS Integration Architecture",
	""
);
INSERT INTO activities VALUES (
	"_RkSNoMVWEd2pfdXgw7I2qQ",
	"discover_business_rules",
	"Discover Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_RkSNZcVWEd2pfdXgw7I2qQ",
	"analyze_business_rules",
	"Analyze Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_DbIE48VXEd2pfdXgw7I2qQ",
	"design_bre_integration",
	"Design BRMS Integration",
	""
);
INSERT INTO activities VALUES (
	"_RkSNccVWEd2pfdXgw7I2qQ",
	"author_business_rules",
	"Author Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_RkSNpsVWEd2pfdXgw7I2qQ",
	"validate_business_rules",
	"Validate Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_0xrvR8VWEd2pfdXgw7I2qQ",
	"deploy_business_rules",
	"Deploy Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_6r4dGMVWEd2pfdXgw7I2qQ",
	"discover_business_rules",
	"Discover Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_6r4c1cVWEd2pfdXgw7I2qQ",
	"analyze_business_rules",
	"Analyze Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_6r4c9cVWEd2pfdXgw7I2qQ",
	"design_bre_integration",
	"Design BRMS Integration",
	""
);
INSERT INTO activities VALUES (
	"_6r4c4cVWEd2pfdXgw7I2qQ",
	"author_business_rules",
	"Author Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_6r4dHsVWEd2pfdXgw7I2qQ",
	"validate_business_rules",
	"Validate Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_6r4c8MVWEd2pfdXgw7I2qQ",
	"deploy_business_rules",
	"Deploy Business Rules",
	""
);
INSERT INTO activities VALUES (
	"_o1WpwZoQEeGnJt_Qpwdfdg",
	"Prepare Environment",
	"Prepare Environment",
	""
);
INSERT INTO activities VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);
INSERT INTO activities VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"develop_solution",
	"Develop Solution Increment",
	"Design, implement, test, and integrate the solution for a requirement within a given context."
);
INSERT INTO activities VALUES (
	"_HhjJsdOOEdyqlogshP8l4g",
	"test_solution",
	"Test Solution",
	"From a system perspective, test and evaluate the developed requirements."
);
INSERT INTO activities VALUES (
	"_GQejYdOOEdyqlogshP8l4g",
	"ongoing_tasks",
	"Ongoing Tasks",
	"Perform ongoing tasks that are not necessarily part of the project schedule."
);
INSERT INTO activities VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"prepare_product_documentation",
	"Develop Product Documentation and Training",
	"This activity prepares product documentation and training materials."
);
INSERT INTO activities VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"identify_and_refine_requirements",
	"Identify and Refine Requirements",
	"Detail a set of requirements (one or more use cases, scenarios or system-wide requirements)."
);
INSERT INTO activities VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);
INSERT INTO activities VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"identify_and_refine_requirements",
	"Identify and Refine Requirements",
	"Detail a set of requirements (one or more use cases, scenarios or system-wide requirements)."
);
INSERT INTO activities VALUES (
	"_aSrtcdOOEdyqlogshP8l4g",
	"develop_architecture",
	"Develop the Architecture",
	"Develop the architecturally significant requirements prioritized for this iteration."
);
INSERT INTO activities VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"develop_solution",
	"Develop Solution Increment",
	"Design, implement, test, and integrate the solution for a requirement within a given context."
);
INSERT INTO activities VALUES (
	"_f4VuYdOOEdyqlogshP8l4g",
	"test_solution",
	"Test Solution",
	"From a system perspective, test and evaluate the developed requirements."
);
INSERT INTO activities VALUES (
	"_g8cPsdOOEdyqlogshP8l4g",
	"ongoing_tasks",
	"Ongoing Tasks",
	"Perform ongoing tasks that are not necessarily part of the project schedule."
);
INSERT INTO activities VALUES (
	"_nfpeAdOOEdyqlogshP8l4g",
	"initiate_project",
	"Initiate Project",
	"Kick off the project and gain agreement with the stakeholders on the scope of the project, and an initial plan for achieving it. This activity bundles tasks required to define the vision and create a project plan."
);
INSERT INTO activities VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);
INSERT INTO activities VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"identify_and_refine_requirements",
	"Identify and Refine Requirements",
	"Detail a set of requirements (one or more use cases, scenarios or system-wide requirements)."
);
INSERT INTO activities VALUES (
	"_w-Bc8dOOEdyqlogshP8l4g",
	"agree_technical_approach",
	"Agree on Technical Approach",
	"Reach agreement on a viable technical approach to developing the solution."
);
INSERT INTO activities VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);
INSERT INTO activities VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"develop_solution",
	"Develop Solution Increment",
	"Design, implement, test, and integrate the solution for a requirement within a given context."
);
INSERT INTO activities VALUES (
	"_AZ58IdOPEdyqlogshP8l4g",
	"test_solution",
	"Test Solution",
	"From a system perspective, test and evaluate the developed requirements."
);
INSERT INTO activities VALUES (
	"_CoJVUdOPEdyqlogshP8l4g",
	"ongoing_tasks",
	"Ongoing Tasks",
	"Perform ongoing tasks that are not necessarily part of the project schedule."
);
INSERT INTO activities VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"prepare_for_release",
	"Prepare for Release",
	"This activity prepares a product for release."
);
INSERT INTO activities VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"deploy_release_to_production",
	"Deploy Release to Production",
	"This activity results in the release of a set of integrated components into the production environment."
);
INSERT INTO activities VALUES (
	"_tcRJkZlXEeGlkdGl1HQlDA",
	"provide_product_training",
	"Provide Product Training",
	"This activity provides product training."
);
INSERT INTO activities VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"prep_doc_trng",
	"Develop Product Documentation and Training",
	"This activity prepares product documentation and training materials."
);
INSERT INTO activities VALUES (
	"_TV_k8dOKEdyqlogshP8l4g",
	"develop_solution",
	"Develop Solution Increment",
	"Design, implement, test, and integrate the solution for a requirement within a given context."
);

INSERT INTO processes VALUES (
	"_92FEQX_DEd2YWI_0AZcMOA",
	"abrd_governance",
	"Rule Governance",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO phases VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"Set Governance Processes",
	"Setting Governance Processes",
	"",
	"_92FEQX_DEd2YWI_0AZcMOA"
);



INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_IFeJQKveEd2Pv_z50upsAg"
);
INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_O93X4KvzEd2Pv_z50upsAg"
);
INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_tzUvgKv7Ed2Pv_z50upsAg"
);
INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_RBu1YFH7Edy72tV0zV7--Q"
);
INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_RBu1YVH7Edy72tV0zV7--Q"
);
INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_E5968Kv8Ed2Pv_z50upsAg"
);
INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_deyUkKv8Ed2Pv_z50upsAg"
);
INSERT INTO phase_tasks VALUES (
	"_AxPN0X_EEd2YWI_0AZcMOA",
	"_w0x40KzAEd2aLdlF48Bk1g"
);

INSERT INTO phases VALUES (
	"_DtuNEX_EEd2YWI_0AZcMOA",
	"Maintain Rule",
	"Maintain Rule",
	"",
	"_92FEQX_DEd2YWI_0AZcMOA"
);



INSERT INTO phase_tasks VALUES (
	"_DtuNEX_EEd2YWI_0AZcMOA",
	"_z9ORcKnrEdyzmOHu2kw1UA"
);

INSERT INTO processes VALUES (
	"_2EcLMXqlEd2o_5d3MWaNxQ",
	"abrd_process",
	"Agile Business Rule Development",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO phases VALUES (
	"_CryGMHqmEd2o_5d3MWaNxQ",
	"Harvesting",
	"Cycle 1- Harvesting",
	"",
	"_2EcLMXqlEd2o_5d3MWaNxQ"
);


INSERT INTO phase_activities VALUES (
	"_CryGMHqmEd2o_5d3MWaNxQ",
	"_nIvp5cVVEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_nIvp5cVVEd2pfdXgw7I2qQ",
	"_A2d5sCyQEd-ER8gMc_Ftrw"
);
INSERT INTO activity_tasks VALUES (
	"_nIvp5cVVEd2pfdXgw7I2qQ",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO activity_tasks VALUES (
	"_nIvp5cVVEd2pfdXgw7I2qQ",
	"_srklxgjqEdyj5bYZ0eCR5g"
);
INSERT INTO activity_tasks VALUES (
	"_nIvp5cVVEd2pfdXgw7I2qQ",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);
INSERT INTO activity_tasks VALUES (
	"_nIvp5cVVEd2pfdXgw7I2qQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);

INSERT INTO phase_activities VALUES (
	"_CryGMHqmEd2o_5d3MWaNxQ",
	"_s37aM8VVEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_s37aM8VVEd2pfdXgw7I2qQ",
	"_o19QgF2BEd2T6cNSe41mOg"
);
INSERT INTO activity_tasks VALUES (
	"_s37aM8VVEd2pfdXgw7I2qQ",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO activity_tasks VALUES (
	"_s37aM8VVEd2pfdXgw7I2qQ",
	"_1dlWkH3GEd2sJcA0evSBQw"
);
INSERT INTO activity_tasks VALUES (
	"_s37aM8VVEd2pfdXgw7I2qQ",
	"_prtzIDmiEdy8N6BRpa8ByQ"
);



INSERT INTO phases VALUES (
	"_zPFMAXrDEd2o_5d3MWaNxQ",
	"prototyping",
	"Cycle 2- Prototyping",
	"",
	"_2EcLMXqlEd2o_5d3MWaNxQ"
);


INSERT INTO phase_activities VALUES (
	"_zPFMAXrDEd2o_5d3MWaNxQ",
	"_z0dHhcVVEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_z0dHhcVVEd2pfdXgw7I2qQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);

INSERT INTO phase_activities VALUES (
	"_zPFMAXrDEd2o_5d3MWaNxQ",
	"_9s4lJcVVEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_9s4lJcVVEd2pfdXgw7I2qQ",
	"_o19QgF2BEd2T6cNSe41mOg"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lJcVVEd2pfdXgw7I2qQ",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lJcVVEd2pfdXgw7I2qQ",
	"_1dlWkH3GEd2sJcA0evSBQw"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lJcVVEd2pfdXgw7I2qQ",
	"_prtzIDmiEdy8N6BRpa8ByQ"
);

INSERT INTO phase_activities VALUES (
	"_zPFMAXrDEd2o_5d3MWaNxQ",
	"_9s4lPcVVEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_9s4lPcVVEd2pfdXgw7I2qQ",
	"_qzveUBk5Edyoe_hnDlTB5A"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lPcVVEd2pfdXgw7I2qQ",
	"_7L2MIDyOEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lPcVVEd2pfdXgw7I2qQ",
	"_ZffcIDmiEdy8N6BRpa8ByQ"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lPcVVEd2pfdXgw7I2qQ",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lPcVVEd2pfdXgw7I2qQ",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);

INSERT INTO phase_activities VALUES (
	"_zPFMAXrDEd2o_5d3MWaNxQ",
	"_9s4lMcVVEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_9s4lMcVVEd2pfdXgw7I2qQ",
	"_mDL5YGhkEd-FVuzXjnvIWA"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lMcVVEd2pfdXgw7I2qQ",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lMcVVEd2pfdXgw7I2qQ",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lMcVVEd2pfdXgw7I2qQ",
	"_UXrv8Eb3EdySHMdInS9eGA"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lMcVVEd2pfdXgw7I2qQ",
	"_JCHfMEXhEdy14e5PT9v3HQ"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lMcVVEd2pfdXgw7I2qQ",
	"_yGbYIEb0EdySHMdInS9eGA"
);

INSERT INTO phase_activities VALUES (
	"_zPFMAXrDEd2o_5d3MWaNxQ",
	"_9s4lTMVVEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_9s4lTMVVEd2pfdXgw7I2qQ",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lTMVVEd2pfdXgw7I2qQ",
	"_HMQasGDFEdyKlZvvtnMrMg"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lTMVVEd2pfdXgw7I2qQ",
	"_lYC2IGDAEdyKlZvvtnMrMg"
);
INSERT INTO activity_tasks VALUES (
	"_9s4lTMVVEd2pfdXgw7I2qQ",
	"_6-p2EH_BEd2YWI_0AZcMOA"
);



INSERT INTO phases VALUES (
	"_o2AhUXtxEd2tkbw8c1Rm7g",
	"Cycle3- Building",
	"Cycle 3- Building",
	"",
	"_2EcLMXqlEd2o_5d3MWaNxQ"
);


INSERT INTO phase_activities VALUES (
	"_o2AhUXtxEd2tkbw8c1Rm7g",
	"_RkSNoMVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_RkSNoMVWEd2pfdXgw7I2qQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);

INSERT INTO phase_activities VALUES (
	"_o2AhUXtxEd2tkbw8c1Rm7g",
	"_RkSNZcVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_RkSNZcVWEd2pfdXgw7I2qQ",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNZcVWEd2pfdXgw7I2qQ",
	"_1dlWkH3GEd2sJcA0evSBQw"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNZcVWEd2pfdXgw7I2qQ",
	"_prtzIDmiEdy8N6BRpa8ByQ"
);

INSERT INTO phase_activities VALUES (
	"_o2AhUXtxEd2tkbw8c1Rm7g",
	"_DbIE48VXEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_DbIE48VXEd2pfdXgw7I2qQ",
	"_qzveUBk5Edyoe_hnDlTB5A"
);

INSERT INTO phase_activities VALUES (
	"_o2AhUXtxEd2tkbw8c1Rm7g",
	"_RkSNccVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_RkSNccVWEd2pfdXgw7I2qQ",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNccVWEd2pfdXgw7I2qQ",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNccVWEd2pfdXgw7I2qQ",
	"_UXrv8Eb3EdySHMdInS9eGA"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNccVWEd2pfdXgw7I2qQ",
	"_JCHfMEXhEdy14e5PT9v3HQ"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNccVWEd2pfdXgw7I2qQ",
	"_yGbYIEb0EdySHMdInS9eGA"
);

INSERT INTO phase_activities VALUES (
	"_o2AhUXtxEd2tkbw8c1Rm7g",
	"_RkSNpsVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_RkSNpsVWEd2pfdXgw7I2qQ",
	"_mDL5YGhkEd-FVuzXjnvIWA"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNpsVWEd2pfdXgw7I2qQ",
	"_eAWtgFv3EdykEsBjRsVfZw"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNpsVWEd2pfdXgw7I2qQ",
	"_euAb8FtuEdykEsBjRsVfZw"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNpsVWEd2pfdXgw7I2qQ",
	"_LGd_MFtvEdykEsBjRsVfZw"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNpsVWEd2pfdXgw7I2qQ",
	"_CmBe4EtaEdyEE-k1R6LmOA"
);
INSERT INTO activity_tasks VALUES (
	"_RkSNpsVWEd2pfdXgw7I2qQ",
	"_cik88EtZEdyEE-k1R6LmOA"
);



INSERT INTO phases VALUES (
	"_3pe8sXtxEd2tkbw8c1Rm7g",
	"Cycle 4- Integrating",
	"Cycle 4- Integrating",
	"",
	"_2EcLMXqlEd2o_5d3MWaNxQ"
);


INSERT INTO phase_activities VALUES (
	"_3pe8sXtxEd2tkbw8c1Rm7g",
	"_0xrvR8VWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_0xrvR8VWEd2pfdXgw7I2qQ",
	"_AgQVAD5QEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_0xrvR8VWEd2pfdXgw7I2qQ",
	"_YkGwYFtsEdykEsBjRsVfZw"
);



INSERT INTO phases VALUES (
	"_53V7YXtxEd2tkbw8c1Rm7g",
	"Cycle 5- Enhancing",
	"Cycle 5- Enhancing",
	"",
	"_2EcLMXqlEd2o_5d3MWaNxQ"
);


INSERT INTO phase_activities VALUES (
	"_53V7YXtxEd2tkbw8c1Rm7g",
	"_6r4dGMVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_6r4dGMVWEd2pfdXgw7I2qQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);

INSERT INTO phase_activities VALUES (
	"_53V7YXtxEd2tkbw8c1Rm7g",
	"_6r4c1cVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_6r4c1cVWEd2pfdXgw7I2qQ",
	"_o19QgF2BEd2T6cNSe41mOg"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c1cVWEd2pfdXgw7I2qQ",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c1cVWEd2pfdXgw7I2qQ",
	"_1dlWkH3GEd2sJcA0evSBQw"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c1cVWEd2pfdXgw7I2qQ",
	"_prtzIDmiEdy8N6BRpa8ByQ"
);

INSERT INTO phase_activities VALUES (
	"_53V7YXtxEd2tkbw8c1Rm7g",
	"_6r4c9cVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_6r4c9cVWEd2pfdXgw7I2qQ",
	"_qzveUBk5Edyoe_hnDlTB5A"
);

INSERT INTO phase_activities VALUES (
	"_53V7YXtxEd2tkbw8c1Rm7g",
	"_6r4c4cVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_6r4c4cVWEd2pfdXgw7I2qQ",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c4cVWEd2pfdXgw7I2qQ",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c4cVWEd2pfdXgw7I2qQ",
	"_UXrv8Eb3EdySHMdInS9eGA"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c4cVWEd2pfdXgw7I2qQ",
	"_JCHfMEXhEdy14e5PT9v3HQ"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c4cVWEd2pfdXgw7I2qQ",
	"_yGbYIEb0EdySHMdInS9eGA"
);

INSERT INTO phase_activities VALUES (
	"_53V7YXtxEd2tkbw8c1Rm7g",
	"_6r4dHsVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_6r4dHsVWEd2pfdXgw7I2qQ",
	"_euAb8FtuEdykEsBjRsVfZw"
);
INSERT INTO activity_tasks VALUES (
	"_6r4dHsVWEd2pfdXgw7I2qQ",
	"_LGd_MFtvEdykEsBjRsVfZw"
);
INSERT INTO activity_tasks VALUES (
	"_6r4dHsVWEd2pfdXgw7I2qQ",
	"_CmBe4EtaEdyEE-k1R6LmOA"
);
INSERT INTO activity_tasks VALUES (
	"_6r4dHsVWEd2pfdXgw7I2qQ",
	"_cik88EtZEdyEE-k1R6LmOA"
);

INSERT INTO phase_activities VALUES (
	"_53V7YXtxEd2tkbw8c1Rm7g",
	"_6r4c8MVWEd2pfdXgw7I2qQ"
);

INSERT INTO activity_tasks VALUES (
	"_6r4c8MVWEd2pfdXgw7I2qQ",
	"_AgQVAD5QEdyA6a_I80swHw"
);
INSERT INTO activity_tasks VALUES (
	"_6r4c8MVWEd2pfdXgw7I2qQ",
	"_YkGwYFtsEdykEsBjRsVfZw"
);



INSERT INTO processes VALUES (
	"_iVgFYT3gEd-rQL4FfV6WbQ",
	"openUp_abrd",
	"ABRD and UP",
	"The process presents how the activities of ABRD may fit in the Inception, Elaboration, Construction and Transition of OpenUp. ",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);

INSERT INTO phases VALUES (
	"_y0zJYT3gEd-rQL4FfV6WbQ",
	"Inception",
	"Inception",
	"",
	"_iVgFYT3gEd-rQL4FfV6WbQ"
);

INSERT INTO iterations VALUES (
	"_jFqhkT3hEd-rQL4FfV6WbQ",
	"Iteration n",
	"Iteration n",
	"",
	"_y0zJYT3gEd-rQL4FfV6WbQ"
);

INSERT INTO iteration_tasks VALUES (
	"_jFqhkT3hEd-rQL4FfV6WbQ",
	"_A2d5sCyQEd-ER8gMc_Ftrw"
);
INSERT INTO iteration_tasks VALUES (
	"_jFqhkT3hEd-rQL4FfV6WbQ",
	"_sruWzAjqEdyj5bYZ0eCR5g"
);
INSERT INTO iteration_tasks VALUES (
	"_jFqhkT3hEd-rQL4FfV6WbQ",
	"_srklxgjqEdyj5bYZ0eCR5g"
);
INSERT INTO iteration_tasks VALUES (
	"_jFqhkT3hEd-rQL4FfV6WbQ",
	"_sruWxAjqEdyj5bYZ0eCR5g"
);
INSERT INTO iteration_tasks VALUES (
	"_jFqhkT3hEd-rQL4FfV6WbQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);



INSERT INTO phases VALUES (
	"_0HDbcD3gEd-rQL4FfV6WbQ",
	"Elaboration",
	"Elaboration",
	"",
	"_iVgFYT3gEd-rQL4FfV6WbQ"
);

INSERT INTO iterations VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"Iteration E1",
	"Iteration E1",
	"",
	"_0HDbcD3gEd-rQL4FfV6WbQ"
);

INSERT INTO iteration_tasks VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);
INSERT INTO iteration_tasks VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"_o19QgF2BEd2T6cNSe41mOg"
);
INSERT INTO iteration_tasks VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"_1dlWkH3GEd2sJcA0evSBQw"
);
INSERT INTO iteration_tasks VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"_prtzIDmiEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"_nOQHsAp6EdyPCr4G1Tb79A"
);
INSERT INTO iteration_tasks VALUES (
	"_sPbicT3hEd-rQL4FfV6WbQ",
	"_eAWtgFv3EdykEsBjRsVfZw"
);
INSERT INTO iterations VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"Iteration E2",
	"Iteration E2",
	"",
	"_0HDbcD3gEd-rQL4FfV6WbQ"
);

INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_qzveUBk5Edyoe_hnDlTB5A"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_7L2MIDyOEdyA6a_I80swHw"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_O92DQDV5EdyTBtGu8YeFfg"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_ZffcIDmiEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_1dlWkH3GEd2sJcA0evSBQw"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_prtzIDmiEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_lYC2IGDAEdyKlZvvtnMrMg"
);
INSERT INTO iteration_tasks VALUES (
	"_zEeusT3hEd-rQL4FfV6WbQ",
	"_HMQasGDFEdyKlZvvtnMrMg"
);
INSERT INTO iterations VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"Iteration En",
	"Iteration En",
	"",
	"_0HDbcD3gEd-rQL4FfV6WbQ"
);

INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_sruW3AjqEdyj5bYZ0eCR5g"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_o19QgF2BEd2T6cNSe41mOg"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_8mZw8DmhEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_dds-IDmiEdy8N6BRpa8ByQ"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_UXrv8Eb3EdySHMdInS9eGA"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_JCHfMEXhEdy14e5PT9v3HQ"
);
INSERT INTO iteration_tasks VALUES (
	"_ST6mMT3iEd-rQL4FfV6WbQ",
	"_yGbYIEb0EdySHMdInS9eGA"
);



INSERT INTO phases VALUES (
	"_4HDtMT3gEd-rQL4FfV6WbQ",
	"Construction",
	"Construction",
	"",
	"_iVgFYT3gEd-rQL4FfV6WbQ"
);

INSERT INTO iterations VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"Iteration C1",
	"Iteration C1",
	"",
	"_4HDtMT3gEd-rQL4FfV6WbQ"
);

INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_6-p2EH_BEd2YWI_0AZcMOA"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_UXrv8Eb3EdySHMdInS9eGA"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_JCHfMEXhEdy14e5PT9v3HQ"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_yGbYIEb0EdySHMdInS9eGA"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_euAb8FtuEdykEsBjRsVfZw"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_LGd_MFtvEdykEsBjRsVfZw"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_CmBe4EtaEdyEE-k1R6LmOA"
);
INSERT INTO iteration_tasks VALUES (
	"_LvtSUT3iEd-rQL4FfV6WbQ",
	"_cik88EtZEdyEE-k1R6LmOA"
);
INSERT INTO iterations VALUES (
	"_NlH70T3iEd-rQL4FfV6WbQ",
	"Iteration Cn",
	"Iteration Cn",
	"",
	"_4HDtMT3gEd-rQL4FfV6WbQ"
);

INSERT INTO iteration_tasks VALUES (
	"_NlH70T3iEd-rQL4FfV6WbQ",
	"_ioCPkDzEEdyA6a_I80swHw"
);
INSERT INTO iteration_tasks VALUES (
	"_NlH70T3iEd-rQL4FfV6WbQ",
	"_Y2CxEDzEEdyA6a_I80swHw"
);
INSERT INTO iteration_tasks VALUES (
	"_NlH70T3iEd-rQL4FfV6WbQ",
	"_UXrv8Eb3EdySHMdInS9eGA"
);
INSERT INTO iteration_tasks VALUES (
	"_NlH70T3iEd-rQL4FfV6WbQ",
	"_JCHfMEXhEdy14e5PT9v3HQ"
);
INSERT INTO iteration_tasks VALUES (
	"_NlH70T3iEd-rQL4FfV6WbQ",
	"_AgQVAD5QEdyA6a_I80swHw"
);



INSERT INTO phases VALUES (
	"_5ETYkT3gEd-rQL4FfV6WbQ",
	"Transition",
	"Transition",
	"",
	"_iVgFYT3gEd-rQL4FfV6WbQ"
);




INSERT INTO processes VALUES (
	"_SuWj4dOPEdyqlogshP8l4g",
	"openup_lifecycle",
	"OpenUP Lifecycle",
	"This delivery process defines an end-to-end software development lifecycle that supports the core principles of OpenUP. It is designed to support small, co-located teams in their daily activities.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO phases VALUES (
	"_8tQrUVQvEd2i9JHp7xurvw",
	"Inception Phase",
	"Inception Phase",
	"",
	"_SuWj4dOPEdyqlogshP8l4g"
);

INSERT INTO iterations VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"inception_phase_iteration",
	"Inception Phase Iteration",
	"This iteration template defines the activities (and associated roles and work products) performed in a typical iteration in the Inception phase.",
	"_8tQrUVQvEd2i9JHp7xurvw"
);

INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_nfpeAdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_nfpeAdOOEdyqlogshP8l4g",
	"_0fOAoMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_nfpeAdOOEdyqlogshP8l4g",
	"_0lC70MlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_uxDPEdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO activity_tasks VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_vyeP0dOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_SL7N0LPdEduocbW-TPTq7A"
);
INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_4z8Z0EbEEdyx8quJU3Grxg"
);
INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_w-Bc8dOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_w-Bc8dOOEdyqlogshP8l4g",
	"_0f-1oMlgEdmt3adZL5Dmdw"
);



INSERT INTO phases VALUES (
	"_ieYHIVQwEd2i9JHp7xurvw",
	"Elaboration Phase",
	"Elaboration Phase",
	"",
	"_SuWj4dOPEdyqlogshP8l4g"
);

INSERT INTO iterations VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"elaboration_phase_iteration",
	"Elaboration Phase Iteration",
	"This iteration template defines the activities (and associated roles and work  products) performed in a typical iteration in the Elaboration phase.",
	"_ieYHIVQwEd2i9JHp7xurvw"
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_XayTQdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO activity_tasks VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_YwLY4dOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_SL7N0LPdEduocbW-TPTq7A"
);
INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_4z8Z0EbEEdyx8quJU3Grxg"
);
INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_aSrtcdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_aSrtcdOOEdyqlogshP8l4g",
	"_0gRJgMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_eyv_UdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);
INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_f4VuYdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_f4VuYdOOEdyqlogshP8l4g",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_f4VuYdOOEdyqlogshP8l4g",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_g8cPsdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_g8cPsdOOEdyqlogshP8l4g",
	"_0mwzEclgEdmt3adZL5Dmdw"
);



INSERT INTO phases VALUES (
	"_nfpBkVQwEd2i9JHp7xurvw",
	"Construction Phase",
	"Construction Phase",
	"",
	"_SuWj4dOPEdyqlogshP8l4g"
);

INSERT INTO iterations VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"construction_phase_iteration",
	"Construction Phase Iteration",
	"This iteration template defines the activities (and associated roles and work products) performed in a typical iteration in the Construction phase.",
	"_nfpBkVQwEd2i9JHp7xurvw"
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_3s7aYdONEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO activity_tasks VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_yw_dcZlVEeGlkdGl1HQlDA"
);

INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_P9cMUPV_EdmdHa9MmVPgqQ"
);
INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_SL7N0LPdEduocbW-TPTq7A"
);
INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_4z8Z0EbEEdyx8quJU3Grxg"
);
INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_0iwc0clgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_CqFrgdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);
INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_HhjJsdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_HhjJsdOOEdyqlogshP8l4g",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_HhjJsdOOEdyqlogshP8l4g",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_GQejYdOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_GQejYdOOEdyqlogshP8l4g",
	"_0mwzEclgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_8--9sZigEeGlkdGl1HQlDA"
);

INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_-zfOruB8EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_-zfOp-B8EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_-zenmeB8EeC1y_NExchKwQ"
);



INSERT INTO phases VALUES (
	"_pOgXIVQwEd2i9JHp7xurvw",
	"Transition Phase",
	"Transition Phase",
	"",
	"_SuWj4dOPEdyqlogshP8l4g"
);

INSERT INTO iterations VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"transition_phase_iteration",
	"Transition Phase Iteration",
	"This iteration template defines the activities (and associated roles and work products) performed in a typical iteration in the Transition phase.",
	"_pOgXIVQwEd2i9JHp7xurvw"
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_5v_o4dOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"_0keUEMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"_8S2aICbYEdqh1LYUOGRh2A"
);
INSERT INTO activity_tasks VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"_0l53cMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_-iix4dOOEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_0fshwMlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_znlIcJR9EdyVKbgqUOtqQA"
);
INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_Ht-z8JfJEdyZkIR-s-Y8wQ"
);
INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_R7atwJfIEdyZkIR-s-Y8wQ"
);
INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_kkZBgJOKEdyaRbFYa4AN4A"
);
INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_AZ58IdOPEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_AZ58IdOPEdyqlogshP8l4g",
	"_0jO98MlgEdmt3adZL5Dmdw"
);
INSERT INTO activity_tasks VALUES (
	"_AZ58IdOPEdyqlogshP8l4g",
	"_0jVEkMlgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_ybaHoZlYEeGlkdGl1HQlDA"
);

INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_-zfOruB8EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_-zfOoOB8EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_-zfOp-B8EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_-zenmeB8EeC1y_NExchKwQ"
);
INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_qRAugZlXEeGlkdGl1HQlDA"
);

INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_IAIu9uB-EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_IAIH4eB-EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_IAIu8uB-EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_IAJWBOB-EeC1y_NExchKwQ"
);
INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_tcRJkZlXEeGlkdGl1HQlDA"
);

INSERT INTO activity_tasks VALUES (
	"_tcRJkZlXEeGlkdGl1HQlDA",
	"_-zeAg-B8EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_tcRJkZlXEeGlkdGl1HQlDA",
	"_-zenlOB8EeC1y_NExchKwQ"
);
INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_CoJVUdOPEdyqlogshP8l4g"
);

INSERT INTO activity_tasks VALUES (
	"_CoJVUdOPEdyqlogshP8l4g",
	"_0mwzEclgEdmt3adZL5Dmdw"
);
INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_sL8xMZlXEeGlkdGl1HQlDA"
);

INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_IAEdgOB-EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_IAD2dOB-EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_IAFEkuB-EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_IADPY-B-EeC1y_NExchKwQ"
);
INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_IAEdhuB-EeC1y_NExchKwQ"
);



