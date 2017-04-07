//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface CppStructDef extends CppDefinition {

  @NotNull
  List<CppVarDef> getVarDefList();

  @NotNull
  CppVname getVname();

  String getName();

  PsiElement setName(String name);

  ItemPresentation getPresentation();

}
