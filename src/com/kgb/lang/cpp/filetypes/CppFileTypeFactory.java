package com.kgb.lang.cpp.filetypes;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.kgb.lang.cpp.CppConstant;
import com.kgb.lang.cpp.filetypes.CppFileType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-03-24.
 */
public class CppFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(CppFileType.INSTANCE, CppConstant.LANG_DEFAULT_EXT);
    }
}
