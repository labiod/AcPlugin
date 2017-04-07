//This is generated class. Do not change anything
package com.kgb.lang.cpp.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kgb.lang.cpp.psi.impl.CppTokenElement;
import com.kgb.lang.cpp.psi.impl.*;

public interface CppTypes {

  IElementType CPP_BASE_TOKEN = new CppElementType("CPP_BASE_TOKEN");
  IElementType CPP_BASIC_DEF_TYPE = new CppElementType("CPP_BASIC_DEF_TYPE");
  IElementType CPP_CALL = new CppElementType("CPP_CALL");
  IElementType CPP_CAST = new CppElementType("CPP_CAST");
  IElementType CPP_CLASS_CONSTRUCTOR_DEF = new CppElementType("CPP_CLASS_CONSTRUCTOR_DEF");
  IElementType CPP_CLASS_DEF = new CppElementType("CPP_CLASS_DEF");
  IElementType CPP_CLASS_DESTRUCTOR_DEF = new CppElementType("CPP_CLASS_DESTRUCTOR_DEF");
  IElementType CPP_COMMA_SEPARATED_LIST = new CppElementType("CPP_COMMA_SEPARATED_LIST");
  IElementType CPP_COMMENTS = new CppElementType("CPP_COMMENTS");
  IElementType CPP_COND = new CppElementType("CPP_COND");
  IElementType CPP_IF_STATEMENT = new CppElementType("CPP_IF_STATEMENT");
  IElementType CPP_INCLUDE = new CppElementType("CPP_INCLUDE");
  IElementType CPP_METHOD_ARG = new CppElementType("CPP_METHOD_ARG");
  IElementType CPP_METHOD_ARGS = new CppElementType("CPP_METHOD_ARGS");
  IElementType CPP_METHOD_CALL = new CppElementType("CPP_METHOD_CALL");
  IElementType CPP_METHOD_DEF = new CppElementType("CPP_METHOD_DEF");
  IElementType CPP_METHOD_PARAM = new CppElementType("CPP_METHOD_PARAM");
  IElementType CPP_METHOD_PARAMS = new CppElementType("CPP_METHOD_PARAMS");
  IElementType CPP_NAMESPACE_DEF = new CppElementType("CPP_NAMESPACE_DEF");
  IElementType CPP_NAMESPACE_USE = new CppElementType("CPP_NAMESPACE_USE");
  IElementType CPP_PRECOMPILER_DEFINE = new CppElementType("CPP_PRECOMPILER_DEFINE");
  IElementType CPP_PRECOMPILER_ELIF = new CppElementType("CPP_PRECOMPILER_ELIF");
  IElementType CPP_PRECOMPILER_ELSE = new CppElementType("CPP_PRECOMPILER_ELSE");
  IElementType CPP_PRECOMPILER_IF = new CppElementType("CPP_PRECOMPILER_IF");
  IElementType CPP_RETURN_CALL = new CppElementType("CPP_RETURN_CALL");
  IElementType CPP_SEP = new CppElementType("CPP_SEP");
  IElementType CPP_STRING = new CppElementType("CPP_STRING");
  IElementType CPP_STRUCT_DEF = new CppElementType("CPP_STRUCT_DEF");
  IElementType CPP_TEMPLATE = new CppElementType("CPP_TEMPLATE");
  IElementType CPP_TYPE_OPTION = new CppElementType("CPP_TYPE_OPTION");
  IElementType CPP_USER_DEF_TYPE = new CppElementType("CPP_USER_DEF_TYPE");
  IElementType CPP_VAR_ACCESSOR_SEPARATED_LIST = new CppElementType("CPP_VAR_ACCESSOR_SEPARATED_LIST");
  IElementType CPP_VAR_ASSIGN = new CppElementType("CPP_VAR_ASSIGN");
  IElementType CPP_VAR_DEF = new CppElementType("CPP_VAR_DEF");
  IElementType CPP_VAR_NAME = new CppElementType("CPP_VAR_NAME");
  IElementType CPP_VAR_TYPE = new CppElementType("CPP_VAR_TYPE");
  IElementType CPP_VAR_VALUE = new CppElementType("CPP_VAR_VALUE");
  IElementType CPP_VNAME = new CppElementType("CPP_VNAME");

