package collections.ex;

class Vehicle{
    String brand;
    String model;
    int year;
    public Vehicle(String brand, String model,int year){
        this.brand = brand;
        this.model = model;                                                //  -- Constructor
        this.year = year;
    }
    public void displayInfo(){
        System.out.println(brand);
        System.out.println(model);                                      //  -- Method
        System.out.println(year);
    }
}

class Car extends Vehicle{
    int numDoors;
    public Car(String brand, String model,int year, int numDoors){
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(numDoors);
    }
}

class Bike extends Vehicle{
    boolean hasCarrier;
    public Bike(String brand, String model,int year, boolean hasCarrier) {
        super(brand, model, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(hasCarrier);
    }
}

public class New {
    public static void main(String[] args) {
        Vehicle car1 = new Car("BMW", "JSM23KT", 2023, 5);
        Vehicle bike1 = new Bike("Pulsar", "CT45", 2020, true);
        System.out.println("CarInfo : ");
        car1.displayInfo();      //displayInfo() is overridden in both Car and Bike, call respective subclass implementation (Polymorphism)
        System.out.println("BikeInfo : ");
        bike1.displayInfo();
    }
}
