package lesson4.geometry.phone;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnother(int number, AbstractPhone phone) {
        phone.call(number);
    }

}
