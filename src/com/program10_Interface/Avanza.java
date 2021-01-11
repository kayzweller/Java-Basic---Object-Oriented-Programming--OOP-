package com.program10_Interface;

public class Avanza implements Car, IsMaintenance {

  public String getBrand() {
    return "Toyota";
  }

  public void drive() {
    System.out.println("Drive Avanza!");
  }

  public int getTire() {
    return 4;
  }

  public boolean isMaintenance() {
    return false;
  }

}
