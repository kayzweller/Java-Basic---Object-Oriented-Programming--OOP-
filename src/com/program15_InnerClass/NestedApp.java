package com.program15_InnerClass;

public class NestedApp {
  public static void main(String[] args) {
    //
    Company company = new Company();
    company.setName("XOXLTN");

    Company.Employee employee = company.new Employee();
    employee.setName("Aloona");

    System.out.println(employee.getName() + ", from " + employee.getCompany());

    Company company2 = new Company();
    company2.setName("Nothing");

    Company.Employee employee2 = company2.new Employee();
    employee2.setName("Cindy");

    System.out.println(employee2.getName() + ", from " + employee2.getCompany());

  }
}
