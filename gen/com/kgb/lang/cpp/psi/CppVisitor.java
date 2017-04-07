//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CppVisitor extends PsiElementVisitor {

  public void visitBaseToken(@NotNull CppBaseToken o) {
    visitPsiElement(o);
  }

  public void visitBasicDefType(@NotNull CppBasicDefType o) {
    visitICppBasicType(o);
  }

  public void visitCall(@NotNull CppCall o) {
    visitPsiElement(o);
  }

  public void visitCast(@NotNull CppCast o) {
    visitPsiElement(o);
  }

  public void visitClassConstructorDef(@NotNull CppClassConstructorDef o) {
    visitDefinition(o);
  }

  public void visitClassDef(@NotNull CppClassDef o) {
    visitDefinition(o);
  }

  public void visitClassDestructorDef(@NotNull CppClassDestructorDef o) {
    visitDefinition(o);
  }

  public void visitCommaSeparatedList(@NotNull CppCommaSeparatedList o) {
    visitPsiElement(o);
  }

  public void visitComments(@NotNull CppComments o) {
    visitPsiElement(o);
  }

  public void visitCond(@NotNull CppCond o) {
    visitPsiElement(o);
  }

  public void visitIfStatement(@NotNull CppIfStatement o) {
    visitPsiElement(o);
  }

  public void visitInclude(@NotNull CppInclude o) {
    visitPsiElement(o);
  }

  public void visitMethodArg(@NotNull CppMethodArg o) {
    visitPsiElement(o);
  }

  public void visitMethodArgs(@NotNull CppMethodArgs o) {
    visitPsiElement(o);
  }

  public void visitMethodCall(@NotNull CppMethodCall o) {
    visitPsiElement(o);
  }

  public void visitMethodDef(@NotNull CppMethodDef o) {
    visitDefinition(o);
  }

  public void visitMethodParam(@NotNull CppMethodParam o) {
    visitPsiElement(o);
  }

  public void visitMethodParams(@NotNull CppMethodParams o) {
    visitPsiElement(o);
  }

  public void visitNamespaceDef(@NotNull CppNamespaceDef o) {
    visitDefinition(o);
  }

  public void visitNamespaceUse(@NotNull CppNamespaceUse o) {
    visitPsiElement(o);
  }

  public void visitPrecompilerDefine(@NotNull CppPrecompilerDefine o) {
    visitPsiElement(o);
  }

  public void visitPrecompilerElif(@NotNull CppPrecompilerElif o) {
    visitPsiElement(o);
  }

  public void visitPrecompilerElse(@NotNull CppPrecompilerElse o) {
    visitPsiElement(o);
  }

  public void visitPrecompilerIf(@NotNull CppPrecompilerIf o) {
    visitPsiElement(o);
  }

  public void visitReturnCall(@NotNull CppReturnCall o) {
    visitPsiElement(o);
  }

  public void visitSep(@NotNull CppSep o) {
    visitPsiElement(o);
  }

  public void visitString(@NotNull CppString o) {
    visitPsiElement(o);
  }

  public void visitStructDef(@NotNull CppStructDef o) {
    visitDefinition(o);
  }

  public void visitTemplate(@NotNull CppTemplate o) {
    visitPsiElement(o);
  }

  public void visitTypeOption(@NotNull CppTypeOption o) {
    visitPsiElement(o);
  }

  public void visitUserDefType(@NotNull CppUserDefType o) {
    visitPsiElement(o);
  }

  public void visitVarAccessorSeparatedList(@NotNull CppVarAccessorSeparatedList o) {
    visitPsiElement(o);
  }

  public void visitVarAssign(@NotNull CppVarAssign o) {
    visitPsiElement(o);
  }

  public void visitVarDef(@NotNull CppVarDef o) {
    visitDefinition(o);
  }

  public void visitVarName(@NotNull CppVarName o) {
    visitPsiElement(o);
  }

  public void visitVarType(@NotNull CppVarType o) {
    visitType(o);
  }

  public void visitVarValue(@NotNull CppVarValue o) {
    visitPsiElement(o);
  }

  public void visitVname(@NotNull CppVname o) {
    visitPsiElement(o);
  }

  public void visitDefinition(@NotNull CppDefinition o) {
    visitPsiElement(o);
  }

  public void visitType(@NotNull CppType o) {
    visitPsiElement(o);
  }

  public void visitICppBasicType(@NotNull ICppBasicType o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
