package example

object RomanLiteral {


  def convert(number: Int): String =
  if (number >= 10) "X" + convert(number - 10)
  else if (number >= 5) "V" + convert(number - 5)
  else if (number >= 1) "I" + convert(number - 1)
  else ""

}
