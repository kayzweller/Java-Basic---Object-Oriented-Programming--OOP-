package com.program08_Abstract.animal;

public class Alpaca extends Animal {

  // Construct matching super
  Alpaca(String name, int age) {
    super(name, age, "Alpaca");
  }

  // method overriding in this one is a must [from abstract class Animal]
  public void run() {
    System.out.println("Run " + name + ", Run!");
  }

  public void printAnimal() {
    System.out.println();
    System.out.println("Type : " + type);
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
  }

}
