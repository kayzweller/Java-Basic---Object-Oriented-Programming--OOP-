package com.program17_Static.util;

public class MathUtil {

  // static method
  public static int sum(int... values) {
    int total = 0;
    for (var value: values) {
      total += value;
    }
    return total;
  }

}
