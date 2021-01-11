package com.program19_EnumClass;

public class Customer {

  private String name;
  private Level level;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  //. accessing the price of an enum
  public void setPrice(double price) {
    level.setPrice(price);
  }

}
