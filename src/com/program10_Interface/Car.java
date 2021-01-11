package com.program10_Interface;

// Interface [02:03:10]
// Another type of Abstract Class, but when using Interface
// every method automatically an abstract method and got no block.
// Interface only have constant, cannot have field/variable
// like you have with an abstract class.
// When try inheriting an Interface class, we use keyword 'implements'
// not using keyword 'extends' like we did before.

public interface Car extends HasBrand {
  // create inheritance from 'HasBrand' interface.
  // you don't need to put keyword 'public' 'abstract'
  void drive();
  int getTire();

  // default method [optionally implemented]
  default boolean isBig() {
    return false;
  }

}
