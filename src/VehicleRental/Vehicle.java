package VehicleRental;

abstract class Vehicle {
    String vehicleNumber;
    String brand;
    double rentalPricePerDay;

    public Vehicle(String vehicleNumber, String brand, double rentalPricePerDay){
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRental(int days){
        double rental = rentalPricePerDay * days;
        return rental;
    }

    public void displayVehicleDetails(){
        System.out.println(vehicleNumber);
        System.out.println(brand);
        System.out.println(rentalPricePerDay);
        System.out.println();
    }
}
