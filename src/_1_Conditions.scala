object _1_Conditions {
  def main(args: Array[String]): Unit = {
    println("Conditions in Scala")

    /**
      * Conditional Operators: ==, !=, >, <, >= and <=.
      * Logical: &&, || and !.
      */

    // Examples:

    val myAge = 20

    val canVote = if(myAge >= 18) "yes" else "no"
    println(canVote)

    if (myAge > 25)
      println("Greeter than 25 years old.")
    else if (myAge < 25)
      println("Smaller than 25 years old.")
    else
      println("Equal to 25 years old.")

    println(true || false)
    println(true && false)

  }
}
