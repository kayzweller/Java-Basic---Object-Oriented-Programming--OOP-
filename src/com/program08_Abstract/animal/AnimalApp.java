package com.program08_Abstract.animal;

public class AnimalApp {
  public static void main(String[] args) {
    //
    var alpaca = new Alpaca("Ogre", 9);
    printRun(alpaca);

    var eagle = new Eagle("Rocky", 5);
    printRun(eagle);

    var alpaca2 = new Alpaca("Kool", 11);
    printRun(alpaca2);

    // polymorphism to Horse Child Class
    alpaca2 = new Horse("Skull", 7);
    printRun(alpaca2);

    // polymorphism to Pony Child Class
    alpaca2 = new Pony("Cook", 13);
    printRun(alpaca2);

    // when engage the polymorphism, you cannot directly access
    // field/variable and method that being declare in child class.
    // you can only access field/variable and method that being
    // declare inside the class where the object instantiated.
    // But, you can still use Method Overriding (y).
//    alpaca2.ponyPrint;
//    System.out.println(alpaca2.ponyTail);

  }

  static void printRun (Animal animal) {
    animal.printAnimal();
    animal.run();

    // only check type of an object when it's first instantiated.
    // polymorphism cannot change the object instance made of.
    if (animal instanceof Eagle) {
      System.out.println("This an Eagle");
    }
    else if (animal instanceof Alpaca) {
      System.out.println("This an Alpaca");
    }
    else if (animal instanceof Horse) {
      System.out.println("This a Horse");
    }
    else if (animal instanceof Pony) {
      System.out.println("This a Pony");
    }

  }
}
