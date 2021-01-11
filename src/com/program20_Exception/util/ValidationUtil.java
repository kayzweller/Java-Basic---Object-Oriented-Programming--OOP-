package com.program20_Exception.util;

import com.program20_Exception.LoginRequest;
import com.program20_Exception.error.BlankException;
import com.program20_Exception.error.ValidationException;

public class ValidationUtil {

  //. Checked Exception
  public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
    if (loginRequest.username() == null) {
      throw new NullPointerException("Username is null!");
    } else if (loginRequest.username().isBlank()) {
      throw new ValidationException("Username is blank!");
    } else if (loginRequest.password() == null) {
      throw new NullPointerException("Password is null!");
    } else if (loginRequest.password().isBlank()) {
      throw new ValidationException("Password is blank!");
    }
  }

  //. Runtime Exception
  public static void validateRuntime(LoginRequest loginRequest) {
    if (loginRequest.username() == null) {
      throw new NullPointerException("Username is null!");
    } else if (loginRequest.username().isBlank()) {
      throw new BlankException("Username is blank!");
    } else if (loginRequest.password() == null) {
      throw new NullPointerException("Password is null!");
    } else if (loginRequest.password().isBlank()) {
      throw new BlankException("Password is blank!");
    }
  }

}
