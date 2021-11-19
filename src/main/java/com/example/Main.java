package com.example;

import com.example.test.Greeter;

public class Main {

  public static void main(String[] args) {
    Greeter greeter = new Greeter();
    if (args.length >= 2) {
      greeter.run(args[0], args[1]);
    } else {
      System.out.println("Not enough arguments, expected 2!");
    }
  }
}
