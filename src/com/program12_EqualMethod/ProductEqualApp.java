package com.program12_EqualMethod;

public class ProductEqualApp {

  public static void main(String[] args) {

    var product = new Product("Macbook Pro 16",30_000_000);
    productAccess(product);
    // to string method called
    System.out.println(product);
    System.out.println(product.hashCode());

    var console = new GameConsole("XBOX X", 7_500_000);
    productAccess(console);
    // to string method called
    System.out.println(console);
    System.out.println(console.hashCode());


    var product2 = new Product("Macbook Pro 16",30_000_000);
    System.out.println();
    System.out.println(product2.hashCode());
    System.out.println(product.equals(product2));
  }

  static void productAccess(Product product) {
    System.out.println();
    System.out.println(product.name);
    System.out.println(product.price);
  }

}
