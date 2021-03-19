INSERT INTO method_configurations VALUES (
	"_QN3nQBEHEdyM7Iu0sxfrPA",
	"openup",
	"OpenUP",
	"OpenUP is a lean Unified Process that applies iterative and incremental approaches within a structured lifecycle. ",
	"1.0.0"
);

INSERT INTO role_sets VALUES (
	"_SHN90MYaEdyXeo04os5BOw",
	"basic_role_set",
	"Basic Roles",
	"This is the list of basic software development roles."
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
	"_Wi8j4L9yEd-AG_DXKKgAXg",
	"environment_roles_list",
	"Environment",
	"This standard category lists all environment roles in software development."
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
	"This standard category lists all deployment roles in software development."
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



INSERT INTO delivery_processes VALUES (
	"_SuWj4dOPEdyqlogshP8l4g",
	"openup_lifecycle",
	"OpenUP Lifecycle",
	"This delivery process defines an end-to-end software development lifecycle that supports the core principles of OpenUP. It is designed to support small, co-located teams in their daily activities.",
	"_QN3nQBEHEdyM7Iu0sxfrPA"
);

INSERT INTO phases VALUES (
	"_8tQrUVQvEd2i9JHp7xurvw",
	"inception_phase",
	"Inception Phase",
	"The overriding goal of the inception phase is to achieve concurrence among all stakeholders on the lifecycle objectives for the project.",
	"_SuWj4dOPEdyqlogshP8l4g"
);
INSERT INTO phases VALUES (
	"_ieYHIVQwEd2i9JHp7xurvw",
	"elaboration_phase",
	"Elaboration Phase",
	"The goal of the elaboration phase is to baseline the architecture of the system to provide a stable basis for the bulk of the design and implementation effort in the construction phase.",
	"_SuWj4dOPEdyqlogshP8l4g"
);
INSERT INTO phases VALUES (
	"_nfpBkVQwEd2i9JHp7xurvw",
	"construction_phase",
	"Construction Phase",
	"The goal of the construction phase is clarifying the remaining requirements and completing the development of the system based upon the baselined architecture.",
	"_SuWj4dOPEdyqlogshP8l4g"
);
INSERT INTO phases VALUES (
	"_pOgXIVQwEd2i9JHp7xurvw",
	"transition_phase",
	"Transition Phase",
	"The focus of the Transition Phase is to ensure that software is available for its end users.",
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
