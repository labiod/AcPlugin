package com.kgb.lang.cpp.features.structureview;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * Created by BT on 2017-04-04.
 */
public class CppStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {
    public CppStructureViewModel(PsiFile psiFile) {
        super(psiFile, new CppStructureViewElement(psiFile));
    }

    @NotNull
    @Override
    public Sorter[] getSorters() {
        return new Sorter[] {Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement structureViewTreeElement) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof PsiFile;
    }
}
