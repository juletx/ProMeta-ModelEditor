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

INSERT INTO work_products VALUES (
	"_6BE7QAp_EdyPCr4G1Tb79A",
	"decision_service_architecture",
	"Decision Service Architecture",
	"A decision service is a piece of logic which uses a decision engine like a rule engine in order to infer actions on the input data.",
	"_fp7oAKRdEd2fX-RO52WAtA"
);
INSERT INTO work_products VALUES (
	"_U003IIm4Ed2cL6yqw-_-uA",
	"executable_object_model",
	"Executable Object Model",
	"A Java, .Net or XML schema implementation of the logical data model",
	"_fp7oAKRdEd2fX-RO52WAtA"
);
INSERT INTO domains VALUES (
	"_2GvlYJliEeGlkdGl1HQlDA",
	"deployment_domain.assign",
	"",
	"This is the list of work products related to the Documentation and Training domain.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO work_products VALUES (
	"_-zf1tuB8EeC1y_NExchKwQ",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format.",
	"_2GvlYJliEeGlkdGl1HQlDA"
);
INSERT INTO work_products VALUES (
	"_-zfOreB8EeC1y_NExchKwQ",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product.",
	"_2GvlYJliEeGlkdGl1HQlDA"
);
INSERT INTO work_products VALUES (
	"_-zf1tOB8EeC1y_NExchKwQ",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the end users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product.",
	"_2GvlYJliEeGlkdGl1HQlDA"
);
INSERT INTO work_products VALUES (
	"_-zeAguB8EeC1y_NExchKwQ",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train end users and production support personnel on the features and inner workings of a product for a particular release.",
	"_2GvlYJliEeGlkdGl1HQlDA"
);

INSERT INTO disciplines VALUES (
	"_qc9i0MhNEdygFZkm1d5NtQ",
	"project_management_discipline",
	"Project Management",
	"This discipline explains how to coach, facilitate, and support the team, helping it to deal with risk and obstacles found when building software.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_EZo2gDIXEd-YE6CeBfCofg",
	"environment_discipline",
	"Environment",
	"This discipline explains how to customize process and tools for a project or organization.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_c0d6wMh3EdygFZkm1d5NtQ",
	"project_management_discipline",
	"Project Management",
	"This discipline explains how to coach, facilitate, and support the team, helping it to deal with risk and obstacles found when building software.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"__QJnsOxZEdyCFeiQwJE7Vg",
	"project_management_discipline",
	"Project Management",
	"This discipline explains how to coach, facilitate, and support the team, helping it to deal with risk and obstacles found when building software.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_u8WxEKshEd-4oa5dU5v0Eg",
	"brd_disciplines",
	"Business Rules Development",
	"This is a group of disciplines under business rules development.",
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
	"__u-KMLRXEd-0GaneRZjjRw",
	"rule_discovery",
	"Rule Discovery",
	"",
	"_PFU-AMVeEd2n6fDcl3UsZg"
);
INSERT INTO disciplines VALUES (
	"_iBsdQMubEdy1o5Xnqdh1Tg",
	"test_discipline",
	"Test",
	"This discipline explains how to provide feedback about the maturing system by designing, implementing, running, and evaluating tests.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_8c5BwNnVEdyNj6EOmqy5Rg",
	"development_discipline",
	"Development",
	"This discipline explains how to design and implement a technical solution that conforms to the architecture and supports the requirements.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_pBQM0M2-Edym_ZFqrJcXUg",
	"architecture_discipline",
	"Architecture",
	"This discipline explains how to create software architecture from architecturally significant requirements. The architecture is built in the Development discipline.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_6ByR0MueEdyRPtFYRAKVDg",
	"development_discipline",
	"Development",
	"This discipline explains how to design and implement a technical solution that conforms to the architecture and supports the requirements.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_2a-s0MrmEdyd6uFrFHNXhA",
	"requirements_discipline",
	"Requirements",
	"This discipline explains how to elicit, analyze, specify, validate, and manage the requirements for the system to be developed.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_TCegMMuAEdyRPtFYRAKVDg",
	"development_discipline",
	"Development",
	"This discipline explains how to design and implement a technical solution that conforms to the architecture and supports the requirements.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_gRTK0MrkEdyd6uFrFHNXhA",
	"requirements_discipline",
	"Requirements",
	"This discipline explains how to elicit, analyze, specify, validate, and manage the requirements for the system to be developed.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
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
INSERT INTO disciplines VALUES (
	"_yvumQJliEeGlkdGl1HQlDA",
	"deployment_discipline",
	"Deployment",
	"This discipline explains how to plan for and deploy a solution.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);
INSERT INTO disciplines VALUES (
	"_jOXI4JoMEeGnJt_Qpwdfdg",
	"deployment_discipline",
	"Deployment",
	"This discipline explains how to plan for and deploy a solution.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
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

INSERT INTO activities VALUES (
	"_nfpeAdOOEdyqlogshP8l4g",
	"initiate_project",
	"Initiate Project",
	"Kick off the project and gain agreement with the stakeholders on the scope of the project, and an initial plan for achieving it. This activity bundles tasks required to define the vision and create a project plan."
);

INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_nfpeAdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"develop_technical_vision",
	"Develop Technical Vision",
	"Define the vision for the future system. Describe the problem and features based on stakeholder requests.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_nfpeAdOOEdyqlogshP8l4g",
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_ceK-UED2EdyoefaQkqWN_Q",
	"Identify stakeholders",
	"Identify stakeholders",
	"Identify the stakeholders: decision-makers, customers, potential users, partners, domain experts, industry analysts and
	other interested parties. Briefly describe what stakeholders do and what their responsibilities are with regard to the
	system being developed.",
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_soyUVNOJEdyqlogshP8l4g",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_soyUVNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_OpsH8GpmEd24CboUCnKL3A",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_OpsH8GpmEd24CboUCnKL3A"
);
INSERT INTO sections VALUES (
	"_h7AacED2EdyoefaQkqWN_Q",
	"Gain agreement on the problem to be solved",
	"Gain agreement on the problem to be solved",
	"<p>
	    Avoid rushing into defining the solution. First, gain agreement on the definition of the problem by asking the
	    stakeholders what they see as the problem. Then search for root causes, or the \"problem behind the problem\".
	    Use&nbsp;appropriate requirements gathering techniques. Formulate the problem statement. The purpose of this is to help
	    you distinguish solutions and answers from problems and questions.
	</p>",
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_soyUVNOJEdyqlogshP8l4g",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_soyUVNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_OpsH8GpmEd24CboUCnKL3A",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_OpsH8GpmEd24CboUCnKL3A"
);
INSERT INTO sections VALUES (
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
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_soyUVNOJEdyqlogshP8l4g",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_soyUVNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_OpsH8GpmEd24CboUCnKL3A",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_OpsH8GpmEd24CboUCnKL3A"
);
INSERT INTO sections VALUES (
	"_yeVC0ED2EdyoefaQkqWN_Q",
	"Define the scope of the solution",
	"Define the scope of the solution",
	"<p>
	    Analyze the scope in terms of processes, organizations, and systems.
	</p>",
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_soyUVNOJEdyqlogshP8l4g",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_soyUVNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_OpsH8GpmEd24CboUCnKL3A",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_OpsH8GpmEd24CboUCnKL3A"
);
INSERT INTO sections VALUES (
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
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_soyUVNOJEdyqlogshP8l4g",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_soyUVNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_OpsH8GpmEd24CboUCnKL3A",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_OpsH8GpmEd24CboUCnKL3A"
);
INSERT INTO sections VALUES (
	"__nDMkED2EdyoefaQkqWN_Q",
	"Achieve concurrence",
	"Achieve concurrence",
	"Conduct an effective requirements&nbsp;review&nbsp;with stakeholders and the development team&nbsp;to ensure agreement on
	the project vision, assess quality, and identify required changes.",
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_soyUVNOJEdyqlogshP8l4g",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_soyUVNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_OpsH8GpmEd24CboUCnKL3A",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_OpsH8GpmEd24CboUCnKL3A"
);
INSERT INTO sections VALUES (
	"_Af_gUEIMEd2omsDpG-BNng",
	"Capture a common vocabulary",
	"Capture a common vocabulary",
	"Every project has its own specialized terminology that everyone on the team must understand well to communicate effectively
	with stakeholders.&nbsp; Work with stakeholders to create a glossary that defines acronyms, abbreviations, and relevant
	business and technical terms.&nbsp; Work with stakeholders to continually expand and refine the glossary throughout the
	project lifecycle.",
	"_sopKYNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_soyUVNOJEdyqlogshP8l4g",
	"vision",
	"Vision",
	"This artifact defines the view of the stakeholders of the technical solution to be developed. This definition is specified in terms of the key needs and features of the stakeholders. The vision contains an outline of the envisioned core requirements for the system."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_soyUVNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_OpsH8GpmEd24CboUCnKL3A",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_sopKYNOJEdyqlogshP8l4g",
	"_OpsH8GpmEd24CboUCnKL3A"
);
INSERT INTO tasks VALUES (
	"_t7pDUNOJEdyqlogshP8l4g",
	"plan_the_project",
	"Plan Project",
	"A collaborative task that outlines an initial agreement on how the project will achieve its goals. The resulting project plan provides a summary-level overview of the project.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_nfpeAdOOEdyqlogshP8l4g",
	"_t7pDUNOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_gu-PgIyBEdyhZb-MhCJrlA",
	"Identify a cohesive team",
	"Identify a cohesive team",
	"Revisit the resourcing for the project.&nbsp;Identify gaps and initiate hiring or re-allocation of resources as needed.
	Discuss with the team who plays which roles, and have them agree on their responsibilities.",
	"_t7pDUNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_4ypNIO-YEdyEMtC_IfEALw",
	"project_plan",
	"Project Plan",
	"This artifact gathers all of the information required to manage the project on a strategic level. Its main part consists of a coarse-grained plan, identifying project iterations and their goals."
);

INSERT INTO task_artifacts VALUES (
	"_t7pDUNOJEdyqlogshP8l4g",
	"_4ypNIO-YEdyEMtC_IfEALw"
);
INSERT INTO sections VALUES (
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
	"_t7pDUNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_4ypNIO-YEdyEMtC_IfEALw",
	"project_plan",
	"Project Plan",
	"This artifact gathers all of the information required to manage the project on a strategic level. Its main part consists of a coarse-grained plan, identifying project iterations and their goals."
);

INSERT INTO task_artifacts VALUES (
	"_t7pDUNOJEdyqlogshP8l4g",
	"_4ypNIO-YEdyEMtC_IfEALw"
);
INSERT INTO sections VALUES (
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
	"_t7pDUNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_4ypNIO-YEdyEMtC_IfEALw",
	"project_plan",
	"Project Plan",
	"This artifact gathers all of the information required to manage the project on a strategic level. Its main part consists of a coarse-grained plan, identifying project iterations and their goals."
);

INSERT INTO task_artifacts VALUES (
	"_t7pDUNOJEdyqlogshP8l4g",
	"_4ypNIO-YEdyEMtC_IfEALw"
);
INSERT INTO sections VALUES (
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
	"_t7pDUNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_4ypNIO-YEdyEMtC_IfEALw",
	"project_plan",
	"Project Plan",
	"This artifact gathers all of the information required to manage the project on a strategic level. Its main part consists of a coarse-grained plan, identifying project iterations and their goals."
);

INSERT INTO task_artifacts VALUES (
	"_t7pDUNOJEdyqlogshP8l4g",
	"_4ypNIO-YEdyEMtC_IfEALw"
);
INSERT INTO sections VALUES (
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
	"_t7pDUNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_4ypNIO-YEdyEMtC_IfEALw",
	"project_plan",
	"Project Plan",
	"This artifact gathers all of the information required to manage the project on a strategic level. Its main part consists of a coarse-grained plan, identifying project iterations and their goals."
);

INSERT INTO task_artifacts VALUES (
	"_t7pDUNOJEdyqlogshP8l4g",
	"_4ypNIO-YEdyEMtC_IfEALw"
);
INSERT INTO sections VALUES (
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
	"_t7pDUNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_4ypNIO-YEdyEMtC_IfEALw",
	"project_plan",
	"Project Plan",
	"This artifact gathers all of the information required to manage the project on a strategic level. Its main part consists of a coarse-grained plan, identifying project iterations and their goals."
);

INSERT INTO task_artifacts VALUES (
	"_t7pDUNOJEdyqlogshP8l4g",
	"_4ypNIO-YEdyEMtC_IfEALw"
);
INSERT INTO activities VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);

INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_uxDPEdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"plan_iteration",
	"Plan Iteration",
	"Plan the scope and responsibilities for a single iteration.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_7bz7AIyAEdyhZb-MhCJrlA",
	"Prioritize Work Items List",
	"Prioritize Work Items List",
	"Prioritize the work items list before you plan the next iteration. Consider what has changed since the last iteration plan
	(such as new change requests, shifting priorities of your stakeholders, or new risks that have been encountered).",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_HzNVgIyBEdyhZb-MhCJrlA",
	"Identify and review risks",
	"Identify and review risks",
	"<p>
	    Throughout the project, new assumptions and concerns may arise. Help the team identify and prioritize new risks as part
	    of iteration planning, updating the risk list. Add risk responses to the work items list, influencing the work that is
	    being planned for that iteration.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_7Hqr4MMsEdmdo9HxCRR_Gw",
	"Define evaluation criteria",
	"Define evaluation criteria",
	"<p>
	    Each iteration should include testing as a part of the evaluation, as well as the test objectives and test cases that
	    need to be detailed. Other evaluation criteria may include successful demonstrations to key stakeholders, or favorable
	    usage by a small group of target users. Document evaluation criteria in the iteration plan.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_-tp18FHjEd2IaYFd32DrjQ",
	"Refine project definition and scope",
	"Refine project definition and scope",
	"<p>
	    Depending on the results of the previous iteration assessment, update the project definition work products as needed.
	    Necessary changes can encompass the need to acquire new resources, to absorb an unplanned effort increase, or to
	    implement a specific change request. If a change affects defined project milestones, consult with the stakeholders
	    before committing to it.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"manage_iteration",
	"Manage Iteration",
	"Assess project status and identify any blocking issues and opportunities. Identify and manage exceptions, problems, and risks. Communicate project status.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_xiFJwCbZEdqh1LYUOGRh2A",
	"Identify and manage risks",
	"Identify and manage risks",
	"<p>
	    Identify risks as soon as the project starts, and continue identifying and managing risks throughout the project.
	    Revisit the <a class=\"elementLink\" href=\"./../../core.mgmt.common.extend_supp/workproducts/risk_list_C4B6F290.html\"
	    guid=\"_Ckay8Cc_EduIsqH1Q6ZuqA\">Risk List</a> weekly, or at a minimum once per iteration. Involve the entire team in
	    identifying and mitigating risks.
	</p>",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Br6VECuxEdqTIKp3l5PtzQ",
	"Manage objectives",
	"Manage objectives",
	"When a team is falling significantly behind, or critical problems occur that prevent the team from meeting the iteration
	objectives, it may be necessary to descope work to ensure that the team delivers a useful product increment by the end of
	the iteration, while maximizing stakeholder value. Work with the team and stakeholders to revise the Iteration Plan and, as
	necessary, reduce the emphasis on less critical tasks by postponing them to a subsequent iteration. In rare cases, if the
	iteration objectives still seem impossible to meet, the team might consider terminating the iteration or reformulating the
	iteration to a new objective.",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"assess_results",
	"Assess Results",
	"Determine success or failure of the iteration. Apply the lessons learned to modify the project or improve the process.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_uxDPEdOOEdyqlogshP8l4g",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_1YHH8DLqEdueZPye-FaNgA",
	"Close-out project",
	"Close-out project",
	"<p>
	    Perform this step when the iteration review coincides with the end of the project. Involve the team and stakeholders in
	    a final assessment for project acceptance which, if successful, marks the point when the customer accepts ownership of
	    the software product. Complete the close-out of the project by disposing of the remaining assets and reassigning the
	    remaining staff.
	</p>",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"identify_and_refine_requirements",
	"Identify and Refine Requirements",
	"Detail a set of requirements (one or more use cases, scenarios or system-wide requirements)."
);

INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_vyeP0dOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"identify_and_outline_requirements",
	"Identify and Outline Requirements",
	"This task describes how to identify and outline the requirements for the system so that the scope of work can be determined.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_GAr3IOz3Edq2wJOsmRwmhg",
	"Identify and capture domain terms",
	"Identify and capture domain terms",
	"If there are ambiguous or domain-specific terms that need to be clearly defined, make sure you work closely with
	stakeholders&nbsp;to capture these&nbsp;terms in the glossary and that you use these terms consistently.",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_0WhHsN-eEdqiM_wFaqLjNg",
	"Achieve concurrence",
	"Achieve concurrence",
	"Conduct a review&nbsp;of the&nbsp;requirements with relevant stakeholders and the development team to ensure consistency
	with the agreed vision, assess quality, and identify any required changes.",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"detail_use_case_scenarios",
	"Detail Use-Case Scenarios",
	"This task describes how to detail a use-case scenarios for the system.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_iEvYMJLaEdyk6dG0ehkW5Q",
	"Detail glossary terms",
	"Detail glossary terms",
	"<p>
	    Review the flow of the use case or scenario. If information is exchanged, be specific about what is passed back and
	    forth. Collaborate with stakeholders to ensure that you define newly discovered domain terms, or ambiguous terms
	    properly in the&nbsp;glossary. If your understanding of the domain has improved, refine existing glossary terms.
	</p>",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_kojt4JLcEdyk6dG0ehkW5Q",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed use case and scenarios with relevant stakeholders and the development team to ensure
	    consistency with the agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"detail_system_wide_requirements",
	"Detail System-Wide Requirements",
	"This task details one or more requirement that does not apply to a specific use case.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_4z8Z1EbEEdyx8quJU3Grxg",
	"Detail system-wide requirements",
	"Detail system-wide requirements",
	"<p>
	    Some&nbsp;system-wide requirements&nbsp;might need to be clarified or described in more detail.&nbsp;New
	    requirements&nbsp;may&nbsp;be discovered&nbsp;while the use cases and scenarios are detailed, and new requirements may
	    have been submitted as change requests.&nbsp;Collaborate with stakeholders to capture, refine and validate those
	    requirements that will have an impact on near term, planned&nbsp;work or are deemed architecturally significant.&nbsp;
	</p><br />",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_4z8Z0UbEEdyx8quJU3Grxg",
	"Detail glossary terms",
	"Detail glossary terms",
	"Review the system-wide requirements and collaborate with stakeholders to ensure that you define newly discovered domain
	terms, or ambiguous terms properly in the glossary. If your understanding of the domain has improved, refine existing
	glossary terms.",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_4z8Z0kbEEdyx8quJU3Grxg",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed system-wide requirements with relevant stakeholders and the development team to ensure
	    consistency with the&nbsp;agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"create_test_cases",
	"Create Test Cases",
	"Develop the test cases and test data for the requirements to be tested.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_vyeP0dOOEdyqlogshP8l4g",
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_IJFSsKuSEdmhFZtkg1nakg",
	"Review the requirements to be tested",
	"Review the requirements to be tested",
	"<p>
	    Work with analysts and developers&nbsp;to identify which scenarios and requirements&nbsp;need new or additional test
	    cases. Review the Plans&nbsp;to ensure you understand the scope of development for the current iteration.<br />
	</p>",
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_w-Bc8dOOEdyqlogshP8l4g",
	"agree_technical_approach",
	"Agree on Technical Approach",
	"Reach agreement on a viable technical approach to developing the solution."
);

INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_w-Bc8dOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"envision_the_arch",
	"Envision the Architecture",
	"This task is where the \"vision\" for the architecture is developed through analysis of the architecturally significant requirements and identification of architectural constraints, decisions and objectives.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_w-Bc8dOOEdyqlogshP8l4g",
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO sections VALUES (
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
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_f0y2kM25Edym_ZFqrJcXUg",
	"Identify architecturally significant requirements",
	"Identify architecturally significant requirements",
	"<p>
	    Identify which of the current requirements are architecturally significant.&nbsp;Explore and refine those that must be
	    implemented in order to realize the architectural goals for the current iteration. See <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/concepts/arch_significant_requirements_1EE5D757.html\"
	    guid=\"_HrZGIA4MEduibvKwrGxWxA\">Concept: Architecturally Significant Requirements</a>&nbsp;for more information.
	</p>",
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_B899cMP2EdmWKcx6ixEiwg",
	"Identify reuse opportunities",
	"Identify reuse opportunities",
	"<p>
	    Survey, assess, and select available assets.&nbsp; Identify assets from other areas that may be reused in the current
	    architecture. For more information, see <a class=\"elementLinkWithType\"
	    href=\"./../../core.tech.common.extend_supp/guidances/guidelines/software_reuse_B6B04C26.html\"
	    guid=\"_vO2uoO0OEduUpsu85bVhiQ\">Guideline: Software Reuse</a>.
	</p>",
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_tmvWwE5cEducxZ_XZXh-vw",
	"Define approach for deploying the system",
	"Define approach for deploying the system",
	"<p>
	    Outline how the software will deploy over the nodes on the network. Work with stakeholders such as network support and
	    deployment teams to ensure that the proposed approach is a good fit for the wider technical environment.
	</p>",
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Q2PRIFHSEd2zrOgIte8oWg",
	"Verify architectural consistency",
	"Verify architectural consistency",
	"Work with the team&nbsp;to verify that the architecture is consistent with the requirements and that the descriptions of
	the architecture are complete, meaningful, and clear.",
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Xia1QFHSEd2zrOgIte8oWg",
	"Capture and communicate architectural decisions",
	"Capture and communicate architectural decisions",
	"Capture important decisions about the architecture in the <a class=\"elementLink\"
	href=\"./../../practice.tech.evolutionary_arch.base/workproducts/architecture_notebook_9BB92433.html\"
	guid=\"_0XAf0MlgEdmt3adZL5Dmdw\">Architecture Notebook</a>&nbsp;for future reference. Make sure that&nbsp;the team
	understands the architecture&nbsp;and can deliver it.",
	"_sjccUN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_BWf5gtOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_sjccUN_1EdyOsumnGvWsEg",
	"_BWf5gtOKEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_h0Gs8dONEdyqlogshP8l4g",
	"inception_phase_iteration",
	"Inception Phase Iteration",
	"This iteration template defines the activities (and associated roles and work products) performed in a typical iteration in the Inception phase."
);

