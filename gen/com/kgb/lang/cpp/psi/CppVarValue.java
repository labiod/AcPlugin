//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CppVarValue extends PsiElement {

  @Nullable
  CppCall getCall();

  @Nullable
  CppCast getCast();

  @Nullable
  CppString getString();

  @Nullable
  CppVarName getVarName();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getNumber();

}
