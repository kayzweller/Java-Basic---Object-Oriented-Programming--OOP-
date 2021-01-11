package com.program13_HashCodeMethod;

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

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + price;
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;

    Product product = (Product) o;

    if (price != product.price) return false;
    return name != null ? name.equals(product.name) : product.name == null;
  }

}
