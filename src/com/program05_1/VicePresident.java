package com.program05_1;

class VicePresident extends Manager {

    int age;

    VicePresident(String name) {
        super(name);
    }

    VicePresident(String name, String company, int age) {
        super(name);
        this.company = company;
        this.age = age;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is VP " + this.name);
    }

}
