package com.example;

public class Greeter {

  public void greet(Developer callee, Plugin caller) {
    System.out.println("Hello, " + callee + ". I am " + caller + ". Nice to Meet You.");
  }
}
