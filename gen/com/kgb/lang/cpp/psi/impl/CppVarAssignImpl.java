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

public class CppVarAssignImpl extends ASTWrapperPsiElement implements CppVarAssign {

  public CppVarAssignImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CppVisitor visitor) {
    visitor.visitVarAssign(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CppVisitor) accept((CppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CppSep getSep() {
    return findChildByClass(CppSep.class);
  }

  @Override
  @NotNull
  public CppVarName getVarName() {
    return findNotNullChildByClass(CppVarName.class);
  }

  @Override
  @Nullable
  public CppVarValue getVarValue() {
    return findChildByClass(CppVarValue.class);
  }

  public String getName() {
    return CppUtilImpl.getName(this);
  }

  public boolean isValid() {
    return CppUtilImpl.isValid(this);
  }

}
