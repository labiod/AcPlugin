package com.kgb.lang.cpp;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-03-24.
 */
public class CppLanguage extends Language {
    public static final Language INSTANCE = new CppLanguage();

    protected CppLanguage() {
        super(CppConstant.LANG_ID);
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return CppConstant.LANG_NAME;
    }
}
