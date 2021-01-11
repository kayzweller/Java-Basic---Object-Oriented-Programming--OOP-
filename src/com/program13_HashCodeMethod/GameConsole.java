package com.program13_HashCodeMethod;

public class GameConsole extends Product {

  String type;

  protected GameConsole(String name, int price) {
    super(name, price);
    this.type = "Game Console";
  }

}
