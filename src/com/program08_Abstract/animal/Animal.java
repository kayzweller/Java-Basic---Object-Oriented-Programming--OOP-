package com.program08_Abstract.animal;

public abstract class Animal {
  //
  String name;
  String type;
  int age;

  Animal(String name, int age, String type) {
    this.name = name;
    this.age = age;
    this.type = type;
  }

  public abstract void run();

  public void printAnimal() {
    System.out.println();
    System.out.println("Type : " + type);
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
  }
}
