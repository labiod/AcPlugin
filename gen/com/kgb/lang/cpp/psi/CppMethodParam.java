//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CppMethodParam extends PsiElement {

  @Nullable
  CppMethodCall getMethodCall();

  @Nullable
  CppString getString();

  @Nullable
  CppVarName getVarName();

  @Nullable
  PsiElement getNumber();

}
