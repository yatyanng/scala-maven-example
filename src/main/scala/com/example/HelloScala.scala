package com.example

case class Plugin(firstname: String, surname: String)
case class Developer(firstname: String, surname: String)

trait Schedule[Callee, Caller] {
  // notice the equal sign after the 2nd Unit
  protected def runEveryMillis(callback: (Callee, Caller) => Unit, d: Callee, p: Caller,
                               delay: Int): Unit = {
    while (true) { callback(d, p); Thread sleep delay }
  }
}

object HelloScala extends App with Schedule[Developer, Plugin] {

  val plugin = Plugin("Scala", "Greeter").copy(surname = "Maven")
  var developer = Developer("Mr", "X")
  if (args.size >= 2) {
    developer = Developer(args(0), args(1))
  }
  runEveryMillis((d, p) => Greeter.greet(d, p), developer, plugin, 1000)
}
