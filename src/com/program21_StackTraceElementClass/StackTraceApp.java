package com.program21_StackTraceElementClass;

public class StackTraceApp {
  public static void main(String[] args) {
    try {
      sampleError();
    } catch (RuntimeException exception) {
      exception.printStackTrace();
    }
  }

  public static void sampleError() {
    try {
      String[] name = {
          "Albert", "Kristaen", "Cindy", "Anastasiani", "Aloona", "Kristaen"
      };

      System.out.println(name[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }

}
