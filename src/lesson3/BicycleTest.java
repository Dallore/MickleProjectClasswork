package lesson3;

public class BicycleTest {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();

        Bicycle.Seat seat = bicycle.new Seat();
        Bicycle.SteeringWheel steeringWheel = bicycle.new SteeringWheel();

        seat.down();
        seat.up();
        seat.up();

        steeringWheel.left();
        steeringWheel.right();

    }

}
