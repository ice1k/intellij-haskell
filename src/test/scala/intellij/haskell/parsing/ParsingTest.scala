package intellij.haskell.parsing

import com.intellij.testFramework.ParsingTestCase
import intellij.haskell.HaskellParserDefinition

class ParsingTest extends ParsingTestCase("", "hs", new HaskellParserDefinition) {
  override def getTestDataPath: String = "src/test/testData/parsing"
  def testSimple(): Unit = {
    doTest(true)
  }
}
