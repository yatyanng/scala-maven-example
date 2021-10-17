package com.example

case class Plugin(firstname: String, surname: String)
case class Developer(firstname: String, surname: String)

trait Schedule[T] {
  // notice the equal sign after the 2nd Unit
  protected def runEveryMillis(callback: (T) => Unit, x: T, delay: Int): Unit = {
    while (true) { callback(x); Thread sleep delay }
  }
}

object HelloScala extends App with Schedule[Plugin] {

  private val plugin = Plugin("Scala", "Greeter").copy(surname = "Maven")

  runEveryMillis((p) => {
    if (args.size < 2) {
      new Greeter().greet(Developer("Mr", "X"), p)
    } else {
      new Greeter().greet(Developer(args(0), args(1)), p)
    }
  }, plugin, 1000)
}
