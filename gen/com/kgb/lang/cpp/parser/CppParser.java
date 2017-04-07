//This is generated class. Do not change anything
package com.kgb.lang.cpp.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.kgb.lang.cpp.psi.CppTypes.*;
import static com.kgb.lang.cpp.parser.CppParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CppParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CPP_BASE_TOKEN) {
      r = base_token(b, 0);
    }
    else if (t == CPP_BASIC_DEF_TYPE) {
      r = basic_def_type(b, 0);
    }
    else if (t == CPP_CALL) {
      r = call(b, 0);
    }
    else if (t == CPP_CAST) {
      r = cast(b, 0);
    }
    else if (t == CPP_CLASS_CONSTRUCTOR_DEF) {
      r = class_constructor_def(b, 0);
    }
    else if (t == CPP_CLASS_DEF) {
      r = class_def(b, 0);
    }
    else if (t == CPP_CLASS_DESTRUCTOR_DEF) {
      r = class_destructor_def(b, 0);
    }
    else if (t == CPP_COMMENTS) {
      r = comments(b, 0);
    }
    else if (t == CPP_COND) {
      r = cond(b, 0);
    }
    else if (t == CPP_IF_STATEMENT) {
      r = if_statement(b, 0);
    }
    else if (t == CPP_INCLUDE) {
      r = include(b, 0);
    }
    else if (t == CPP_METHOD_ARG) {
      r = method_arg(b, 0);
    }
    else if (t == CPP_METHOD_ARGS) {
      r = method_args(b, 0);
    }
    else if (t == CPP_METHOD_CALL) {
      r = method_call(b, 0);
    }
    else if (t == CPP_METHOD_DEF) {
      r = method_def(b, 0);
    }
    else if (t == CPP_METHOD_PARAM) {
      r = method_param(b, 0);
    }
    else if (t == CPP_METHOD_PARAMS) {
      r = method_params(b, 0);
    }
    else if (t == CPP_NAMESPACE_DEF) {
      r = namespace_def(b, 0);
    }
    else if (t == CPP_NAMESPACE_USE) {
      r = namespace_use(b, 0);
    }
    else if (t == CPP_PRECOMPILER_DEFINE) {
      r = precompiler_define(b, 0);
    }
    else if (t == CPP_PRECOMPILER_ELIF) {
      r = precompiler_elif(b, 0);
    }
    else if (t == CPP_PRECOMPILER_ELSE) {
      r = precompiler_else(b, 0);
    }
    else if (t == CPP_PRECOMPILER_IF) {
      r = precompiler_if(b, 0);
    }
    else if (t == CPP_RETURN_CALL) {
      r = return_call(b, 0);
    }
    else if (t == CPP_SEP) {
      r = sep(b, 0);
    }
    else if (t == CPP_STRING) {
      r = string(b, 0);
    }
    else if (t == CPP_STRUCT_DEF) {
      r = struct_def(b, 0);
    }
    else if (t == CPP_TEMPLATE) {
      r = template(b, 0);
    }
    else if (t == CPP_TYPE_OPTION) {
      r = type_option(b, 0);
    }
    else if (t == CPP_USER_DEF_TYPE) {
      r = user_def_type(b, 0);
    }
    else if (t == CPP_VAR_ASSIGN) {
      r = var_assign(b, 0);
    }
    else if (t == CPP_VAR_DEF) {
      r = var_def(b, 0);
    }
    else if (t == CPP_VAR_NAME) {
      r = var_name(b, 0);
    }
    else if (t == CPP_VAR_TYPE) {
      r = var_type(b, 0);
    }
    else if (t == CPP_VAR_VALUE) {
      r = var_value(b, 0);
    }
    else if (t == CPP_VNAME) {
      r = vname(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // void_type | bool_type | char_type | int_type | float_type | double_type | short_type | long_type
  public static boolean base_token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_token")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_BASE_TOKEN, "<base token>");
    r = consumeToken(b, CPP_VOID_TYPE);
    if (!r) r = consumeToken(b, CPP_BOOL_TYPE);
    if (!r) r = consumeToken(b, CPP_CHAR_TYPE);
    if (!r) r = consumeToken(b, CPP_INT_TYPE);
    if (!r) r = consumeToken(b, CPP_FLOAT_TYPE);
    if (!r) r = consumeToken(b, CPP_DOUBLE_TYPE);
    if (!r) r = consumeToken(b, CPP_SHORT_TYPE);
    if (!r) r = consumeToken(b, CPP_LONG_TYPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // base_token type_option?
  public static boolean basic_def_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_def_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_BASIC_DEF_TYPE, "<basic def type>");
    r = base_token(b, l + 1);
    r = r && basic_def_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_option?
  private static boolean basic_def_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_def_type_1")) return false;
    type_option(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> (precompiler | namespace_use | namespace_def | struct_def | class_def
  //     | var_assign | var_def | method_def | (call ";") | statements | comments)
  static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = body_0(b, l + 1);
    r = r && body_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // precompiler | namespace_use | namespace_def | struct_def | class_def
  //     | var_assign | var_def | method_def | (call ";") | statements | comments
  private static boolean body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precompiler(b, l + 1);
    if (!r) r = namespace_use(b, l + 1);
    if (!r) r = namespace_def(b, l + 1);
    if (!r) r = struct_def(b, l + 1);
    if (!r) r = class_def(b, l + 1);
    if (!r) r = var_assign(b, l + 1);
    if (!r) r = var_def(b, l + 1);
    if (!r) r = method_def(b, l + 1);
    if (!r) r = body_1_8(b, l + 1);
    if (!r) r = statements(b, l + 1);
    if (!r) r = comments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // call ";"
  private static boolean body_1_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_1_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = call(b, l + 1);
    r = r && consumeToken(b, CPP_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // method_call | var_call | return_call
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CALL, "<call>");
    r = method_call(b, l + 1);
    if (!r) r = var_call(b, l + 1);
    if (!r) r = return_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (LB2 var_type RB2) | var_type
  public static boolean cast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CAST, "<cast>");
    r = cast_0(b, l + 1);
    if (!r) r = var_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LB2 var_type RB2
  private static boolean cast_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_LB2);
    r = r && var_type(b, l + 1);
    r = r && consumeToken(b, CPP_RB2);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_keywords? var_name LB2 method_args? RB2 LB body* RB
  public static boolean class_constructor_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_constructor_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CLASS_CONSTRUCTOR_DEF, "<definition>");
    r = class_constructor_def_0(b, l + 1);
    r = r && var_name(b, l + 1);
    r = r && consumeToken(b, CPP_LB2);
    r = r && class_constructor_def_3(b, l + 1);
    r = r && consumeTokens(b, 0, CPP_RB2, CPP_LB);
    r = r && class_constructor_def_6(b, l + 1);
    r = r && consumeToken(b, CPP_RB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var_keywords?
  private static boolean class_constructor_def_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_constructor_def_0")) return false;
    var_keywords(b, l + 1);
    return true;
  }

  // method_args?
  private static boolean class_constructor_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_constructor_def_3")) return false;
    method_args(b, l + 1);
    return true;
  }

  // body*
  private static boolean class_constructor_def_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_constructor_def_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_constructor_def_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // class_keyword vname LB (private_class_body | public_class_body)* RB ";"
  public static boolean class_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_def")) return false;
    if (!nextTokenIs(b, CPP_CLASS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CLASS_DEF, "<definition>");
    r = consumeToken(b, CPP_CLASS_KEYWORD);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_LB);
    r = r && class_def_3(b, l + 1);
    r = r && consumeTokens(b, 0, CPP_RB, CPP_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (private_class_body | public_class_body)*
  private static boolean class_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_def_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!class_def_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_def_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // private_class_body | public_class_body
  private static boolean class_def_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_def_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = private_class_body(b, l + 1);
    if (!r) r = public_class_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_keywords? DESTRUCTOR_KEY var_name LB2 method_args? RB2 LB body* RB
  public static boolean class_destructor_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_destructor_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_CLASS_DESTRUCTOR_DEF, "<definition>");
    r = class_destructor_def_0(b, l + 1);
    r = r && consumeToken(b, CPP_DESTRUCTOR_KEY);
    r = r && var_name(b, l + 1);
    r = r && consumeToken(b, CPP_LB2);
    r = r && class_destructor_def_4(b, l + 1);
    r = r && consumeTokens(b, 0, CPP_RB2, CPP_LB);
    r = r && class_destructor_def_7(b, l + 1);
    r = r && consumeToken(b, CPP_RB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var_keywords?
  private static boolean class_destructor_def_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_destructor_def_0")) return false;
    var_keywords(b, l + 1);
    return true;
  }

  // method_args?
  private static boolean class_destructor_def_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_destructor_def_4")) return false;
    method_args(b, l + 1);
    return true;
  }

  // body*
  private static boolean class_destructor_def_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_destructor_def_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_destructor_def_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // <<param>> ("," <<param>>) *
  public static boolean comma_separated_list(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && comma_separated_list_1(b, l + 1, _param);
    exit_section_(b, m, CPP_COMMA_SEPARATED_LIST, r);
    return r;
  }

  // ("," <<param>>) *
  private static boolean comma_separated_list_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!comma_separated_list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "comma_separated_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "," <<param>>
  private static boolean comma_separated_list_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_COMMA);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // line_comments | multiline_comment
  public static boolean comments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comments")) return false;
    if (!nextTokenIs(b, "<comments>", CPP_LINE_COMMENTS, CPP_MULTILINE_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_COMMENTS, "<comments>");
    r = consumeToken(b, CPP_LINE_COMMENTS);
    if (!r) r = consumeToken(b, CPP_MULTILINE_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var_value (EQ | NOT_EQ) var_value
  public static boolean cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_COND, "<cond>");
    r = var_value(b, l + 1);
    r = r && cond_1(b, l + 1);
    r = r && var_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EQ | NOT_EQ
  private static boolean cond_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_EQ);
    if (!r) r = consumeToken(b, CPP_NOT_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if_keyword LB2 cond RB2 LB body* RB
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, CPP_IF_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CPP_IF_KEYWORD, CPP_LB2);
    r = r && cond(b, l + 1);
    r = r && consumeTokens(b, 0, CPP_RB2, CPP_LB);
    r = r && if_statement_5(b, l + 1);
    r = r && consumeToken(b, CPP_RB);
    exit_section_(b, m, CPP_IF_STATEMENT, r);
    return r;
  }

  // body*
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // include_keyword (include_path | string )
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, CPP_INCLUDE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_INCLUDE_KEYWORD);
    r = r && include_1(b, l + 1);
    exit_section_(b, m, CPP_INCLUDE, r);
    return r;
  }

  // include_path | string
  private static boolean include_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_INCLUDE_PATH);
    if (!r) r = string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_type var_keywords? var_name
  public static boolean method_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_METHOD_ARG, "<method arg>");
    r = var_type(b, l + 1);
    r = r && method_arg_1(b, l + 1);
    r = r && var_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var_keywords?
  private static boolean method_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_arg_1")) return false;
    var_keywords(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<comma_separated_list(method_arg)>>
  public static boolean method_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_args")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_METHOD_ARGS, "<method args>");
    r = comma_separated_list(b, l + 1, method_args_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (method_arg)
  private static boolean method_args_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_args_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_name LB2 method_params? RB2
  public static boolean method_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call")) return false;
    if (!nextTokenIs(b, CPP_KEY_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_name(b, l + 1);
    r = r && consumeToken(b, CPP_LB2);
    r = r && method_call_2(b, l + 1);
    r = r && consumeToken(b, CPP_RB2);
    exit_section_(b, m, CPP_METHOD_CALL, r);
    return r;
  }

  // method_params?
  private static boolean method_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_2")) return false;
    method_params(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // var_def_type vname template? LB2 method_args? RB2 LB body* RB
  public static boolean method_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_METHOD_DEF, "<definition>");
    r = var_def_type(b, l + 1);
    r = r && vname(b, l + 1);
    r = r && method_def_2(b, l + 1);
    r = r && consumeToken(b, CPP_LB2);
    r = r && method_def_4(b, l + 1);
    r = r && consumeTokens(b, 0, CPP_RB2, CPP_LB);
    r = r && method_def_7(b, l + 1);
    r = r && consumeToken(b, CPP_RB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // template?
  private static boolean method_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_def_2")) return false;
    template(b, l + 1);
    return true;
  }

  // method_args?
  private static boolean method_def_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_def_4")) return false;
    method_args(b, l + 1);
    return true;
  }

  // body*
  private static boolean method_def_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_def_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_def_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // method_call | var_name | string | number
  public static boolean method_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_METHOD_PARAM, "<method param>");
    r = method_call(b, l + 1);
    if (!r) r = var_name(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = consumeToken(b, CPP_NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<comma_separated_list(method_param)>>
  public static boolean method_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_params")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_METHOD_PARAMS, "<method params>");
    r = comma_separated_list(b, l + 1, method_params_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (method_param)
  private static boolean method_params_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_params_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // namespace_keyword vname LB body* RB
  public static boolean namespace_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_def")) return false;
    if (!nextTokenIs(b, CPP_NAMESPACE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_NAMESPACE_DEF, "<definition>");
    r = consumeToken(b, CPP_NAMESPACE_KEYWORD);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_LB);
    r = r && namespace_def_3(b, l + 1);
    r = r && consumeToken(b, CPP_RB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // body*
  private static boolean namespace_def_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_def_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_def_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // using_keyword namespace_keyword vname ";"
  public static boolean namespace_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_use")) return false;
    if (!nextTokenIs(b, CPP_USING_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CPP_USING_KEYWORD, CPP_NAMESPACE_KEYWORD);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_SEMICOLON);
    exit_section_(b, m, CPP_NAMESPACE_USE, r);
    return r;
  }

  /* ********************************************************** */
  // precompiler_if | precompiler_define | include
  static boolean precompiler(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precompiler_if(b, l + 1);
    if (!r) r = precompiler_define(b, l + 1);
    if (!r) r = include(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // precompiler_define_key vname var_value
  public static boolean precompiler_define(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_define")) return false;
    if (!nextTokenIs(b, CPP_PRECOMPILER_DEFINE_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_PRECOMPILER_DEFINE_KEY);
    r = r && vname(b, l + 1);
    r = r && var_value(b, l + 1);
    exit_section_(b, m, CPP_PRECOMPILER_DEFINE, r);
    return r;
  }

  /* ********************************************************** */
  // precompiler_elif_key vname LB2 vname RB2 body*
  public static boolean precompiler_elif(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_elif")) return false;
    if (!nextTokenIs(b, CPP_PRECOMPILER_ELIF_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_PRECOMPILER_ELIF_KEY);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_LB2);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_RB2);
    r = r && precompiler_elif_5(b, l + 1);
    exit_section_(b, m, CPP_PRECOMPILER_ELIF, r);
    return r;
  }

  // body*
  private static boolean precompiler_elif_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_elif_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "precompiler_elif_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // precompiler_else_key body*
  public static boolean precompiler_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_else")) return false;
    if (!nextTokenIs(b, CPP_PRECOMPILER_ELSE_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_PRECOMPILER_ELSE_KEY);
    r = r && precompiler_else_1(b, l + 1);
    exit_section_(b, m, CPP_PRECOMPILER_ELSE, r);
    return r;
  }

  // body*
  private static boolean precompiler_else_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_else_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "precompiler_else_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // precompiler_if_key vname LB2 vname RB2 body* precompiler_elif* precompiler_else? precompiler_endif_key
  public static boolean precompiler_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_if")) return false;
    if (!nextTokenIs(b, CPP_PRECOMPILER_IF_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_PRECOMPILER_IF_KEY);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_LB2);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_RB2);
    r = r && precompiler_if_5(b, l + 1);
    r = r && precompiler_if_6(b, l + 1);
    r = r && precompiler_if_7(b, l + 1);
    r = r && consumeToken(b, CPP_PRECOMPILER_ENDIF_KEY);
    exit_section_(b, m, CPP_PRECOMPILER_IF, r);
    return r;
  }

  // body*
  private static boolean precompiler_if_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_if_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "precompiler_if_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // precompiler_elif*
  private static boolean precompiler_if_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_if_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!precompiler_elif(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "precompiler_if_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // precompiler_else?
  private static boolean precompiler_if_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precompiler_if_7")) return false;
    precompiler_else(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (private_keyword COLON)? (var_def | method_def | class_constructor_def | class_destructor_def)+
  static boolean private_class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_class_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = private_class_body_0(b, l + 1);
    r = r && private_class_body_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (private_keyword COLON)?
  private static boolean private_class_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_class_body_0")) return false;
    private_class_body_0_0(b, l + 1);
    return true;
  }

  // private_keyword COLON
  private static boolean private_class_body_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_class_body_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CPP_PRIVATE_KEYWORD, CPP_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (var_def | method_def | class_constructor_def | class_destructor_def)+
  private static boolean private_class_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_class_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = private_class_body_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!private_class_body_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "private_class_body_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // var_def | method_def | class_constructor_def | class_destructor_def
  private static boolean private_class_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "private_class_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_def(b, l + 1);
    if (!r) r = method_def(b, l + 1);
    if (!r) r = class_constructor_def(b, l + 1);
    if (!r) r = class_destructor_def(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // public_keyword COLON (var_def | method_def | class_constructor_def | class_destructor_def)+
  static boolean public_class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "public_class_body")) return false;
    if (!nextTokenIs(b, CPP_PUBLIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CPP_PUBLIC_KEYWORD, CPP_COLON);
    r = r && public_class_body_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (var_def | method_def | class_constructor_def | class_destructor_def)+
  private static boolean public_class_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "public_class_body_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = public_class_body_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!public_class_body_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "public_class_body_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // var_def | method_def | class_constructor_def | class_destructor_def
  private static boolean public_class_body_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "public_class_body_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_def(b, l + 1);
    if (!r) r = method_def(b, l + 1);
    if (!r) r = class_constructor_def(b, l + 1);
    if (!r) r = class_destructor_def(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // return_keyword (var_call | method_call)
  public static boolean return_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_call")) return false;
    if (!nextTokenIs(b, CPP_RETURN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_RETURN_KEYWORD);
    r = r && return_call_1(b, l + 1);
    exit_section_(b, m, CPP_RETURN_CALL, r);
    return r;
  }

  // var_call | method_call
  private static boolean return_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_call(b, l + 1);
    if (!r) r = method_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // body*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    int c = current_position_(b);
    while (true) {
      if (!body(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EQ | IN | OUT
  public static boolean sep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_SEP, "<sep>");
    r = consumeToken(b, CPP_EQ);
    if (!r) r = consumeToken(b, CPP_IN);
    if (!r) r = consumeToken(b, CPP_OUT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if_statement
  static boolean statements(PsiBuilder b, int l) {
    return if_statement(b, l + 1);
  }

  /* ********************************************************** */
  // (string_pattern | var_name)+
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "<string>", CPP_KEY_NAME, CPP_STRING_PATTERN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_STRING, "<string>");
    r = string_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!string_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // string_pattern | var_name
  private static boolean string_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_STRING_PATTERN);
    if (!r) r = var_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_def+
  static boolean struct_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_def(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!var_def(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // struct_keyword vname LB struct_body RB ";"
  public static boolean struct_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_def")) return false;
    if (!nextTokenIs(b, CPP_STRUCT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_STRUCT_DEF, "<definition>");
    r = consumeToken(b, CPP_STRUCT_KEYWORD);
    r = r && vname(b, l + 1);
    r = r && consumeToken(b, CPP_LB);
    r = r && struct_body(b, l + 1);
    r = r && consumeTokens(b, 0, CPP_RB, CPP_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LB4 <<comma_separated_list(var_type)>> RB4
  public static boolean template(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template")) return false;
    if (!nextTokenIs(b, CPP_LB4)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_LB4);
    r = r && comma_separated_list(b, l + 1, template_1_0_parser_);
    r = r && consumeToken(b, CPP_RB4);
    exit_section_(b, m, CPP_TEMPLATE, r);
    return r;
  }

  // (var_type)
  private static boolean template_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // POINTER | REFERENCE | "[]" | template
  public static boolean type_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_option")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_TYPE_OPTION, "<type option>");
    r = consumeToken(b, CPP_POINTER);
    if (!r) r = consumeToken(b, CPP_REFERENCE);
    if (!r) r = consumeToken(b, CPP_TABLE);
    if (!r) r = template(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var_name type_option?
  public static boolean user_def_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_def_type")) return false;
    if (!nextTokenIs(b, CPP_KEY_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_name(b, l + 1);
    r = r && user_def_type_1(b, l + 1);
    exit_section_(b, m, CPP_USER_DEF_TYPE, r);
    return r;
  }

  // type_option?
  private static boolean user_def_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_def_type_1")) return false;
    type_option(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // REFERENCE | POINTER | cast
  static boolean value_option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_option")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_REFERENCE);
    if (!r) r = consumeToken(b, CPP_POINTER);
    if (!r) r = cast(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<param>> ("::" <<param>>) *
  public static boolean var_accessor_separated_list(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "var_accessor_separated_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && var_accessor_separated_list_1(b, l + 1, _param);
    exit_section_(b, m, CPP_VAR_ACCESSOR_SEPARATED_LIST, r);
    return r;
  }

  // ("::" <<param>>) *
  private static boolean var_accessor_separated_list_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "var_accessor_separated_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!var_accessor_separated_list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "var_accessor_separated_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "::" <<param>>
  private static boolean var_accessor_separated_list_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "var_accessor_separated_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_VAR_ACCESSOR);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_name (sep var_value)? ";"
  public static boolean var_assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_assign")) return false;
    if (!nextTokenIs(b, CPP_KEY_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_name(b, l + 1);
    r = r && var_assign_1(b, l + 1);
    r = r && consumeToken(b, CPP_SEMICOLON);
    exit_section_(b, m, CPP_VAR_ASSIGN, r);
    return r;
  }

  // (sep var_value)?
  private static boolean var_assign_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_assign_1")) return false;
    var_assign_1_0(b, l + 1);
    return true;
  }

  // sep var_value
  private static boolean var_assign_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_assign_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sep(b, l + 1);
    r = r && var_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (var_name | "(" POINTER? var_name ")")  ((DOT | POINTER_CALL) method_call)
  static boolean var_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_call")) return false;
    if (!nextTokenIs(b, "", CPP_LB2, CPP_KEY_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_call_0(b, l + 1);
    r = r && var_call_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // var_name | "(" POINTER? var_name ")"
  private static boolean var_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_name(b, l + 1);
    if (!r) r = var_call_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" POINTER? var_name ")"
  private static boolean var_call_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_call_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_LB2);
    r = r && var_call_0_1_1(b, l + 1);
    r = r && var_name(b, l + 1);
    r = r && consumeToken(b, CPP_RB2);
    exit_section_(b, m, null, r);
    return r;
  }

  // POINTER?
  private static boolean var_call_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_call_0_1_1")) return false;
    consumeToken(b, CPP_POINTER);
    return true;
  }

  // (DOT | POINTER_CALL) method_call
  private static boolean var_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_call_1_0(b, l + 1);
    r = r && method_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT | POINTER_CALL
  private static boolean var_call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_DOT);
    if (!r) r = consumeToken(b, CPP_POINTER_CALL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_def_type var_name (sep var_value)? ";"
  public static boolean var_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_VAR_DEF, "<definition>");
    r = var_def_type(b, l + 1);
    r = r && var_name(b, l + 1);
    r = r && var_def_2(b, l + 1);
    r = r && consumeToken(b, CPP_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (sep var_value)?
  private static boolean var_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def_2")) return false;
    var_def_2_0(b, l + 1);
    return true;
  }

  // sep var_value
  private static boolean var_def_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sep(b, l + 1);
    r = r && var_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (var_type var_keywords?) | (var_keywords? var_type)
  static boolean var_def_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_def_type_0(b, l + 1);
    if (!r) r = var_def_type_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // var_type var_keywords?
  private static boolean var_def_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_type(b, l + 1);
    r = r && var_def_type_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // var_keywords?
  private static boolean var_def_type_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def_type_0_1")) return false;
    var_keywords(b, l + 1);
    return true;
  }

  // var_keywords? var_type
  private static boolean var_def_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_def_type_1_0(b, l + 1);
    r = r && var_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // var_keywords?
  private static boolean var_def_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_def_type_1_0")) return false;
    var_keywords(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // const | static | virtual
  static boolean var_keywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_keywords")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_CONST);
    if (!r) r = consumeToken(b, CPP_STATIC);
    if (!r) r = consumeToken(b, CPP_VIRTUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<var_accessor_separated_list(vname)>>
  public static boolean var_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_name")) return false;
    if (!nextTokenIs(b, CPP_KEY_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_accessor_separated_list(b, l + 1, var_name_0_0_parser_);
    exit_section_(b, m, CPP_VAR_NAME, r);
    return r;
  }

  // (vname)
  private static boolean var_name_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_name_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vname(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // user_def_type | basic_def_type
  public static boolean var_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_VAR_TYPE, "<var type>");
    r = user_def_type(b, l + 1);
    if (!r) r = basic_def_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (value_option? ((LB2 var_value_internal RB2) | var_value_internal)) | call
  public static boolean var_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CPP_VAR_VALUE, "<var value>");
    r = var_value_0(b, l + 1);
    if (!r) r = call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // value_option? ((LB2 var_value_internal RB2) | var_value_internal)
  private static boolean var_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_value_0_0(b, l + 1);
    r = r && var_value_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // value_option?
  private static boolean var_value_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_value_0_0")) return false;
    value_option(b, l + 1);
    return true;
  }

  // (LB2 var_value_internal RB2) | var_value_internal
  private static boolean var_value_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_value_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_value_0_1_0(b, l + 1);
    if (!r) r = var_value_internal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LB2 var_value_internal RB2
  private static boolean var_value_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_value_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_LB2);
    r = r && var_value_internal(b, l + 1);
    r = r && consumeToken(b, CPP_RB2);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string | number | char | var_name | null_keyword | true | false
  static boolean var_value_internal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_value_internal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string(b, l + 1);
    if (!r) r = consumeToken(b, CPP_NUMBER);
    if (!r) r = consumeToken(b, CPP_CHAR);
    if (!r) r = var_name(b, l + 1);
    if (!r) r = consumeToken(b, CPP_NULL_KEYWORD);
    if (!r) r = consumeToken(b, CPP_TRUE);
    if (!r) r = consumeToken(b, CPP_FALSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // key_name template?
  public static boolean vname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vname")) return false;
    if (!nextTokenIs(b, CPP_KEY_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CPP_KEY_NAME);
    r = r && vname_1(b, l + 1);
    exit_section_(b, m, CPP_VNAME, r);
    return r;
  }

  // template?
  private static boolean vname_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vname_1")) return false;
    template(b, l + 1);
    return true;
  }

  final static Parser method_args_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return method_args_0_0(b, l + 1);
    }
  };
  final static Parser method_params_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return method_params_0_0(b, l + 1);
    }
  };
  final static Parser template_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return template_1_0(b, l + 1);
    }
  };
  final static Parser var_name_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return var_name_0_0(b, l + 1);
    }
  };
}
