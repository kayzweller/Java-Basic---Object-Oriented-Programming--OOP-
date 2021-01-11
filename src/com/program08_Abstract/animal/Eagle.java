package com.program08_Abstract.animal;

public class Eagle extends Animal {

  Eagle(String name, int age) {
    super(name, age, "Eagle");
  }

  public void run() {
    System.out.println("Fly " + name + ", Fly Higher!");
  }

  public void printAnimal() {
    System.out.println();
    System.out.println("This is an Eagle");
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
  }
}
