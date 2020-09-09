package example

object RomanLiteral {
  def convert(number: Int): String = number match {
    case 1 => "I"
    case _ => "I" + convert(number - 1)
  }

}