INSERT INTO iteration_activities VALUES (
	"_kYVSUdOPEdyqlogshP8l4g",
	"_h0Gs8dONEdyqlogshP8l4g"
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

INSERT INTO activities VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_XayTQdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"plan_iteration",
	"Plan Iteration",
	"Plan the scope and responsibilities for a single iteration.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_7bz7AIyAEdyhZb-MhCJrlA",
	"Prioritize Work Items List",
	"Prioritize Work Items List",
	"Prioritize the work items list before you plan the next iteration. Consider what has changed since the last iteration plan
	(such as new change requests, shifting priorities of your stakeholders, or new risks that have been encountered).",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_HzNVgIyBEdyhZb-MhCJrlA",
	"Identify and review risks",
	"Identify and review risks",
	"<p>
	    Throughout the project, new assumptions and concerns may arise. Help the team identify and prioritize new risks as part
	    of iteration planning, updating the risk list. Add risk responses to the work items list, influencing the work that is
	    being planned for that iteration.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_7Hqr4MMsEdmdo9HxCRR_Gw",
	"Define evaluation criteria",
	"Define evaluation criteria",
	"<p>
	    Each iteration should include testing as a part of the evaluation, as well as the test objectives and test cases that
	    need to be detailed. Other evaluation criteria may include successful demonstrations to key stakeholders, or favorable
	    usage by a small group of target users. Document evaluation criteria in the iteration plan.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_-tp18FHjEd2IaYFd32DrjQ",
	"Refine project definition and scope",
	"Refine project definition and scope",
	"<p>
	    Depending on the results of the previous iteration assessment, update the project definition work products as needed.
	    Necessary changes can encompass the need to acquire new resources, to absorb an unplanned effort increase, or to
	    implement a specific change request. If a change affects defined project milestones, consult with the stakeholders
	    before committing to it.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"manage_iteration",
	"Manage Iteration",
	"Assess project status and identify any blocking issues and opportunities. Identify and manage exceptions, problems, and risks. Communicate project status.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_xiFJwCbZEdqh1LYUOGRh2A",
	"Identify and manage risks",
	"Identify and manage risks",
	"<p>
	    Identify risks as soon as the project starts, and continue identifying and managing risks throughout the project.
	    Revisit the <a class=\"elementLink\" href=\"./../../core.mgmt.common.extend_supp/workproducts/risk_list_C4B6F290.html\"
	    guid=\"_Ckay8Cc_EduIsqH1Q6ZuqA\">Risk List</a> weekly, or at a minimum once per iteration. Involve the entire team in
	    identifying and mitigating risks.
	</p>",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Br6VECuxEdqTIKp3l5PtzQ",
	"Manage objectives",
	"Manage objectives",
	"When a team is falling significantly behind, or critical problems occur that prevent the team from meeting the iteration
	objectives, it may be necessary to descope work to ensure that the team delivers a useful product increment by the end of
	the iteration, while maximizing stakeholder value. Work with the team and stakeholders to revise the Iteration Plan and, as
	necessary, reduce the emphasis on less critical tasks by postponing them to a subsequent iteration. In rare cases, if the
	iteration objectives still seem impossible to meet, the team might consider terminating the iteration or reformulating the
	iteration to a new objective.",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"assess_results",
	"Assess Results",
	"Determine success or failure of the iteration. Apply the lessons learned to modify the project or improve the process.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_XayTQdOOEdyqlogshP8l4g",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_1YHH8DLqEdueZPye-FaNgA",
	"Close-out project",
	"Close-out project",
	"<p>
	    Perform this step when the iteration review coincides with the end of the project. Involve the team and stakeholders in
	    a final assessment for project acceptance which, if successful, marks the point when the customer accepts ownership of
	    the software product. Complete the close-out of the project by disposing of the remaining assets and reassigning the
	    remaining staff.
	</p>",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"identify_and_refine_requirements",
	"Identify and Refine Requirements",
	"Detail a set of requirements (one or more use cases, scenarios or system-wide requirements)."
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_YwLY4dOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"identify_and_outline_requirements",
	"Identify and Outline Requirements",
	"This task describes how to identify and outline the requirements for the system so that the scope of work can be determined.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_GAr3IOz3Edq2wJOsmRwmhg",
	"Identify and capture domain terms",
	"Identify and capture domain terms",
	"If there are ambiguous or domain-specific terms that need to be clearly defined, make sure you work closely with
	stakeholders&nbsp;to capture these&nbsp;terms in the glossary and that you use these terms consistently.",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_0WhHsN-eEdqiM_wFaqLjNg",
	"Achieve concurrence",
	"Achieve concurrence",
	"Conduct a review&nbsp;of the&nbsp;requirements with relevant stakeholders and the development team to ensure consistency
	with the agreed vision, assess quality, and identify any required changes.",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"detail_use_case_scenarios",
	"Detail Use-Case Scenarios",
	"This task describes how to detail a use-case scenarios for the system.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_iEvYMJLaEdyk6dG0ehkW5Q",
	"Detail glossary terms",
	"Detail glossary terms",
	"<p>
	    Review the flow of the use case or scenario. If information is exchanged, be specific about what is passed back and
	    forth. Collaborate with stakeholders to ensure that you define newly discovered domain terms, or ambiguous terms
	    properly in the&nbsp;glossary. If your understanding of the domain has improved, refine existing glossary terms.
	</p>",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_kojt4JLcEdyk6dG0ehkW5Q",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed use case and scenarios with relevant stakeholders and the development team to ensure
	    consistency with the agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"detail_system_wide_requirements",
	"Detail System-Wide Requirements",
	"This task details one or more requirement that does not apply to a specific use case.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_4z8Z1EbEEdyx8quJU3Grxg",
	"Detail system-wide requirements",
	"Detail system-wide requirements",
	"<p>
	    Some&nbsp;system-wide requirements&nbsp;might need to be clarified or described in more detail.&nbsp;New
	    requirements&nbsp;may&nbsp;be discovered&nbsp;while the use cases and scenarios are detailed, and new requirements may
	    have been submitted as change requests.&nbsp;Collaborate with stakeholders to capture, refine and validate those
	    requirements that will have an impact on near term, planned&nbsp;work or are deemed architecturally significant.&nbsp;
	</p><br />",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_4z8Z0UbEEdyx8quJU3Grxg",
	"Detail glossary terms",
	"Detail glossary terms",
	"Review the system-wide requirements and collaborate with stakeholders to ensure that you define newly discovered domain
	terms, or ambiguous terms properly in the glossary. If your understanding of the domain has improved, refine existing
	glossary terms.",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_4z8Z0kbEEdyx8quJU3Grxg",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed system-wide requirements with relevant stakeholders and the development team to ensure
	    consistency with the&nbsp;agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"create_test_cases",
	"Create Test Cases",
	"Develop the test cases and test data for the requirements to be tested.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_YwLY4dOOEdyqlogshP8l4g",
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_IJFSsKuSEdmhFZtkg1nakg",
	"Review the requirements to be tested",
	"Review the requirements to be tested",
	"<p>
	    Work with analysts and developers&nbsp;to identify which scenarios and requirements&nbsp;need new or additional test
	    cases. Review the Plans&nbsp;to ensure you understand the scope of development for the current iteration.<br />
	</p>",
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_aSrtcdOOEdyqlogshP8l4g",
	"develop_architecture",
	"Develop the Architecture",
	"Develop the architecturally significant requirements prioritized for this iteration."
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_aSrtcdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"refine_the_arch",
	"Refine the Architecture",
	"Refine the architecture to an appropriate level of detail to support development.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_aSrtcdOOEdyqlogshP8l4g",
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO sections VALUES (
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
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_82iI0FHOEd2zrOgIte8oWg",
	"Define development architecture and test architecture",
	"Define development architecture and test architecture",
	"Ensure that the development and test architectures are defined. Note any architecturally significant differences between
	these environments and work with the team to devise strategies to mitigate any risks these may introduce.",
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_xIIVkMUbEdu5GrwIlTJV7g",
	"Map the software to the hardware",
	"Map the software to the hardware",
	"<p align=\"left\">
	    Map the architecturally significant design elements to the target deployment environment. Work with hardware and
	    network specialists to ensure that the hardware is sufficient to meet the needs of the system; and that any new
	    hardware is available in time.
	</p>",
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_pyyVoFHPEd2zrOgIte8oWg",
	"Communicate decisions",
	"Communicate decisions",
	"Ensure that those who need to act upon the architectural work understand it and are able to work with it. Make sure that
	the description of the architecture clearly conveys not only the solution but also the motivation and objectives related to
	the decisions that have been made in shaping the architecture. This will make it easier for others to understand the
	architecture and to adapt it over time.",
	"_6RuKMN_1EdyOsumnGvWsEg"
);

INSERT INTO artifacts VALUES (
	"_EjG_cNOKEdyqlogshP8l4g",
	"architecture_notebook",
	"Architecture Notebook",
	"This artifact describes the rationale, assumptions, explanation, and implications of the decisions that were made in forming the architecture."
);

INSERT INTO task_artifacts VALUES (
	"_6RuKMN_1EdyOsumnGvWsEg",
	"_EjG_cNOKEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"develop_solution",
	"Develop Solution Increment",
	"Design, implement, test, and integrate the solution for a requirement within a given context."
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_eyv_UdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"design_solution",
	"Design the Solution",
	"Identify the elements and devise the interactions, behavior, relations, and data necessary to realize some functionality.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"implement_developer_tests",
	"Implement Developer Tests",
	"Implement one or more tests that enable the validation of the individual implementation elements through execution.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Es64wJR-EdyVKbgqUOtqQA",
	"Write the test setup",
	"Write the test setup",
	"To successfully run a test the system must be in a known state so that the correct behavior can be defined. Implement the
	setup logic that must be performed as part of the developer test.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_GZaPwJR-EdyVKbgqUOtqQA",
	"Write the test logic",
	"Write the test logic",
	"Write the steps that perform the actual test(s).",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_IMxq0JR-EdyVKbgqUOtqQA",
	"Define the test response",
	"Define the test response",
	"Define the information the test(s) must produce to successfully indicate success or failure. Consider if a response of True
	or False is sufficient, or if a detailed message should be logged as well.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_JAiqEJR-EdyVKbgqUOtqQA",
	"Write clean-up code",
	"Write clean-up code",
	"Identify, and then implement, the steps to be followed in order to restore the environment to the original state for each
	test. The goal is to ensure that there are no side effects from running the tests.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"implement_solution",
	"Implement Solution",
	"Implement source code to provide new functionality or fix defects.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_SW1pAJfJEdyZkIR-s-Y8wQ",
	"Identify opportunities for reuse",
	"Identify opportunities for reuse",
	"<p>
	    Identify existing code or other implementation elements that can be reused in the portion of the implementation that
	    you are creating or changing. A comprehensive understanding of the overall design is helpful, because it is best to
	    leverage reuse opportunities when you have a thorough understanding of the proposed solution.
	</p>",
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO tasks VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"run_developer_tests",
	"Run Developer Tests",
	"Run tests against the individual implementation elements to verify that their internal structures work as specified.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_itj1QJfIEdyZkIR-s-Y8wQ",
	"Respond to test results",
	"Respond to test results",
	"<p>
	    Determine the appropriate corrective action to recover from a \"failed\" developer test run. If the implementation
	    element under test is faulty, fix the problem if possible and rerun the tests. If the problem is serious and cannot be
	    immediately addressed, report the defect. If the developer test is faulty fix the test and rerun the tests. If there
	    was a problem with the environment, resolve it and then rerun&nbsp;the tests.
	</p>",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_C0_fYFQAEd2ECfw27om6fw",
	"Promote changes for integration test",
	"Promote changes for integration test",
	"<p>
	    When the developer tests pass and no further work is need to complete the change set, promote the changes for
	    integration test. If the passing of these tests represent completion of a requirement update the status of the work
	    item.
	</p>",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO tasks VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"integrate_and_create_build",
	"Integrate and Create Build",
	"This task describes how to integrate all changes made by developers into the code base and perform the minimal testing to validate the build.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_eyv_UdOOEdyqlogshP8l4g",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
	"_kkZBhJOKEdyaRbFYa4AN4A",
	"Test integrated elements",
	"Test integrated elements",
	"<p>
	    Re-run the developer tests against the integrated elements to verify that they behave the same as they did in
	    isolation. Ensure that the scope of these&nbsp;tests is as broad as possible, which ensures that the latest change sets
	    did not cause failing developer tests in other areas of the system.
	</p>",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
	"_kkZBg5OKEdyaRbFYa4AN4A",
	"Run "Smoke Tests"",
	"Run "Smoke Tests"",
	"<p>
	    Several builds will be created in each iteration. For each build, this step is performed only when change sets have
	    been delivered to satisfy the requirements of that build.
	</p>
	<p>
	    Execute a sub-set of the system tests to ensure that the build is suitable prior to committing resources to the full
	    scope of system testing.&nbsp;While the level of testing will vary, focus on gaining confidence that the increment is
	    of sufficient quality to establish a baseline for system testing.
	</p>",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO activities VALUES (
	"_f4VuYdOOEdyqlogshP8l4g",
	"test_solution",
	"Test Solution",
	"From a system perspective, test and evaluate the developed requirements."
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_f4VuYdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"implement_tests",
	"Implement Tests",
	"Implement Test Scripts to validate a Build of the solution. Organize Test Scripts into suites, and collaborate to ensure appropriate depth and breadth of test feedback.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_f4VuYdOOEdyqlogshP8l4g",
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"run_tests",
	"Run Tests",
	"Run the appropriate tests scripts, analyze results, articulate issues, and communicate test results to the team.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_f4VuYdOOEdyqlogshP8l4g",
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_xVhnwKRLEdyLP-jEVj8Kyw",
	"Review work items completed in the build",
	"Review work items completed in the build",
	"Review work items that were integrated into the build since the last test cycle. Focus on identifying any previously
	unimplemented or failing requirements are now expected to meet the conditions of satisfaction.",
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_g8cPsdOOEdyqlogshP8l4g",
	"ongoing_tasks",
	"Ongoing Tasks",
	"Perform ongoing tasks that are not necessarily part of the project schedule."
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_g8cPsdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"request_change",
	"Request Change",
	"Capture and record change requests.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_g8cPsdOOEdyqlogshP8l4g",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO sections VALUES (
	"_qEkewKuoEdmEGLSmmpF1Sg",
	"Gather change request information",
	"Gather change request information",
	"<p>
	    Gather the information required to describe the change request. This should include a description of the requested
	    change, the reason for the change (defect or enhancement), the&nbsp;artifact&nbsp;affected (including&nbsp;the
	    version), and&nbsp;the priority of the change. If possible,&nbsp;provide an estimate of the effort required to
	    implement the change.
	</p>",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO artifacts VALUES (
	"_HGqkMdnTEdyNj6EOmqy5Rg",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"_HGqkMdnTEdyNj6EOmqy5Rg"
);
INSERT INTO sections VALUES (
	"_r2aP0KuoEdmEGLSmmpF1Sg",
	"Update the Work Item List",
	"Update the Work Item List",
	"Update the <a class=\"elementLinkWithType\"
	href=\"./../../core.mgmt.common.extend_supp/workproducts/work_items_list_39D03CC8.html\"
	guid=\"_rGNWsCbSEdqh1LYUOGRh2A\">Artifact: Work Items List</a>&nbsp;to&nbsp;document the information that you gathered in the
	previous step.",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO artifacts VALUES (
	"_HGqkMdnTEdyNj6EOmqy5Rg",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"_HGqkMdnTEdyNj6EOmqy5Rg"
);
INSERT INTO activities VALUES (
	"_aUsVEdONEdyqlogshP8l4g",
	"elaboration_phase_iteration",
	"Elaboration Phase Iteration",
	"This iteration template defines the activities (and associated roles and work  products) performed in a typical iteration in the Elaboration phase."
);

INSERT INTO iteration_activities VALUES (
	"_51ewYdOPEdyqlogshP8l4g",
	"_aUsVEdONEdyqlogshP8l4g"
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

INSERT INTO activities VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_3s7aYdONEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"plan_iteration",
	"Plan Iteration",
	"Plan the scope and responsibilities for a single iteration.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_7bz7AIyAEdyhZb-MhCJrlA",
	"Prioritize Work Items List",
	"Prioritize Work Items List",
	"Prioritize the work items list before you plan the next iteration. Consider what has changed since the last iteration plan
	(such as new change requests, shifting priorities of your stakeholders, or new risks that have been encountered).",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_HzNVgIyBEdyhZb-MhCJrlA",
	"Identify and review risks",
	"Identify and review risks",
	"<p>
	    Throughout the project, new assumptions and concerns may arise. Help the team identify and prioritize new risks as part
	    of iteration planning, updating the risk list. Add risk responses to the work items list, influencing the work that is
	    being planned for that iteration.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_7Hqr4MMsEdmdo9HxCRR_Gw",
	"Define evaluation criteria",
	"Define evaluation criteria",
	"<p>
	    Each iteration should include testing as a part of the evaluation, as well as the test objectives and test cases that
	    need to be detailed. Other evaluation criteria may include successful demonstrations to key stakeholders, or favorable
	    usage by a small group of target users. Document evaluation criteria in the iteration plan.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_-tp18FHjEd2IaYFd32DrjQ",
	"Refine project definition and scope",
	"Refine project definition and scope",
	"<p>
	    Depending on the results of the previous iteration assessment, update the project definition work products as needed.
	    Necessary changes can encompass the need to acquire new resources, to absorb an unplanned effort increase, or to
	    implement a specific change request. If a change affects defined project milestones, consult with the stakeholders
	    before committing to it.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"manage_iteration",
	"Manage Iteration",
	"Assess project status and identify any blocking issues and opportunities. Identify and manage exceptions, problems, and risks. Communicate project status.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_xiFJwCbZEdqh1LYUOGRh2A",
	"Identify and manage risks",
	"Identify and manage risks",
	"<p>
	    Identify risks as soon as the project starts, and continue identifying and managing risks throughout the project.
	    Revisit the <a class=\"elementLink\" href=\"./../../core.mgmt.common.extend_supp/workproducts/risk_list_C4B6F290.html\"
	    guid=\"_Ckay8Cc_EduIsqH1Q6ZuqA\">Risk List</a> weekly, or at a minimum once per iteration. Involve the entire team in
	    identifying and mitigating risks.
	</p>",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Br6VECuxEdqTIKp3l5PtzQ",
	"Manage objectives",
	"Manage objectives",
	"When a team is falling significantly behind, or critical problems occur that prevent the team from meeting the iteration
	objectives, it may be necessary to descope work to ensure that the team delivers a useful product increment by the end of
	the iteration, while maximizing stakeholder value. Work with the team and stakeholders to revise the Iteration Plan and, as
	necessary, reduce the emphasis on less critical tasks by postponing them to a subsequent iteration. In rare cases, if the
	iteration objectives still seem impossible to meet, the team might consider terminating the iteration or reformulating the
	iteration to a new objective.",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"assess_results",
	"Assess Results",
	"Determine success or failure of the iteration. Apply the lessons learned to modify the project or improve the process.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_3s7aYdONEdyqlogshP8l4g",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_1YHH8DLqEdueZPye-FaNgA",
	"Close-out project",
	"Close-out project",
	"<p>
	    Perform this step when the iteration review coincides with the end of the project. Involve the team and stakeholders in
	    a final assessment for project acceptance which, if successful, marks the point when the customer accepts ownership of
	    the software product. Complete the close-out of the project by disposing of the remaining assets and reassigning the
	    remaining staff.
	</p>",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"identify_and_refine_requirements",
	"Identify and Refine Requirements",
	"Detail a set of requirements (one or more use cases, scenarios or system-wide requirements)."
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_yw_dcZlVEeGlkdGl1HQlDA"
);

INSERT INTO tasks VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"identify_and_outline_requirements",
	"Identify and Outline Requirements",
	"This task describes how to identify and outline the requirements for the system so that the scope of work can be determined.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_GAr3IOz3Edq2wJOsmRwmhg",
	"Identify and capture domain terms",
	"Identify and capture domain terms",
	"If there are ambiguous or domain-specific terms that need to be clearly defined, make sure you work closely with
	stakeholders&nbsp;to capture these&nbsp;terms in the glossary and that you use these terms consistently.",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_0WhHsN-eEdqiM_wFaqLjNg",
	"Achieve concurrence",
	"Achieve concurrence",
	"Conduct a review&nbsp;of the&nbsp;requirements with relevant stakeholders and the development team to ensure consistency
	with the agreed vision, assess quality, and identify any required changes.",
	"_EOm5oNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_EOm5oNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"detail_use_case_scenarios",
	"Detail Use-Case Scenarios",
	"This task describes how to detail a use-case scenarios for the system.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_iEvYMJLaEdyk6dG0ehkW5Q",
	"Detail glossary terms",
	"Detail glossary terms",
	"<p>
	    Review the flow of the use case or scenario. If information is exchanged, be specific about what is passed back and
	    forth. Collaborate with stakeholders to ensure that you define newly discovered domain terms, or ambiguous terms
	    properly in the&nbsp;glossary. If your understanding of the domain has improved, refine existing glossary terms.
	</p>",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_kojt4JLcEdyk6dG0ehkW5Q",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed use case and scenarios with relevant stakeholders and the development team to ensure
	    consistency with the agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_FX7SINOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqp9OLEdyqlogshP8l4g",
	"use_case",
	"Use Case",
	"This artifact captures the system behavior to yield an observable result of value to those who interact with the system."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqp9OLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_FX7SINOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"detail_system_wide_requirements",
	"Detail System-Wide Requirements",
	"This task details one or more requirement that does not apply to a specific use case.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_4z8Z1EbEEdyx8quJU3Grxg",
	"Detail system-wide requirements",
	"Detail system-wide requirements",
	"<p>
	    Some&nbsp;system-wide requirements&nbsp;might need to be clarified or described in more detail.&nbsp;New
	    requirements&nbsp;may&nbsp;be discovered&nbsp;while the use cases and scenarios are detailed, and new requirements may
	    have been submitted as change requests.&nbsp;Collaborate with stakeholders to capture, refine and validate those
	    requirements that will have an impact on near term, planned&nbsp;work or are deemed architecturally significant.&nbsp;
	</p><br />",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_4z8Z0UbEEdyx8quJU3Grxg",
	"Detail glossary terms",
	"Detail glossary terms",
	"Review the system-wide requirements and collaborate with stakeholders to ensure that you define newly discovered domain
	terms, or ambiguous terms properly in the glossary. If your understanding of the domain has improved, refine existing
	glossary terms.",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_4z8Z0kbEEdyx8quJU3Grxg",
	"Achieve concurrence",
	"Achieve concurrence",
	"<p>
	    Review the&nbsp;detailed system-wide requirements with relevant stakeholders and the development team to ensure
	    consistency with the&nbsp;agreed vision.&nbsp;Assess quality and identify any required changes.
	</p>",
	"_F68foNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_EOwqptOLEdyqlogshP8l4g",
	"system_wide_requirements",
	"System-Wide Requirements",
	"This artifact captures the quality attributes and constraints that have system-wide scope. It also captures system-wide functional requirements."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqptOLEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_EOwqqNOLEdyqlogshP8l4g",
	"glossary",
	"Glossary",
	"This artifact defines important terms used by the project. The collection of terms clarifies the vocabulary used on the project."
);

INSERT INTO task_artifacts VALUES (
	"_F68foNOLEdyqlogshP8l4g",
	"_EOwqqNOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"create_test_cases",
	"Create Test Cases",
	"Develop the test cases and test data for the requirements to be tested.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_yw_dcZlVEeGlkdGl1HQlDA",
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_IJFSsKuSEdmhFZtkg1nakg",
	"Review the requirements to be tested",
	"Review the requirements to be tested",
	"<p>
	    Work with analysts and developers&nbsp;to identify which scenarios and requirements&nbsp;need new or additional test
	    cases. Review the Plans&nbsp;to ensure you understand the scope of development for the current iteration.<br />
	</p>",
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_HDOWUNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_HDOWUtOLEdyqlogshP8l4g",
	"test_case",
	"Test Case",
	"This artifact is the specification of a set of test inputs, execution conditions, and expected results that you identify to evaluate a particular aspect of a scenario."
);

INSERT INTO task_artifacts VALUES (
	"_HDOWUNOLEdyqlogshP8l4g",
	"_HDOWUtOLEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"develop_solution",
	"Develop Solution Increment",
	"Design, implement, test, and integrate the solution for a requirement within a given context."
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_CqFrgdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"design_solution",
	"Design the Solution",
	"Identify the elements and devise the interactions, behavior, relations, and data necessary to realize some functionality.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"implement_developer_tests",
	"Implement Developer Tests",
	"Implement one or more tests that enable the validation of the individual implementation elements through execution.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Es64wJR-EdyVKbgqUOtqQA",
	"Write the test setup",
	"Write the test setup",
	"To successfully run a test the system must be in a known state so that the correct behavior can be defined. Implement the
	setup logic that must be performed as part of the developer test.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_GZaPwJR-EdyVKbgqUOtqQA",
	"Write the test logic",
	"Write the test logic",
	"Write the steps that perform the actual test(s).",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_IMxq0JR-EdyVKbgqUOtqQA",
	"Define the test response",
	"Define the test response",
	"Define the information the test(s) must produce to successfully indicate success or failure. Consider if a response of True
	or False is sufficient, or if a detailed message should be logged as well.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_JAiqEJR-EdyVKbgqUOtqQA",
	"Write clean-up code",
	"Write clean-up code",
	"Identify, and then implement, the steps to be followed in order to restore the environment to the original state for each
	test. The goal is to ensure that there are no side effects from running the tests.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"implement_solution",
	"Implement Solution",
	"Implement source code to provide new functionality or fix defects.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_SW1pAJfJEdyZkIR-s-Y8wQ",
	"Identify opportunities for reuse",
	"Identify opportunities for reuse",
	"<p>
	    Identify existing code or other implementation elements that can be reused in the portion of the implementation that
	    you are creating or changing. A comprehensive understanding of the overall design is helpful, because it is best to
	    leverage reuse opportunities when you have a thorough understanding of the proposed solution.
	</p>",
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO tasks VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"run_developer_tests",
	"Run Developer Tests",
	"Run tests against the individual implementation elements to verify that their internal structures work as specified.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_itj1QJfIEdyZkIR-s-Y8wQ",
	"Respond to test results",
	"Respond to test results",
	"<p>
	    Determine the appropriate corrective action to recover from a \"failed\" developer test run. If the implementation
	    element under test is faulty, fix the problem if possible and rerun the tests. If the problem is serious and cannot be
	    immediately addressed, report the defect. If the developer test is faulty fix the test and rerun the tests. If there
	    was a problem with the environment, resolve it and then rerun&nbsp;the tests.
	</p>",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_C0_fYFQAEd2ECfw27om6fw",
	"Promote changes for integration test",
	"Promote changes for integration test",
	"<p>
	    When the developer tests pass and no further work is need to complete the change set, promote the changes for
	    integration test. If the passing of these tests represent completion of a requirement update the status of the work
	    item.
	</p>",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO tasks VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"integrate_and_create_build",
	"Integrate and Create Build",
	"This task describes how to integrate all changes made by developers into the code base and perform the minimal testing to validate the build.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_CqFrgdOOEdyqlogshP8l4g",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
	"_kkZBhJOKEdyaRbFYa4AN4A",
	"Test integrated elements",
	"Test integrated elements",
	"<p>
	    Re-run the developer tests against the integrated elements to verify that they behave the same as they did in
	    isolation. Ensure that the scope of these&nbsp;tests is as broad as possible, which ensures that the latest change sets
	    did not cause failing developer tests in other areas of the system.
	</p>",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
	"_kkZBg5OKEdyaRbFYa4AN4A",
	"Run "Smoke Tests"",
	"Run "Smoke Tests"",
	"<p>
	    Several builds will be created in each iteration. For each build, this step is performed only when change sets have
	    been delivered to satisfy the requirements of that build.
	</p>
	<p>
	    Execute a sub-set of the system tests to ensure that the build is suitable prior to committing resources to the full
	    scope of system testing.&nbsp;While the level of testing will vary, focus on gaining confidence that the increment is
	    of sufficient quality to establish a baseline for system testing.
	</p>",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO activities VALUES (
	"_HhjJsdOOEdyqlogshP8l4g",
	"test_solution",
	"Test Solution",
	"From a system perspective, test and evaluate the developed requirements."
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_HhjJsdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"implement_tests",
	"Implement Tests",
	"Implement Test Scripts to validate a Build of the solution. Organize Test Scripts into suites, and collaborate to ensure appropriate depth and breadth of test feedback.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_HhjJsdOOEdyqlogshP8l4g",
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"run_tests",
	"Run Tests",
	"Run the appropriate tests scripts, analyze results, articulate issues, and communicate test results to the team.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_HhjJsdOOEdyqlogshP8l4g",
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_xVhnwKRLEdyLP-jEVj8Kyw",
	"Review work items completed in the build",
	"Review work items completed in the build",
	"Review work items that were integrated into the build since the last test cycle. Focus on identifying any previously
	unimplemented or failing requirements are now expected to meet the conditions of satisfaction.",
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_GQejYdOOEdyqlogshP8l4g",
	"ongoing_tasks",
	"Ongoing Tasks",
	"Perform ongoing tasks that are not necessarily part of the project schedule."
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_GQejYdOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"request_change",
	"Request Change",
	"Capture and record change requests.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_GQejYdOOEdyqlogshP8l4g",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO sections VALUES (
	"_qEkewKuoEdmEGLSmmpF1Sg",
	"Gather change request information",
	"Gather change request information",
	"<p>
	    Gather the information required to describe the change request. This should include a description of the requested
	    change, the reason for the change (defect or enhancement), the&nbsp;artifact&nbsp;affected (including&nbsp;the
	    version), and&nbsp;the priority of the change. If possible,&nbsp;provide an estimate of the effort required to
	    implement the change.
	</p>",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO artifacts VALUES (
	"_HGqkMdnTEdyNj6EOmqy5Rg",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"_HGqkMdnTEdyNj6EOmqy5Rg"
);
INSERT INTO sections VALUES (
	"_r2aP0KuoEdmEGLSmmpF1Sg",
	"Update the Work Item List",
	"Update the Work Item List",
	"Update the <a class=\"elementLinkWithType\"
	href=\"./../../core.mgmt.common.extend_supp/workproducts/work_items_list_39D03CC8.html\"
	guid=\"_rGNWsCbSEdqh1LYUOGRh2A\">Artifact: Work Items List</a>&nbsp;to&nbsp;document the information that you gathered in the
	previous step.",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO artifacts VALUES (
	"_HGqkMdnTEdyNj6EOmqy5Rg",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"_HGqkMdnTEdyNj6EOmqy5Rg"
);
INSERT INTO activities VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"prepare_product_documentation",
	"Develop Product Documentation and Training",
	"This activity prepares product documentation and training materials."
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_8--9sZigEeGlkdGl1HQlDA"
);

INSERT INTO tasks VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"develop_product_documentation",
	"Develop Product Documentation",
	"Because product documentation continues to be used after a development effort ends, it is important to ensure that the features developed within a particular release are clearly documented while the functionality is still fresh in the minds of team members.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zf1seB8EeC1y_NExchKwQ",
	"Document each feature",
	"Document each feature",
	"Write a comprehensive description of each feature and include appropriate screen shots as well as relevant information
	about how the feature was developed.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zf1s-B8EeC1y_NExchKwQ",
	"Review product documentation with stakeholders",
	"Review product documentation with stakeholders",
	"Schedule a review session with key stakeholders to ensure that the product documentation is adequate and that it contains
	the level of detail needed by the product customer. If more detail is required, elicit one or more examples from the
	stakeholders that show how they would like the documentation to be prepared.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOr-B8EeC1y_NExchKwQ",
	"Update product documentation as necessary",
	"Update product documentation as necessary",
	"Based on the outcome of the review session, update the product documentation so that it can receive the proper approval on
	delivery.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zf1sOB8EeC1y_NExchKwQ",
	"Deliver product documentation",
	"Deliver product documentation",
	"For this release, deliver the final product documentation to the customer and key stakeholders. Obtain their formal
	approval if necessary.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"develop_user_documentation",
	"Develop User Documentation",
	"User documentation must be developed and maintained for each Release so that the product's End Users will know how to operate the system effectively.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOpeB8EeC1y_NExchKwQ",
	"Leverage product documentation",
	"Leverage product documentation",
	"Re-use whatever material you can from the product documentation that your team has created. If adequate time and attention
	was given to product documentation, you should be able to leverage a significant amount of it to develop the user
	documentation. Because only features (and possibly some nonfunctional requirements) were documented for the product, only
	that amount can be leveraged. However, it often provides a nice framework for the user documentation.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
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
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOouB8EeC1y_NExchKwQ",
	"Write user documentation content",
	"Write user documentation content",
	"Based on the previous steps, write the user documentation. One way to do this is to assign sections of the document
	(described in the step \"Determine User Documentation Contents\" above) to Development team members as Sprint/Iteration Tasks
	in the Release Sprint/Iteration.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOoeB8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As the user documentation is integrated, plan and conduct a quality review during the Release Sprint/Iteration to ensure
	that the documentation is of sufficient quantity and quality. Update and improve the user documentation based on the
	results of the quality review.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOpuB8EeC1y_NExchKwQ",
	"Deliver user documentation",
	"Deliver user documentation",
	"Before or at the end of a release, deliver the completed user documentation to the deployment manager. Ensure that the
	program has a plan for communicating the user documentation to end users.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"develop_support_documentation",
	"Develop Support Documentation",
	"This type of documentation is used by production support and IT operations personnel on a regular basis to answer End Users' questions about a particular product, to troubleshoot issues, or to determine if an incident is a result of a defect or missed requirements.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
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
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOqeB8EeC1y_NExchKwQ",
	"Write support documentation",
	"Write support documentation",
	"Based on the previous steps, write the support documentation. One way to do this is to assign sections of the document
	(determined in the step \"Determine Support Documentation Contents\" above) to development team members as sprint/iteration
	tasks in the release sprint/iteration.",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOrOB8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As the support documentation is integrated, plan and conduct a quality review during the release sprint/iteration to ensure
	that the documentation is of sufficient quantity and quality. Update and improve the support documentation based on the
	results of the quality review.",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOqOB8EeC1y_NExchKwQ",
	"Deliver support documentation",
	"Deliver support documentation",
	"At the end of a release, deliver the completed support documentation to the deployment manager. Ensure that the program has
	a plan for communicating the support documentation to the IT operations support organization in a timely manner.",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"develop_training_materials",
	"Develop Training Materials",
	"This task is used to develop quality audio/visual materials that can be used to train End Users and IT production support personnel.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_8--9sZigEeGlkdGl1HQlDA",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO sections VALUES (
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
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
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
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
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
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
	"_-zenn-B8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As user and support training materials are developed, plan and conduct a quality review during the release sprint/iteration
	to ensure that the materials are of sufficient quantity and quality. Update and improve the training materials based on the
	results of the quality review.",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
	"_-zennuB8EeC1y_NExchKwQ",
	"Perform dry run",
	"Perform dry run",
	"Before formally delivering the user or support training, plan a sprint/iteration task in which representatives of both the
	user and support communities are invited to participate in a dry run of the training materials. Use the feedback obtained
	from these sessions to improve the training materials during the release sprint/iteration.",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
	"_-zenneB8EeC1y_NExchKwQ",
	"Deliver training materials",
	"Deliver training materials",
	"When the final user and support training materials are complete, deliver them to the deployment manager for integration
	with the training materials from the other teams participating in the program.",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO activities VALUES (
	"_RQi0AdONEdyqlogshP8l4g",
	"construction_phase_iteration",
	"Construction Phase Iteration",
	"This iteration template defines the activities (and associated roles and work products) performed in a typical iteration in the Construction phase."
);

INSERT INTO iteration_activities VALUES (
	"_6togYdOPEdyqlogshP8l4g",
	"_RQi0AdONEdyqlogshP8l4g"
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

INSERT INTO activities VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"plan_manage_iteration",
	"Plan and Manage Iteration",
	"Initiate the iteration and allow team members to sign up for development tasks. Monitor and communicate project status to external stakeholders. Identify and handle exceptions and problems."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_5v_o4dOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"plan_iteration",
	"Plan Iteration",
	"Plan the scope and responsibilities for a single iteration.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_7bz7AIyAEdyhZb-MhCJrlA",
	"Prioritize Work Items List",
	"Prioritize Work Items List",
	"Prioritize the work items list before you plan the next iteration. Consider what has changed since the last iteration plan
	(such as new change requests, shifting priorities of your stakeholders, or new risks that have been encountered).",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_HzNVgIyBEdyhZb-MhCJrlA",
	"Identify and review risks",
	"Identify and review risks",
	"<p>
	    Throughout the project, new assumptions and concerns may arise. Help the team identify and prioritize new risks as part
	    of iteration planning, updating the risk list. Add risk responses to the work items list, influencing the work that is
	    being planned for that iteration.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_7Hqr4MMsEdmdo9HxCRR_Gw",
	"Define evaluation criteria",
	"Define evaluation criteria",
	"<p>
	    Each iteration should include testing as a part of the evaluation, as well as the test objectives and test cases that
	    need to be detailed. Other evaluation criteria may include successful demonstrations to key stakeholders, or favorable
	    usage by a small group of target users. Document evaluation criteria in the iteration plan.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_-tp18FHjEd2IaYFd32DrjQ",
	"Refine project definition and scope",
	"Refine project definition and scope",
	"<p>
	    Depending on the results of the previous iteration assessment, update the project definition work products as needed.
	    Necessary changes can encompass the need to acquire new resources, to absorb an unplanned effort increase, or to
	    implement a specific change request. If a change affects defined project milestones, consult with the stakeholders
	    before committing to it.
	</p>",
	"_y05RQNOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_y05RQNOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"manage_iteration",
	"Manage Iteration",
	"Assess project status and identify any blocking issues and opportunities. Identify and manage exceptions, problems, and risks. Communicate project status.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_xiFJwCbZEdqh1LYUOGRh2A",
	"Identify and manage risks",
	"Identify and manage risks",
	"<p>
	    Identify risks as soon as the project starts, and continue identifying and managing risks throughout the project.
	    Revisit the <a class=\"elementLink\" href=\"./../../core.mgmt.common.extend_supp/workproducts/risk_list_C4B6F290.html\"
	    guid=\"_Ckay8Cc_EduIsqH1Q6ZuqA\">Risk List</a> weekly, or at a minimum once per iteration. Involve the entire team in
	    identifying and mitigating risks.
	</p>",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Br6VECuxEdqTIKp3l5PtzQ",
	"Manage objectives",
	"Manage objectives",
	"When a team is falling significantly behind, or critical problems occur that prevent the team from meeting the iteration
	objectives, it may be necessary to descope work to ensure that the team delivers a useful product increment by the end of
	the iteration, while maximizing stakeholder value. Work with the team and stakeholders to revise the Iteration Plan and, as
	necessary, reduce the emphasis on less critical tasks by postponing them to a subsequent iteration. In rare cases, if the
	iteration objectives still seem impossible to meet, the team might consider terminating the iteration or reformulating the
	iteration to a new objective.",
	"_zjF0ANOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMdOJEdyqlogshP8l4g",
	"risk_list",
	"Risk List",
	"This artifact is a sorted list of known and open risks to the project, sorted in order of importance and associated with specific mitigation or contingency actions."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMdOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_zjF0ANOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"assess_results",
	"Assess Results",
	"Determine success or failure of the iteration. Apply the lessons learned to modify the project or improve the process.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_5v_o4dOOEdyqlogshP8l4g",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_1YHH8DLqEdueZPye-FaNgA",
	"Close-out project",
	"Close-out project",
	"<p>
	    Perform this step when the iteration review coincides with the end of the project. Involve the team and stakeholders in
	    a final assessment for project acceptance which, if successful, marks the point when the customer accepts ownership of
	    the software product. Complete the close-out of the project by disposing of the remaining assets and reassigning the
	    remaining staff.
	</p>",
	"_0Qiv4NOJEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_y1MMMNOJEdyqlogshP8l4g",
	"iteration_plan",
	"Iteration Plan",
	"A fine-grained plan describing the objectives, work assignments, and evaluation criteria for the iteration."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMNOJEdyqlogshP8l4g"
);
INSERT INTO artifacts VALUES (
	"_y1MMMtOJEdyqlogshP8l4g",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_0Qiv4NOJEdyqlogshP8l4g",
	"_y1MMMtOJEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"develop_solution",
	"Develop Solution Increment",
	"Design, implement, test, and integrate the solution for a requirement within a given context."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_-iix4dOOEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"design_solution",
	"Design the Solution",
	"Identify the elements and devise the interactions, behavior, relations, and data necessary to realize some functionality.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_frOcQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_frh-QtOKEdyqlogshP8l4g",
	"design",
	"Design",
	"This artifact describes the realization of required system functionality and serves as an abstraction of the source code."
);

INSERT INTO task_artifacts VALUES (
	"_frOcQNOKEdyqlogshP8l4g",
	"_frh-QtOKEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"implement_developer_tests",
	"Implement Developer Tests",
	"Implement one or more tests that enable the validation of the individual implementation elements through execution.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_Es64wJR-EdyVKbgqUOtqQA",
	"Write the test setup",
	"Write the test setup",
	"To successfully run a test the system must be in a known state so that the correct behavior can be defined. Implement the
	setup logic that must be performed as part of the developer test.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_GZaPwJR-EdyVKbgqUOtqQA",
	"Write the test logic",
	"Write the test logic",
	"Write the steps that perform the actual test(s).",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_IMxq0JR-EdyVKbgqUOtqQA",
	"Define the test response",
	"Define the test response",
	"Define the information the test(s) must produce to successfully indicate success or failure. Consider if a response of True
	or False is sufficient, or if a detailed message should be logged as well.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
	"_JAiqEJR-EdyVKbgqUOtqQA",
	"Write clean-up code",
	"Write clean-up code",
	"Identify, and then implement, the steps to be followed in order to restore the environment to the original state for each
	test. The goal is to ensure that there are no side effects from running the tests.",
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_gXo2UNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_gX7xQtOKEdyqlogshP8l4g",
	"developer_test",
	"Developer Test",
	"The Developer Test validates a specific aspect of an implementation element."
);

INSERT INTO task_artifacts VALUES (
	"_gXo2UNOKEdyqlogshP8l4g",
	"_gX7xQtOKEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"implement_solution",
	"Implement Solution",
	"Implement source code to provide new functionality or fix defects.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_SW1pAJfJEdyZkIR-s-Y8wQ",
	"Identify opportunities for reuse",
	"Identify opportunities for reuse",
	"<p>
	    Identify existing code or other implementation elements that can be reused in the portion of the implementation that
	    you are creating or changing. A comprehensive understanding of the overall design is helpful, because it is best to
	    leverage reuse opportunities when you have a thorough understanding of the proposed solution.
	</p>",
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_hVe-oNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4JojEd2XAqcHTC2Siw",
	"implementation",
	"Implementation",
	"Software code files, data files, and supporting files (such as online help files) that represent the raw parts of a system that can be built."
);

INSERT INTO task_artifacts VALUES (
	"_hVe-oNOKEdyqlogshP8l4g",
	"_dC4w4JojEd2XAqcHTC2Siw"
);
INSERT INTO tasks VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"run_developer_tests",
	"Run Developer Tests",
	"Run tests against the individual implementation elements to verify that their internal structures work as specified.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
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
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_itj1QJfIEdyZkIR-s-Y8wQ",
	"Respond to test results",
	"Respond to test results",
	"<p>
	    Determine the appropriate corrective action to recover from a \"failed\" developer test run. If the implementation
	    element under test is faulty, fix the problem if possible and rerun the tests. If the problem is serious and cannot be
	    immediately addressed, report the defect. If the developer test is faulty fix the test and rerun the tests. If there
	    was a problem with the environment, resolve it and then rerun&nbsp;the tests.
	</p>",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO sections VALUES (
	"_C0_fYFQAEd2ECfw27om6fw",
	"Promote changes for integration test",
	"Promote changes for integration test",
	"<p>
	    When the developer tests pass and no further work is need to complete the change set, promote the changes for
	    integration test. If the passing of these tests represent completion of a requirement update the status of the work
	    item.
	</p>",
	"_iRZNQNOKEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_dC4w4ZojEd2XAqcHTC2Siw",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_iRZNQNOKEdyqlogshP8l4g",
	"_dC4w4ZojEd2XAqcHTC2Siw"
);
INSERT INTO tasks VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"integrate_and_create_build",
	"Integrate and Create Build",
	"This task describes how to integrate all changes made by developers into the code base and perform the minimal testing to validate the build.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_-iix4dOOEdyqlogshP8l4g",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
	"_kkZBhJOKEdyaRbFYa4AN4A",
	"Test integrated elements",
	"Test integrated elements",
	"<p>
	    Re-run the developer tests against the integrated elements to verify that they behave the same as they did in
	    isolation. Ensure that the scope of these&nbsp;tests is as broad as possible, which ensures that the latest change sets
	    did not cause failing developer tests in other areas of the system.
	</p>",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
	"_kkZBg5OKEdyaRbFYa4AN4A",
	"Run "Smoke Tests"",
	"Run "Smoke Tests"",
	"<p>
	    Several builds will be created in each iteration. For each build, this step is performed only when change sets have
	    been delivered to satisfy the requirements of that build.
	</p>
	<p>
	    Execute a sub-set of the system tests to ensure that the build is suitable prior to committing resources to the full
	    scope of system testing.&nbsp;While the level of testing will vary, focus on gaining confidence that the increment is
	    of sufficient quality to establish a baseline for system testing.
	</p>",
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO sections VALUES (
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
	"_Dlo8wNo8EdyzZqGyZ7hwdw"
);

INSERT INTO artifacts VALUES (
	"_aJ1X4No7EdyzZqGyZ7hwdw",
	"build",
	"Build",
	"An operational version of a system or part of a system that demonstrates a subset of the capabilities to be provided in the final product."
);

INSERT INTO task_artifacts VALUES (
	"_Dlo8wNo8EdyzZqGyZ7hwdw",
	"_aJ1X4No7EdyzZqGyZ7hwdw"
);
INSERT INTO activities VALUES (
	"_AZ58IdOPEdyqlogshP8l4g",
	"test_solution",
	"Test Solution",
	"From a system perspective, test and evaluate the developed requirements."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_AZ58IdOPEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"implement_tests",
	"Implement Tests",
	"Implement Test Scripts to validate a Build of the solution. Organize Test Scripts into suites, and collaborate to ensure appropriate depth and breadth of test feedback.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_AZ58IdOPEdyqlogshP8l4g",
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_Viv68NOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_Vi5r8dOLEdyqlogshP8l4g",
	"test_script",
	"Test Script",
	"This artifact contains the step-by-step instructions that compose a test, enabling its run. Text scripts can take the form of either documented textual instructions that are manually followed, or computer-readable instructions that enable
	automated testing."
);

INSERT INTO task_artifacts VALUES (
	"_Viv68NOLEdyqlogshP8l4g",
	"_Vi5r8dOLEdyqlogshP8l4g"
);
INSERT INTO tasks VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"run_tests",
	"Run Tests",
	"Run the appropriate tests scripts, analyze results, articulate issues, and communicate test results to the team.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_AZ58IdOPEdyqlogshP8l4g",
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO sections VALUES (
	"_xVhnwKRLEdyLP-jEVj8Kyw",
	"Review work items completed in the build",
	"Review work items completed in the build",
	"Review work items that were integrated into the build since the last test cycle. Focus on identifying any previously
	unimplemented or failing requirements are now expected to meet the conditions of satisfaction.",
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO sections VALUES (
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
	"_WttSMNOLEdyqlogshP8l4g"
);

INSERT INTO artifacts VALUES (
	"_WttSMdOLEdyqlogshP8l4g",
	"test_log",
	"Test Log",
	"This artifact collects the raw output that is captured during a unique run of one or more tests for a single test cycle run."
);

INSERT INTO task_artifacts VALUES (
	"_WttSMNOLEdyqlogshP8l4g",
	"_WttSMdOLEdyqlogshP8l4g"
);
INSERT INTO activities VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"prep_doc_trng",
	"Develop Product Documentation and Training",
	"This activity prepares product documentation and training materials."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_ybaHoZlYEeGlkdGl1HQlDA"
);

INSERT INTO tasks VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"develop_product_documentation",
	"Develop Product Documentation",
	"Because product documentation continues to be used after a development effort ends, it is important to ensure that the features developed within a particular release are clearly documented while the functionality is still fresh in the minds of team members.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zf1seB8EeC1y_NExchKwQ",
	"Document each feature",
	"Document each feature",
	"Write a comprehensive description of each feature and include appropriate screen shots as well as relevant information
	about how the feature was developed.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zf1s-B8EeC1y_NExchKwQ",
	"Review product documentation with stakeholders",
	"Review product documentation with stakeholders",
	"Schedule a review session with key stakeholders to ensure that the product documentation is adequate and that it contains
	the level of detail needed by the product customer. If more detail is required, elicit one or more examples from the
	stakeholders that show how they would like the documentation to be prepared.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOr-B8EeC1y_NExchKwQ",
	"Update product documentation as necessary",
	"Update product documentation as necessary",
	"Based on the outcome of the review session, update the product documentation so that it can receive the proper approval on
	delivery.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zf1sOB8EeC1y_NExchKwQ",
	"Deliver product documentation",
	"Deliver product documentation",
	"For this release, deliver the final product documentation to the customer and key stakeholders. Obtain their formal
	approval if necessary.",
	"_y7kklJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkk5iLEeGOvpP1fVrVNA",
	"product_documentation",
	"Product Documentation",
	"Information about a specific product that has been captured in an organized format."
);

INSERT INTO task_artifacts VALUES (
	"_y7kklJiLEeGOvpP1fVrVNA",
	"_y7kkk5iLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"develop_user_documentation",
	"Develop User Documentation",
	"User documentation must be developed and maintained for each Release so that the product's End Users will know how to operate the system effectively.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOpeB8EeC1y_NExchKwQ",
	"Leverage product documentation",
	"Leverage product documentation",
	"Re-use whatever material you can from the product documentation that your team has created. If adequate time and attention
	was given to product documentation, you should be able to leverage a significant amount of it to develop the user
	documentation. Because only features (and possibly some nonfunctional requirements) were documented for the product, only
	that amount can be leveraged. However, it often provides a nice framework for the user documentation.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
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
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOouB8EeC1y_NExchKwQ",
	"Write user documentation content",
	"Write user documentation content",
	"Based on the previous steps, write the user documentation. One way to do this is to assign sections of the document
	(described in the step \"Determine User Documentation Contents\" above) to Development team members as Sprint/Iteration Tasks
	in the Release Sprint/Iteration.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOoeB8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As the user documentation is integrated, plan and conduct a quality review during the Release Sprint/Iteration to ensure
	that the documentation is of sufficient quantity and quality. Update and improve the user documentation based on the
	results of the quality review.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOpuB8EeC1y_NExchKwQ",
	"Deliver user documentation",
	"Deliver user documentation",
	"Before or at the end of a release, deliver the completed user documentation to the deployment manager. Ensure that the
	program has a plan for communicating the user documentation to end users.",
	"_y7kkkpiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0K5iLEeGOvpP1fVrVNA",
	"user_documentation",
	"User Documentation",
	"Documents that can be utilized by the End Users of a particular system or product. This type of documentation typically is written in a way that enables system users to easily find information they need to use the product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkpiLEeGOvpP1fVrVNA",
	"_y7a0K5iLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"develop_support_documentation",
	"Develop Support Documentation",
	"This type of documentation is used by production support and IT operations personnel on a regular basis to answer End Users' questions about a particular product, to troubleshoot issues, or to determine if an incident is a result of a defect or missed requirements.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
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
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOqeB8EeC1y_NExchKwQ",
	"Write support documentation",
	"Write support documentation",
	"Based on the previous steps, write the support documentation. One way to do this is to assign sections of the document
	(determined in the step \"Determine Support Documentation Contents\" above) to development team members as sprint/iteration
	tasks in the release sprint/iteration.",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOrOB8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As the support documentation is integrated, plan and conduct a quality review during the release sprint/iteration to ensure
	that the documentation is of sufficient quantity and quality. Update and improve the support documentation based on the
	results of the quality review.",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_-zfOqOB8EeC1y_NExchKwQ",
	"Deliver support documentation",
	"Deliver support documentation",
	"At the end of a release, deliver the completed support documentation to the deployment manager. Ensure that the program has
	a plan for communicating the support documentation to the IT operations support organization in a timely manner.",
	"_y7kkkJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7kkkZiLEeGOvpP1fVrVNA",
	"support_documentation",
	"Support Documentation",
	"Documents used by members of a production support team that provide information about how to service and support a specific product."
);

INSERT INTO task_artifacts VALUES (
	"_y7kkkJiLEeGOvpP1fVrVNA",
	"_y7kkkZiLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"develop_training_materials",
	"Develop Training Materials",
	"This task is used to develop quality audio/visual materials that can be used to train End Users and IT production support personnel.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_ybaHoZlYEeGlkdGl1HQlDA",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO sections VALUES (
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
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
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
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
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
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
	"_-zenn-B8EeC1y_NExchKwQ",
	"Perform quality review",
	"Perform quality review",
	"As user and support training materials are developed, plan and conduct a quality review during the release sprint/iteration
	to ensure that the materials are of sufficient quantity and quality. Update and improve the training materials based on the
	results of the quality review.",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
	"_-zennuB8EeC1y_NExchKwQ",
	"Perform dry run",
	"Perform dry run",
	"Before formally delivering the user or support training, plan a sprint/iteration task in which representatives of both the
	user and support communities are invited to participate in a dry run of the training materials. Use the feedback obtained
	from these sessions to improve the training materials during the release sprint/iteration.",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO sections VALUES (
	"_-zenneB8EeC1y_NExchKwQ",
	"Deliver training materials",
	"Deliver training materials",
	"When the final user and support training materials are complete, deliver them to the deployment manager for integration
	with the training materials from the other teams participating in the program.",
	"_ofI9sJlWEeGlkdGl1HQlDA"
);

INSERT INTO artifacts VALUES (
	"_ofSHoplWEeGlkdGl1HQlDA",
	"training_materials",
	"Training Materials",
	"This work product represents all the materials needed to train End Users and production support personnel on the features and inner workings of a product for a particular Release."
);

INSERT INTO task_artifacts VALUES (
	"_ofI9sJlWEeGlkdGl1HQlDA",
	"_ofSHoplWEeGlkdGl1HQlDA"
);
INSERT INTO activities VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"prepare_for_release",
	"Prepare for Release",
	"This activity prepares a product for release."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_qRAugZlXEeGlkdGl1HQlDA"
);

INSERT INTO tasks VALUES (
	"_y7az_piLEeGOvpP1fVrVNA",
	"review_conform_to_release_controls",
	"Review and Conform to Release Controls",
	"Release controls normally are specified by the Deployment Manager. These controls document the requirements to which all releases must conform before being placed into the production environment.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_y7az_piLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAJWAuB-EeC1y_NExchKwQ",
	"Locate release controls",
	"Locate release controls",
	"If the program's release controls are not readily available, the development team must engage the deployment manager and/or
	their deployment engineers to know where to find the release controls and be able to comply with them.",
	"_y7az_piLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAJWAeB-EeC1y_NExchKwQ",
	"Review release controls",
	"Review release controls",
	"The development team should thoroughly review the release controls so that it understands what is expected before a release
	is accepted into the production environment. If the team has any questions or issues with the controls, team members should
	communicate directly with the deployment manager or the deployment engineer to understand the issues.",
	"_y7az_piLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7az_piLEeGOvpP1fVrVNA"
);

INSERT INTO tasks VALUES (
	"_y7a0ApiLEeGOvpP1fVrVNA",
	"install_validate_infrastructure",
	"Install and Validate Infrastructure",
	"Any infrastructure components needed to support a release must be procured, installed, and tested.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_y7a0ApiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAIH4-B-EeC1y_NExchKwQ",
	"Identify infrastructure needs",
	"Identify infrastructure needs",
	"Identify and describe all the components of the infrastructure that are needed to support the upcoming release. These
	requirements should be based completely on the feature set that is about to be deployed, not on intended future needs.",
	"_y7a0ApiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0A5iLEeGOvpP1fVrVNA",
	"infrastructure",
	"Infrastructure",
	"In reference to a Release Sprint, infrastructure refers to all the hardware, software, and network facilities necessary to support a deployed release."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0ApiLEeGOvpP1fVrVNA",
	"_y7a0A5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAIu8eB-EeC1y_NExchKwQ",
	"Procure components",
	"Procure components",
	"Determine how long it will reasonably take to procure the needed components and to engage the appropriate division in the
	organization to place the order. Be sure to work with the procurement agency to track the order and to identify any issues
	with that order. Ultimately, the development team, not the procurement agency, is responsible for ensuring that the correct
	infrastructure components are in place.",
	"_y7a0ApiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0A5iLEeGOvpP1fVrVNA",
	"infrastructure",
	"Infrastructure",
	"In reference to a Release Sprint, infrastructure refers to all the hardware, software, and network facilities necessary to support a deployed release."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0ApiLEeGOvpP1fVrVNA",
	"_y7a0A5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAIH5OB-EeC1y_NExchKwQ",
	"Schedule components for installation",
	"Schedule components for installation",
	"After the procured components arrive, schedule to have them installed by the IT operations group(s) that control the
	production environment. The development team should be developing tests to confirm the correct installation at this time.",
	"_y7a0ApiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0A5iLEeGOvpP1fVrVNA",
	"infrastructure",
	"Infrastructure",
	"In reference to a Release Sprint, infrastructure refers to all the hardware, software, and network facilities necessary to support a deployed release."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0ApiLEeGOvpP1fVrVNA",
	"_y7a0A5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAIH4uB-EeC1y_NExchKwQ",
	"Install and test components",
	"Install and test components",
	"When the components have been installed, be prepared to run the validation tests developed in the previous step. These
	tests should not only verify the individual components' readiness, but also should validate their integration with each
	other and with legacy components.",
	"_y7a0ApiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0A5iLEeGOvpP1fVrVNA",
	"infrastructure",
	"Infrastructure",
	"In reference to a Release Sprint, infrastructure refers to all the hardware, software, and network facilities necessary to support a deployed release."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0ApiLEeGOvpP1fVrVNA",
	"_y7a0A5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
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
	"_y7a0ApiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0A5iLEeGOvpP1fVrVNA",
	"infrastructure",
	"Infrastructure",
	"In reference to a Release Sprint, infrastructure refers to all the hardware, software, and network facilities necessary to support a deployed release."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0ApiLEeGOvpP1fVrVNA",
	"_y7a0A5iLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_y7az-5iLEeGOvpP1fVrVNA",
	"develop_backout_plan",
	"Develop Backout Plan",
	"This task results in a plan to be used by the production support organization to roll back the release if there is a problem during or after deployment.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_y7az-5iLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAIu9eB-EeC1y_NExchKwQ",
	"Determine if backout plan exists",
	"Determine if backout plan exists",
	"Determine whether the development team has a backout plan already written for a previous release. If so, part of that plan
	might be reusable. If this release is the development team's first, another development team with a similar feature set
	might have a plan that can be used as a starting point.",
	"_y7az-5iLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0BJiLEeGOvpP1fVrVNA",
	"backout_plan",
	"Backout Plan",
	"A Backout Plan defines the criteria and procedures to be followed if a release into production needs to be rolled back."
);

INSERT INTO task_artifacts VALUES (
	"_y7az-5iLEeGOvpP1fVrVNA",
	"_y7a0BJiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAIu8-B-EeC1y_NExchKwQ",
	"Develop the backout plan (if applicable)",
	"Develop the backout plan (if applicable)",
	"If a backout plan does not exist, or one cannot be found to be used as a starting point, answer the questions documented in
	the <a class=\"elementLinkWithType\"
	href=\"./../../practice.gen.production_release.base/workproducts/backout_plan_DC0D7247.html\"
	guid=\"_IAHg2eB-EeC1y_NExchKwQ\">Artifact: Backout Plan</a> to start and develop a backout plan.",
	"_y7az-5iLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0BJiLEeGOvpP1fVrVNA",
	"backout_plan",
	"Backout Plan",
	"A Backout Plan defines the criteria and procedures to be followed if a release into production needs to be rolled back."
);

INSERT INTO task_artifacts VALUES (
	"_y7az-5iLEeGOvpP1fVrVNA",
	"_y7a0BJiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAIu9OB-EeC1y_NExchKwQ",
	"Update the backout plan (if applicable)",
	"Update the backout plan (if applicable)",
	"If a backout plan does exist that can be used as a baseline, review that plan and update, add, or delete information as
	necessary. When the plan is completed, it should reflect entirely the contents of the upcoming deployment only, not a
	release in the past or one in the future. In other words, the backout plan should be specific only to this release.",
	"_y7az-5iLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0BJiLEeGOvpP1fVrVNA",
	"backout_plan",
	"Backout Plan",
	"A Backout Plan defines the criteria and procedures to be followed if a release into production needs to be rolled back."
);

INSERT INTO task_artifacts VALUES (
	"_y7az-5iLEeGOvpP1fVrVNA",
	"_y7a0BJiLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_y7a0AJiLEeGOvpP1fVrVNA",
	"develop_release_communications",
	"Develop Release Communications",
	"Stakeholders should be notified when a product (or feature set) is placed into production.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_qRAugZlXEeGlkdGl1HQlDA",
	"_y7a0AJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAJWBuB-EeC1y_NExchKwQ",
	"Identify stakeholders for this release",
	"Identify stakeholders for this release",
	"The development team should know exactly which stakeholder groups will benefit from the upcoming release. First, identify
	the stakeholders for this release. Next, determine how each stakeholder group is expected to benefit from the release based
	on the components that will be delivered to production.",
	"_y7a0AJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7az_ZiLEeGOvpP1fVrVNA",
	"release_communications",
	"Release Communications",
	"This artifact provides information to concerned parties that a product (or subset) has been placed into production."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0AJiLEeGOvpP1fVrVNA",
	"_y7az_ZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
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
	"_y7a0AJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7az_ZiLEeGOvpP1fVrVNA",
	"release_communications",
	"Release Communications",
	"This artifact provides information to concerned parties that a product (or subset) has been placed into production."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0AJiLEeGOvpP1fVrVNA",
	"_y7az_ZiLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAJWB-B-EeC1y_NExchKwQ",
	"Provide commiques to deployment manager",
	"Provide commiques to deployment manager",
	"After drafting the communiques for each stakeholder group, the development team should provide those drafts to the
	deployment manager. Typically, release communications are consolidated and released at the program level. The deployment
	manager and deployment engineers normally are responsible for ensuring that all release communications are consistent and
	concise. The deployment manager will determine the appropriate time to communicate information about the upcoming release
	to the appropriate stakeholders.",
	"_y7a0AJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7az_ZiLEeGOvpP1fVrVNA",
	"release_communications",
	"Release Communications",
	"This artifact provides information to concerned parties that a product (or subset) has been placed into production."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0AJiLEeGOvpP1fVrVNA",
	"_y7az_ZiLEeGOvpP1fVrVNA"
);
INSERT INTO activities VALUES (
	"_tcRJkZlXEeGlkdGl1HQlDA",
	"provide_product_training",
	"Provide Product Training",
	"This activity provides product training."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_tcRJkZlXEeGlkdGl1HQlDA"
);

INSERT INTO tasks VALUES (
	"_y7az8ZiLEeGOvpP1fVrVNA",
	"deliver_end_user_training",
	"Deliver End User Training",
	"In most cases, End Users of a system require training to use the application effectively.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_tcRJkZlXEeGlkdGl1HQlDA",
	"_y7az8ZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7az8ZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_-zenkuB8EeC1y_NExchKwQ",
	"Prepare for user training delivery",
	"Prepare for user training delivery",
	"Review the training materials so that you are familiar with them. If you encounter any areas in which you are unsure or
	tentative about, engage experts from the development team or program who can help you understand the material. Then, update
	the training materials accordingly and create instructor notes to help you remember key points as you deliver the training.
	Instructor notes that you author will not only help you, but they might assist other instructors in the future who have not
	had the benefit of working with the development team or program.",
	"_y7az8ZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_-zenkeB8EeC1y_NExchKwQ",
	"Deliver user training and gather feedback",
	"Deliver user training and gather feedback",
	"On the prescribed day(s) and time(s), deliver the training as planned. When each course is completed, solicit feedback from
	the attendees on the course material, its organization and flow, the learning objectives, how well the instructor delivered
	the content, and whether the course met their expectations.",
	"_y7az8ZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_-zenkOB8EeC1y_NExchKwQ",
	"Provide feedback to the program level",
	"Provide feedback to the program level",
	"Consolidate the feedback from the courses delivered and provide it to the program manager or their delegate for review.",
	"_y7az8ZiLEeGOvpP1fVrVNA"
);

INSERT INTO tasks VALUES (
	"_y7az7piLEeGOvpP1fVrVNA",
	"deliver_support_training",
	"Deliver Support Training",
	"Personnel who support an application need training so they can perform their jobs effectively.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_tcRJkZlXEeGlkdGl1HQlDA",
	"_y7az7piLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7az7piLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_-zenl-B8EeC1y_NExchKwQ",
	"Prepare for support training delivery",
	"Prepare for support training delivery",
	"Review the training materials so that you are familiar with them. If you encounter any areas where you are unsure or
	tentative, engage experts from the development team or program who can help you understand the material. Then, update the
	training materials accordingly and create instructor notes to help you remember key points as you deliver the training.
	Instructor notes that you write will not only help you but might assist other instructors in the future who have not had
	the benefit of working with the development team or program.",
	"_y7az7piLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_-zenluB8EeC1y_NExchKwQ",
	"deliver support training and gather feedback",
	"deliver support training and gather feedback",
	"On the prescribed day(s) and time(s), deliver the training as planned. When each course is completed, solicit feedback from
	the attendees about the course material, its organization and flow, the learning objectives, how well the instructor
	delivered the content, and whether the course met their expectations.",
	"_y7az7piLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_-zenleB8EeC1y_NExchKwQ",
	"Provide feedback to the program",
	"Provide feedback to the program",
	"Consolidate the feedback from the courses delivered and provide it to the program manager or their delegate for review.",
	"_y7az7piLEeGOvpP1fVrVNA"
);

INSERT INTO activities VALUES (
	"_CoJVUdOPEdyqlogshP8l4g",
	"ongoing_tasks",
	"Ongoing Tasks",
	"Perform ongoing tasks that are not necessarily part of the project schedule."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_CoJVUdOPEdyqlogshP8l4g"
);

INSERT INTO tasks VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"request_change",
	"Request Change",
	"Capture and record change requests.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_CoJVUdOPEdyqlogshP8l4g",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO sections VALUES (
	"_qEkewKuoEdmEGLSmmpF1Sg",
	"Gather change request information",
	"Gather change request information",
	"<p>
	    Gather the information required to describe the change request. This should include a description of the requested
	    change, the reason for the change (defect or enhancement), the&nbsp;artifact&nbsp;affected (including&nbsp;the
	    version), and&nbsp;the priority of the change. If possible,&nbsp;provide an estimate of the effort required to
	    implement the change.
	</p>",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO artifacts VALUES (
	"_HGqkMdnTEdyNj6EOmqy5Rg",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"_HGqkMdnTEdyNj6EOmqy5Rg"
);
INSERT INTO sections VALUES (
	"_r2aP0KuoEdmEGLSmmpF1Sg",
	"Update the Work Item List",
	"Update the Work Item List",
	"Update the <a class=\"elementLinkWithType\"
	href=\"./../../core.mgmt.common.extend_supp/workproducts/work_items_list_39D03CC8.html\"
	guid=\"_rGNWsCbSEdqh1LYUOGRh2A\">Artifact: Work Items List</a>&nbsp;to&nbsp;document the information that you gathered in the
	previous step.",
	"_HGqkMNnTEdyNj6EOmqy5Rg"
);

INSERT INTO artifacts VALUES (
	"_HGqkMdnTEdyNj6EOmqy5Rg",
	"work_items_list",
	"Work Items List",
	"This artifact contains a list of all of the scheduled work to be done within the project, as well as proposed work that may affect the product in this or future projects. Each work item may contain references to information relevant to carry out the work described within the work item."
);

INSERT INTO task_artifacts VALUES (
	"_HGqkMNnTEdyNj6EOmqy5Rg",
	"_HGqkMdnTEdyNj6EOmqy5Rg"
);
INSERT INTO activities VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"deploy_release_to_production",
	"Deploy Release to Production",
	"This activity results in the release of a set of integrated components into the production environment."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_sL8xMZlXEeGlkdGl1HQlDA"
);

INSERT INTO tasks VALUES (
	"_y7a0GJiLEeGOvpP1fVrVNA",
	"package_the_release",
	"Package the Release",
	"Each release should be built and packaged in a standard, controlled, and repeatable manner.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_y7a0GJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAEdheB-EeC1y_NExchKwQ",
	"Assemble components",
	"Assemble components",
	"Question all the developers on the development team to determine which components are ready for packaging. Only package
	those components that were completed and accepted during the previous feature development sprint/iterations. Components
	that were not finished or not accepted should not be bundled, unless the customer has granted an exception or they are
	infrastructure-related components.",
	"_y7a0GJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0I5iLEeGOvpP1fVrVNA",
	"release",
	"Release",
	"	
	A Release is the transition of an increment of potentially shippable product from the development group into routine use by Customers based on a successful placement of a Release Sprint's output into the production environment."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0GJiLEeGOvpP1fVrVNA",
	"_y7a0I5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAEdguB-EeC1y_NExchKwQ",
	"Test the release",
	"Test the release",
	"After the components have been packaged and built, that executable should be installed and run in a test environment that
	mimics the production environment. A \"staging\" environment usually is maintained for this purpose. Testing typically
	includes a \"smoke test\" in which key features are exercised to highlight any unplanned behavior.",
	"_y7a0GJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0I5iLEeGOvpP1fVrVNA",
	"release",
	"Release",
	"	
	A Release is the transition of an increment of potentially shippable product from the development group into routine use by Customers based on a successful placement of a Release Sprint's output into the production environment."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0GJiLEeGOvpP1fVrVNA",
	"_y7a0I5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAEdhOB-EeC1y_NExchKwQ",
	"Tag source code repository",
	"Tag source code repository",
	"In the team's configuration management (CM) tool, tag all the components that went into the release package so that the
	package can be reconstructed at a later date, if needed. This tag is known as the release \"baseline.\"",
	"_y7a0GJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0I5iLEeGOvpP1fVrVNA",
	"release",
	"Release",
	"	
	A Release is the transition of an increment of potentially shippable product from the development group into routine use by Customers based on a successful placement of a Release Sprint's output into the production environment."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0GJiLEeGOvpP1fVrVNA",
	"_y7a0I5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAEdg-B-EeC1y_NExchKwQ",
	"Package release documentation",
	"Package release documentation",
	"Gather all the product, user, and support documentation developed earlier in the production release sprint/iteration and
	add it to the release package.",
	"_y7a0GJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0I5iLEeGOvpP1fVrVNA",
	"release",
	"Release",
	"	
	A Release is the transition of an increment of potentially shippable product from the development group into routine use by Customers based on a successful placement of a Release Sprint's output into the production environment."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0GJiLEeGOvpP1fVrVNA",
	"_y7a0I5iLEeGOvpP1fVrVNA"
);
INSERT INTO sections VALUES (
	"_IAEdgeB-EeC1y_NExchKwQ",
	"Deliver release package",
	"Deliver release package",
	"When the entire release package, including documentation, is ready, deliver it to the deployment manager and the release
	team in a timely manner. Be prepared to answer questions from the deployment engineer, especially questions about
	conformity to release controls.",
	"_y7a0GJiLEeGOvpP1fVrVNA"
);

INSERT INTO artifacts VALUES (
	"_y7a0I5iLEeGOvpP1fVrVNA",
	"release",
	"Release",
	"	
	A Release is the transition of an increment of potentially shippable product from the development group into routine use by Customers based on a successful placement of a Release Sprint's output into the production environment."
);

INSERT INTO task_artifacts VALUES (
	"_y7a0GJiLEeGOvpP1fVrVNA",
	"_y7a0I5iLEeGOvpP1fVrVNA"
);
INSERT INTO tasks VALUES (
	"_y7a0IJiLEeGOvpP1fVrVNA",
	"execute_deployment_plan",
	"Execute Deployment Plan",
	"The Deployment Plan has all the unique instructions necessary to roll out a release.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_y7a0IJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAD2deB-EeC1y_NExchKwQ",
	"Review deployment plan",
	"Review deployment plan",
	"Review the contents of the deployment plan to ensure that the production environment has all the dependent components
	installed and that the system is in the correct state. Also ensure that the release window is ready to be achieved.",
	"_y7a0IJiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7a0IJiLEeGOvpP1fVrVNA"
);

INSERT INTO tasks VALUES (
	"_y7a0KZiLEeGOvpP1fVrVNA",
	"verify_successful_deployment",
	"Verify Successful Deployment",
	"Determine whether the rollout of a particular release into production has been successful or not.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_y7a0KZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAFEleB-EeC1y_NExchKwQ",
	"Test production release",
	"Test production release",
	"In this step, automated smoke tests should be run to determine whether key components were deployed successfully. These
	tests should be brief but revealing enough to quickly determine the validity of the deployment.",
	"_y7a0KZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAFEk-B-EeC1y_NExchKwQ",
	"Run manual tests",
	"Run manual tests",
	"If the automated smoke tests are successful, run several complex manual tests to simulate key end user behavior. These
	tests should be executed by development team members or stakeholders recruited specifically for this purpose.",
	"_y7a0KZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAFElOB-EeC1y_NExchKwQ",
	"Determine if release should be reversed",
	"Determine if release should be reversed",
	"In some situations, problems with the release might be encountered but are not serious enough to reverse the deployment. If
	the problem(s) associated with the release can be fixed easily, and if they are not detrimental to the production
	environment, an emergency bug fix (EBF) might be the answer. In that case, the release is not backed out; rather, an EBF is
	scheduled to be executed as soon as possible.",
	"_y7a0KZiLEeGOvpP1fVrVNA"
);

INSERT INTO tasks VALUES (
	"_y7a0HZiLEeGOvpP1fVrVNA",
	"execute_backout_plan",
	"Execute Backout Plan (if necessary)",
	"If a particular release into production goes wrong, the plan for cleanly reversing that deployment is executed.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_y7a0HZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
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
	"_y7a0HZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAD2cOB-EeC1y_NExchKwQ",
	"Backout the release",
	"Backout the release",
	"Following the instructions in the backout plan, reverse the deployment. However, be aware that the backout plan
	instructions are a guide and should not always be taken literally. This interpretation is due to the fact that not every
	problematic condition can be documented in advance and because each real-world situation might be slightly different.",
	"_y7a0HZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAD2cuB-EeC1y_NExchKwQ",
	"Determine if the backout was successful",
	"Determine if the backout was successful",
	"Ascertain whether the reversal was successful. If not, key members of the release team, development team, or program level
	agile system team might need to be engaged to find and fix the problem(s).",
	"_y7a0HZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAD2ceB-EeC1y_NExchKwQ",
	"Communicate the backout",
	"Communicate the backout",
	"Ensure that all interested parties are aware of the failed release. Because releases often take place at odd hours to
	minimize end user impact, use beeper-based notifications judiciously. In most cases, an email to key stakeholders (such as
	the product owner and program manager) might suffice. Following up with a phone call also might be warranted.",
	"_y7a0HZiLEeGOvpP1fVrVNA"
);

INSERT INTO tasks VALUES (
	"_y7a0JZiLEeGOvpP1fVrVNA",
	"deliver_release_communications",
	"Deliver Release Communications",
	"After a product release has been declared a success and is available for use, all relevant stakeholders should receive a communique stating that fact.",
	NULL
);

INSERT INTO activity_tasks VALUES (
	"_sL8xMZlXEeGlkdGl1HQlDA",
	"_y7a0JZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAFEkeB-EeC1y_NExchKwQ",
	"Validate the communiques",
	"Validate the communiques",
	"Ensure that the communiques designated for this release are correct, complete, and reflect all the stakeholder groups that
	must be informed.",
	"_y7a0JZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAFEkOB-EeC1y_NExchKwQ",
	"Send release communications",
	"Send release communications",
	"Using a pre-planned script, send the communiques in the manner designated in the <a class=\"elementLinkWithType\"
	href=\"./../../practice.gen.production_release.base/workproducts/release_communications_7698226F.html\"
	guid=\"_IAIH4OB-EeC1y_NExchKwQ\">Artifact: Release Communications</a>. Most of the time, the preferred communication
	mechanism will be by email, but other methods could include beeper notification, telephone calls, a posting to an internal
	release website, live or pre-recorded presentations by senior management, etc.",
	"_y7a0JZiLEeGOvpP1fVrVNA"
);

INSERT INTO sections VALUES (
	"_IAEdh-B-EeC1y_NExchKwQ",
	"Validate communications were received",
	"Validate communications were received",
	"If the communiques were sent by email, it may be prudent to request a receipt of delivery to ensure that the notices were
	received by the intended audience.",
	"_y7a0JZiLEeGOvpP1fVrVNA"
);

INSERT INTO activities VALUES (
	"_pzQU0dONEdyqlogshP8l4g",
	"transition_phase_iteration",
	"Transition Phase Iteration",
	"This iteration template defines the activities (and associated roles and work products) performed in a typical iteration in the Transition phase."
);

INSERT INTO iteration_activities VALUES (
	"_7bg6EdOPEdyqlogshP8l4g",
	"_pzQU0dONEdyqlogshP8l4g"
);

