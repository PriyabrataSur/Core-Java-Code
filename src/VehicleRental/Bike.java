package VehicleRental;

class Bike extends  Vehicle{
    double engineCC;

    public Bike(String vehicleNumber, String brand, double rentalPricePerDay , double engineCC){
        super(vehicleNumber, brand, rentalPricePerDay);
        this.engineCC = engineCC;
    }

    public double calculateRental(int days) {
        double rental = rentalPricePerDay * days;
        return rental ;
    }
}
