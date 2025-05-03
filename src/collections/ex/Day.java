package collections.ex;

class Vehicle1{
    void speed(){
        System.out.println("The vehicle is moving.");
    }
}
class Car1 extends Vehicle1{
    @Override
    void speed() {
        System.out.println("The car is moving 80 km/h.");
    }
}

public class Day {
    public static void main(String[] args) {
        Vehicle1 vehicle = new Vehicle1();
        vehicle.speed();
        Car1 car = new Car1();
        car.speed();
        Vehicle1 v = new Car1();
        v.speed();
    }
}
