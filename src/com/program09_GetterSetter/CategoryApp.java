package com.program09_GetterSetter;

public class CategoryApp {
  public static void main(String[] args) {
    //
    var category = new Category();
    category.setId("ID007");
    category.setId(null);

    System.out.println(category.getId());
    System.out.println(category.isExpensive());
  }
}
