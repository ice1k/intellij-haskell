// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellCdecls extends HaskellCompositeElement {

  @NotNull
  List<HaskellCdeclDataDeclaration> getCdeclDataDeclarationList();

  @NotNull
  List<HaskellCideclExpression> getCideclExpressionList();

  @NotNull
  List<HaskellDataDeclaration> getDataDeclarationList();

  @NotNull
  List<HaskellDefaultDeclaration> getDefaultDeclarationList();

  @NotNull
  List<HaskellInlinelikePragma> getInlinelikePragmaList();

  @NotNull
  List<HaskellInstanceDeclaration> getInstanceDeclarationList();

  @NotNull
  List<HaskellMinimalPragma> getMinimalPragmaList();

  @NotNull
  List<HaskellNewtypeDeclaration> getNewtypeDeclarationList();

  @NotNull
  List<HaskellSpecializePragma> getSpecializePragmaList();

  @NotNull
  List<HaskellTypeDeclaration> getTypeDeclarationList();

  @NotNull
  List<HaskellTypeFamilyDeclaration> getTypeFamilyDeclarationList();

  @NotNull
  List<HaskellTypeSignature> getTypeSignatureList();

}
