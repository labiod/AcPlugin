//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface CppClassDef extends CppDefinition {

  @NotNull
  List<CppClassConstructorDef> getClassConstructorDefList();

  @NotNull
  List<CppClassDestructorDef> getClassDestructorDefList();

  @NotNull
  List<CppMethodDef> getMethodDefList();

  @NotNull
  List<CppVarDef> getVarDefList();

  @NotNull
  CppVname getVname();

  String getName();

  PsiElement setName(String name);

  ItemPresentation getPresentation();

}
