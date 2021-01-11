package com.program12_EqualMethod;

public class GameConsole extends Product {

  String type;

  protected GameConsole(String name, int price) {
    super(name, price);
    this.type = "Game Console";
  }

}
