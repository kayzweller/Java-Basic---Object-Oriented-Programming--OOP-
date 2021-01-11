package com.program04_Inheritance;

class VicePresident extends Manager {
    // inherit from Class Manager

    // Super Constructor
    VicePresident(String name) {
        super(name);
    }

    // Constructor Overloading
    VicePresident() {
        super(null);
    }


    // method overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is VP " + this.name);
    }
}
