package com.kgb.lang.cpp.filetypes;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.kgb.lang.cpp.CppConstant;
import com.kgb.lang.cpp.CppLanguage;
import com.kgb.lang.cpp.features.CppIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by BT on 2017-03-24.
 */
public class CppFileType extends LanguageFileType {
    public static final CppFileType INSTANCE = new CppFileType();


    private CppFileType() {
        super(CppLanguage.INSTANCE);
    }


    @NotNull
    @Override
    public String getName() {
        return CppConstant.LANG_NAME;
    }


    @NotNull
    @Override
    public String getDescription() {
        return CppConstant.LANG_DESCRIPTION;
    }


    @NotNull
    @Override
    public String getDefaultExtension() {
        return CppConstant.LANG_DEFAULT_EXT;
    }


    @Nullable
    @Override
    public Icon getIcon() {
        return CppIcons.FILE_ICON;
    }

}
