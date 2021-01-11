package com.program20_Exception;

import com.program20_Exception.error.BlankException;
import com.program20_Exception.error.ValidationException;
import com.program20_Exception.util.ValidationUtil;

public class ValidationApp {
  public static void main(String[] args) {

    System.out.println();
    LoginRequest loginRequest = new LoginRequest("Aloona", null);
    //. Checked Exception : Using 'try and catch' block.
    // ~You must use 'try and catch' block.
    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid!");
    } catch (ValidationException | NullPointerException e) {
      System.out.println("Data is not valid : " + e.getMessage());
    } finally {
      System.out.println("Finally block are always being execute!");
    }

    System.out.println();
    LoginRequest loginRequest2 = new LoginRequest(null, null);
    //. Runtime Exception : Can be use without 'try and catch' block, like code below.
    // ValidationUtil.validateRuntime(loginRequest2);
    //. But, it's still recommended to use 'try and catch' block to prevent application terminated.
    // ~Advantage: Cleaner code, creating one error handler to collect all the error.
    try {
      ValidationUtil.validateRuntime(loginRequest2);
    } catch (BlankException | NullPointerException e) {
      System.out.println("Runtime error : " + e.getMessage());
    }

  }
}
