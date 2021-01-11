package com.program11_ToStringMethod;

public class ProductApp extends Console {

  ProductApp(String name, int price) {
    super(name, price);
  }

  public static void main(String[] args) {

    var product = new Product("Macbook Pro 16",30_000_000);
    System.out.println();
    productAccess(product);
    // to string method called
    System.out.println(product);

    var console = new Console("XBOX X", 7_500_000);
    System.out.println();
    productAccess(console);
    // to string method called
    System.out.println(console);

    var proApp = new ProductApp("Ableton Live 11 Suite", 13_000_000);
    System.out.println();
    productAccess(proApp);
    // to string method called
    System.out.println(proApp);

  }

  static void productAccess(Product product) {
    System.out.println(product.name);
    System.out.println(product.price);
  }

}
