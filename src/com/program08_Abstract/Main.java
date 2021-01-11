package com.program08_Abstract;

public class Main {
  public static void main(String[] args) {

    // parent class [abstract class, can only be inherited]
    // instantiated will return error!
//    ClassOne co = new ClassOne("hello", "aloona");
//    System.out.println(co.a);
//    System.out.println(co.b);

    // inherited from ClassOne [object created]
    ClassTwo ct1 = new ClassTwo("Hello", "Aloona");
    System.out.println(ct1.a + " " + ct1.b + "!");

    ClassTwo ct2 = new ClassTwo("Hello", "Albert");
    System.out.println(ct2.a + " " + ct2.b + "!");

    // using polymorphism
    ct1 = new ClassThree("Hello", "Cindy", "XOXLTN");
    System.out.println(ct1.a + " " + ct1.b + ", from " + ct1.c);
    ct1.run();

    ct2 = new ClassThree("Hello", "Aloona", "re:Encode");
    System.out.println(ct2.a + " " + ct2.b + ", from " + ct2.c);
    ct2.run();

  }
}
