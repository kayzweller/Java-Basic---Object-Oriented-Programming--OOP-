package com.program01_ConstructorOverloading;

public class PersonMain {

    public static void main(String[] args) {
        //
        System.out.println();
        var person1 = new Person("Albert", "Kristaen");
        personPrint(person1);
        person1.sayGoodbye("XOXLTN");

        System.out.println();
        Person person2 = new Person("Cindy", "Anastasiani");
        personPrint(person2);

        System.out.println();
        var person3 = new Person("Aloona");
        personPrint(person3);

        System.out.println();
        Person person4 = new Person();
        personPrint(person4);

    }

    static void personPrint(Person person) {
        person.sayHello();
        person.sayGoodbye();
    }

}
