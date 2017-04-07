//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CppCall extends PsiElement {

  @Nullable
  CppMethodCall getMethodCall();

  @Nullable
  CppReturnCall getReturnCall();

  @Nullable
  CppVarName getVarName();

}
