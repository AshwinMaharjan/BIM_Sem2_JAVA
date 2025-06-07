// Abstract class Shape
abstract class Shape {
    // Abstract methods
    public abstract void rectangleArea(double length, double breadth);
    public abstract void squareArea(double side);
    public abstract void circleArea(double radius);
}

// Concrete class implementing Shape
class Area extends Shape {
    @Override
    public void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Area areaObj = new Area();

        areaObj.rectangleArea(10, 5);
        areaObj.squareArea(7);
        areaObj.circleArea(3.5);
    }
}
