package lesson4.geometry;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.draw();
        drawShape(shape);

        Circle circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        Triangle triangle = new Triangle();
        triangle.draw();

        Paralelepiped paralelepiped = new Paralelepiped();
        paralelepiped.draw();


    }

    public static void drawShape (Shape shape) {
        shape.draw();
    }

}
