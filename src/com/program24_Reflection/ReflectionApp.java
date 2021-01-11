package com.program24_Reflection;

import com.program24_Reflection.util.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("Aloona34");
    request.setPassword("secret");

    ValidationUtil.validationReflection(request);

  }
}
