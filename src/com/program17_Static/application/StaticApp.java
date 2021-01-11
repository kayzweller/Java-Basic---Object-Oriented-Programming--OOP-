package com.program17_Static.application;

// static import
import static com.program17_Static.data.Constant.*;
import static com.program17_Static.data.Application.PROCESSORS;
import com.program17_Static.data.Country;
import com.program17_Static.util.MathUtil;

public class StaticApp {
  public static void main(String[] args) {

    // calling the inner field/variable
    System.out.println(APPLICATION);
    System.out.println(VERSION);

    // calling static method
    System.out.println(
            MathUtil.sum(1, 2 , 3 , 4, 5, 6, 7, 8, 9, 10)
    );

    // calling static inner class
    // you don't need to create instance of Country object.
    Country.City city = new Country.City();
    city.setName("Palangka Raya");
    System.out.println(city.getName());

    // static block
    System.out.println(PROCESSORS);

  }
}
