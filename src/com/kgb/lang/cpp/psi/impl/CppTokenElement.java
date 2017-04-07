package com.kgb.lang.cpp.psi.impl;

import com.intellij.psi.tree.IElementType;
import com.kgb.lang.cpp.CppLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-03-27.
 */
public class CppTokenElement extends IElementType {
    public CppTokenElement(@NotNull String debugName) {
        super(debugName, CppLanguage.INSTANCE);
    }
}
