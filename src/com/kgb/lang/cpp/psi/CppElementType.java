package com.kgb.lang.cpp.psi;

import com.intellij.psi.tree.IElementType;
import com.kgb.lang.cpp.CppLanguage;

/**
 * Created by BT on 2017-03-27.
 */
public class CppElementType extends IElementType {
    public CppElementType(String name) {
        super(name, CppLanguage.INSTANCE);
    }
}
