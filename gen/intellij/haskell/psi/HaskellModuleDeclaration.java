// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import scala.Option;
import scala.collection.Seq;

public interface HaskellModuleDeclaration extends HaskellDeclarationElement {

  @Nullable
  HaskellExports getExports();

  @NotNull
  List<HaskellGeneralPragmaContent> getGeneralPragmaContentList();

  @NotNull
  HaskellImportDeclarations getImportDeclarations();

  @NotNull
  HaskellModid getModid();

  @Nullable
  HaskellTopDeclaration getTopDeclaration();

  @NotNull
  List<HaskellTopDeclarationLine> getTopDeclarationLineList();

  String getName();

  ItemPresentation getPresentation();

  Seq<HaskellNamedElement> getIdentifierElements();

  Option<String> getModuleName();

}
