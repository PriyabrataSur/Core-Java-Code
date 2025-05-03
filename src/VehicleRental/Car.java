package VehicleRental;

class Car extends Vehicle{
    String seatingCapacity;

    public Car(String vehicleNumber, String brand, double rentalPricePerDay, String seatingCapacity){
        super(vehicleNumber, brand, rentalPricePerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double calculateRental(int days) {
        double rental = days * rentalPricePerDay + 500 ;        // 500/- insurance fee
        return rental;
    }
}
