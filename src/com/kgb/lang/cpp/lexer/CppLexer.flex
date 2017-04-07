package com.kgb.lang.cpp.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.kgb.lang.cpp.psi.CppTypes.*;

%%

%{
  public CppLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class CppLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

WHITE_SPACE=[\s\n\r\t]
LINE_COMMENTS="//".*
MULTILINE_COMMENT="/"\*( [^*] | (\*+[^*/]) )*\*+"/"
STRING_PATTERN=(\"([^\"\\]|\\.)*\")
INCLUDE_PATH=[ \t\n\x0B\f\r]<([\w\\\s\\.\/]+)>
CHAR=('([^'\\]|\\.)*')
NUMBER=[0-9]+(\.[0-9]*)?
KEY_NAME=[a-zA-Z_][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}            { return WHITE_SPACE; }

  "{"                      { return CPP_LB; }
  "}"                      { return CPP_RB; }
  "("                      { return CPP_LB2; }
  ")"                      { return CPP_RB2; }
  "["                      { return CPP_LB3; }
  "]"                      { return CPP_RB3; }
  "<"                      { return CPP_LB4; }
  ">"                      { return CPP_RB4; }
  "="                      { return CPP_EQ; }
  "!="                     { return CPP_NOT_EQ; }
  "<<"                     { return CPP_OUT; }
  ">>"                     { return CPP_IN; }
  ";"                      { return CPP_SEMICOLON; }
  ":"                      { return CPP_COLON; }
  "."                      { return CPP_DOT; }
  "->"                     { return CPP_POINTER_CALL; }
  ","                      { return CPP_COMMA; }
  "*"                      { return CPP_POINTER; }
  "&"                      { return CPP_REFERENCE; }
  "[]"                     { return CPP_TABLE; }
  "\""                     { return CPP_APOS; }
  "::"                     { return CPP_VAR_ACCESSOR; }
  "~"                      { return CPP_DESTRUCTOR_KEY; }
  "short"                  { return CPP_SHORT_TYPE; }
  "int"                    { return CPP_INT_TYPE; }
  "long"                   { return CPP_LONG_TYPE; }
  "float"                  { return CPP_FLOAT_TYPE; }
  "double"                 { return CPP_DOUBLE_TYPE; }
  "char"                   { return CPP_CHAR_TYPE; }
  "void"                   { return CPP_VOID_TYPE; }
  "bool"                   { return CPP_BOOL_TYPE; }
  "const"                  { return CPP_CONST; }
  "static"                 { return CPP_STATIC; }
  "virtual"                { return CPP_VIRTUAL; }
  "true"                   { return CPP_TRUE; }
  "false"                  { return CPP_FALSE; }
  "#include"               { return CPP_INCLUDE_KEYWORD; }
  "#if"                    { return CPP_PRECOMPILER_IF_KEY; }
  "#else"                  { return CPP_PRECOMPILER_ELSE_KEY; }
  "#elif"                  { return CPP_PRECOMPILER_ELIF_KEY; }
  "#endif"                 { return CPP_PRECOMPILER_ENDIF_KEY; }
  "#define"                { return CPP_PRECOMPILER_DEFINE_KEY; }
  "namespace"              { return CPP_NAMESPACE_KEYWORD; }
  "using"                  { return CPP_USING_KEYWORD; }
  "struct"                 { return CPP_STRUCT_KEYWORD; }
  "class"                  { return CPP_CLASS_KEYWORD; }
  "return"                 { return CPP_RETURN_KEYWORD; }
  "public"                 { return CPP_PUBLIC_KEYWORD; }
  "private"                { return CPP_PRIVATE_KEYWORD; }
  "NULL"                   { return CPP_NULL_KEYWORD; }
  "if"                     { return CPP_IF_KEYWORD; }
  "else"                   { return CPP_ELSE_KEYWORD; }

  {WHITE_SPACE}            { return CPP_WHITE_SPACE; }
  {LINE_COMMENTS}          { return CPP_LINE_COMMENTS; }
  {MULTILINE_COMMENT}      { return CPP_MULTILINE_COMMENT; }
  {STRING_PATTERN}         { return CPP_STRING_PATTERN; }
  {INCLUDE_PATH}           { return CPP_INCLUDE_PATH; }
  {CHAR}                   { return CPP_CHAR; }
  {NUMBER}                 { return CPP_NUMBER; }
  {KEY_NAME}               { return CPP_KEY_NAME; }

}

[^] { return BAD_CHARACTER; }
