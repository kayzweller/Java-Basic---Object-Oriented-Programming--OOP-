package com.program22_TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp_ManualClose {
  public static void main(String[] args) {

    BufferedReader reader = null;

    try {
      reader = new BufferedReader(
          new FileReader("README.md")
      );

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }

    } catch (Throwable throwable) {
      System.out.println("Error reading file " + throwable.getMessage());

    } finally {
      if (reader != null) {
        try {
          //. manual close
          reader.close();
          System.out.println("\nFile closed successfully!");
        } catch (IOException exception) {
          System.out.println("Error closing resource " + exception.getMessage());
        }
      }
    }

  }
}
