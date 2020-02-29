package lesson3.memory;

import lesson3.Bicycle;
import lesson3.anon.Demo;

public class MemoryTest {

    public static void main(String[] args) {
        double number = 1.5;

        Bicycle bicycle = new Bicycle(12,"misad");

        Demo demo = new Demo();
        demo.print(bicycle);
    }

}
