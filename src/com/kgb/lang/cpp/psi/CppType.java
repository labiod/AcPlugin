package com.kgb.lang.cpp.psi;

import com.intellij.psi.PsiElement;

/**
 * Created by BT on 2017-03-30.
 */
public interface CppType extends PsiElement {
    boolean validValue(CppVarValue varValue);
}
