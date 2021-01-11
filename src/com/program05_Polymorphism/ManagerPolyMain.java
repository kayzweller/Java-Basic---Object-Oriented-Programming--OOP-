package com.program05_Polymorphism;

// POLYMORPHISM

public class ManagerPolyMain {
    public static void main(String[] args) {
        //
        Employee employee = new Employee("Kristaen");
        employee.sayHello("Aloona");
        sayHello(employee);

        employee = new Manager("Cindy", "XOXLTN");
        employee.sayHello("Albert");
        sayHello(employee);

        employee = new VicePresident("Aloona", "re:Encode");
        employee.sayHello("Kristaen");
        sayHello(employee);

        System.out.println();

        // CALL: METHOD POLYMORPHISM
        sayHello(new Employee("Aloona"));
        sayHello(new Manager("Albert"));
        sayHello(new VicePresident("Cindy"));
    }

    // METHOD POLYMORPHISM
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello VP " + vp.name);
        }
        else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }
        else {
            System.out.println("Hello " + employee.name);
        }
    }

}
