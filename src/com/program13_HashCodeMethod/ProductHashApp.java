package com.program13_HashCodeMethod;

public class ProductHashApp {

  public static void main(String[] args) {

    Product product = new Product("Macbook Pro 16",30_000_000);
    productAccess(product);
    // to string method called
    System.out.println(product);

    GameConsole console = new GameConsole("XBOX X", 7_500_000);
    productAccess(console);
    // to string method called
    System.out.println(console);

    Product product2 = new Product("Macbook Pro 16",30_000_000);
    System.out.println();
    System.out.println(product.equals(product2));
    System.out.println(product.hashCode() == product2.hashCode());

  }

  static void productAccess(Product product) {
    System.out.println();
    System.out.println(product.name);
    System.out.println(product.price);
  }

}
