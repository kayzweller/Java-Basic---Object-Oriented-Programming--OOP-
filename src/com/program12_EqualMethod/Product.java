package com.program12_EqualMethod;

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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;

    Product product = (Product) o;

    if (price != product.price) return false;
    return name != null ? name.equals(product.name) : product.name == null;
  }

/*  Code Below: Overriding equal method manually.
 *
    public boolean equal(Object o) {
    if (o == this) {
      return true;
    }

    if (!(o instanceof Product)) {
      return false;
    }

    var product = (Product) o;

    if(this.price != product.price) {
      return false;
    }

    if(this.name != null) {
      return this.name.equals(product.name);
    }
    else {
      return product.name == null;
    }
  }
 *
 */

}
