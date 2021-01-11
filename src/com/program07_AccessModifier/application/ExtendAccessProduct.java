package com.program07_AccessModifier.application;

import com.program07_AccessModifier.data.Product;

// protected constructor & method

public class ExtendAccessProduct extends Product {

  protected ExtendAccessProduct(String name, int price) {
    super(name, price);
  }

  protected void AccessProduct() {
    System.out.println("Product : " + this.name + ", Price : " + this.price);
  }

}
