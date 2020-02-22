package lesson2;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();


        cat.age = 13;
        cat.name = "Шарик";

        cat1.age = 20;
        cat1.name = "Рыжик";


        System.out.println(cat);
        System.out.println(cat1);

        System.out.print(cat.age + " лет,");
        System.out.print(" зовут " + cat.name + ", ");

        cat.eat();

        cat1 = cat;

        System.out.println(cat);
        System.out.println(cat1);


    }

}
