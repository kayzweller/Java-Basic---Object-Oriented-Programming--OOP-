package com.program02_MethodOverriding;

class VicePresident extends Manager {
    // inherit from Class Manager

    // method overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is VP " + this.name);
    }
}
