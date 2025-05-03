package VehicleRental;
import java.util.ArrayList;
import java.util.List;

public class VehicalRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("xyz1234", "Hyundai", 155, "5"));
        vehicles.add(new Car("ABC1234", "Mercedes", 264, "5"));
        vehicles.add(new Bike("QWE098", "Hero-Honda", 87,800));
        vehicles.add(new Bike("MNB4567", "Bajaj", 74,650));

        int days = 5;
        for(Vehicle i : vehicles){
            //i.displayVehicleDetails();
            System.out.println("vehicle Number: "+ i.vehicleNumber +"   No. of days : " + days + "\n Rental: "+ i.calculateRental(days));
        }
    }
}
