package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.ecore.genmodel.impl.Literals;

public class EnumClass_
{
  protected static String nl;
  public static synchronized EnumClass_ create(String lineSeparator)
  {
    nl = lineSeparator;
    EnumClass_ result = new EnumClass_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "//------------------------------------------------------------------------------" + NL + "// Copyright (c) 2005, 2006 IBM Corporation and others." + NL + "// All rights reserved. This program and the accompanying materials" + NL + "// are made available under the terms of the Eclipse Public License v1.0" + NL + "// which accompanies this distribution, and is available at" + NL + "// http://www.eclipse.org/legal/epl-v10.html" + NL + "//" + NL + "// Contributors:" + NL + "// IBM Corporation - initial implementation" + NL + "//------------------------------------------------------------------------------" + NL + "package ";
  protected final String TEXT_3 = ";" + NL;
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the literals of the enumeration '<em><b>";
  protected final String TEXT_5 = "</b></em>'," + NL + " * and utility methods for working with them." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_6 = NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_7 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_8 = NL + " * @see ";
  protected final String TEXT_9 = "#get";
  protected final String TEXT_10 = "()";
  protected final String TEXT_11 = NL + " * @model ";
  protected final String TEXT_12 = NL + " *        ";
  protected final String TEXT_13 = NL + " * @model";
  protected final String TEXT_14 = NL + " * ";
  protected final String TEXT_15 = NL + " * @generated" + NL + " */";
  protected final String TEXT_16 = NL + "@Deprecated";
  protected final String TEXT_17 = NL + "public ";
  protected final String TEXT_18 = "enum";
  protected final String TEXT_19 = "final class";
  protected final String TEXT_20 = " ";
  protected final String TEXT_21 = "implements";
  protected final String TEXT_22 = "extends";
  protected final String TEXT_23 = NL + "{";
  protected final String TEXT_24 = NL + "\t;" + NL;
  protected final String TEXT_25 = NL + "\t/**" + NL + "\t * The '<em><b>";
  protected final String TEXT_26 = "</b></em>' literal object." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_27 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_28 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_29 = NL + "\t * @see #";
  protected final String TEXT_30 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_31 = NL + "\t@Deprecated";
  protected final String TEXT_32 = NL + "\t";
  protected final String TEXT_33 = "(";
  protected final String TEXT_34 = ", \"";
  protected final String TEXT_35 = "\", ";
  protected final String TEXT_36 = ")";
  protected final String TEXT_37 = ",";
  protected final String TEXT_38 = ";";
  protected final String TEXT_39 = NL;
  protected final String TEXT_40 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_41 = " copyright = ";
  protected final String TEXT_42 = "</b></em>' literal value." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_43 = NL + "\t * @model ";
  protected final String TEXT_44 = NL + "\t *        ";
  protected final String TEXT_45 = NL + "\t * @model";
  protected final String TEXT_46 = NL + "\tpublic static final int ";
  protected final String TEXT_47 = " = ";
  protected final String TEXT_48 = "</b></em>' literal object." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_49 = NL + "\t * ";
  protected final String TEXT_50 = NL + "\tpublic static final ";
  protected final String TEXT_51 = " = new ";
  protected final String TEXT_52 = ");";
  protected final String TEXT_53 = NL + "\t/**" + NL + "\t * An array of all the '<em><b>";
  protected final String TEXT_54 = "</b></em>' enumerators." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_55 = "[] VALUES_ARRAY =" + NL + "\t\tnew ";
  protected final String TEXT_56 = "[]" + NL + "\t\t{";
  protected final String TEXT_57 = NL + "\t\t\t";
  protected final String TEXT_58 = NL + "\t\t};" + NL + "" + NL + "\t/**" + NL + "\t * A public read-only list of all the '<em><b>";
  protected final String TEXT_59 = "</b></em>' enumerators." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final List";
  protected final String TEXT_60 = "<";
  protected final String TEXT_61 = ">";
  protected final String TEXT_62 = " VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));" + NL + "" + NL + "\t/**" + NL + "\t * Returns the '<em><b>";
  protected final String TEXT_63 = "</b></em>' literal with the specified literal value." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param literal the literal." + NL + "\t * @return the matching enumerator or <code>null</code>." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_64 = " get(";
  protected final String TEXT_65 = " literal)" + NL + "\t{" + NL + "\t\tfor (int i = 0; i < VALUES_ARRAY.length; ++i)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_66 = " result = VALUES_ARRAY[i];" + NL + "\t\t\tif (result.toString().equals(literal))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the '<em><b>";
  protected final String TEXT_67 = "</b></em>' literal with the specified name." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param name the name." + NL + "\t * @return the matching enumerator or <code>null</code>." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_68 = " getByName(";
  protected final String TEXT_69 = " name)" + NL + "\t{" + NL + "\t\tfor (int i = 0; i < VALUES_ARRAY.length; ++i)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_70 = " result = VALUES_ARRAY[i];" + NL + "\t\t\tif (result.getName().equals(name))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the '<em><b>";
  protected final String TEXT_71 = "</b></em>' literal with the specified integer value." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the integer value." + NL + "\t * @return the matching enumerator or <code>null</code>." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_72 = " get(int value)" + NL + "\t{" + NL + "\t\tswitch (value)" + NL + "\t\t{";
  protected final String TEXT_73 = NL + "\t\t\tcase ";
  protected final String TEXT_74 = ": return ";
  protected final String TEXT_75 = NL + "\t\t\tdefault: return null;" + NL + "\t\t}";
  protected final String TEXT_76 = NL + "\t\t}" + NL + "\t\treturn null;";
  protected final String TEXT_77 = NL + "\t}" + NL;
  protected final String TEXT_78 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final int value;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_79 = " name;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_80 = " literal;" + NL;
  protected final String TEXT_81 = NL + "\t/**" + NL + "\t * Only this class can construct instances." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_82 = "(int value, ";
  protected final String TEXT_83 = " name, ";
  protected final String TEXT_84 = " literal)" + NL + "\t{";
  protected final String TEXT_85 = NL + "\t\tthis.value = value;" + NL + "\t\tthis.name = name;" + NL + "\t\tthis.literal = literal;";
  protected final String TEXT_86 = NL + "\t\tsuper(value, name, literal);";
  protected final String TEXT_87 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_88 = NL + "\t@Override";
  protected final String TEXT_89 = NL + "\tpublic int getValue()" + NL + "\t{" + NL + "\t  return value;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_90 = NL + "\tpublic ";
  protected final String TEXT_91 = " getName()" + NL + "\t{" + NL + "\t  return name;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_92 = " getLiteral()" + NL + "\t{" + NL + "\t  return literal;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the literal value of the enumerator, which is its string representation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_93 = " toString()" + NL + "\t{" + NL + "\t\treturn literal;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_94 = NL + "} //";
  protected final String TEXT_95 = NL + "/**" + NL + " * A private implementation interface used to hide the inheritance from Enumerator." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "interface Internal";
  protected final String TEXT_96 = " extends org.eclipse.emf.common.util.Enumerator" + NL + "{" + NL + "\t// Empty " + NL + "}";
  protected final String TEXT_97 = NL + "/**" + NL + " * A private implementation class to construct the instances." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "class Internal";
  protected final String TEXT_98 = " extends org.eclipse.emf.common.util.AbstractEnumerator" + NL + "{" + NL + "\t/**" + NL + "\t * Only this class can construct instances." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Internal";
  protected final String TEXT_99 = " literal)" + NL + "\t{" + NL + "\t\tsuper(value, name, literal);" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2019 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Alexander Fedorov <alexander.fedorov@arsysop.ru> - Bug 546714
 */

    GenEnum genEnum = (GenEnum)argument; GenPackage genPackage = genEnum.getGenPackage(); GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean forceDefaultCase = genModel.isSwitchMissingDefaultCase();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_3);
    genModel.addImport("java.util.Arrays");
    genModel.addImport("java.util.List");
    genModel.addImport("java.util.Collections");
    genModel.markImportLocation(stringBuffer, genPackage);
    boolean isEnum = genModel.useGenerics();
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_5);
    if (genEnum.hasDocumentation()) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genEnum.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_10);
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genEnum.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_11);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_13);
    }}
    if (genEnum.hasImplicitAPITags(true)) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genEnum.getImplicitAPITags(genModel.getIndentation(stringBuffer), true));
    }
    stringBuffer.append(TEXT_15);
    if (isJDK50 && genEnum.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    if (isEnum) {
    stringBuffer.append(TEXT_18);
    } else {
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_20);
    if (isEnum) {
    stringBuffer.append(TEXT_21);
    } else {
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.isSuppressEMFMetaData() && !genModel.isSuppressInterfaces() ? "Internal" + genEnum.getName() : genModel.getImportedName(isEnum ? "org.eclipse.emf.common.util.Enumerator" : "org.eclipse.emf.common.util.AbstractEnumerator"));
    stringBuffer.append(TEXT_23);
    if (isEnum) {
    if (genEnum.getGenEnumLiterals().isEmpty()) {
    stringBuffer.append(TEXT_24);
    }else {
    for (Iterator<GenEnumLiteral> l = genEnum.getGenEnumLiterals().iterator(); l.hasNext(); ) { GenEnumLiteral genEnumLiteral = l.next(); 
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genEnumLiteral.getFormattedName());
    stringBuffer.append(TEXT_26);
    if (genEnumLiteral.hasDocumentation()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genEnumLiteral.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_30);
    if (isJDK50 && genEnumLiteral.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genEnumLiteral.getValue());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genEnumLiteral.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(Literals.toStringLiteral(genEnumLiteral.getLiteral(), genModel));
    stringBuffer.append(TEXT_36);
    if (l.hasNext()) {
    stringBuffer.append(TEXT_37);
    } else {
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_39);
    }
    }
    }
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_39);
    }
    for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genEnumLiteral.getFormattedName());
    stringBuffer.append(TEXT_42);
    if (genEnumLiteral.hasDocumentation()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genEnumLiteral.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genEnumLiteral.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_43);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_45);
    }}
    stringBuffer.append(TEXT_30);
    if (isJDK50 && genEnumLiteral.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genEnumLiteral.getValue());
    stringBuffer.append(TEXT_3);
    }
    if (!isEnum) for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genEnumLiteral.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    if (genEnumLiteral.hasAPITags()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genEnumLiteral.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_30);
    if (isJDK50 && genEnumLiteral.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genEnumLiteral.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(Literals.toStringLiteral(genEnumLiteral.getLiteral(), genModel));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_56);
    for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_37);
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_59);
    if (isEnum) {
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genEnum.getFormattedName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_72);
    for (GenEnumLiteral genEnumLiteral : genEnum.getUniqueValuedGenEnumLiterals()) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genEnumLiteral.getEnumLiteralValueConstantName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genEnumLiteral.getEnumLiteralInstanceConstantName());
    stringBuffer.append(TEXT_38);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_75);
    } else { // {
    stringBuffer.append(TEXT_76);
    } // }
    stringBuffer.append(TEXT_77);
    if (isEnum) {
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_80);
    }
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_84);
    if (isEnum) {
    stringBuffer.append(TEXT_85);
    } else {
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_77);
    if (isEnum) {
    stringBuffer.append(TEXT_87);
    if (genModel.useInterfaceOverrideAnnotation()) {
    stringBuffer.append(TEXT_88);
    }
    stringBuffer.append(TEXT_89);
    if (genModel.useInterfaceOverrideAnnotation()) {
    stringBuffer.append(TEXT_88);
    }
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_91);
    if (genModel.useInterfaceOverrideAnnotation()) {
    stringBuffer.append(TEXT_88);
    }
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_92);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_88);
    }
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genEnum.getName());
    if (genModel.isSuppressEMFMetaData()&& !genModel.isSuppressInterfaces() ) {
    stringBuffer.append(TEXT_39);
    if (isEnum) {
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_96);
    } else {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genEnum.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_99);
    }
    }
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_39);
    return stringBuffer.toString();
  }
}
