package com.program11_ToStringMethod;

public class Product {

  protected String name;
  protected int price;

  protected Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // Overriding toString method
  public String toString() {
    return "Product name: " + name + ", Price: " + price;
  }

}
