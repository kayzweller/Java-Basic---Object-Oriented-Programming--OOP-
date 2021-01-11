package com.program05_1;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is Employee " + this.name);
    }
}
