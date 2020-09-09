package example

object RomanLiteral {

  def convert(number: Int): String = {
    iterate(
      number,
      List(
        RomanRepresentation(10, "X"),
        RomanRepresentation(5, "V"),
        RomanRepresentation(1, "I")
      ))
  }

  private def iterate(number: Int,
                      representations: List[RomanRepresentation]
                     ): String =
    representations match {
      case h :: t =>
        if (number >= h.arabic)
          h.roman + iterate(number - h.arabic, h :: t)
        else iterate(number, t)
      case Nil => ""
    }
}

case class RomanRepresentation(arabic: Int, roman: String)
