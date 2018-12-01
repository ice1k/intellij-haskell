// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellConstr2 extends HaskellCompositeElement {

  @Nullable
  HaskellQName getQName();

  @NotNull
  List<HaskellTtype> getTtypeList();

  @NotNull
  List<HaskellUnpackNounpackPragma> getUnpackNounpackPragmaList();

}
