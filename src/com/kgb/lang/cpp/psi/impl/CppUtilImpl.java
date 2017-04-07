package com.kgb.lang.cpp.psi.impl;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiUtil;
import com.kgb.lang.cpp.CppConstant;
import com.kgb.lang.cpp.features.CppIcons;
import com.kgb.lang.cpp.psi.*;
import com.kgb.lang.cpp.tree.CppTreeUtils;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CppUtilImpl {
    public static String getName(CppVarDef varDef) {
        return varDef.getVarName().getText();
    }

    public static String getName(CppVarAssign varDef) {
        return varDef.getVarName().getText();
    }

    public static String getName(CppMethodDef varDef) {
        return varDef.getVname().getText();
    }

    public static String getName(CppNamespaceDef namespaceDef) {
        return namespaceDef.getVname().getText();
    }

    public static String getName(CppStructDef structDef) {
        return structDef.getVname().getText();
    }

    public static String getName(CppClassDef classDef) {
        return classDef.getVname().getText();
    }

    public static String getName(CppClassConstructorDef classDef) {
        return classDef.getVarName().getText();
    }

    public static String getName(CppClassDestructorDef classDef) {
        return classDef.getVarName().getText();
    }

    public static String getName(CppVarType type) {
        if (type.getBasicDefType() != null) {
            return type.getBasicDefType().getBaseToken().getText();
        } else {
            return type.getUserDefType().getText();
        }
    }

    public static PsiElement setName(CppDefinition definition, String name) {
        return definition;
    }

    public static IElementType getBaseTypeToken(CppBasicDefType basicDefType) {
        String tokenText = basicDefType.getBaseToken().getText();
        if (tokenText.equals(CppTypes.CPP_INT_TYPE.toString())) {
            return CppTypes.CPP_INT_TYPE;
        } else if (tokenText.equals(CppTypes.CPP_SHORT_TYPE.toString())) {
            return CppTypes.CPP_SHORT_TYPE;
        } else if (tokenText.equals(CppTypes.CPP_LONG_TYPE.toString())) {
            return CppTypes.CPP_LONG_TYPE;
        } else if (tokenText.equals(CppTypes.CPP_FLOAT_TYPE.toString())) {
            return CppTypes.CPP_FLOAT_TYPE;
        } else if (tokenText.equals(CppTypes.CPP_DOUBLE_TYPE.toString())) {
            return CppTypes.CPP_DOUBLE_TYPE;
        } else if (tokenText.equals(CppTypes.CPP_BOOL_TYPE.toString())) {
            return CppTypes.CPP_BOOL_TYPE;
        } else if (tokenText.equals(CppTypes.CPP_CHAR_TYPE.toString())) {
            return CppTypes.CPP_CHAR_TYPE;
        }
        return CppTypes.CPP_VOID_TYPE;
    }

    //Valid element

    public static boolean validValue(CppVarType type, CppVarValue varValue) {
        if (varValue == null) {
            return true;
        }
        if (type.getUserDefType() != null) {
            return true;
        } else if (type.getBasicDefType() != null) {
            if (type.getBasicDefType().isInt() || type.getBasicDefType().isShort()) {
                return varValue.getNumber() != null && varValue.getNumber().getText().matches("^-?\\d+$");
            } else if (type.getBasicDefType().isDouble() || type.getBasicDefType().isFloat()) {
                return varValue.getNumber() != null && varValue.getNumber().getText().matches("^-?\\d+(\\.\\d+)?$");
            } else if (type.getBasicDefType().isChar()) {
                if (type.getBasicDefType().isPointer()) {
                    return varValue.getString() != null || varValue.getVarName() != null;
                } else {
                    return varValue.getChar() != null;
                }
            }
        }
        return true;
    }

    public static boolean isValid(CppVarDef varDef) {
        return varDef.getVarType().validValue(varDef.getVarValue());
    }
    public static boolean isValid(CppVarAssign varAssign) {
        CppVarDef varDef = CppTreeUtils.findVarDefinition(varAssign.getVarName());
        return varDef != null && varDef.getVarType().validValue(varDef.getVarValue());
    }

    public static String getLibName(CppInclude include) {
        return include.getIncludePath() != null ? include.getIncludePath().getText() : include.getString().getText();
    }

    public static ItemPresentation getPresentation(final CppNamespaceDef element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return CppIcons.NAMESPACE_ICON;
            }
        };
    }

    public static ItemPresentation getPresentation(final CppVarDef element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return CppIcons.VAR_ICON;
            }
        };
    }

    public static ItemPresentation getPresentation(final CppMethodDef element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return CppIcons.FUNCTION_ICON;
            }
        };
    }

    public static ItemPresentation getPresentation(final CppStructDef element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return CppIcons.STRUCT_ICON;
            }
        };
    }

    public static ItemPresentation getPresentation(final CppDefinition element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return CppIcons.STRUCT_ICON;
            }
        };
    }

}
