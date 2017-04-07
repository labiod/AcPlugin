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
import com.intellij.navigation.ItemPresentation;

public class CppStructDefImpl extends ASTWrapperPsiElement implements CppStructDef {

  public CppStructDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CppVisitor visitor) {
    visitor.visitStructDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CppVisitor) accept((CppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CppVarDef> getVarDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CppVarDef.class);
  }

  @Override
  @NotNull
  public CppVname getVname() {
    return findNotNullChildByClass(CppVname.class);
  }

  public String getName() {
    return CppUtilImpl.getName(this);
  }

  public PsiElement setName(String name) {
    return CppUtilImpl.setName(this, name);
  }

  public ItemPresentation getPresentation() {
    return CppUtilImpl.getPresentation(this);
  }

}
