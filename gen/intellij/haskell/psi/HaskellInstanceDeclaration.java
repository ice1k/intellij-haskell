// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import scala.Option;
import scala.collection.Seq;

public interface HaskellInstanceDeclaration extends HaskellTopDeclaration, HaskellDeclarationElement {

  @NotNull
  List<HaskellCidecl> getCideclList();

  @Nullable
  HaskellInst getInst();

  @Nullable
  HaskellQName getQName();

  @Nullable
  HaskellScontext getScontext();

  @Nullable
  HaskellTypeEquality getTypeEquality();

  @NotNull
  List<HaskellVarCon> getVarConList();

  String getName();

  ItemPresentation getPresentation();

  Seq<HaskellNamedElement> getIdentifierElements();

  Option<String> getModuleName();

}
