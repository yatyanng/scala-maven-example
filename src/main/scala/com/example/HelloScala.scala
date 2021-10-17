package com.example

object HelloScala extends App {
  if (args.size == 0)
    new Greeter().greet("Scala-Maven-Shade")
  else
    new Greeter().greet(args(0))
}
