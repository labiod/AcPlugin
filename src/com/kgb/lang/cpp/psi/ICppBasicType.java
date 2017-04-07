package com.kgb.lang.cpp.psi;

import com.intellij.psi.PsiElement;

/**
 * Created by BT on 2017-03-30.
 */
public interface ICppBasicType extends PsiElement {
    boolean isInt();

    boolean isDouble();

    boolean isFloat();

    boolean isShort();

    boolean isLong();

    boolean isChar();

    boolean isBool();

    boolean isVoid();

    boolean isPointer();

    boolean isReference() ;

    boolean isTable();
}
