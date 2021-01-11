package com.program01_ConstructorOverloading;

class Person {
    // Field
    String firstName;
    String lastName;

    // Constructor
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(String firstName) {
        // constructor overloading
        this(firstName, null);
    }

    Person() {
        // constructor overloading
        this(null);
    }

    // Method 1
    void sayHello() {
        System.out.println("Hello, " + firstName + " " + lastName);
    }

    // Method 2
    void sayGoodbye() {
        System.out.println("Goodbye, " + firstName + " " + lastName);
    }

    // Method Overloading
    void sayGoodbye(String company) {
        System.out.println("Goodbye, " + firstName + " " + lastName + " from: " + company);
    }
}
