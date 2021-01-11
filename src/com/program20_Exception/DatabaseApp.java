package com.program20_Exception;

import com.program20_Exception.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {
    //. You still can use 'try and catch' block with error exception.
    // ~But it's, highly not recommended to do, because error is used
    // ~for highly fatal/critical operation, that make an apps
    // ~not working properly.
    connectDatabase("Aloona", null);
  }

  public static void  connectDatabase(String username, String password) {
    if (username == null || password == null) {
      throw new DatabaseError("Cannot connect to database!");
    } else {
      System.out.println("Login Success!");
    }
  }

}
