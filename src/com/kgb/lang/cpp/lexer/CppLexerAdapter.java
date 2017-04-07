package com.kgb.lang.cpp.lexer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by BT on 2017-03-27.
 */
public class CppLexerAdapter extends FlexAdapter {
    public CppLexerAdapter() {
        super(new CppLexer());
    }
}
