//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kgb.lang.cpp.psi.CppTypes.*;
import com.kgb.lang.cpp.psi.*;
import com.intellij.psi.tree.IElementType;

public class CppBasicDefTypeImpl extends CppBasicType implements CppBasicDefType {

  public CppBasicDefTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CppVisitor visitor) {
    visitor.visitBasicDefType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CppVisitor) accept((CppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CppBaseToken getBaseToken() {
    return findNotNullChildByClass(CppBaseToken.class);
  }

  @Override
  @Nullable
  public CppTypeOption getTypeOption() {
    return findChildByClass(CppTypeOption.class);
  }

  public IElementType getBaseTypeToken() {
    return CppUtilImpl.getBaseTypeToken(this);
  }

}
