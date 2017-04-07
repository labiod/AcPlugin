//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CppVarAssign extends PsiElement {

  @Nullable
  CppSep getSep();

  @NotNull
  CppVarName getVarName();

  @Nullable
  CppVarValue getVarValue();

  String getName();

  boolean isValid();

}
