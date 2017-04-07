package com.kgb.lang.cpp.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.kgb.lang.cpp.CppConstant;
import com.kgb.lang.cpp.CppLanguage;
import com.kgb.lang.cpp.lexer.CppLexerAdapter;
import com.kgb.lang.cpp.psi.CppTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-03-27.
 */
public class CppParserDefinition implements ParserDefinition {
    private static final  IFileElementType FILE = new IFileElementType(Language.findInstance(CppLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new CppLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new CppParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return TokenSet.create(TokenType.WHITE_SPACE);
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.create(CppTypes.CPP_LINE_COMMENTS, CppTypes.CPP_MULTILINE_COMMENT);
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.create(CppTypes.CPP_STRING);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return CppTypes.Factory.createElement(astNode);
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new CppFile(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }
}
