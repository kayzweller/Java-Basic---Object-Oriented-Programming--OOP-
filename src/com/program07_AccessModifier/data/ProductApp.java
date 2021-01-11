package com.program07_AccessModifier.data;

import com.program07_AccessModifier.application.*;

// PACKAGE & ACCESS MODIFIER [01:42:51]

public class ProductApp extends ExtendAccessProduct {

  // use Constructor Overloaded in order to inherit from EAP
  ProductApp(String name, int price) {
    super(name, price);
  }

  public static void main(String[] args) {

    Product product = new Product("Macbook Pro 16",30_000_000);
    System.out.println();
    System.out.println(product.name);
    System.out.println(product.price);

    // protected constructor & method inherited from different package [WHY ERROR?]
    // ~ because, even though you calling it as an extends class (inherited)
    // ~ you trying to call it, not really inherit the class.
    // ~ that's why 'protected' access modifier wont work!
//    ExtendAccessProduct eap = new ExtendAccessProduct("iPhone 13", 17_000_000);
//    System.out.println();
//    System.out.println(eap.name);
//    System.out.println(eap.price);
//    eap.AccessProduct();

    // public constructor & method imported from different package [EAP2]
    // ~ this is the right way to call imported class
    ExtendAccessProduct2 eap2 = new ExtendAccessProduct2("iPhone 13 Pro Max", 25_000_000);
    System.out.println();
    System.out.println(eap2.name);
    System.out.println(eap2.price);
    eap2.AccessProduct();

    // ~ this is the true way you create inheritance from EAP class
    ProductApp proApp = new ProductApp("PlayStation 5", 21_000_000);
    System.out.println();
    productAccess(proApp);
  }

  static void productAccess(ProductApp product) {
    System.out.println(product.name);
    System.out.println(product.price);
    product.AccessProduct();
  }

}
