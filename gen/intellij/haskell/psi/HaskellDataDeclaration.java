// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import scala.Option;
import scala.collection.Seq;

public interface HaskellDataDeclaration extends HaskellDataConstructorDeclarationElement {

  @Nullable
  HaskellCcontext getCcontext();

  @NotNull
  List<HaskellConstr1> getConstr1List();

  @NotNull
  List<HaskellConstr2> getConstr2List();

  @NotNull
  List<HaskellConstr3> getConstr3List();

  @Nullable
  HaskellCtypePragma getCtypePragma();

  @Nullable
  HaskellDataDeclarationDeriving getDataDeclarationDeriving();

  @NotNull
  List<HaskellKindSignature> getKindSignatureList();

  @NotNull
  List<HaskellQName> getQNameList();

  @NotNull
  HaskellSimpletype getSimpletype();

  @Nullable
  HaskellTtype getTtype();

  @NotNull
  List<HaskellTypeSignature> getTypeSignatureList();

  String getName();

  ItemPresentation getPresentation();

  Seq<HaskellNamedElement> getIdentifierElements();

  Option<String> getModuleName();

  HaskellNamedElement getDataTypeConstructor();

}
