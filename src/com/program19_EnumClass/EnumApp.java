package com.program19_EnumClass;

public class EnumApp {
  public static void main(String[] args) {
    //.
    Customer c1 = new Customer();
    c1.setName("Aloona");
    c1.setLevel(Level.PREMIUM);

    // get 10% discount for PREMIUM
    double price = c1.getLevel().getPrice();
    c1.setPrice(price - (price * 0.1));

    System.out.println();
    System.out.println(c1.getName());
    System.out.println(c1.getLevel() + " \"" + c1.getLevel().getDescription() + "\"");
    System.out.println(c1.getLevel().getPrice());

    //.
    Customer c2 = new Customer();
    c2.setName("Cindy");
    c2.setLevel(Level.VIP);

    // get 25% discount for VIP
    double price2 = c2.getLevel().getPrice();
    c2.setPrice(price2 - (price2 * 0.25));

    System.out.println();
    System.out.println(c2.getName());
    System.out.println(c2.getLevel() + " \"" + c2.getLevel().getDescription() + "\"");
    System.out.println(c2.getLevel().getPrice());
    System.out.println();

    //. enum conversion
    String levelString = Level.STANDARD.name();
    System.out.println(levelString);

    Level level = Level.valueOf("PREMIUM");
    System.out.println(level.name());

    System.out.println("Print Level:");
    for (var value: Level.values()) {
      System.out.println(value.name());
    }

  }
}
