package com.program05_Polymorphism;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is " + this.name);
    }
}
