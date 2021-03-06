//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CppPrecompilerElse extends PsiElement {

  @NotNull
  List<CppCall> getCallList();

  @NotNull
  List<CppClassDef> getClassDefList();

  @NotNull
  List<CppComments> getCommentsList();

  @NotNull
  List<CppIfStatement> getIfStatementList();

  @NotNull
  List<CppInclude> getIncludeList();

  @NotNull
  List<CppMethodDef> getMethodDefList();

  @NotNull
  List<CppNamespaceDef> getNamespaceDefList();

  @NotNull
  List<CppNamespaceUse> getNamespaceUseList();

  @NotNull
  List<CppPrecompilerDefine> getPrecompilerDefineList();

  @NotNull
  List<CppPrecompilerIf> getPrecompilerIfList();

  @NotNull
  List<CppStructDef> getStructDefList();

  @NotNull
  List<CppVarAssign> getVarAssignList();

  @NotNull
  List<CppVarDef> getVarDefList();

}
