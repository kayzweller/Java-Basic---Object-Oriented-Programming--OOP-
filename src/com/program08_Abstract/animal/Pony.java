package com.program08_Abstract.animal;

public class Pony extends Horse{

  public String ponyTail;

  Pony(String name, int age) {
    super(name, age);
    this.type = "Pony";
  }

  public void ponyPrint() {
    System.out.println(ponyTail);
  }

}
