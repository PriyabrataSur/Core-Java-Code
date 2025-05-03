package collections.ex;

class Shape{
    double calculateArea(){
        return 0.0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 2*3.1416*radius;
    }
}
class Rectangle extends Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length*width;
    }
}
class MathOperations{
    int add(int num1, int num2){
        return num1 + num2;
    }
    double add(double num1, double num2){
        return num1 + num2;
    }
    int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}
public class ShapeEx {
    public static void main(String[] args) {
        Shape circle = new Circle(5.6);
        System.out.println("Area of the Circle: "+circle.calculateArea());
        Shape rectangle = new Rectangle(8,5);
        System.out.println("Area of the Rectangle: "+rectangle.calculateArea());

        MathOperations res = new MathOperations();
        System.out.println("Example of methodOverloading of add: ");
        System.out.println(res.add(5,9));
        System.out.println(res.add(13,26));
        System.out.println(res.add(4.6,19.2));
        System.out.println(res.add(6.8,8.9));
        System.out.println(res.add(7,2,3));
        System.out.println(res.add(15,36,3));
    }
}
