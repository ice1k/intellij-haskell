// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static intellij.haskell.psi.HaskellTypes.*;
import intellij.haskell.psi.*;
import com.intellij.navigation.ItemPresentation;
import scala.Option;
import scala.collection.Seq;

public class HaskellNewtypeDeclarationImpl extends HaskellTopDeclarationImpl implements HaskellNewtypeDeclaration {

  public HaskellNewtypeDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitNewtypeDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellCcontext getCcontext() {
    return PsiTreeUtil.getChildOfType(this, HaskellCcontext.class);
  }

  @Override
  @NotNull
  public HaskellNewconstr getNewconstr() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellNewconstr.class));
  }

  @Override
  @NotNull
  public HaskellSimpletype getSimpletype() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellSimpletype.class));
  }

  @Override
  @Nullable
  public HaskellTtype getTtype() {
    return PsiTreeUtil.getChildOfType(this, HaskellTtype.class);
  }

  @Override
  public String getName() {
    return HaskellPsiImplUtil.getName(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return HaskellPsiImplUtil.getPresentation(this);
  }

  @Override
  public Seq<HaskellNamedElement> getIdentifierElements() {
    return HaskellPsiImplUtil.getIdentifierElements(this);
  }

  @Override
  public Option<String> getModuleName() {
    return HaskellPsiImplUtil.getModuleName(this);
  }

  @Override
  public HaskellNamedElement getDataTypeConstructor() {
    return HaskellPsiImplUtil.getDataTypeConstructor(this);
  }

}
