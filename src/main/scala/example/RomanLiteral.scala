package example

object RomanLiteral {


  def convert(number: Int): String =  number match {
    case 1 => "I"
    case 5 => "V"
    case 10 => "X"
    case _ => {
      if(number >= 10) "X"+convert(number -10)
      else if(number >= 1) "I"+convert(number -1)
      else ""
    }
  }

}
