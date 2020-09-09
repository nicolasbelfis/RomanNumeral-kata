package example

object RomanLiteral {
  val RomanRepresentationList = List(
    RomanRepresentation(50, "L"),
    RomanRepresentation(40, "XL"),
    RomanRepresentation(10, "X"),
    RomanRepresentation(9, "IX"),
    RomanRepresentation(5, "V"),
    RomanRepresentation(4, "IV"),
    RomanRepresentation(1, "I")
  )

  def convert(number: Int): String = {
    iterate(
      number,
      RomanRepresentationList)
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
