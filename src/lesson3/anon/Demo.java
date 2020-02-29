package lesson3.anon;

import lesson3.Bicycle;

public class Demo {

    public void show() {

        System.out.println("Show Demo");
    }

    public void print(Bicycle bicycle) {
        String bicycleString = bicycle.toString();
        System.out.println(bicycleString);

    }

}
