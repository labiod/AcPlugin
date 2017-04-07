//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface CppVarDef extends CppDefinition {

  @Nullable
  CppSep getSep();

  @NotNull
  CppVarName getVarName();

  @NotNull
  CppVarType getVarType();

  @Nullable
  CppVarValue getVarValue();

  String getName();

  boolean isValid();

  PsiElement setName(String name);

  ItemPresentation getPresentation();

}
