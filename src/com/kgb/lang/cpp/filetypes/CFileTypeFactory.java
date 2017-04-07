package com.kgb.lang.cpp.filetypes;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.kgb.lang.cpp.CppConstant;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-04-05.
 */
public class CFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(CFileType.INSTANCE, CppConstant.LANG_C_EXT);
    }
}