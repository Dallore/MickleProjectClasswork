package lesson2;

public class Dog {

    private String color;
    private String breed;
    private int weight;
    private int strength;

    private Dog() {

    }

    public Dog(String color, String breed, int weight, int strength) {
        this.color = color;
        this.breed = breed;
        this.weight = weight;
        this.strength = strength;
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return this.color;
    }

    public String getBreed() {
        return this.breed;
    }

    private void setColor(java.lang.String color) {
        this.color = color;
    }

    private void setBreed(java.lang.String breed) {
        this.breed = breed;
    }

    public String fight(Dog dog) {
        if (this.strength > dog.strength) {
            return this.breed;
        }
        return dog.breed;
    }
}
