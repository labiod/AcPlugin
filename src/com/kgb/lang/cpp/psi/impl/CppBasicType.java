package com.kgb.lang.cpp.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.kgb.lang.cpp.psi.CppTypeOption;
import com.kgb.lang.cpp.psi.CppTypes;
import com.kgb.lang.cpp.psi.ICppBasicType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-03-30.
 */
public abstract class CppBasicType extends ASTWrapperPsiElement implements ICppBasicType {
    public CppBasicType(@NotNull ASTNode node) {
        super(node);
    }

    public boolean isInt() {
        return getBaseTypeToken().equals(CppTypes.CPP_INT_TYPE);
    }

    public boolean isDouble() {
        return getBaseTypeToken().equals(CppTypes.CPP_DOUBLE_TYPE);
    }

    public boolean isFloat() {
        return getBaseTypeToken().equals(CppTypes.CPP_FLOAT_TYPE);
    }

    public boolean isShort() {
        return getBaseTypeToken().equals(CppTypes.CPP_SHORT_TYPE);
    }

    public boolean isLong() {
        return getBaseTypeToken().equals(CppTypes.CPP_LONG_TYPE);
    }

    public boolean isChar() {
        return getBaseTypeToken().equals(CppTypes.CPP_CHAR_TYPE);
    }

    public boolean isBool() {
        return getBaseTypeToken().equals(CppTypes.CPP_BOOL_TYPE);
    }

    public boolean isVoid() {
        return getBaseTypeToken().equals(CppTypes.CPP_VOID_TYPE);
    }

    public boolean isPointer() {
        return getTypeOption() != null && getTypeOption().getText().equals(CppTypes.CPP_POINTER.toString());
    }

    public boolean isReference() {
        return getTypeOption() != null && getTypeOption().getText().equals(CppTypes.CPP_REFERENCE.toString());
    }

    public boolean isTable() {
        return getTypeOption() != null && getTypeOption().getText().equals(CppTypes.CPP_TABLE.toString());
    }

    public abstract IElementType getBaseTypeToken();

    public abstract CppTypeOption getTypeOption();
}
