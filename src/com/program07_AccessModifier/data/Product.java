package com.program07_AccessModifier.data;

public class Product {

  /**
   * FOR VARIABLE -or- FIELD
   * PUBLIC       : OPEN ACCESS
   * PROTECTED    : INSIDE SAME PACKAGE & SUBCLASS [OKAY WITH DIFFERENT PACKAGE]
   * NO MODIFIER  : ONLY INSIDE SAME PACKAGE
   * PRIVATE      : ONLY INSIDE SAME CLASS
   */

  protected String name;
  protected int price;

  protected Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

}
