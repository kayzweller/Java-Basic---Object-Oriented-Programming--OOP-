package com.program10_Interface;

public class Bus implements Car, IsMaintenance {


  public void drive() {
    System.out.println("Drive Bus!");
  }

  public int getTire() {
    return 6;
  }

  public String getBrand() {
    return "Volvo";
  }

  public boolean isMaintenance() {
    return false;
  }

  public boolean isBig() {
    return true;
  }
}
