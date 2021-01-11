package com.program19_EnumClass;

// ENUM [03:19:05]
// ~ Class with predetermined value option.
// ~ enum class cannot extend another class,
// ~ but it's still can implement another interface.

//. ~ Inside enum class, you can add members (field, method and constructor)
//. ~ special for 'constructor' you cannot add public constructor.

public enum Level {

  STANDARD("Standard Edition", 35),
  PREMIUM("Premium Edition", 65),
  VIP("VIP Edition", 95);

  // imo, best wat to use this is,
  // put this as private final field.
  private final String description;
  private double price;

  Level(String description, int price) {
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  //. using this you can change 'price' of an Enum
  public void setPrice(double price) {
    this.price = price;
  }

}
