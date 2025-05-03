package Shape;

public class Rectangle implements Shape{
        @Override
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter(int rad) {
        return 0;
    }
}
