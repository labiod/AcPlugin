package com.kgb.lang.cpp.features;

import com.intellij.lang.Commenter;
import com.kgb.lang.cpp.psi.CppTypes;
import org.jetbrains.annotations.Nullable;

/**
 * Created by BT on 2017-03-24.
 */
public class CPPCommenter implements Commenter {
    @Nullable
    @Override
    public String getLineCommentPrefix() {
        return "//";
    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return "/*";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return "*/";
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return null;
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return null;
    }
}
