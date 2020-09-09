package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RomanSpec extends AnyFlatSpec with Matchers {
  "Roman Literal" should "convert arabic to roman numbers" in {
    RomanLiteral.convert(1) shouldBe "I"
    RomanLiteral.convert(2) shouldBe "II"
  }
}
