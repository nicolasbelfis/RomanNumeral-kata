package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RomanSpec extends AnyFlatSpec with Matchers {
  "Roman Literal" should "convert arabic to roman numbers" in {
    RomanLiteral.convert(1) shouldBe "I"
    RomanLiteral.convert(2) shouldBe "II"
    RomanLiteral.convert(3) shouldBe "III"
    RomanLiteral.convert(5) shouldBe "V"
    RomanLiteral.convert(10) shouldBe "X"
    RomanLiteral.convert(20) shouldBe "XX"
    RomanLiteral.convert(28) shouldBe "XXVIII"
    RomanLiteral.convert(4) shouldBe "IV"
    RomanLiteral.convert(9) shouldBe "IX"
    RomanLiteral.convert(40) shouldBe "XL"
    RomanLiteral.convert(50) shouldBe "L"
    RomanLiteral.convert(49) shouldBe "XLIX"
    RomanLiteral.convert(89) shouldBe "LXXXIX"
  }
}
