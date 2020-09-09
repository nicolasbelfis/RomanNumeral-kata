package example

object RomanLiteral {
  def convert(number: Int): String = number match {
    case 1 => "I"
    case 5 => "V"
    case 10 => "X"
    case _ => "I" + convert(number - 1)
  }

}
