package com.kgb.lang.cpp.features.annotators;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.kgb.lang.cpp.psi.CppVarAssign;
import com.kgb.lang.cpp.psi.CppVarDef;
import com.kgb.lang.cpp.psi.CppVarName;
import com.kgb.lang.cpp.psi.CppVarValue;
import com.kgb.lang.cpp.tree.CppTreeUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-03-31.
 */
public class CppVarAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder holder) {
        if (psiElement instanceof CppVarDef) {
            if (!psiElement.isValid()) {
                TextRange range = new TextRange(psiElement.getTextRange().getStartOffset(),
                        psiElement.getTextRange().getEndOffset());
                holder.createErrorAnnotation(range, "Incompatible types");
            }
        } else if (psiElement instanceof CppVarAssign) {
            CppVarDef varDef = CppTreeUtils.findVarDefinition(((CppVarAssign) psiElement).getVarName());
            if (varDef != null) {
                if (!varDef.isValid()) {
                    TextRange range = new TextRange(psiElement.getTextRange().getStartOffset(),
                            psiElement.getTextRange().getEndOffset());
                    holder.createErrorAnnotation(range, "Incompatible types");
                }
            } else if (!CppTreeUtils.checkLibraries(((CppVarAssign) psiElement).getVarName())){
                TextRange range = new TextRange(psiElement.getTextRange().getStartOffset(),
                        psiElement.getTextRange().getEndOffset());
                holder.createErrorAnnotation(range, "Variable not define");
            }
        }
    }
}
