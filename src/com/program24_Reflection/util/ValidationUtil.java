package com.program24_Reflection.util;

import com.program24_Reflection.LoginRequest;
import com.program24_Reflection.annotation.NotBlank;
import com.program24_Reflection.error.BlankException;
import com.program24_Reflection.error.ValidationException;

import java.lang.reflect.Field;

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

  //. Reflection Framework [general]
  public static void validationReflection(Object object) {
    Class aClass = object.getClass();
    Field[] fields = aClass.getDeclaredFields();

    for (var field : fields) {
      field.setAccessible(true);

      if (field.getAnnotation(NotBlank.class) != null) {
        //. validate
        try {
          String value = (String) field.get(object);
          if (value == null || value.isBlank()) {
            throw new BlankException("Field " + field.getName() + " is blank.");
          }
        } catch (IllegalAccessException e) {
          System.out.println("Cannot access field " + field.getName());
        }

      }

    }
  }

}
