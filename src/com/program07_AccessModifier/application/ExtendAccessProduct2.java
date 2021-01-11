package com.program07_AccessModifier.application;

import com.program07_AccessModifier.data.Product;

// public constructor & method

public class ExtendAccessProduct2 extends Product {

  public ExtendAccessProduct2(String name, int price) {
    super(name, price);
  }

  public void AccessProduct() {
    System.out.println("EX Product : " + this.name + ", Price : " + this.price);
  }

}