  IElementType CPP_APOS = new CppTokenElement("\"");
  IElementType CPP_BOOL_TYPE = new CppTokenElement("bool");
  IElementType CPP_CHAR = new CppTokenElement("char");
  IElementType CPP_CHAR_TYPE = new CppTokenElement("char");
  IElementType CPP_CLASS_KEYWORD = new CppTokenElement("class");
  IElementType CPP_COLON = new CppTokenElement(":");
  IElementType CPP_COMMA = new CppTokenElement(",");
  IElementType CPP_CONST = new CppTokenElement("const");
  IElementType CPP_DESTRUCTOR_KEY = new CppTokenElement("~");
  IElementType CPP_DOT = new CppTokenElement(".");
  IElementType CPP_DOUBLE_TYPE = new CppTokenElement("double");
  IElementType CPP_ELSE_KEYWORD = new CppTokenElement("else");
  IElementType CPP_EQ = new CppTokenElement("=");
  IElementType CPP_FALSE = new CppTokenElement("false");
  IElementType CPP_FLOAT_TYPE = new CppTokenElement("float");
  IElementType CPP_IF_KEYWORD = new CppTokenElement("if");
  IElementType CPP_IN = new CppTokenElement(">>");
  IElementType CPP_INCLUDE_KEYWORD = new CppTokenElement("#include");
  IElementType CPP_INCLUDE_PATH = new CppTokenElement("include_path");
  IElementType CPP_INT_TYPE = new CppTokenElement("int");
  IElementType CPP_KEY_NAME = new CppTokenElement("key_name");
  IElementType CPP_LB = new CppTokenElement("{");
  IElementType CPP_LB2 = new CppTokenElement("(");
  IElementType CPP_LB3 = new CppTokenElement("[");
  IElementType CPP_LB4 = new CppTokenElement("<");
  IElementType CPP_LINE_COMMENTS = new CppTokenElement("line_comments");
  IElementType CPP_LONG_TYPE = new CppTokenElement("long");
  IElementType CPP_MULTILINE_COMMENT = new CppTokenElement("multiline_comment");
  IElementType CPP_NAMESPACE_KEYWORD = new CppTokenElement("namespace");
  IElementType CPP_NOT_EQ = new CppTokenElement("!=");
  IElementType CPP_NULL_KEYWORD = new CppTokenElement("NULL");
  IElementType CPP_NUMBER = new CppTokenElement("number");
  IElementType CPP_OUT = new CppTokenElement("<<");
  IElementType CPP_POINTER = new CppTokenElement("*");
  IElementType CPP_POINTER_CALL = new CppTokenElement("->");
  IElementType CPP_PRECOMPILER_DEFINE_KEY = new CppTokenElement("#define");
  IElementType CPP_PRECOMPILER_ELIF_KEY = new CppTokenElement("#elif");
  IElementType CPP_PRECOMPILER_ELSE_KEY = new CppTokenElement("#else");
  IElementType CPP_PRECOMPILER_ENDIF_KEY = new CppTokenElement("#endif");
  IElementType CPP_PRECOMPILER_IF_KEY = new CppTokenElement("#if");
  IElementType CPP_PRIVATE_KEYWORD = new CppTokenElement("private");
  IElementType CPP_PUBLIC_KEYWORD = new CppTokenElement("public");
  IElementType CPP_RB = new CppTokenElement("}");
  IElementType CPP_RB2 = new CppTokenElement(")");
  IElementType CPP_RB3 = new CppTokenElement("]");
  IElementType CPP_RB4 = new CppTokenElement(">");
  IElementType CPP_REFERENCE = new CppTokenElement("&");
  IElementType CPP_RETURN_KEYWORD = new CppTokenElement("return");
  IElementType CPP_SEMICOLON = new CppTokenElement(";");
  IElementType CPP_SHORT_TYPE = new CppTokenElement("short");
  IElementType CPP_STATIC = new CppTokenElement("static");
  IElementType CPP_STRING_PATTERN = new CppTokenElement("string_pattern");
  IElementType CPP_STRUCT_KEYWORD = new CppTokenElement("struct");
  IElementType CPP_TABLE = new CppTokenElement("[]");
  IElementType CPP_TRUE = new CppTokenElement("true");
  IElementType CPP_USING_KEYWORD = new CppTokenElement("using");
  IElementType CPP_VAR_ACCESSOR = new CppTokenElement("::");
  IElementType CPP_VIRTUAL = new CppTokenElement("virtual");
  IElementType CPP_VOID_TYPE = new CppTokenElement("void");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CPP_BASE_TOKEN) {
        return new CppBaseTokenImpl(node);
      }
      else if (type == CPP_BASIC_DEF_TYPE) {
        return new CppBasicDefTypeImpl(node);
      }
      else if (type == CPP_CALL) {
        return new CppCallImpl(node);
      }
      else if (type == CPP_CAST) {
        return new CppCastImpl(node);
      }
      else if (type == CPP_CLASS_CONSTRUCTOR_DEF) {
        return new CppClassConstructorDefImpl(node);
      }
      else if (type == CPP_CLASS_DEF) {
        return new CppClassDefImpl(node);
      }
      else if (type == CPP_CLASS_DESTRUCTOR_DEF) {
        return new CppClassDestructorDefImpl(node);
      }
      else if (type == CPP_COMMA_SEPARATED_LIST) {
        return new CppCommaSeparatedListImpl(node);
      }
      else if (type == CPP_COMMENTS) {
        return new CppCommentsImpl(node);
      }
      else if (type == CPP_COND) {
        return new CppCondImpl(node);
      }
      else if (type == CPP_IF_STATEMENT) {
        return new CppIfStatementImpl(node);
      }
      else if (type == CPP_INCLUDE) {
        return new CppIncludeImpl(node);
      }
      else if (type == CPP_METHOD_ARG) {
        return new CppMethodArgImpl(node);
      }
      else if (type == CPP_METHOD_ARGS) {
        return new CppMethodArgsImpl(node);
      }
      else if (type == CPP_METHOD_CALL) {
        return new CppMethodCallImpl(node);
      }
      else if (type == CPP_METHOD_DEF) {
        return new CppMethodDefImpl(node);
      }
      else if (type == CPP_METHOD_PARAM) {
        return new CppMethodParamImpl(node);
      }
      else if (type == CPP_METHOD_PARAMS) {
        return new CppMethodParamsImpl(node);
      }
      else if (type == CPP_NAMESPACE_DEF) {
        return new CppNamespaceDefImpl(node);
      }
      else if (type == CPP_NAMESPACE_USE) {
        return new CppNamespaceUseImpl(node);
      }
      else if (type == CPP_PRECOMPILER_DEFINE) {
        return new CppPrecompilerDefineImpl(node);
      }
      else if (type == CPP_PRECOMPILER_ELIF) {
        return new CppPrecompilerElifImpl(node);
      }
      else if (type == CPP_PRECOMPILER_ELSE) {
        return new CppPrecompilerElseImpl(node);
      }
      else if (type == CPP_PRECOMPILER_IF) {
        return new CppPrecompilerIfImpl(node);
      }
      else if (type == CPP_RETURN_CALL) {
        return new CppReturnCallImpl(node);
      }
      else if (type == CPP_SEP) {
        return new CppSepImpl(node);
      }
      else if (type == CPP_STRING) {
        return new CppStringImpl(node);
      }
      else if (type == CPP_STRUCT_DEF) {
        return new CppStructDefImpl(node);
      }
      else if (type == CPP_TEMPLATE) {
        return new CppTemplateImpl(node);
      }
      else if (type == CPP_TYPE_OPTION) {
        return new CppTypeOptionImpl(node);
      }
      else if (type == CPP_USER_DEF_TYPE) {
        return new CppUserDefTypeImpl(node);
      }
      else if (type == CPP_VAR_ACCESSOR_SEPARATED_LIST) {
        return new CppVarAccessorSeparatedListImpl(node);
      }
      else if (type == CPP_VAR_ASSIGN) {
        return new CppVarAssignImpl(node);
      }
      else if (type == CPP_VAR_DEF) {
        return new CppVarDefImpl(node);
      }
      else if (type == CPP_VAR_NAME) {
        return new CppVarNameImpl(node);
      }
      else if (type == CPP_VAR_TYPE) {
        return new CppVarTypeImpl(node);
      }
      else if (type == CPP_VAR_VALUE) {
        return new CppVarValueImpl(node);
      }
      else if (type == CPP_VNAME) {
        return new CppVnameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
