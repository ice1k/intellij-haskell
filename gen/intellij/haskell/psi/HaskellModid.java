// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import intellij.haskell.psi.stubs.HaskellModidStub;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public interface HaskellModid extends HaskellNamedElement, StubBasedPsiElement<HaskellModidStub> {

  @NotNull
  List<HaskellConid> getConidList();

  String getName();

  PsiElement setName(String newName);

  HaskellNamedElement getNameIdentifier();

  PsiReference getReference();

  ItemPresentation getPresentation();

}
