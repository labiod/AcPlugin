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

public class CppCondImpl extends ASTWrapperPsiElement implements CppCond {

  public CppCondImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CppVisitor visitor) {
    visitor.visitCond(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CppVisitor) accept((CppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CppVarValue> getVarValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppVarValue.class);
  }

}
