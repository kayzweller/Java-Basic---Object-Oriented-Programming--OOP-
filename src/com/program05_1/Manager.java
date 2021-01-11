package com.program05_1;

class Manager extends Employee {

    String company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is Manager " + this.name);
    }
}
