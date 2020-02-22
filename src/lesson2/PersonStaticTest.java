package lesson2;

import static lesson2.Person.printPersonCount;

public class PersonStaticTest {

    public static void main(String[] args) {

        printPersonCount();
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();

        printPersonCount();

        System.out.println(person.toString());


    }
}
