package com.program04_Inheritance;

class Manager {
    String name;
    String company;

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    // Constructor Overloading
    // by calling another Constructor
    Manager(String name) {
        this(name, null);
    }


    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is Manager " + this.name);
    }
}
