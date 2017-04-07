package com.kgb.lang.cpp.features.highlighters;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.kgb.lang.cpp.lexer.CppLexerAdapter;
import com.kgb.lang.cpp.psi.CppTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by BT on 2017-03-27.
 */
public class CppHighlighter implements SyntaxHighlighter {

    private static final TextAttributesKey[] KEY = {
            createTextAttributesKey("CPP_BASE_TYPE", DefaultLanguageHighlighterColors.KEYWORD)
    };
    private static final TextAttributesKey[] STRING = {
            createTextAttributesKey("CPP_STRING_TYPE", DefaultLanguageHighlighterColors.STRING)
    };
    private static final TextAttributesKey[] CHAR = {
            createTextAttributesKey("CPP_CHAR_TYPE", DefaultLanguageHighlighterColors.CONSTANT)
    };
    private static final TextAttributesKey[] NUMBER = {
            createTextAttributesKey("CPP_NUMBER_TYPE", DefaultLanguageHighlighterColors.NUMBER)
    };

    private static final TextAttributesKey[] INCLUDE = {
            createTextAttributesKey("CPP_INCLUDE_TYPE", DefaultLanguageHighlighterColors.METADATA)
    };
    private static final TextAttributesKey[] LINE_COMMENT = {
            createTextAttributesKey("CPP_LINE_COMMENT_TYPE", DefaultLanguageHighlighterColors.LINE_COMMENT)
    };
    private static final TextAttributesKey[] MULTI_LINE_COMMENT = {
            createTextAttributesKey("CPP_MULTI_LINE_COMMENT_TYPE", DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP)
    };
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{
        createTextAttributesKey("CPP_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
    };
    private static final TextAttributesKey[] DEFAULT = new TextAttributesKey[] {
          createTextAttributesKey("CPP_DEFAULT_TEXT", HighlighterColors.TEXT)
    };

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CppLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (checkBasicTypes(tokenType) || checkKeywords(tokenType)) {
            return KEY;
        } else if (tokenType.equals(CppTypes.CPP_STRING_PATTERN)
                || tokenType.equals(CppTypes.CPP_INCLUDE_PATH)) {
            return STRING;
        } else if (tokenType.equals(CppTypes.CPP_CHAR)) {
            return CHAR;
        }  else if (tokenType.equals(CppTypes.CPP_NUMBER)) {
            return NUMBER;
        } else if (tokenType.equals(CppTypes.CPP_LINE_COMMENTS)) {
            return LINE_COMMENT;
        } else if (tokenType.equals(CppTypes.CPP_MULTILINE_COMMENT)) {
            return MULTI_LINE_COMMENT;
        } else if (checkPrecompilerDef(tokenType)) {
            return INCLUDE;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return DEFAULT;
        }
    }

    private boolean checkPrecompilerDef(IElementType tokenType) {
        return tokenType.equals(CppTypes.CPP_INCLUDE_KEYWORD) ||
                tokenType.equals(CppTypes.CPP_PRECOMPILER_IF_KEY) ||
                tokenType.equals(CppTypes.CPP_PRECOMPILER_ELIF_KEY) ||
                tokenType.equals(CppTypes.CPP_PRECOMPILER_ELSE_KEY) ||
                tokenType.equals(CppTypes.CPP_PRECOMPILER_DEFINE_KEY) ||
                tokenType.equals(CppTypes.CPP_PRECOMPILER_ENDIF_KEY);
    }

    private boolean checkKeywords(IElementType tokenType) {
        return tokenType.equals(CppTypes.CPP_CONST)
                || tokenType.equals(CppTypes.CPP_STATIC)
                || tokenType.equals(CppTypes.CPP_VIRTUAL)
                || tokenType.equals(CppTypes.CPP_NAMESPACE_KEYWORD)
                || tokenType.equals(CppTypes.CPP_USING_KEYWORD)
                || tokenType.equals(CppTypes.CPP_STRUCT_KEYWORD)
                || tokenType.equals(CppTypes.CPP_CLASS_KEYWORD)
                || tokenType.equals(CppTypes.CPP_PUBLIC_KEYWORD)
                || tokenType.equals(CppTypes.CPP_PRIVATE_KEYWORD)
                || tokenType.equals(CppTypes.CPP_RETURN_KEYWORD);
    }

    private boolean checkBasicTypes(IElementType tokenType) {
        return tokenType.equals(CppTypes.CPP_INT_TYPE) ||
                tokenType.equals(CppTypes.CPP_FLOAT_TYPE) ||
                tokenType.equals(CppTypes.CPP_SHORT_TYPE) ||
                tokenType.equals(CppTypes.CPP_DOUBLE_TYPE) ||
                tokenType.equals(CppTypes.CPP_BOOL_TYPE) ||
                tokenType.equals(CppTypes.CPP_CHAR_TYPE) ||
                tokenType.equals(CppTypes.CPP_VOID_TYPE);
    }
}
