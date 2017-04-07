//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kgb.lang.cpp.psi.CppTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kgb.lang.cpp.psi.*;

public class CppPrecompilerElifImpl extends ASTWrapperPsiElement implements CppPrecompilerElif {

  public CppPrecompilerElifImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CppVisitor visitor) {
    visitor.visitPrecompilerElif(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CppVisitor) accept((CppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CppCall> getCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppCall.class);
  }

  @Override
  @NotNull
  public List<CppClassDef> getClassDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppClassDef.class);
  }

  @Override
  @NotNull
  public List<CppComments> getCommentsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppComments.class);
  }

  @Override
  @NotNull
  public List<CppIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppIfStatement.class);
  }

  @Override
  @NotNull
  public List<CppInclude> getIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppInclude.class);
  }

  @Override
  @NotNull
  public List<CppMethodDef> getMethodDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppMethodDef.class);
  }

  @Override
  @NotNull
  public List<CppNamespaceDef> getNamespaceDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppNamespaceDef.class);
  }

  @Override
  @NotNull
  public List<CppNamespaceUse> getNamespaceUseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppNamespaceUse.class);
  }

  @Override
  @NotNull
  public List<CppPrecompilerDefine> getPrecompilerDefineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppPrecompilerDefine.class);
  }

  @Override
  @NotNull
  public List<CppPrecompilerIf> getPrecompilerIfList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppPrecompilerIf.class);
  }

  @Override
  @NotNull
  public List<CppStructDef> getStructDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppStructDef.class);
  }

  @Override
  @NotNull
  public List<CppVarAssign> getVarAssignList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppVarAssign.class);
  }

  @Override
  @NotNull
  public List<CppVarDef> getVarDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppVarDef.class);
  }

  @Override
  @NotNull
  public List<CppVname> getVnameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppVname.class);
  }

}
