import scala.io.StdIn.readLine

object _4_IO {
  def main(args: Array[String]): Unit = {
    println("IO in Scala")

    /**
      * Input and output
      */


    // IO via the console
    var inputName = ""

    do {
      println("Type your name: ")
      println("> ")
      inputName = readLine()
    } while (inputName.length <= 0)

    println(inputName)
  }
}