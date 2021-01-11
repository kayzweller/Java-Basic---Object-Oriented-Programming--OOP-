package com.program04_Inheritance;

// INHERITANCE

public class ManagerSuperMain {
    public static void main(String[] args) {

        var manager = new Manager("Albert", "XOXLTN");
        manager.sayHello("Cindy");

        var vp = new VicePresident();
        vp.name = "Aloona";
        vp.sayHello("Michael");

        var vp2 = new VicePresident("Aloona");
        vp2.sayHello("Cindy");

        var vp3 = new VicePresident("Kristaen");
        vp3.sayHello("Aloona");

    }
}
