package com.program17_Static.data;

public class Application {

  public static final int PROCESSORS;

  static {
    System.out.println("Accessing Application Class...");
    PROCESSORS =Runtime.getRuntime().availableProcessors();
  }

}
