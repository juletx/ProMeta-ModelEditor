package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.ecore.genmodel.impl.Literals;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;

public class PackageClass_
{
  protected static String nl;
  public static synchronized PackageClass_ create(String lineSeparator)
  {
    nl = lineSeparator;
    PackageClass_ result = new PackageClass_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "//------------------------------------------------------------------------------" + NL + "// Copyright (c) 2005, 2006 IBM Corporation and others." + NL + "// All rights reserved. This program and the accompanying materials" + NL + "// are made available under the terms of the Eclipse Public License v1.0" + NL + "// which accompanies this distribution, and is available at" + NL + "// http://www.eclipse.org/legal/epl-v10.html" + NL + "//" + NL + "// Contributors:" + NL + "// IBM Corporation - initial implementation" + NL + "//------------------------------------------------------------------------------";
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ";";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Package</b> for the model." + NL + " * It contains accessors for the meta objects to represent" + NL + " * <ul>" + NL + " *   <li>each class,</li>" + NL + " *   <li>each feature of each class,</li>";
  protected final String TEXT_7 = NL + " *   <li>each operation of each class,</li>";
  protected final String TEXT_8 = NL + " *   <li>each enum,</li>" + NL + " *   <li>and each data type</li>" + NL + " * </ul>" + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_9 = NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_10 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_11 = NL + " * @see ";
  protected final String TEXT_12 = NL + " * @model ";
  protected final String TEXT_13 = NL + " *        ";
  protected final String TEXT_14 = NL + " * @model";
  protected final String TEXT_15 = NL + " * @generated" + NL + " */";
  protected final String TEXT_16 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model <b>Package</b>." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_17 = NL + " * ";
  protected final String TEXT_18 = NL + "@Deprecated";
  protected final String TEXT_19 = NL + "@SuppressWarnings(\"deprecation\")";
  protected final String TEXT_20 = NL + "public class ";
  protected final String TEXT_21 = " extends ";
  protected final String TEXT_22 = " implements ";
  protected final String TEXT_23 = NL + "public interface ";
  protected final String TEXT_24 = NL + "{";
  protected final String TEXT_25 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_26 = " copyright = ";
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * The package name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_28 = " eNAME = \"";
  protected final String TEXT_29 = "\";";
  protected final String TEXT_30 = NL + NL + "\t/**" + NL + "\t * The package namespace URI." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_31 = " eNS_URI = \"";
  protected final String TEXT_32 = NL + NL + "\t/**" + NL + "\t * The package namespace name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_33 = " eNS_PREFIX = \"";
  protected final String TEXT_34 = NL + NL + "\t/**" + NL + "\t * The package content type ID." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_35 = " eCONTENT_TYPE = \"";
  protected final String TEXT_36 = NL + NL + "\t/**" + NL + "\t * The singleton instance of the package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_37 = " eINSTANCE = ";
  protected final String TEXT_38 = ".init();" + NL;
  protected final String TEXT_39 = NL + "\t/**";
  protected final String TEXT_40 = NL + "\t * The meta object id for the '{@link ";
  protected final String TEXT_41 = " <em>";
  protected final String TEXT_42 = "</em>}' class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_43 = "</em>}' enum." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see ";
  protected final String TEXT_44 = NL + "\t * The meta object id for the '<em>";
  protected final String TEXT_45 = "</em>' data type." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_46 = NL + "\t * @see ";
  protected final String TEXT_47 = "#get";
  protected final String TEXT_48 = "()";
  protected final String TEXT_49 = NL + "\t * ";
  protected final String TEXT_50 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_51 = NL + "\t@Deprecated";
  protected final String TEXT_52 = NL + "\t";
  protected final String TEXT_53 = "int ";
  protected final String TEXT_54 = " = ";
  protected final String TEXT_55 = ";" + NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * The feature id for the '<em><b>";
  protected final String TEXT_57 = "</b></em>' ";
  protected final String TEXT_58 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_59 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * The number of structural features of the '<em>";
  protected final String TEXT_61 = "</em>' class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_62 = NL + "\t/**" + NL + "\t * The operation id for the '<em>";
  protected final String TEXT_63 = "</em>' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_64 = NL + "\t/**" + NL + "\t * The number of operations of the '<em>";
  protected final String TEXT_65 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected String packageFilename = \"";
  protected final String TEXT_66 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_67 = NL + "\tprivate ";
  protected final String TEXT_68 = " ";
  protected final String TEXT_69 = " = null;" + NL;
  protected final String TEXT_70 = NL + "\t/**" + NL + "\t * Creates an instance of the model <b>Package</b>, registered with" + NL + "\t * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package" + NL + "\t * package URI value." + NL + "\t * <p>Note: the correct way to create the package is via the static" + NL + "\t * factory method {@link #init init()}, which also performs" + NL + "\t * initialization of the package, or returns the registered package," + NL + "\t * if one already exists." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see org.eclipse.emf.ecore.EPackage.Registry" + NL + "\t * @see ";
  protected final String TEXT_71 = "#eNS_URI" + NL + "\t * @see #init()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_72 = "()" + NL + "\t{" + NL + "\t\tsuper(eNS_URI, ";
  protected final String TEXT_73 = ");" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static boolean isInited = false;" + NL + "" + NL + "\t/**" + NL + "\t * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends." + NL + "\t *" + NL + "\t * <p>This method is used to initialize {@link ";
  protected final String TEXT_74 = "#eINSTANCE} when that field is accessed." + NL + "\t * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #eNS_URI";
  protected final String TEXT_75 = NL + "\t * @see #createPackageContents()" + NL + "\t * @see #initializePackageContents()";
  protected final String TEXT_76 = NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_77 = " init()" + NL + "\t{" + NL + "\t\tif (isInited) return (";
  protected final String TEXT_78 = ")";
  protected final String TEXT_79 = ".Registry.INSTANCE.getEPackage(";
  protected final String TEXT_80 = ".eNS_URI);" + NL;
  protected final String TEXT_81 = NL + "\t\tinitializeRegistryHelpers();" + NL;
  protected final String TEXT_82 = NL + "\t\t// Obtain or create and register package" + NL + "\t\tObject registered";
  protected final String TEXT_83 = ".Registry.INSTANCE.get(eNS_URI);" + NL + "\t\t";
  protected final String TEXT_84 = " the";
  protected final String TEXT_85 = " = registered";
  protected final String TEXT_86 = " instanceof ";
  protected final String TEXT_87 = " ? (";
  protected final String TEXT_88 = ")registered";
  protected final String TEXT_89 = " : new ";
  protected final String TEXT_90 = "();" + NL + "" + NL + "\t\tisInited = true;" + NL;
  protected final String TEXT_91 = NL + "\t\t// Initialize simple dependencies";
  protected final String TEXT_92 = NL + "\t\t";
  protected final String TEXT_93 = ".eINSTANCE.eClass();";
  protected final String TEXT_94 = NL + "\t\t// Obtain or create and register interdependencies";
  protected final String TEXT_95 = "Object ";
  protected final String TEXT_96 = "registeredPackage = ";
  protected final String TEXT_97 = ".eNS_URI);" + NL + "\t\t";
  protected final String TEXT_98 = " = (";
  protected final String TEXT_99 = ")(registeredPackage instanceof ";
  protected final String TEXT_100 = " ? registeredPackage : ";
  protected final String TEXT_101 = ".eINSTANCE);";
  protected final String TEXT_102 = NL + "\t\t// Load packages";
  protected final String TEXT_103 = NL + "\t\tthe";
  protected final String TEXT_104 = ".loadPackage();";
  protected final String TEXT_105 = NL + "\t\t// Create package meta-data objects";
  protected final String TEXT_106 = ".createPackageContents();";
  protected final String TEXT_107 = NL + NL + "\t\t// Initialize created meta-data";
  protected final String TEXT_108 = ".initializePackageContents();";
  protected final String TEXT_109 = NL + "\t\t// Fix loaded packages";
  protected final String TEXT_110 = ".fixPackageContents();";
  protected final String TEXT_111 = NL + "\t\t// Register package validator" + NL + "\t\t";
  protected final String TEXT_112 = ".Registry.INSTANCE.put" + NL + "\t\t\t(the";
  protected final String TEXT_113 = "," + NL + "\t\t\t new ";
  protected final String TEXT_114 = ".Descriptor()" + NL + "\t\t\t {";
  protected final String TEXT_115 = NL + "\t\t\t\t @Override";
  protected final String TEXT_116 = NL + "\t\t\t\t public ";
  protected final String TEXT_117 = " getEValidator()" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t return ";
  protected final String TEXT_118 = ".INSTANCE;" + NL + "\t\t\t\t }" + NL + "\t\t\t });" + NL;
  protected final String TEXT_119 = NL + "\t\t// Mark meta-data to indicate it can't be changed" + NL + "\t\tthe";
  protected final String TEXT_120 = ".freeze();" + NL;
  protected final String TEXT_121 = NL + "\t\t// Update the registry and return the package" + NL + "\t\t";
  protected final String TEXT_122 = ".Registry.INSTANCE.put(";
  protected final String TEXT_123 = ".eNS_URI, the";
  protected final String TEXT_124 = ");" + NL + "\t\treturn the";
  protected final String TEXT_125 = ";" + NL + "\t}";
  protected final String TEXT_126 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static void initializeRegistryHelpers()" + NL + "\t{";
  protected final String TEXT_127 = ".register" + NL + "\t\t\t(";
  protected final String TEXT_128 = ".class," + NL + "\t\t\t new ";
  protected final String TEXT_129 = ".Helper()" + NL + "\t\t\t {" + NL + "\t\t\t\t public boolean isInstance(Object instance)" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t return instance instanceof ";
  protected final String TEXT_130 = ";" + NL + "\t\t\t\t }" + NL + "" + NL + "\t\t\t\t public Object newArrayInstance(int size)" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t return new ";
  protected final String TEXT_131 = "[size];" + NL + "\t\t\t\t }" + NL + "\t\t\t });";
  protected final String TEXT_132 = ";" + NL + "\t\t\t\t }" + NL + "" + NL + "\t\t\t\t public Object newArrayInstance(int size)" + NL + "\t\t\t\t {";
  protected final String TEXT_133 = NL + "\t\t\t\t\t return new ";
  protected final String TEXT_134 = "[size]";
  protected final String TEXT_135 = "[size];";
  protected final String TEXT_136 = NL + "\t\t\t\t }" + NL + "\t\t});";
  protected final String TEXT_137 = NL + "\t}" + NL + "" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class WhiteList implements ";
  protected final String TEXT_138 = ", EBasicWhiteList" + NL + "\t{";
  protected final String TEXT_139 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_140 = NL + "\t}";
  protected final String TEXT_141 = NL + "\t * Returns the meta object for class '{@link ";
  protected final String TEXT_142 = "</em>}'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for class '<em>";
  protected final String TEXT_143 = "</em>'." + NL + "\t * @see ";
  protected final String TEXT_144 = NL + "\t * @model ";
  protected final String TEXT_145 = NL + "\t *        ";
  protected final String TEXT_146 = NL + "\t * @model";
  protected final String TEXT_147 = NL + "\t * Returns the meta object for enum '{@link ";
  protected final String TEXT_148 = "</em>}'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for enum '<em>";
  protected final String TEXT_149 = NL + "\t * Returns the meta object for data type '<em>";
  protected final String TEXT_150 = "</em>'.";
  protected final String TEXT_151 = NL + "\t * Returns the meta object for data type '{@link ";
  protected final String TEXT_152 = "</em>}'.";
  protected final String TEXT_153 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_154 = NL + "     * <!-- begin-model-doc -->" + NL + "     * ";
  protected final String TEXT_155 = NL + "     * <!-- end-model-doc -->";
  protected final String TEXT_156 = NL + "\t * @return the meta object for data type '<em>";
  protected final String TEXT_157 = NL + "\t@Override";
  protected final String TEXT_158 = NL + "\tpublic ";
  protected final String TEXT_159 = " get";
  protected final String TEXT_160 = "()" + NL + "\t{";
  protected final String TEXT_161 = NL + "\t\tif (";
  protected final String TEXT_162 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_163 = ".eNS_URI).getEClassifiers().get(";
  protected final String TEXT_164 = ");" + NL + "\t\t}";
  protected final String TEXT_165 = NL + "\t\treturn ";
  protected final String TEXT_166 = ";" + NL + "\t}" + NL;
  protected final String TEXT_167 = "();" + NL;
  protected final String TEXT_168 = NL + "\t/**" + NL + "\t * Returns the meta object for the ";
  protected final String TEXT_169 = " '{@link ";
  protected final String TEXT_170 = "#";
  protected final String TEXT_171 = "</em>}'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for the ";
  protected final String TEXT_172 = " '<em>";
  protected final String TEXT_173 = NL + "\t * @see #get";
  protected final String TEXT_174 = NL + "\t\treturn (";
  protected final String TEXT_175 = ".getEStructuralFeatures().get(";
  protected final String TEXT_176 = ");";
  protected final String TEXT_177 = NL + "        return (";
  protected final String TEXT_178 = ")get";
  protected final String TEXT_179 = "().getEStructuralFeatures().get(";
  protected final String TEXT_180 = "();";
  protected final String TEXT_181 = NL + "\t/**" + NL + "\t * Returns the meta object for the '{@link ";
  protected final String TEXT_182 = "(";
  protected final String TEXT_183 = ") <em>";
  protected final String TEXT_184 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the meta object for the '<em>";
  protected final String TEXT_185 = "</em>' operation." + NL + "\t * @see ";
  protected final String TEXT_186 = ".getEOperations().get(";
  protected final String TEXT_187 = NL + "        return get";
  protected final String TEXT_188 = "().getEOperations().get(";
  protected final String TEXT_189 = NL + "\t/**" + NL + "\t * Returns the factory that creates the instances of the model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the factory that creates the instances of the model." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_190 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_191 = "()" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_192 = ")getEFactoryInstance();" + NL + "\t}";
  protected final String TEXT_193 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isCreated = false;" + NL + "" + NL + "\t/**" + NL + "\t * Creates the meta-model objects for the package.  This method is" + NL + "\t * guarded to have no affect on any invocation but its first." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_194 = NL + "\t@SuppressWarnings(\"deprecation\")";
  protected final String TEXT_195 = NL + "\tpublic void createPackageContents()" + NL + "\t{" + NL + "\t\tif (isCreated) return;" + NL + "\t\tisCreated = true;";
  protected final String TEXT_196 = NL + NL + "\t\t// Create classes and their features";
  protected final String TEXT_197 = " = create";
  protected final String TEXT_198 = NL + "\t\tcreate";
  protected final String TEXT_199 = ", ";
  protected final String TEXT_200 = NL + "\t\tcreateEOperation(";
  protected final String TEXT_201 = NL + NL + "\t\t// Create enums";
  protected final String TEXT_202 = " = createEEnum(";
  protected final String TEXT_203 = NL + NL + "\t\t// Create data types";
  protected final String TEXT_204 = " = createEDataType(";
  protected final String TEXT_205 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isInitialized = false;" + NL;
  protected final String TEXT_206 = NL + "\t/**" + NL + "\t * Complete the initialization of the package and its meta-model.  This" + NL + "\t * method is guarded to have no affect on any invocation but its first." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_207 = NL + "\tpublic void initializePackageContents()" + NL + "\t{" + NL + "\t\tif (isInitialized) return;" + NL + "\t\tisInitialized = true;" + NL + "" + NL + "\t\t// Initialize package" + NL + "\t\tsetName(eNAME);" + NL + "\t\tsetNsPrefix(eNS_PREFIX);" + NL + "\t\tsetNsURI(eNS_URI);";
  protected final String TEXT_208 = NL + NL + "\t\t// Obtain other dependent packages";
  protected final String TEXT_209 = ".eNS_URI);";
  protected final String TEXT_210 = NL + NL + "\t\t// Add subpackages";
  protected final String TEXT_211 = NL + "\t\tgetESubpackages().add(";
  protected final String TEXT_212 = NL + NL + "\t\t// Create type parameters";
  protected final String TEXT_213 = "_";
  protected final String TEXT_214 = " = addETypeParameter(";
  protected final String TEXT_215 = ", \"";
  protected final String TEXT_216 = "\");";
  protected final String TEXT_217 = NL + "\t\taddETypeParameter(";
  protected final String TEXT_218 = NL + NL + "\t\t// Set bounds for type parameters";
  protected final String TEXT_219 = "g";
  protected final String TEXT_220 = " = createEGenericType(";
  protected final String TEXT_221 = NL + "\t\tg";
  protected final String TEXT_222 = ".";
  protected final String TEXT_223 = "(g";
  protected final String TEXT_224 = ".getEBounds().add(g1);";
  protected final String TEXT_225 = NL + NL + "\t\t// Add supertypes to classes";
  protected final String TEXT_226 = ".getESuperTypes().add(";
  protected final String TEXT_227 = ".get";
  protected final String TEXT_228 = "());";
  protected final String TEXT_229 = ".getEGenericSuperTypes().add(g1);";
  protected final String TEXT_230 = NL + NL + "\t\t// Initialize classes";
  protected final String TEXT_231 = ", features, and operations; add parameters";
  protected final String TEXT_232 = " and features; add operations and parameters";
  protected final String TEXT_233 = NL + "\t\tinitEClass(";
  protected final String TEXT_234 = "null";
  protected final String TEXT_235 = ".class";
  protected final String TEXT_236 = "\", ";
  protected final String TEXT_237 = "\"";
  protected final String TEXT_238 = NL + "\t\tinitEReference(get";
  protected final String TEXT_239 = "(), ";
  protected final String TEXT_240 = "g1";
  protected final String TEXT_241 = NL + "\t\tget";
  protected final String TEXT_242 = "().getEKeys().add(";
  protected final String TEXT_243 = NL + "\t\tinitEAttribute(get";
  protected final String TEXT_244 = "initEOperation(get";
  protected final String TEXT_245 = "addEOperation(";
  protected final String TEXT_246 = "(), \"";
  protected final String TEXT_247 = ", null, \"";
  protected final String TEXT_248 = "addETypeParameter(op, \"";
  protected final String TEXT_249 = NL + "\t\tt";
  protected final String TEXT_250 = NL + "\t\taddEParameter(op, ";
  protected final String TEXT_251 = NL + "\t\taddEException(op, g";
  protected final String TEXT_252 = NL + "\t\taddEException(op, ";
  protected final String TEXT_253 = NL + "\t\tinitEOperation(op, g1);";
  protected final String TEXT_254 = NL + NL + "\t\t// Initialize enums and add enum literals";
  protected final String TEXT_255 = NL + "\t\tinitEEnum(";
  protected final String TEXT_256 = ".class, \"";
  protected final String TEXT_257 = NL + "\t\taddEEnumLiteral(";
  protected final String TEXT_258 = NL + NL + "\t\t// Initialize data types";
  protected final String TEXT_259 = NL + "\t\tinitEDataType(";
  protected final String TEXT_260 = NL + NL + "\t\t// Create resource" + NL + "\t\tcreateResource(";
  protected final String TEXT_261 = NL + NL + "\t\t// Create annotations";
  protected final String TEXT_262 = NL + "\t\t// ";
  protected final String TEXT_263 = "Annotations();";
  protected final String TEXT_264 = NL + "\t}" + NL;
  protected final String TEXT_265 = NL + "\t/**" + NL + "\t * Initializes the annotations for <b>";
  protected final String TEXT_266 = "</b>." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void create";
  protected final String TEXT_267 = "Annotations()" + NL + "\t{" + NL + "\t\tString source = ";
  protected final String TEXT_268 = "null;";
  protected final String TEXT_269 = NL + "\t\taddAnnotation" + NL + "\t\t  (";
  protected final String TEXT_270 = "," + NL + "\t\t   source," + NL + "\t\t   new String[]" + NL + "\t\t   {";
  protected final String TEXT_271 = NL + "\t\t\t   ";
  protected final String TEXT_272 = NL + "\t\t   }";
  protected final String TEXT_273 = ",";
  protected final String TEXT_274 = NL + "\t\t   new ";
  protected final String TEXT_275 = "[]" + NL + "\t\t   {";
  protected final String TEXT_276 = NL + "\t\t\t ";
  protected final String TEXT_277 = ".createURI(";
  protected final String TEXT_278 = "eNS_URI).appendFragment(\"";
  protected final String TEXT_279 = "\")";
  protected final String TEXT_280 = NL + "\t\t   });";
  protected final String TEXT_281 = "," + NL + "\t\t   ";
  protected final String TEXT_282 = "new boolean[] { ";
  protected final String TEXT_283 = " }";
  protected final String TEXT_284 = "null,";
  protected final String TEXT_285 = "\",";
  protected final String TEXT_286 = NL + "\t\t   new String[]" + NL + "\t\t   {";
  protected final String TEXT_287 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isLoaded = false;" + NL + "" + NL + "\t/**" + NL + "\t * Laods the package and any sub-packages from their serialized form." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void loadPackage()" + NL + "\t{" + NL + "\t\tif (isLoaded) return;" + NL + "\t\tisLoaded = true;" + NL + "" + NL + "\t\t";
  protected final String TEXT_288 = " url = getClass().getResource(packageFilename);" + NL + "\t\tif (url == null)" + NL + "\t\t{" + NL + "\t\t\tthrow new RuntimeException(\"Missing serialized package: \" + packageFilename);";
  protected final String TEXT_289 = NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_290 = " uri = ";
  protected final String TEXT_291 = ".createURI(url.toString());" + NL + "\t\t";
  protected final String TEXT_292 = " resource = new ";
  protected final String TEXT_293 = "().createResource(uri);" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\tresource.load(null);" + NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_294 = " exception)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_295 = "(exception);" + NL + "\t\t}" + NL + "\t\tinitializeFromLoadedEPackage(this, (";
  protected final String TEXT_296 = ")resource.getContents().get(0));" + NL + "\t\tcreateResource(eNS_URI);" + NL + "\t}" + NL;
  protected final String TEXT_297 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean isFixed = false;" + NL + "" + NL + "\t/**" + NL + "\t * Fixes up the loaded package, to make it appear as if it had been programmatically built." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void fixPackageContents()" + NL + "\t{" + NL + "\t\tif (isFixed) return;" + NL + "\t\tisFixed = true;" + NL + "\t\tfixEClassifiers();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Sets the instance class on the given classifier." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_298 = NL + "\tprotected void fixInstanceClass(";
  protected final String TEXT_299 = " eClassifier)" + NL + "\t{" + NL + "\t\tif (eClassifier.getInstanceClassName() == null)" + NL + "\t\t{";
  protected final String TEXT_300 = NL + "\t\t\teClassifier.setInstanceClassName(\"";
  protected final String TEXT_301 = ".\" + eClassifier.getName());";
  protected final String TEXT_302 = NL + "\t\t\tsetGeneratedClassName(eClassifier);";
  protected final String TEXT_303 = NL + "\t\t\tswitch (eClassifier.getClassifierID())" + NL + "\t\t\t{";
  protected final String TEXT_304 = NL + "\t\t\t\tcase ";
  protected final String TEXT_305 = ":";
  protected final String TEXT_306 = NL + "\t\t\t\t{" + NL + "\t\t\t\t\tbreak;" + NL + "\t\t\t\t}" + NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\teClassifier.setInstanceClassName(\"";
  protected final String TEXT_307 = NL + "\t\t\t\t\tsetGeneratedClassName(eClassifier);" + NL + "\t\t\t\t\tbreak;" + NL + "\t\t\t\t}" + NL + "\t\t\t}";
  protected final String TEXT_308 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_309 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_310 = " addEOperation(";
  protected final String TEXT_311 = " owner, ";
  protected final String TEXT_312 = " type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_313 = " o = addEOperation(owner, type, name, lowerBound, upperBound);" + NL + "\t\to.setUnique(isUnique);" + NL + "\t\to.setOrdered(isOrdered);" + NL + "\t\treturn o;" + NL + "\t}" + NL;
  protected final String TEXT_314 = " addEParameter(";
  protected final String TEXT_315 = " p = ecoreFactory.createEParameter();" + NL + "\t\tp.setEType(type);" + NL + "\t\tp.setName(name);" + NL + "\t\tp.setLowerBound(lowerBound);" + NL + "\t\tp.setUpperBound(upperBound);" + NL + "\t\tp.setUnique(isUnique);" + NL + "\t\tp.setOrdered(isOrdered);" + NL + "\t\towner.getEParameters().add(p);" + NL + "\t\treturn p;" + NL + "\t}" + NL;
  protected final String TEXT_316 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * Defines literals for the meta objects that represent" + NL + "\t * <ul>" + NL + "\t *   <li>each class,</li>" + NL + "\t *   <li>each feature of each class,</li>";
  protected final String TEXT_317 = NL + "\t *   <li>each operation of each class,</li>";
  protected final String TEXT_318 = NL + "\t *   <li>each enum,</li>" + NL + "\t *   <li>and each data type</li>" + NL + "\t * </ul>" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_319 = "public ";
  protected final String TEXT_320 = "interface Literals" + NL + "\t{";
  protected final String TEXT_321 = NL + "\t\t/**";
  protected final String TEXT_322 = NL + "\t\t * The meta object literal for the '{@link ";
  protected final String TEXT_323 = "</em>}' class." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @see ";
  protected final String TEXT_324 = "</em>}' enum." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @see ";
  protected final String TEXT_325 = NL + "\t\t * The meta object literal for the '<em>";
  protected final String TEXT_326 = "</em>' data type." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->";
  protected final String TEXT_327 = NL + "\t\t * @see ";
  protected final String TEXT_328 = NL + "\t\t * ";
  protected final String TEXT_329 = NL + "\t\t * @generated" + NL + "\t\t */";
  protected final String TEXT_330 = NL + "\t\t@Deprecated";
  protected final String TEXT_331 = " = eINSTANCE.get";
  protected final String TEXT_332 = NL + "\t\t/**" + NL + "\t\t * The meta object literal for the '<em><b>";
  protected final String TEXT_333 = " feature." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->";
  protected final String TEXT_334 = "</b></em>' operation." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->";
  protected final String TEXT_335 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    final GenPackage genPackage = (GenPackage)((Object[])argument)[0]; final GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);  boolean useInterfaceOverrideAnnotation = genModel.useInterfaceOverrideAnnotation() && !(isInterface && isImplementation);
    boolean packageNeedsSuppressDeprecation = isJDK50 && GenModelUtil.hasAPIDeprecatedTag(genPackage.getOrderedGenClassifiers()) && !genPackage.hasAPIDeprecatedTag() && !genModel.isSuppressEMFMetaData();
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    boolean needsAddEOperation = false;
    boolean needsAddEParameter = false;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    if (isImplementation && !genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getReflectionPackageName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) {
    genModel.addPseudoImport("org.eclipse.emf.ecore.EPackage.Registry");
    genModel.addPseudoImport("org.eclipse.emf.ecore.EPackage.Descriptor");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.EPackageImpl.EBasicWhiteList");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
    if (genPackage.isLiteralsInterface()) {
    genModel.addPseudoImport(genPackage.getQualifiedPackageInterfaceName() + ".Literals");
    }
    for (GenClassifier genClassifier : genPackage.getOrderedGenClassifiers()) genModel.addPseudoImport(genPackage.getQualifiedPackageInterfaceName() + "." + genPackage.getClassifierID(genClassifier));
    }
    if (isInterface) {
    stringBuffer.append(TEXT_6);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    if (genPackage.hasDocumentation()) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genPackage.getQualifiedFactoryInterfaceName());
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genPackage.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_12);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_14);
    }}
    stringBuffer.append(TEXT_15);
    } else {
    stringBuffer.append(TEXT_16);
    if (genPackage.hasAPITags()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_15);
    }
    if (isJDK50 && genPackage.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_18);
    }
    if (isImplementation) {
    if (packageNeedsSuppressDeprecation) {
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.EPackageImpl"));
    if (!isInterface){
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    }
    } else {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    }
    stringBuffer.append(TEXT_24);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_5);
    }
    if (isInterface) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genPackage.getNSURI());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genPackage.getNSName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    if (genPackage.isContentType()) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genPackage.getContentTypeIdentifier());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_36);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genPackage.getQualifiedPackageClassName());
    stringBuffer.append(TEXT_38);
    for (GenClassifier genClassifier : genPackage.getOrderedGenClassifiers()) {
    stringBuffer.append(TEXT_39);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    if (!genClass.isInterface()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.getQualifiedClassName());
    } else {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    }
    } else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genEnum.getQualifiedName());
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_45);
    if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    }
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genPackage.getQualifiedPackageClassName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    if (genClassifier.hasAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClassifier.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_50);
    if (isJDK50 && genClassifier.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genPackage.getClassifierID(genClassifier));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genPackage.getClassifierValue(genClassifier));
    stringBuffer.append(TEXT_55);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    for (GenFeature genFeature : genClass.getAllGenFeatures()) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_58);
    if (genFeature.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_59);
    if (isJDK50 && genFeature.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getFeatureID(genFeature));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getFeatureValue(genFeature));
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_61);
    if (genClass.hasAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_59);
    if (isJDK50 && genClass.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getFeatureCountID());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getFeatureCountValue());
    stringBuffer.append(TEXT_55);
    if (genModel.isOperationReflection()) {
    for (GenOperation genOperation : genClass.getAllGenOperations(false)) {
    if (genClass.getOverrideGenOperation(genOperation) == null) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_63);
    if (genOperation.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genOperation.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_59);
    if (isJDK50 && genOperation.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getOperationID(genOperation, false));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getOperationValue(genOperation));
    stringBuffer.append(TEXT_55);
    }
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_61);
    if (genClass.hasAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_59);
    if (isJDK50 && genClass.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getOperationCountID());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getOperationCountValue());
    stringBuffer.append(TEXT_55);
    }
    }
    }
    }
    if (isImplementation) {
    if (genPackage.isLoadingInitialization()) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genPackage.getSerializedPackageFilename());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_5);
    }
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_66);
    if (genClassifier.hasAPITags(true)) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClassifier.getAPITags(genModel.getIndentation(stringBuffer), true));
    }
    stringBuffer.append(TEXT_50);
    if (isJDK50 && genClassifier.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_69);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genPackage.getQualifiedEFactoryInstanceAccessor());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_74);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_75);
    }
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_80);
    if (genModel.getRuntimePlatform() == GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_81);
    }
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genPackage.getPackageClassName());
    stringBuffer.append(TEXT_90);
    if (!genPackage.getPackageSimpleDependencies().isEmpty()) {
    stringBuffer.append(TEXT_91);
    for (GenPackage dep : genPackage.getPackageSimpleDependencies()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_5);
    }
    if (!genPackage.getPackageInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_94);
    for (ListIterator<GenPackage> i = genPackage.getPackageInterDependencies().listIterator(); i.hasNext(); ) { GenPackage interdep = i.next(); 
    stringBuffer.append(TEXT_92);
    if (i.previousIndex() == 0) {
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(interdep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(interdep.getImportedPackageClassName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(interdep.getImportedPackageClassName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(interdep.getImportedPackageClassName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(interdep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_5);
    }
    if (genPackage.isLoadedInitialization() || !genPackage.getPackageLoadInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_102);
    if (genPackage.isLoadingInitialization()) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_104);
    }
    for (GenPackage interdep : genPackage.getPackageLoadInterDependencies()) {
    if (interdep.isLoadingInitialization()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_104);
    }
    }
    stringBuffer.append(TEXT_5);
    }
    if (!genPackage.isLoadedInitialization() || !genPackage.getPackageBuildInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_105);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_106);
    }
    for (GenPackage interdep : genPackage.getPackageBuildInterDependencies()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_106);
    }
    stringBuffer.append(TEXT_107);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_108);
    }
    for (GenPackage interdep : genPackage.getPackageBuildInterDependencies()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_108);
    }
    stringBuffer.append(TEXT_5);
    }
    if (genPackage.isLoadedInitialization() || !genPackage.getPackageLoadInterDependencies().isEmpty()) {
    stringBuffer.append(TEXT_109);
    if (genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_110);
    }
    for (GenPackage interdep : genPackage.getPackageLoadInterDependencies()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genPackage.getPackageInstanceVariable(interdep));
    stringBuffer.append(TEXT_110);
    }
    stringBuffer.append(TEXT_5);
    }
    if (genPackage.hasConstraints()) {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EValidator"));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EValidator"));
    stringBuffer.append(TEXT_114);
    if (genModel.useInterfaceOverrideAnnotation()) {
    stringBuffer.append(TEXT_115);
    }
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EValidator"));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genPackage.getImportedValidatorClassName());
    stringBuffer.append(TEXT_118);
    }
    if (!genPackage.isEcorePackage()) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_125);
    if (genModel.getRuntimePlatform() == GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_126);
    Set<String> helpers = new HashSet<String>(); for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    if (!genClass.isDynamic()) { String theClass = genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getRawImportedInterfaceName(); if (helpers.add(theClass)) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getRawImportedInterfaceName() + genClass.getInterfaceWildTypeArguments());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_131);
    }}
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    if (!genDataType.isPrimitiveType() && !genDataType.isObjectType()) { String theClass = genDataType.getRawImportedInstanceClassName(); if (helpers.add(theClass)) { 
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Reflect"));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_132);
    if (genDataType.isArrayType()) { String componentType = theClass; String indices = ""; while(componentType.endsWith("[]")) { componentType = componentType.substring(0, componentType.length() - 2); indices += "[]";}
    stringBuffer.append(TEXT_133);
    stringBuffer.append(componentType);
    stringBuffer.append(TEXT_134);
    stringBuffer.append(indices);
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(theClass);
    stringBuffer.append(TEXT_135);
    }
    stringBuffer.append(TEXT_136);
    }}
    }
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.IsSerializable"));
    stringBuffer.append(TEXT_138);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    if (!genClass.isDynamic()) {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getImportedWildcardInstanceClassName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_55);
    }
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    if (!genDataType.isObjectType() && genDataType.isSerializable()) {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genDataType.getImportedWildcardInstanceClassName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genDataType.getSafeUncapName());
    stringBuffer.append(TEXT_55);
    }
    }
    }
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_5);
    }
    if (isInterface) { // TODO REMOVE THIS BOGUS EMPTY LINE
    stringBuffer.append(TEXT_5);
    }
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    if (isInterface) {
    stringBuffer.append(TEXT_39);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    if (!genModel.isSuppressEMFModelTags() && (genClass.isExternalInterface() || genClass.isDynamic())) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_144);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_146);
    }}
    } else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genEnum.getQualifiedName());
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    if (genDataType.isPrimitiveType() || genDataType.isArrayType()) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_153);
    if (genDataType.hasDocumentation()) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genDataType.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_155);
    }
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_150);
    if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    }
    if (!genModel.isSuppressEMFModelTags()) {boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genDataType.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_144);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_146);
    }}
    }
    if ((genClassifier instanceof GenClass || genClassifier instanceof GenEnum) && genClassifier.hasAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClassifier.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_50);
    } else {
    stringBuffer.append(TEXT_66);
    if (genClassifier.hasAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClassifier.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_50);
    }
    if (isJDK50 && genClassifier.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    if (isImplementation) {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_160);
    if (genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genPackage.getLocalClassifierIndex(genClassifier));
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_166);
    } else {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_167);
    }
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (isInterface) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    if (!genClass.isMapEntry() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    if (!genClass.isMapEntry() && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    if (genFeature.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_50);
    } else {
    stringBuffer.append(TEXT_66);
    if (genFeature.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_50);
    }
    if (isJDK50 && genFeature.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    if (isImplementation) {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_160);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genClass.getLocalFeatureIndex(genFeature));
    stringBuffer.append(TEXT_176);
    } else {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genClass.getLocalFeatureIndex(genFeature));
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_140);
    } else {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_5);
    }
    if (genModel.isOperationReflection()) {
    for (GenOperation genOperation : genClass.getGenOperations()) {
    if (isInterface) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_78);
    if (genOperation.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genOperation.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_50);
    } else {
    stringBuffer.append(TEXT_66);
    if (genOperation.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genOperation.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_50);
    }
    if (isJDK50 && genOperation.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_51);
    }
    if (isImplementation) {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genOperation.getImportedMetaType());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_160);
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genClass.getLocalOperationIndex(genOperation));
    stringBuffer.append(TEXT_176);
    } else {
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genClass.getLocalOperationIndex(genOperation));
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_140);
    } else {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genOperation.getImportedMetaType());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_5);
    }
    }
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_189);
    } else {
    stringBuffer.append(TEXT_190);
    }
    if (isImplementation) {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_192);
    } else {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_5);
    if (isImplementation) {
    if (!genPackage.isLoadedInitialization()) {
    stringBuffer.append(TEXT_193);
    {boolean needsSuppressDeprecation = false; if (!packageNeedsSuppressDeprecation && isJDK50 && !genModel.isSuppressEMFMetaData()) { LOOP: for (GenClass genClass : genPackage.getGenClasses()) { for (GenFeature genFeature : genClass.getGenFeatures()) { if (genFeature.hasAPIDeprecatedTag()) { needsSuppressDeprecation = true; break LOOP; }}
      for (GenOperation genOperation : genClass.getGenOperations()) { if (genOperation.hasAPIDeprecatedTag()) { needsSuppressDeprecation = true; break LOOP; }}} if (needsSuppressDeprecation) {
    stringBuffer.append(TEXT_194);
    }}}
    stringBuffer.append(TEXT_195);
    if (!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_196);
    for (Iterator<GenClass> c=genPackage.getGenClasses().iterator(); c.hasNext();) { GenClass genClass = c.next();
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genClass.getMetaType());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genClass.getClassifierID());
    stringBuffer.append(TEXT_176);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genFeature.getMetaType());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genClass.getFeatureID(genFeature));
    stringBuffer.append(TEXT_176);
    }
    if (genModel.isOperationReflection()) {
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genClass.getOperationID(genOperation, false));
    stringBuffer.append(TEXT_176);
    }
    }
    if (c.hasNext()) {
    stringBuffer.append(TEXT_5);
    }
    }
    }
    if (!genPackage.getGenEnums().isEmpty()) {
    stringBuffer.append(TEXT_201);
    for (GenEnum genEnum : genPackage.getGenEnums()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genEnum.getClassifierInstanceName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genEnum.getClassifierID());
    stringBuffer.append(TEXT_176);
    }
    }
    if (!genPackage.getGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_203);
    for (GenDataType genDataType : genPackage.getGenDataTypes()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genDataType.getClassifierInstanceName());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_176);
    }
    }
    stringBuffer.append(TEXT_205);
    
