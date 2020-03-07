package lesson4.geometry.phone;

public class Main {

    public static void main(String[] args) {

        AbstractPhone thomasEdisonPhone = new TomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone smartPhone = new SmartPhone(2000, 12, "ios");
        User user = new User("Владик");

        user.callAnother(102, thomasEdisonPhone);
        user.callAnother(103, phone);
        user.callAnother(1054, smartPhone);


    }

}
