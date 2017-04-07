//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CppVarType extends CppType {

  @Nullable
  CppBasicDefType getBasicDefType();

  @Nullable
  CppUserDefType getUserDefType();

  String getName();

  boolean validValue(CppVarValue varValue);

}
