package com.program08_Abstract;

// this is an abstract class, and this one
// cannot be use directly to create object
abstract class ClassOne {

  protected String a;
  protected String b;

  ClassOne(String a, String b) {
    this.a = a;
    this.b = b;
  }

  // this is abstract method
  abstract void run();
}


class ClassTwo extends ClassOne {

  String c;

  ClassTwo(String a, String b) {
    super(a, b);
  }

  void run() {
    System.out.println("Method from an abstract instantiated");
  }

  ClassTwo(String a, String b, String c) {
    super(a, b);
    this.c = c;
  }
}


class ClassThree extends ClassTwo {
  ClassThree(String a, String b, String c) {
    super(a, b, c);
  }
}
