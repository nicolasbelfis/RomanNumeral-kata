package example

object RomanLiteral {


  def convert(number: Int): String = {
    val tenToX = (10,"X")
    val fiveToV = (5,"V")
    val oneToI = (1,"I")
    if (number >= tenToX._1)
      tenToX._2 + convert(number - tenToX._1)
    else if (number >= fiveToV._1)
      fiveToV._2 + convert(number - fiveToV._1)
    else if (number >= oneToI._1)
      oneToI._2 + convert(number - oneToI._1)
    else ""
  }

}
