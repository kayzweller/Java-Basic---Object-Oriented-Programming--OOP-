package com.program02_MethodOverriding;

public class ManagerMain {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.name = "Albert";
        manager.sayHello("Cindy");

        VicePresident vp = new VicePresident();
        vp.name = "Aloona";
        vp.sayHello("Michael");

    }
}
