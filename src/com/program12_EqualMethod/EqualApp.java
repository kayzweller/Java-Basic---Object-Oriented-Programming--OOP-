package com.program12_EqualMethod;

// [02:19'27"]

public class EqualApp {
  public static void main(String[] args) {
    //
    String first = "Aloona";
    first = first + " " + "Kristaen";
    System.out.println(first);

    String second = "Aloona Kristaen";
    System.out.println(second);

    String third = "Aloona Kristaen";
    System.out.println(third);

    System.out.println();
    System.out.println(first == second);      // false  - object checking...
    System.out.println(second == third);      // true   - java memory optimization
    System.out.println(first.equals(second)); // true   - value inside of var/field comparison
    System.out.println(second.equals(third)); // true

    System.out.println();
    System.out.println(first == third);
    System.out.println(first.equals(third));
  }

}
