package Shape;

public class ShapeEx {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.calculatePerimeter(5));

        Rectangle r = new Rectangle();
        System.out.println(r.calculateArea(5,9));
    }
}
