package com.kgb.lang.cpp.tree;

import com.kgb.lang.cpp.psi.CppDefinition;
import com.kgb.lang.cpp.psi.CppVarDef;
import com.kgb.lang.cpp.psi.CppVarName;

/**
 * Created by BT on 2017-04-03.
 */
public class CppTreeUtils {
    public static CppVarDef findVarDefinition(CppVarName varName) {
        return null;
    }

    public static boolean checkLibraries(CppVarName varName) {
        if (varName.getText().equals("std::cout") || varName.getText().equals("std::cin")) {
            return true;
        }
        return false;
    }
}
