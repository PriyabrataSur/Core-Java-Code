package Shape;

public class Circle implements Shape{
    @Override
    public double calculatePerimeter(int rad) {
        return 2*3.1416 * rad;
    }

    @Override
    public double calculateArea(double length, double breadth) {
        return 0;
    }
}
