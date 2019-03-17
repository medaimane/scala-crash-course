// Import libraries functions:
import scala.math._ // _ to import all the library.

object _0_Basics {
  def main(args: Array[String]) : Unit = {
    println("Basics")

    // Hello World!
    // print on the screen
    println("Hello, Scala World!")

    // Comments :
    // This is one line comment.
    /**
    * This is a multiple lines comment.
    */

    // Variables :
    // var variables are able to changed
    var myAge = 26
    myAge += 1

    // val variables are not able to changed
    val myName = "Med Aimane"
    val myCity = "Tetouan"

    println("My name's " + myName + ", I'm " + myAge + " and I live on " + myCity)

    // Math library
    println("Math functions :")
    println(abs(-8))
    println(ceil(1.27))
    println(round(3.2))
    println(pow(2,2))
    println(exp(2.27))
    println("...")

  }
}
