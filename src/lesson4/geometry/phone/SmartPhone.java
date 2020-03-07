package lesson4.geometry.phone;


public class SmartPhone extends CellPhone {


    private String operationSystem;

    public SmartPhone(int year, int hours, String operationSystem) {
        super(year, hours);
        this.operationSystem = operationSystem;
    }

    public  void install(String app) {
        System.out.println("Устанавливаю " + app);
    }
}
