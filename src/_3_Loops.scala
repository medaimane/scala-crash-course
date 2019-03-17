object _3_Loops {
  def main(args: Array[String]): Unit = {
    println("Loops in Scala")

    /**
      * Loops: while, do while
      */

    // Examples
    var i = 0

    println("While loop")
    while (i <= 10) {
      println("Index: " + i)
      i += 1
    }

    println("do While loop")
    do {
      i -= 1
      println("Index: " + i)
    } while (i > 0)

    println("For loop")
    for (i <- 0 to 10)
      println("Index: " + i)

    // Loop throughout a string
    val aScalaString = "Scala programming language!"
    for (i <- 0 until aScalaString.length)
      println("Index " + i + " has values [" + aScalaString(i) + "].")

    // Loop throughout a list
    val aScalaList = List(9, 2, 4, 6, 8, 2, 1)
    for(i <- 0 until aScalaList.size)
      println("List item " + i + " is [" + aScalaList(i) + "].")

    println("List items")
    for(i <- aScalaList)
      println("[" + i + "].")

    // Loop and if statements
    val resultList = for { i <- 0 to 20
      if (i % 2) == 0
    } yield i


    println("0 to 20 numbers % 2 == 0 result")
    for (i <- resultList)
      println("item [" + i + "].")

    // two iterators
    for (i <- 1 to 5; j <- 6 to 10)
      println("Addition of " + i + " and " + j + " is [" + (i + j) + "].")

    // Note: there is no `break` or `continue` in scala world

    // Simulate break with function
    def printNumbers(): Unit = {
      val aNumbersList = List(12, 33, 45, 18, 91, 152, 67, 100)
      for (i <- aNumbersList) {
        if (i >= 100) {
          println("Break Works!")
          return
        }
        println("List item: [" + i + "].")
      }
    }

    // call our function
    printNumbers()
  }
}