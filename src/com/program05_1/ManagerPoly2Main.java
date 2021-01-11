package com.program05_1;

// POLYMORPHISM

public class ManagerPoly2Main {
    public static void main(String[] args) {
        // BASIC POLYMORPHISM
        Employee employee = new Employee("Kristaen");
        employee.sayHello("Aloona");

        employee = new Manager("Cindy", "XOXLTN");
        employee.sayHello("Albert");

        employee = new VicePresident("Aloona", "re:Encode", 34);
        employee.sayHello("Kristaen");

        System.out.println();

        // CALL: METHOD POLYMORPHISM
        sayHello(new Employee("Aloona"));
        sayHello(new Manager("Albert"));
        sayHello(new VicePresident("Cindy"));
    }

    // METHOD IN POLYMORPHISM
    static void sayHello(Employee employee) {
        employee.sayHello(employee.name);
    }
}
