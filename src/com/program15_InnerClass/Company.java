package com.program15_InnerClass;

// outer class
public class Company {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // inner class
  public class Employee {

    private String name;

    public String getCompany() {
      return Company.this.name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }


  }

}
