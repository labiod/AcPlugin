package com.kgb.lang.cpp.features.structureview;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.kgb.lang.cpp.parser.CppFile;
import com.kgb.lang.cpp.psi.CppDefinition;
import com.kgb.lang.cpp.psi.CppMethodDef;
import com.kgb.lang.cpp.psi.CppNamespaceDef;
import com.kgb.lang.cpp.psi.CppVarDef;
import com.kgb.lang.cpp.psi.impl.CppNamespaceDefImpl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BT on 2017-04-04.
 */
public class CppStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
    private PsiElement element;

    public CppStructureViewElement(PsiElement element) {
        this.element = element;
    }

    @Override
    public Object getValue() {
        return element;
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return element instanceof NavigationItem ? ((NavigationItem) element).getPresentation() : null;
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (element instanceof CppFile || element instanceof CppNamespaceDef || element instanceof CppMethodDef) {
            CppDefinition[] definitions = PsiTreeUtil.getChildrenOfType(element, CppDefinition.class);
            if (definitions != null) {
                List<TreeElement> treeElements = new ArrayList<TreeElement>(definitions.length);
                for (CppDefinition property : definitions) {
                    treeElements.add(new CppStructureViewElement(property));
                }
                return treeElements.toArray(new TreeElement[treeElements.size()]);
            }
        }
        return EMPTY_ARRAY;
    }

    @Override
    public void navigate(boolean requestFocus) {
        if (element instanceof NavigationItem) {
            ((NavigationItem) element).navigate(requestFocus);
        }
    }

    @Override
    public boolean canNavigate() {
        return element instanceof NavigationItem && ((NavigationItem) element).canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element instanceof NavigationItem && ((NavigationItem) element).canNavigateToSource();
    }
}
