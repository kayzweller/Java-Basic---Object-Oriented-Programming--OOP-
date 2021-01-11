package com.program05_Polymorphism;

class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }

    VicePresident(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is VP " + this.name + ", from " + this.company);
    }

}
