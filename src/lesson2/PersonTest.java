package lesson2;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person("With name");

        System.out.println(person1.name);
        System.out.println(person1.age);

        String someName = "Ярик";
        int someAge = 10;

        Person person2 = new Person(someName, someAge);

        System.out.println(person2.name);
        System.out.println(person2.age);

        Person person3 = new Person(132);
        System.out.println(person3.age);


    }
}
