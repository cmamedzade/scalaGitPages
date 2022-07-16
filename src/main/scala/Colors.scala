
object Colors {

  /**
   * Color enum represents type of color build from string
   */
   protected object Color extends Enumeration {
    type Color = Value
    val RED, BLACK, WHITE, BLUE, YELLOW, GREEN = Value
  }
  import Color._

  /**
   * @param input is any color in type of string
   * @return new object which is represents color in this domain, prevents wrong color name.
   */
  def getColor(input: String): Color = {
    input match {
      case "red" => RED
      case "black" => BLACK
      case "white" => WHITE
      case "blue" => BLUE
      case "yellow" => YELLOW
      case "green" => GREEN
      case _ => throw new MatchError("no color found")
    }
  }

  def displayColor(color: Color): Unit = {
    println(s"color is: ${color.toString}")
  }
}