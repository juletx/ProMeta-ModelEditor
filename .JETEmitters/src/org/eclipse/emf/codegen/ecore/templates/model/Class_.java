package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class Class_
{
  protected static String nl;
  public static synchronized Class_ create(String lineSeparator)
  {
    nl = lineSeparator;
    Class_ result = new Class_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "//------------------------------------------------------------------------------" + NL + "// Copyright (c) 2005, 2006 IBM Corporation and others." + NL + "// All rights reserved. This program and the accompanying materials" + NL + "// are made available under the terms of the Eclipse Public License v1.0" + NL + "// which accompanies this distribution, and is available at" + NL + "// http://www.eclipse.org/legal/epl-v10.html" + NL + "//" + NL + "// Contributors:" + NL + "// IBM Corporation - initial implementation" + NL + "//------------------------------------------------------------------------------";
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ";";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_7 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_8 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_9 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_10 = NL + " *";
  protected final String TEXT_11 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_12 = NL + " *   <li>{@link ";
  protected final String TEXT_13 = "#";
  protected final String TEXT_14 = " <em>";
  protected final String TEXT_15 = "</em>}</li>";
  protected final String TEXT_16 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_17 = NL + " * @see ";
  protected final String TEXT_18 = "#get";
  protected final String TEXT_19 = "()";
  protected final String TEXT_20 = NL + " * @model ";
  protected final String TEXT_21 = NL + " *        ";
  protected final String TEXT_22 = NL + " * @model";
  protected final String TEXT_23 = NL + " * @extends ";
  protected final String TEXT_24 = NL + " * @generated" + NL + " */";
  protected final String TEXT_25 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_26 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_27 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_28 = NL + " * </ul>";
  protected final String TEXT_29 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_30 = NL + "public";
  protected final String TEXT_31 = " abstract";
  protected final String TEXT_32 = " class ";
  protected final String TEXT_33 = NL + "public interface ";
  protected final String TEXT_34 = NL + "{";
  protected final String TEXT_35 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_36 = " copyright = ";
  protected final String TEXT_37 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_38 = " mofDriverNumber = \"";
  protected final String TEXT_39 = "\";";
  protected final String TEXT_40 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_41 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_42 = ";" + NL;
  protected final String TEXT_43 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_44 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_45 = " = 0;" + NL;
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_47 = "() <em>";
  protected final String TEXT_48 = "</em>}' ";
  protected final String TEXT_49 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_50 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_51 = " ";
  protected final String TEXT_52 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_53 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_54 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_55 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_56 = NL + "\tprotected static final ";
  protected final String TEXT_57 = "[] ";
  protected final String TEXT_58 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_59 = " [0]";
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_61 = "; // TODO The default value literal \"";
  protected final String TEXT_62 = "\" is not valid.";
  protected final String TEXT_63 = " = ";
  protected final String TEXT_64 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_65 = NL + "\t/**" + NL + "\t * The flag representing the value of the '{@link #";
  protected final String TEXT_66 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_67 = "_EFLAG = 1 ";
  protected final String TEXT_68 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_69 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_70 = "_ESETFLAG = 1 ";
  protected final String TEXT_71 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_72 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_73 = "ESet;" + NL;
  protected final String TEXT_74 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_75 = ".getFeatureID(";
  protected final String TEXT_76 = ") - ";
  protected final String TEXT_77 = "public";
  protected final String TEXT_78 = "protected";
  protected final String TEXT_79 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_80 = NL + "\t\t";
  protected final String TEXT_81 = " |= ";
  protected final String TEXT_82 = "_EFLAG;";
  protected final String TEXT_83 = NL + "  " + NL + " //UMA-->" + NL + " \t\treassignDefaultValues();" + NL + " //UMA<--  " + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_84 = NL + "\t@Override";
  protected final String TEXT_85 = NL + "\tprotected ";
  protected final String TEXT_86 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_87 = ";" + NL + "\t}" + NL;
  protected final String TEXT_88 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_89 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_90 = NL + "\t";
  protected final String TEXT_91 = "();" + NL;
  protected final String TEXT_92 = NL + "\tpublic ";
  protected final String TEXT_93 = "()" + NL + "\t{";
  protected final String TEXT_94 = " list = (";
  protected final String TEXT_95 = ")";
  protected final String TEXT_96 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_97 = "(";
  protected final String TEXT_98 = "[])";
  protected final String TEXT_99 = "_EEMPTY_ARRAY;";
  protected final String TEXT_100 = NL + "\t\tif (";
  protected final String TEXT_101 = " == null || ";
  protected final String TEXT_102 = ".isEmpty()) return ";
  protected final String TEXT_103 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_104 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_105 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_106 = " get";
  protected final String TEXT_107 = "(int index);" + NL;
  protected final String TEXT_108 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_109 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_110 = NL + "\tint get";
  protected final String TEXT_111 = "Length();" + NL;
  protected final String TEXT_112 = NL + "\tpublic int get";
  protected final String TEXT_113 = "Length()" + NL + "\t{";
  protected final String TEXT_114 = NL + "\t\treturn ";
  protected final String TEXT_115 = "().size();";
  protected final String TEXT_116 = " == null ? 0 : ";
  protected final String TEXT_117 = ".size();";
  protected final String TEXT_118 = NL + "\t}" + NL;
  protected final String TEXT_119 = NL + "\tvoid set";
  protected final String TEXT_120 = "[] new";
  protected final String TEXT_121 = ");" + NL;
  protected final String TEXT_122 = NL + "\tpublic void set";
  protected final String TEXT_123 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_124 = "()).setData(new";
  protected final String TEXT_125 = ".length, new";
  protected final String TEXT_126 = ");" + NL + "\t}" + NL;
  protected final String TEXT_127 = "(int index, ";
  protected final String TEXT_128 = " element);" + NL;
  protected final String TEXT_129 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_130 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_131 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_132 = "</b></em>' ";
  protected final String TEXT_133 = ".";
  protected final String TEXT_134 = NL + "\t * The key is of type ";
  protected final String TEXT_135 = "list of {@link ";
  protected final String TEXT_136 = "}";
  protected final String TEXT_137 = "{@link ";
  protected final String TEXT_138 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_139 = ",";
  protected final String TEXT_140 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_141 = NL + "\t * The default value is <code>";
  protected final String TEXT_142 = "</code>.";
  protected final String TEXT_143 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_144 = "}.";
  protected final String TEXT_145 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_146 = "</em>}'.";
  protected final String TEXT_147 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_148 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_149 = "</em>' ";
  protected final String TEXT_150 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_151 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_152 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_153 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_154 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_155 = NL + "\t * @see ";
  protected final String TEXT_156 = NL + "\t * @see #isSet";
  protected final String TEXT_157 = NL + "\t * @see #unset";
  protected final String TEXT_158 = NL + "\t * @see #set";
  protected final String TEXT_159 = NL + "\t * @model ";
  protected final String TEXT_160 = NL + "\t *        ";
  protected final String TEXT_161 = NL + "\t * @model";
  protected final String TEXT_162 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_163 = ")eGet(";
  protected final String TEXT_164 = ", true)";
  protected final String TEXT_165 = ").";
  protected final String TEXT_166 = " = (";
  protected final String TEXT_167 = ")eVirtualGet(";
  protected final String TEXT_168 = ");";
  protected final String TEXT_169 = " == null)" + NL + "\t\t{";
  protected final String TEXT_170 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_171 = ", ";
  protected final String TEXT_172 = " = new ";
  protected final String TEXT_173 = NL + "\t\t\t";
  protected final String TEXT_174 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_175 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_176 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_177 = ")eContainer();";
  protected final String TEXT_178 = " != null && ";
  protected final String TEXT_179 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_180 = " old";
  protected final String TEXT_181 = ";" + NL + "\t\t\t";
  protected final String TEXT_182 = "eResolveProxy(old";
  protected final String TEXT_183 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_184 = " != old";
  protected final String TEXT_185 = ")" + NL + "\t\t\t{";
  protected final String TEXT_186 = NL + "\t\t\t\t";
  protected final String TEXT_187 = " new";
  protected final String TEXT_188 = " msgs = old";
  protected final String TEXT_189 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_190 = ", null, null);";
  protected final String TEXT_191 = " msgs =  old";
  protected final String TEXT_192 = ".eInverseRemove(this, ";
  protected final String TEXT_193 = ".class, null);";
  protected final String TEXT_194 = NL + "\t\t\t\tif (new";
  protected final String TEXT_195 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_196 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_197 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_198 = ", null, msgs);";
  protected final String TEXT_199 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_200 = ".eInverseAdd(this, ";
  protected final String TEXT_201 = ".class, msgs);";
  protected final String TEXT_202 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_203 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_204 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_205 = "(this, ";
  protected final String TEXT_206 = ".RESOLVE, ";
  protected final String TEXT_207 = ", old";
  protected final String TEXT_208 = "));";
  protected final String TEXT_209 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_210 = NL + "\t\treturn (";
  protected final String TEXT_211 = " & ";
  protected final String TEXT_212 = "_EFLAG) != 0;";
  protected final String TEXT_213 = " = basicGet";
  protected final String TEXT_214 = "();" + NL + "\t\treturn ";
  protected final String TEXT_215 = ".eIsProxy() ? ";
  protected final String TEXT_216 = "eResolveProxy((";
  protected final String TEXT_217 = ") : ";
  protected final String TEXT_218 = NL + "\t\treturn new ";
  protected final String TEXT_219 = "((";
  protected final String TEXT_220 = ".Internal)((";
  protected final String TEXT_221 = ".Internal.Wrapper)get";
  protected final String TEXT_222 = "()).featureMap().";
  protected final String TEXT_223 = "list(";
  protected final String TEXT_224 = ")get";
  protected final String TEXT_225 = "().";
  protected final String TEXT_226 = NL + "\t\treturn ((";
  protected final String TEXT_227 = "()).featureMap().list(";
  protected final String TEXT_228 = NL + "\t\treturn get";
  protected final String TEXT_229 = "().list(";
  protected final String TEXT_230 = "()).featureMap().get(";
  protected final String TEXT_231 = "get";
  protected final String TEXT_232 = "().get(";
  protected final String TEXT_233 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_234 = "' ";
  protected final String TEXT_235 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_236 = NL + "\t\t// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting" + NL + "\t\t// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.";
  protected final String TEXT_237 = "EcoreEMap";
  protected final String TEXT_238 = "BasicFeatureMap";
  protected final String TEXT_239 = "EcoreEList";
  protected final String TEXT_240 = " should be used.";
  protected final String TEXT_241 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_242 = " basicGet";
  protected final String TEXT_243 = ")eInternalContainer();";
  protected final String TEXT_244 = ")((";
  protected final String TEXT_245 = ", false);";
  protected final String TEXT_246 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_247 = " basicSet";
  protected final String TEXT_248 = " msgs)" + NL + "\t{";
  protected final String TEXT_249 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_250 = ")new";
  protected final String TEXT_251 = ", msgs);";
  protected final String TEXT_252 = NL + "\t\treturn msgs;";
  protected final String TEXT_253 = NL + "\t\tObject old";
  protected final String TEXT_254 = " = eVirtualSet(";
  protected final String TEXT_255 = ", new";
  protected final String TEXT_256 = ";" + NL + "\t\t";
  protected final String TEXT_257 = " = new";
  protected final String TEXT_258 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_259 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_260 = NL + "\t\tboolean old";
  protected final String TEXT_261 = "ESet = (";
  protected final String TEXT_262 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_263 = "_ESETFLAG;";
  protected final String TEXT_264 = "ESet = ";
  protected final String TEXT_265 = "ESet;" + NL + "\t\t";
  protected final String TEXT_266 = "ESet = true;";
  protected final String TEXT_267 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_268 = " notification = new ";
  protected final String TEXT_269 = ".SET, ";
  protected final String TEXT_270 = "isSetChange ? null : old";
  protected final String TEXT_271 = "old";
  protected final String TEXT_272 = "isSetChange";
  protected final String TEXT_273 = "!old";
  protected final String TEXT_274 = "ESet";
  protected final String TEXT_275 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_276 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_277 = "()).featureMap()).basicAdd(";
  protected final String TEXT_278 = ".Internal)get";
  protected final String TEXT_279 = "()).basicAdd(";
  protected final String TEXT_280 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_281 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_282 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_283 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_284 = NL + "\t * @see #";
  protected final String TEXT_285 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_286 = " value);" + NL;
  protected final String TEXT_287 = ")" + NL + "\t{";
  protected final String TEXT_288 = NL + "\t\teSet(";
  protected final String TEXT_289 = "new ";
  protected final String TEXT_290 = "new";
  protected final String TEXT_291 = NL + "\t\tif (new";
  protected final String TEXT_292 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_293 = " && new";
  protected final String TEXT_294 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_295 = ".isAncestor(this, ";
  protected final String TEXT_296 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_297 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_298 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_299 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_300 = ").eInverseAdd(this, ";
  protected final String TEXT_301 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_302 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_303 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_304 = " != ";
  protected final String TEXT_305 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_306 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_307 = " != null)";
  protected final String TEXT_308 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_309 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_310 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_311 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_312 = ").eInverseRemove(this, ";
  protected final String TEXT_313 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_314 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_315 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_316 = NL + "\t\t\tboolean old";
  protected final String TEXT_317 = "ESet = eVirtualIsSet(";
  protected final String TEXT_318 = "_ESETFLAG) != 0;";
  protected final String TEXT_319 = "ESet;";
  protected final String TEXT_320 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_321 = ", !old";
  protected final String TEXT_322 = "ESet));";
  protected final String TEXT_323 = NL + "\t\t}";
  protected final String TEXT_324 = ") ";
  protected final String TEXT_325 = "_EFLAG; else ";
  protected final String TEXT_326 = " &= ~";
  protected final String TEXT_327 = " == null ? ";
  protected final String TEXT_328 = " : new";
  protected final String TEXT_329 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_330 = "isSetChange ? ";
  protected final String TEXT_331 = " : old";
  protected final String TEXT_332 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_333 = NL + "\t\t((";
  protected final String TEXT_334 = "()).featureMap()).set(";
  protected final String TEXT_335 = "()).set(";
  protected final String TEXT_336 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_337 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_338 = " basicUnset";
  protected final String TEXT_339 = " = eVirtualUnset(";
  protected final String TEXT_340 = " = null;";
  protected final String TEXT_341 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_342 = "ESet = false;";
  protected final String TEXT_343 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_344 = ".UNSET, ";
  protected final String TEXT_345 = "isSetChange ? old";
  protected final String TEXT_346 = " : null";
  protected final String TEXT_347 = ", null, ";
  protected final String TEXT_348 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_349 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_350 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_351 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_352 = NL + "\tvoid unset";
  protected final String TEXT_353 = NL + "\tpublic void unset";
  protected final String TEXT_354 = NL + "\t\teUnset(";
  protected final String TEXT_355 = " != null) ((";
  protected final String TEXT_356 = ".Unsettable";
  protected final String TEXT_357 = ").unset();";
  protected final String TEXT_358 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_359 = " msgs = null;";
  protected final String TEXT_360 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_361 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_362 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_363 = ", null, null, old";
  protected final String TEXT_364 = " : ";
  protected final String TEXT_365 = "()).featureMap()).clear(";
  protected final String TEXT_366 = "()).clear(";
  protected final String TEXT_367 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_368 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_369 = " is set.";
  protected final String TEXT_370 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_371 = NL + "\tboolean isSet";
  protected final String TEXT_372 = NL + "\tpublic boolean isSet";
  protected final String TEXT_373 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_374 = " != null && ((";
  protected final String TEXT_375 = ").isSet();";
  protected final String TEXT_376 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_377 = NL + "\t\treturn !((";
  protected final String TEXT_378 = "()).featureMap()).isEmpty(";
  protected final String TEXT_379 = "()).isEmpty(";
  protected final String TEXT_380 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_381 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_382 = NL + "\t/**";
  protected final String TEXT_383 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_384 = NL + "\t * ";
  protected final String TEXT_385 = NL + "\t * @param ";
  protected final String TEXT_386 = NL + "\t *   ";
  protected final String TEXT_387 = NL + "\t{";
  protected final String TEXT_388 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_389 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_390 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_391 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_392 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_393 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_394 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_395 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_396 = "\", ";
  protected final String TEXT_397 = ".getObjectLabel(this, ";
  protected final String TEXT_398 = ") }),";
  protected final String TEXT_399 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_400 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_401 = " eInverseAdd(";
  protected final String TEXT_402 = " otherEnd, int featureID, ";
  protected final String TEXT_403 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_404 = ")" + NL + "\t\t{";
  protected final String TEXT_405 = NL + "\t\t\tcase ";
  protected final String TEXT_406 = ":";
  protected final String TEXT_407 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_408 = ".InternalMapView";
  protected final String TEXT_409 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_410 = NL + "\t\t\t\treturn (";
  protected final String TEXT_411 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_412 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_413 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_414 = ")otherEnd, msgs);";
  protected final String TEXT_415 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_416 = "basicGet";
  protected final String TEXT_417 = "();";
  protected final String TEXT_418 = NL + "\t\t\t\tif (";
  protected final String TEXT_419 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_420 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_421 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_422 = " eInverseRemove(";
  protected final String TEXT_423 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_424 = ".Internal.Wrapper)";
  protected final String TEXT_425 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_426 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_427 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_428 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_429 = "(msgs);";
  protected final String TEXT_430 = "(null, msgs);";
  protected final String TEXT_431 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_432 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_433 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_434 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID";
  protected final String TEXT_435 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_436 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_437 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_438 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_439 = NL + "\t\t\t\treturn ";
  protected final String TEXT_440 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_441 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_442 = "());";
  protected final String TEXT_443 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_444 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_445 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_446 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_447 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_448 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_449 = "().map();";
  protected final String TEXT_450 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_451 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_452 = ".Internal)";
  protected final String TEXT_453 = "()).getWrapper();";
  protected final String TEXT_454 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_455 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_456 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_457 = NL + "\t\t\t\t((";
  protected final String TEXT_458 = "()).featureMap()).set(newValue);";
  protected final String TEXT_459 = "()).set(newValue);";
  protected final String TEXT_460 = ".Setting)((";
  protected final String TEXT_461 = "()).eMap()).set(newValue);";
  protected final String TEXT_462 = ".Setting)";
  protected final String TEXT_463 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_464 = "().addAll((";
  protected final String TEXT_465 = "<? extends ";
  protected final String TEXT_466 = ">";
  protected final String TEXT_467 = ")newValue);";
  protected final String TEXT_468 = NL + "\t\t\t\tset";
  protected final String TEXT_469 = "(((";
  protected final String TEXT_470 = ")newValue).";
  protected final String TEXT_471 = "newValue);";
  protected final String TEXT_472 = NL + "\t\t\t\treturn;";
  protected final String TEXT_473 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_474 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_475 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_476 = "()).featureMap().clear();";
  protected final String TEXT_477 = "().clear();";
  protected final String TEXT_478 = NL + "\t\t\t\tunset";
  protected final String TEXT_479 = ")null);";
  protected final String TEXT_480 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_481 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_482 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "//UMA-->" + NL + "\t\t";
  protected final String TEXT_483 = " feature = getFeatureWithOverridenDefaultValue(featureID);" + NL + "\t\tif(feature != null) {" + NL + "\t\t\treturn isFeatureWithOverridenDefaultValueSet(feature);" + NL + "\t\t}" + NL + "//UMA<--\t\t" + NL + "\t\tswitch (featureID";
  protected final String TEXT_484 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_485 = "()).featureMap().isEmpty();";
  protected final String TEXT_486 = " != null && !";
  protected final String TEXT_487 = ".featureMap().isEmpty();";
  protected final String TEXT_488 = ".isEmpty();";
  protected final String TEXT_489 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_490 = NL + "\t\t\t\treturn !";
  protected final String TEXT_491 = "().isEmpty();";
  protected final String TEXT_492 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_493 = " != null;";
  protected final String TEXT_494 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_495 = ") != null;";
  protected final String TEXT_496 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_497 = "() != null;";
  protected final String TEXT_498 = "_EFLAG) != 0) != ";
  protected final String TEXT_499 = ") != ";
  protected final String TEXT_500 = "() != ";
  protected final String TEXT_501 = " != null : !";
  protected final String TEXT_502 = ".equals(";
  protected final String TEXT_503 = "() != null : !";
  protected final String TEXT_504 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_505 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_506 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_507 = " baseClass)" + NL + "\t{";
  protected final String TEXT_508 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_509 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_510 = NL + "\t\t\t\tcase ";
  protected final String TEXT_511 = ": return ";
  protected final String TEXT_512 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_513 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_514 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_515 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_516 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_517 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_518 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_519 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_520 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_521 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_522 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_523 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_524 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_525 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_526 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_527 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_528 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_529 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_530 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_531 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_532 = ": \");";
  protected final String TEXT_533 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_534 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_535 = ")) result.append(eVirtualGet(";
  protected final String TEXT_536 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_537 = "_ESETFLAG) != 0";
  protected final String TEXT_538 = ") result.append((";
  protected final String TEXT_539 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_540 = ") result.append(";
  protected final String TEXT_541 = "); else result.append(\"<unset>\");";
  protected final String TEXT_542 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_543 = NL + "\t\tresult.append((";
  protected final String TEXT_544 = "_EFLAG) != 0);";
  protected final String TEXT_545 = NL + "\t\tresult.append(";
  protected final String TEXT_546 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_547 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_548 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_549 = " getKey()" + NL + "\t{";
  protected final String TEXT_550 = "(getTypedKey());";
  protected final String TEXT_551 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_552 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_553 = " key)" + NL + "\t{";
  protected final String TEXT_554 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_555 = "key);";
  protected final String TEXT_556 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_557 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_558 = ")key).";
  protected final String TEXT_559 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_560 = ")key);";
  protected final String TEXT_561 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_562 = " getValue()" + NL + "\t{";
  protected final String TEXT_563 = "(getTypedValue());";
  protected final String TEXT_564 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_565 = " setValue(";
  protected final String TEXT_566 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_567 = " oldValue = getValue();";
  protected final String TEXT_568 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_569 = "value);";
  protected final String TEXT_570 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_571 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_572 = ")value).";
  protected final String TEXT_573 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_574 = ")value);";
  protected final String TEXT_575 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_576 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_577 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_578 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_579 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    if (isInterface) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_5);
    if (isInterface) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_7);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_11);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_15);
    }
    }
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_10);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_20);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_22);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_24);
    } else {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_26);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_27);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_30);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_34);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_5);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_5);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_40);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_42);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_42);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_45);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_42);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_54);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_42);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_54);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_62);
    } else {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_5);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genClass.getFlagIndex(genFeature) > 31 && genClass.getFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append("<< " + genClass.getFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_42);
    } else {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_42);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) {
    if (genClass.getESetFlagIndex(genFeature) > 31 && genClass.getESetFlagIndex(genFeature) % 32 == 0) {
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append("<< " + genClass.getESetFlagIndex(genFeature) % 32 );
    stringBuffer.append(TEXT_42);
    } else {
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_73);
    }
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_42);
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_42);
    }
    }
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_35);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_77);
    } else {
    stringBuffer.append(TEXT_78);
    }
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_79);
    for (GenFeature genFeature : genClass.getFlagGenFeatures("true")) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_82);
    }
    stringBuffer.append(TEXT_83);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_87);
    }
    if (isImplementation && genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL && (genClass.getClassExtendsGenClass() == null || genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL)) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_87);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_88);
    if (!isImplementation) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_91);
    } else {
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_93);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_98);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_99);
    } else {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_102);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_98);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_105);
    }
    stringBuffer.append(TEXT_88);
    if (!isImplementation) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_107);
    } else {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_108);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_109);
    }
    stringBuffer.append(TEXT_88);
    if (!isImplementation) {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_111);
    } else {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_113);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_115);
    } else {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_117);
    }
    stringBuffer.append(TEXT_118);
    }
    stringBuffer.append(TEXT_88);
    if (!isImplementation) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_121);
    } else {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_126);
    }
    stringBuffer.append(TEXT_88);
    if (!isImplementation) {
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_128);
    } else {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_130);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_133);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_134);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_135);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_136);
    } else {
    stringBuffer.append(TEXT_137);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_136);
    }
    stringBuffer.append(TEXT_138);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_135);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_136);
    } else {
    stringBuffer.append(TEXT_137);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_136);
    }
    stringBuffer.append(TEXT_139);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_140);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_133);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_142);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_144);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_146);
    }
    }
    stringBuffer.append(TEXT_147);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_150);
    }
    stringBuffer.append(TEXT_151);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_153);
    }
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_133);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_95);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_159);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_161);
    }}
    stringBuffer.append(TEXT_162);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_91);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast() || genFeature.isListType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_93);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_114);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_164);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_169);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_4);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_177);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_185);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_190);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_195);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_198);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_200);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_202);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_208);
    }
    stringBuffer.append(TEXT_209);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_168);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_212);
    } else {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_208);
    } else {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_114);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_164);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_114);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_97);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_231);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_164);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_4);
    }
    }
    } else {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_235);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_236);
    if (genFeature.isMapType()) {
    stringBuffer.append(TEXT_237);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_238);
    } else {
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(TEXT_240);
    }
    stringBuffer.append(TEXT_241);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_118);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_243);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_245);
    } else {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_245);
    }
    } else {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_246);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_118);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_248);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_251);
    stringBuffer.append(TEXT_252);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_259);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_266);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_267);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_272);
    } else {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_276);
    }
    stringBuffer.append(TEXT_252);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_251);
    } else {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_251);
    }
    } else {
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_281);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_118);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_133);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    }
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_285);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_286);
    } else {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_287);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_171);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_168);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_302);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_208);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_307);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_198);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_302);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_315);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_263);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_266);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    }
    stringBuffer.append(TEXT_323);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_208);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_82);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_4);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_259);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_263);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_266);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_171);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_272);
    } else {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_208);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_171);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_208);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_171);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_171);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    }
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_168);
    }
    } else {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_337);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_118);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_248);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_340);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_341);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_342);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_346);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_347);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_272);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_348);
    }
    } else {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_281);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_118);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(TEXT_351);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_162);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_91);
    } else {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_357);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_359);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_198);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_362);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_263);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_342);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    }
    stringBuffer.append(TEXT_323);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_212);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_4);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_341);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_318);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_319);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_340);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_342);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_346);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_347);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_272);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_208);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_82);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_342);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_171);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_272);
    } else {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_208);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    }
    } else {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_337);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_118);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_369);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_162);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_91);
    } else {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_93);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_375);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_318);
    } else {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_319);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_168);
    }
    } else {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_381);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_118);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isInterface) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(TEXT_351);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_383);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_153);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_159);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_161);
    }}
    stringBuffer.append(TEXT_162);
    //Class/genOperation.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_88);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/genOperation.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_42);
    } else {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_387);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    stringBuffer.append(TEXT_388);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_389);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_392);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_399);
    } else {
    stringBuffer.append(TEXT_400);
    //Class/implementedGenOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_118);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_88);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_55);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_406);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_409);
    } else {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_411);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_412);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_414);
    } else {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_251);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_168);
    } else if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_63);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_417);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_307);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_198);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_414);
    }
    }
    stringBuffer.append(TEXT_323);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_420);
    } else {
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_118);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_406);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_423);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_425);
    } else {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_426);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_251);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_429);
    } else {
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_430);
    }
    }
    stringBuffer.append(TEXT_323);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_431);
    } else {
    stringBuffer.append(TEXT_432);
    }
    stringBuffer.append(TEXT_118);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_435);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_323);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_436);
    } else {
    stringBuffer.append(TEXT_437);
    }
    stringBuffer.append(TEXT_118);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_438);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_406);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_440);
    } else {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_442);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_417);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_417);
    } else {
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_449);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_417);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_453);
    } else {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_417);
    }
    }
    stringBuffer.append(TEXT_323);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_454);
    } else {
    stringBuffer.append(TEXT_455);
    }
    stringBuffer.append(TEXT_118);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_88);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_55);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_456);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_406);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_458);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_459);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_461);
    } else {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_459);
    }
    } else {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_466);
    }
    stringBuffer.append(TEXT_467);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_442);
    } else {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_471);
    }
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_323);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_473);
    } else {
    stringBuffer.append(TEXT_474);
    }
    stringBuffer.append(TEXT_118);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_475);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_406);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_476);
    } else {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_477);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_417);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_479);
    } else {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_323);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_480);
    } else {
    stringBuffer.append(TEXT_481);
    }
    stringBuffer.append(TEXT_118);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_88);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_55);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_406);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_485);
    } else {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_487);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_488);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_488);
    } else {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_491);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_417);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_493);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_495);
    } else {
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_497);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_493);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_495);
    } else {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_497);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_4);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_442);
    }
    }
    }
    }
    stringBuffer.append(TEXT_323);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_504);
    } else {
    stringBuffer.append(TEXT_505);
    }
    stringBuffer.append(TEXT_118);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_506);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_507);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_185);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_512);
    }
    stringBuffer.append(TEXT_513);
    }
    stringBuffer.append(TEXT_514);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_515);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_507);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_516);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_512);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_517);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_185);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_512);
    }
    stringBuffer.append(TEXT_518);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_519);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_520);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_521);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_522);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_523);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_524);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_525);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_526);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_527);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(TEXT_529);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_530);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_100);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_537);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_100);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_537);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_208);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_544);
    } else {
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_168);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_546);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_547);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_548);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_549);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_550);
    } else {
    stringBuffer.append(TEXT_551);
    }
    stringBuffer.append(TEXT_552);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_553);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_554);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_555);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_556);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_442);
    } else {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_560);
    }
    stringBuffer.append(TEXT_561);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_562);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_563);
    } else {
    stringBuffer.append(TEXT_564);
    }
    stringBuffer.append(TEXT_561);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_565);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_566);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_567);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_568);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_569);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_570);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_571);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_572);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_442);
    } else {
    stringBuffer.append(TEXT_573);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_574);
    }
    stringBuffer.append(TEXT_575);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_92);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_578);
    }
    stringBuffer.append(TEXT_579);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
