package com.kgb.lang.cpp.parser;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.kgb.lang.cpp.CppConstant;
import com.kgb.lang.cpp.filetypes.CppFileType;
import com.kgb.lang.cpp.CppLanguage;
import com.kgb.lang.cpp.features.CppIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by BT on 2017-03-27.
 */
public class CppFile extends PsiFileBase {
    public CppFile(FileViewProvider fileViewProvider) {
        super(fileViewProvider, CppLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CppFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return CppConstant.LANG_NAME;
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return CppIcons.FILE_ICON;
    }
}
