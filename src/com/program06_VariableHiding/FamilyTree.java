package com.program06_VariableHiding;

class Parent {
  String name;
  void doIt() {
    System.out.println("Do it in Parent");
  }
}

class Child extends Parent {
  String name;    // <-- THIS IS UNNECESSARY, VARIABLE/FIELD 'name' ALREADY DESCRIBED IN PARENT CLASS
  void doIt() {
    System.out.println("Do it in Child");
//    System.out.println("Parent name is : " + super.name);
  }
}
