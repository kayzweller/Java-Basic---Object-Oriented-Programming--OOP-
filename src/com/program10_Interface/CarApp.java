package com.program10_Interface;

public class CarApp {
  public static void main(String[] args) {
    //
    Car car = new Avanza();
    car.drive();
    System.out.println("Car Type   : " + car.getBrand());
    System.out.println("Tire count : " + car.getTire());

    Car bus = new Bus();
    bus.drive();
    System.out.println("Car Type   : " + bus.getBrand());
    System.out.println("Tire count : " + bus.getTire());

  }
}
