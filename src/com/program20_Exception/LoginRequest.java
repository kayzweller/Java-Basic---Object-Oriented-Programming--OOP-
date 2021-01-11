package com.program20_Exception;

// java record use for immutable data

// this one actually a constructor
public record LoginRequest(String username, String password) {

  // record constructor
  public LoginRequest {
    System.out.println("Create object LoginRequest...");
  }

  // record constructor overloading
  // ~ You still need to call main constructor
  public LoginRequest(String username) {
    this(username, "");
  }

  public LoginRequest() {
    this("", "");
  }

  // method
  public void sayHello() {
    System.out.println("Hello " + username);
  }

}
