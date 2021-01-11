package com.program08_Abstract.animal;

public class Horse extends Alpaca {

  Horse(String name, int age) {
    // you cannot doing this, because 'super' are
    // not mentioning constructor in Animal Abstract Class,
    // It's mention Constructor in Alpaca Class. That have
    // Two parameter in Constructor ('name' and 'age').
//    super(name, age, "Horse");

    // this is how to use the constructor and
    // set the 'type' variable/field accordingly.
    super(name, age);
    this.type = "Horse";
  }

}
