package com.program18_RecordClass;

public class RecordApp {
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("Aloona", "secret");

    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    System.out.println(loginRequest);
    loginRequest.sayHello();

    System.out.println();

    System.out.println(new LoginRequest());
    System.out.println(new LoginRequest("Aloona"));
    System.out.println(new LoginRequest("Cindy", "secret"));

  }
}
