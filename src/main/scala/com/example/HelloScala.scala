package com.example

case class Plugin(firstname: String, surname: String)

object HelloScala extends App {

  // notice the equal sign after the 2nd Unit
  protected def runEveryMillis(callback: () => Unit, delay: Int): Unit = {
    while (true) { callback(); Thread sleep delay }
  }

  override def toString() = Plugin("Scala", "Greeter").copy(surname = "Maven").toString()

  runEveryMillis(() => {
    if (args.size == 0) {
      new Greeter().greet("Developer", this)
    } else {
      new Greeter().greet(args(0), this)
    }
  }, 1000)
}