///////////////////////
class Information
{
  @SuppressWarnings("unused")
  EGenericType eGenericType;
  int depth;
  String type;
  String accessor;
}

class InformationIterator
{
  Iterator<Object> iterator;
  InformationIterator(EGenericType eGenericType)
  {
    iterator = EcoreUtil.getAllContents(Collections.singleton(eGenericType));
  }

  boolean hasNext()
  {
    return iterator.hasNext();
  }

  Information next()
  {
    Information information = new Information();
    EGenericType eGenericType = information.eGenericType = (EGenericType)iterator.next();
    for (EObject container = eGenericType.eContainer(); container instanceof EGenericType; container = container.eContainer())
    {
      ++information.depth;
    }
    if (eGenericType.getEClassifier() != null )
    {
      GenClassifier genClassifier = genModel.findGenClassifier(eGenericType.getEClassifier());
      information.type = genPackage.getPackageInstanceVariable(genClassifier.getGenPackage()) + ".get" + genClassifier.getClassifierAccessorName() + "()";
    }
    else if (eGenericType.getETypeParameter() != null)
    {
      ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
      if (eTypeParameter.eContainer() instanceof EClass)
      {
        information.type = genModel.findGenClassifier((EClass)eTypeParameter.eContainer()).getClassifierInstanceName() + "_" + eGenericType.getETypeParameter().getName();
      }
      else
      {
        information.type = "t" + (((EOperation)eTypeParameter.eContainer()).getETypeParameters().indexOf(eTypeParameter) + 1);
      }
    }
    else
    {
      information.type ="";
    }
    if (information.depth > 0)
    {
      if (eGenericType.eContainmentFeature().isMany())
      {
        information.accessor = "getE" + eGenericType.eContainmentFeature().getName().substring(1) + "().add";
      }
      else
      {
        information.accessor = "setE" + eGenericType.eContainmentFeature().getName().substring(1);
      }
    }
    return information;
  }
}
///////////////////////
int maxGenericTypeAssignment = 0;

    stringBuffer.append(TEXT_206);
    {boolean needsSuppressDeprecation = false; if (!packageNeedsSuppressDeprecation && isJDK50) { LOOP: for (GenEnum genEnum : genPackage.getGenEnums()) { for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) { if (genEnumLiteral.hasAPIDeprecatedTag()) { needsSuppressDeprecation = true; break LOOP; }}} if (needsSuppressDeprecation) {
    stringBuffer.append(TEXT_194);
    }}}
    stringBuffer.append(TEXT_207);
    if (!genPackage.getPackageInitializationDependencies().isEmpty()) {
    stringBuffer.append(TEXT_208);
    for (GenPackage dep : genPackage.getPackageInitializationDependencies()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genPackage.getPackageInstanceVariable(dep));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(dep.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_209);
    }
    }
    if (!genPackage.getSubGenPackages().isEmpty()) {
    stringBuffer.append(TEXT_210);
    for (GenPackage sub : genPackage.getSubGenPackages()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genPackage.getPackageInstanceVariable(sub));
    stringBuffer.append(TEXT_176);
    }
    }
    if (!genPackage.getGenClasses().isEmpty()) { boolean firstOperationAssignment = true; int maxTypeParameterAssignment = 0;
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_212);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    for (GenTypeParameter genTypeParameter : genClassifier.getGenTypeParameters()) {
    if (!genTypeParameter.getEcoreTypeParameter().getEBounds().isEmpty() || genTypeParameter.isUsed()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.ETypeParameter"));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    }
    }
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_218);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    for (GenTypeParameter genTypeParameter : genClassifier.getGenTypeParameters()) {
    for (EGenericType bound : genTypeParameter.getEcoreTypeParameter().getEBounds()) {
    for (InformationIterator i=new InformationIterator(bound); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_176);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genClassifier.getClassifierInstanceName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_224);
    }
    }
    }
    }
    stringBuffer.append(TEXT_225);
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.hasGenericSuperTypes()) {
    for (GenClass baseGenClass : genClass.getBaseGenClasses()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genPackage.getPackageInstanceVariable(baseGenClass.getGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(baseGenClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_228);
    }
    } else {
    for (EGenericType superType : genClass.getEcoreClass().getEGenericSuperTypes()) {
    for (InformationIterator i=new InformationIterator(superType); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_176);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_229);
    }
    }
    }
    stringBuffer.append(TEXT_230);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_231);
    } else {
    stringBuffer.append(TEXT_232);
    }
    for (Iterator<GenClass> c=genPackage.getGenClasses().iterator(); c.hasNext();) { GenClass genClass = c.next(); boolean hasInstanceTypeName = genModel.useGenerics() && genClass.getEcoreClass().getInstanceTypeName() != null && genClass.getEcoreClass().getInstanceTypeName().contains("<");
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genClass.getClassifierInstanceName());
    stringBuffer.append(TEXT_199);
    if (genClass.isDynamic()) {
    stringBuffer.append(TEXT_234);
    } else {
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_235);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genClass.getAbstractFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genClass.getInterfaceFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genClass.getGeneratedInstanceClassFlag());
    if (hasInstanceTypeName) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genClass.getEcoreClass().getInstanceTypeName());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    if (hasInstanceTypeName) {
    stringBuffer.append(genModel.getNonNLS(2));
    }
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (genFeature.hasGenericType()) {
    for (InformationIterator i=new InformationIterator(genFeature.getEcoreFeature().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_176);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    }
    }
    if (genFeature.isReferenceType()) { GenFeature reverseGenFeature = genFeature.getReverse();
    String reverse = reverseGenFeature == null ? "null" : genPackage.getPackageInstanceVariable(reverseGenFeature.getGenPackage()) + ".get" + reverseGenFeature.getFeatureAccessorName() + "()";
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_239);
    if (genFeature.hasGenericType()) {
    stringBuffer.append(TEXT_240);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_199);
    stringBuffer.append(reverse);
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getUpperBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getContainerClass());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getTransientFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getVolatileFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getChangeableFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getContainmentFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getResolveProxiesFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getUnsettableFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getUniqueFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getDerivedFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getOrderedFlag());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(genFeature.getDefaultValue(), 2));
    for (GenFeature keyFeature : genFeature.getKeys()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genPackage.getPackageInstanceVariable(keyFeature.getGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(keyFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_228);
    }
    } else {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_239);
    if (genFeature.hasGenericType()) {
    stringBuffer.append(TEXT_240);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getUpperBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getContainerClass());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getTransientFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getVolatileFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getChangeableFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getUnsettableFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getIDFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getUniqueFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getDerivedFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getOrderedFlag());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(genFeature.getDefaultValue(), 2));
    }
    }
    for (GenOperation genOperation : genClass.getGenOperations()) {String prefix = ""; if (genOperation.hasGenericType() || !genOperation.getGenParameters().isEmpty() || !genOperation.getGenExceptions().isEmpty() || !genOperation.getGenTypeParameters().isEmpty()) { if (firstOperationAssignment) { firstOperationAssignment = false; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EOperation") + " op = "; } else { prefix = "op = "; }} 
    stringBuffer.append(TEXT_5);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_48);
    } else {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_199);
    if (genOperation.isVoid() || genOperation.hasGenericType()) {
    stringBuffer.append(TEXT_234);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genOperation.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genOperation.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genOperation.getUpperBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genOperation.getUniqueFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genOperation.getOrderedFlag());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    } else if (!genOperation.isVoid()) {
    if (!genOperation.getEcoreOperation().isOrdered() || !genOperation.getEcoreOperation().isUnique()) { needsAddEOperation = true;
    stringBuffer.append(TEXT_92);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_48);
    } else {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genOperation.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genOperation.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genOperation.getUpperBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genOperation.getUniqueFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genOperation.getOrderedFlag());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_48);
    } else {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genOperation.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genOperation.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genOperation.getUpperBound());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(prefix);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_48);
    } else {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genClass.getClassifierInstanceName());
    }
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genModel.useGenerics()) {
    for (ListIterator<GenTypeParameter> t=genOperation.getGenTypeParameters().listIterator(); t.hasNext(); ) { GenTypeParameter genTypeParameter = t.next(); String typeParameterVariable = ""; if (!genTypeParameter.getEcoreTypeParameter().getEBounds().isEmpty() || genTypeParameter.isUsed()) { if (maxTypeParameterAssignment <= t.previousIndex()) { ++maxTypeParameterAssignment; typeParameterVariable = genModel.getImportedName("org.eclipse.emf.ecore.ETypeParameter") + " t" + t.nextIndex() + " = "; } else { typeParameterVariable = "t" + t.nextIndex() + " = "; }} 
    stringBuffer.append(TEXT_92);
    stringBuffer.append(typeParameterVariable);
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genTypeParameter.getName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getNonNLS());
    for (EGenericType typeParameter : genTypeParameter.getEcoreTypeParameter().getEBounds()) {
    for (InformationIterator i=new InformationIterator(typeParameter); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_176);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    }
    stringBuffer.append(TEXT_249);
    stringBuffer.append(t.nextIndex());
    stringBuffer.append(TEXT_224);
    }
    }
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasGenericType()) {
    for (InformationIterator i=new InformationIterator(genParameter.getEcoreParameter().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_176);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    }
    }
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_250);
    if (genParameter.hasGenericType()){
    stringBuffer.append(TEXT_240);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genParameter.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genParameter.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genParameter.getUpperBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genParameter.getUniqueFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genParameter.getOrderedFlag());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    } else if (!genParameter.getEcoreParameter().isOrdered() || !genParameter.getEcoreParameter().isUnique()) { needsAddEParameter = true;
    stringBuffer.append(TEXT_250);
    if (genParameter.hasGenericType()){
    stringBuffer.append(TEXT_240);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genParameter.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genParameter.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genParameter.getUpperBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genParameter.getUniqueFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genParameter.getOrderedFlag());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_250);
    if (genParameter.hasGenericType()){
    stringBuffer.append(TEXT_240);
    } else {
    stringBuffer.append(genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genParameter.getTypeClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genParameter.getLowerBound());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genParameter.getUpperBound());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.hasGenericExceptions()) {
    for (EGenericType genericExceptions : genOperation.getEcoreOperation().getEGenericExceptions()) {
    for (InformationIterator i=new InformationIterator(genericExceptions); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_176);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_251);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    }
    } else {
    for (GenClassifier genException : genOperation.getGenExceptions()) {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genPackage.getPackageInstanceVariable(genException.getGenPackage()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genException.getClassifierAccessorName());
    stringBuffer.append(TEXT_228);
    }
    }
    if (!genOperation.isVoid() && genOperation.hasGenericType()) {
    for (InformationIterator i=new InformationIterator(genOperation.getEcoreOperation().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(typePrefix);
    stringBuffer.append(TEXT_219);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_220);
    stringBuffer.append(info.type);
    stringBuffer.append(TEXT_176);
    if (info.depth > 0) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(info.depth);
    stringBuffer.append(TEXT_222);
    stringBuffer.append(info.accessor);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(info.depth + 1);
    stringBuffer.append(TEXT_176);
    }
    }
    stringBuffer.append(TEXT_253);
    }
    }
    if (c.hasNext()) {
    stringBuffer.append(TEXT_5);
    }
    }
    }
    if (!genPackage.getGenEnums().isEmpty()) {
    stringBuffer.append(TEXT_254);
    for (Iterator<GenEnum> e=genPackage.getGenEnums().iterator(); e.hasNext();) { GenEnum genEnum = e.next();
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genEnum.getClassifierInstanceName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genEnum.getImportedName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getNonNLS());
    for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genEnum.getClassifierInstanceName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genEnum.getImportedName().equals(genEnum.getClassifierID()) ? genEnum.getQualifiedName() : genEnum.getImportedName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_176);
    }
    if (e.hasNext()) {
    stringBuffer.append(TEXT_5);
    }
    }
    }
    if (!genPackage.getGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_258);
    for (GenDataType genDataType : genPackage.getGenDataTypes()) {boolean hasInstanceTypeName = genModel.useGenerics() && genDataType.getEcoreDataType().getInstanceTypeName() != null && genDataType.getEcoreDataType().getInstanceTypeName().contains("<");
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genDataType.getClassifierInstanceName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genDataType.getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genDataType.getSerializableFlag());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genDataType.getGeneratedInstanceClassFlag());
    if (hasInstanceTypeName) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genDataType.getEcoreDataType().getInstanceTypeName());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genModel.getNonNLS());
    if (hasInstanceTypeName) {
    stringBuffer.append(genModel.getNonNLS(2));
    }
    }
    }
    if (genPackage.getSuperGenPackage() == null) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genPackage.getSchemaLocation());
    stringBuffer.append(TEXT_176);
    }
    if (!genPackage.isEcorePackage() && !genPackage.getAnnotationSources().isEmpty()) {
    stringBuffer.append(TEXT_261);
    for (String annotationSource : genPackage.getAnnotationSources()) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genPackage.getAnnotationSourceIdentifier(annotationSource));
    stringBuffer.append(TEXT_263);
    }
    }
    stringBuffer.append(TEXT_264);
    for (String annotationSource : genPackage.getAnnotationSources()) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genPackage.getAnnotationSourceIdentifier(annotationSource));
    stringBuffer.append(TEXT_267);
    if (annotationSource == null) {
    stringBuffer.append(TEXT_268);
    } else {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(annotationSource);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getNonNLS());
    }
    for (EAnnotation eAnnotation : genPackage.getAllAnnotations()) { List<GenPackage.AnnotationReferenceData> annotationReferenceDataList = genPackage.getReferenceData(eAnnotation);
    if (annotationSource == null ? eAnnotation.getSource() == null : annotationSource.equals(eAnnotation.getSource())) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genPackage.getAnnotatedModelElementAccessor(eAnnotation));
    stringBuffer.append(TEXT_270);
    for (Iterator<Map.Entry<String, String>> k = eAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry<String, String> detail = k.next(); String key = Literals.toStringLiteral(detail.getKey(), genModel); String value = Literals.toStringLiteral(detail.getValue(), genModel);
    stringBuffer.append(TEXT_271);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_199);
    stringBuffer.append(value);
    stringBuffer.append(k.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    }
    stringBuffer.append(TEXT_272);
    if (annotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_176);
    } else {
    stringBuffer.append(TEXT_273);
    }
    if (!annotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_275);
    for (Iterator<GenPackage.AnnotationReferenceData> k = annotationReferenceDataList.iterator(); k.hasNext();) { GenPackage.AnnotationReferenceData annotationReferenceData = k.next();
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_277);
    if (annotationReferenceData.containingGenPackage != genPackage) {
    stringBuffer.append(annotationReferenceData.containingGenPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_278);
    stringBuffer.append(annotationReferenceData.uriFragment);
    stringBuffer.append(TEXT_279);
    if (k.hasNext()) {
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_280);
    }
    for (EAnnotation nestedEAnnotation : genPackage.getAllNestedAnnotations(eAnnotation)) {String nestedAnnotationSource = nestedEAnnotation.getSource();  int depth = 0; boolean nonContentAnnotation = false; StringBuilder path = new StringBuilder();  for (EObject eContainer = nestedEAnnotation.eContainer(), child = nestedEAnnotation; child != eAnnotation; child = eContainer, eContainer = eContainer.eContainer())  {  boolean nonContentChild = child.eContainmentFeature() != EcorePackage.Literals.EANNOTATION__CONTENTS; if (path.length() != 0) { path.insert(0, ", ");  } path.insert(0, nonContentChild); if (nonContentChild) { nonContentAnnotation = true; } ++depth;  } List<GenPackage.AnnotationReferenceData> nestedAnnotationReferenceDataList = genPackage.getReferenceData(nestedEAnnotation);
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genPackage.getAnnotatedModelElementAccessor(eAnnotation));
    stringBuffer.append(TEXT_281);
    if (nonContentAnnotation && genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF210_VALUE) {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(path.toString());
    stringBuffer.append(TEXT_283);
    } else {
    stringBuffer.append(depth);
    }
    stringBuffer.append(TEXT_281);
    if (nestedAnnotationSource == null) {
    stringBuffer.append(TEXT_284);
    } else {
    stringBuffer.append(TEXT_237);
    stringBuffer.append(nestedAnnotationSource);
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_286);
    for (Iterator<Map.Entry<String, String>> l = nestedEAnnotation.getDetails().iterator(); l.hasNext();) { Map.Entry<String, String> detail = l.next(); String key = Literals.toStringLiteral(detail.getKey(), genModel); String value = Literals.toStringLiteral(detail.getValue(), genModel);
    stringBuffer.append(TEXT_271);
    stringBuffer.append(key);
    stringBuffer.append(TEXT_199);
    stringBuffer.append(value);
    stringBuffer.append(l.hasNext() ? "," : "");
    stringBuffer.append(genModel.getNonNLS(key + value));
    }
    stringBuffer.append(TEXT_272);
    if (nestedAnnotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_176);
    } else {
    stringBuffer.append(TEXT_273);
    }
    if (!nestedAnnotationReferenceDataList.isEmpty()) {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_275);
    for (Iterator<GenPackage.AnnotationReferenceData> l = nestedAnnotationReferenceDataList.iterator(); l.hasNext();) { GenPackage.AnnotationReferenceData annotationReferenceData = l.next();
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_277);
    if (annotationReferenceData.containingGenPackage != genPackage) {
    stringBuffer.append(annotationReferenceData.containingGenPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_278);
    stringBuffer.append(annotationReferenceData.uriFragment);
    stringBuffer.append(TEXT_279);
    if (l.hasNext()) {
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_280);
    }
    }
    }
    }
    stringBuffer.append(TEXT_264);
    }
    } else {
    if (genPackage.isLoadingInitialization()) {
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genModel.getImportedName("java.net.URL"));
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl"));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genModel.getImportedName("java.io.IOException"));
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_296);
    }
    stringBuffer.append(TEXT_297);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_157);
    }
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_299);
    ArrayList<GenClass> dynamicGenClasses = new ArrayList<GenClass>(); for (GenClass genClass : genPackage.getGenClasses()) { if (genClass.isDynamic()) { dynamicGenClasses.add(genClass); } }
    if (dynamicGenClasses.isEmpty()) {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_302);
    } else {
    stringBuffer.append(TEXT_303);
    for (GenClass genClass : dynamicGenClasses) {
    if (genClass.isDynamic()) {
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genPackage.getClassifierID(genClass));
    stringBuffer.append(TEXT_305);
    }
    }
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_307);
    }
    stringBuffer.append(TEXT_308);
    }
    if (needsAddEOperation) {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_313);
    }
    if (needsAddEParameter) {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EParameter"));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EParameter"));
    stringBuffer.append(TEXT_315);
    }
    }
    if (isInterface && genPackage.isLiteralsInterface()) {
    stringBuffer.append(TEXT_316);
    if (genModel.isOperationReflection()) {
    stringBuffer.append(TEXT_317);
    }
    stringBuffer.append(TEXT_318);
    if (isImplementation) {
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_320);
    for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
    stringBuffer.append(TEXT_321);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    if (!genClass.isInterface()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genClass.getQualifiedClassName());
    } else {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    }
    } else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genEnum.getQualifiedName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genEnum.getQualifiedName());
    } else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_326);
    if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genDataType.getRawInstanceClassName());
    }
    }
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genPackage.getQualifiedPackageClassName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_48);
    if (genClassifier.hasAPITags()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genClassifier.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_329);
    if (isJDK50 && genClassifier.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_330);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genClassifier.getImportedMetaType());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genPackage.getClassifierID(genClassifier));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genClassifier.getClassifierAccessorName());
    stringBuffer.append(TEXT_167);
    if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_333);
    if (genFeature.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_329);
    if (isJDK50 && genFeature.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_330);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genFeature.getImportedMetaType());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genClass.getFeatureID(genFeature));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_167);
    }
    if (genModel.isOperationReflection()) {
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_334);
    if (genOperation.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genOperation.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_329);
    if (isJDK50 && genOperation.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_330);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genOperation.getImportedMetaType());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genClass.getOperationID(genOperation, false));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genOperation.getOperationAccessorName());
    stringBuffer.append(TEXT_167);
    }
    }
    }
    }
    stringBuffer.append(TEXT_264);
    }
    stringBuffer.append(TEXT_335);
    stringBuffer.append(isInterface ? genPackage.getPackageInterfaceName() : genPackage.getPackageClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
