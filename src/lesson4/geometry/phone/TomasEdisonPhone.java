package lesson4.geometry.phone;

public class TomasEdisonPhone extends AbstractPhone {

    public TomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int number) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int number) {
        System.out.println("Телефон звонит");
    }
}
