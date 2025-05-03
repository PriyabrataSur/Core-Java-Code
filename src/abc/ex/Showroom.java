package abc.ex;

class car {
    int wheels;
    String color;
    String model;
    String company;
    double price;

    void car(String clr, String mdl, String com, double price, int w) {
        this.color = clr;
        this.company = com;
        this.model = mdl;
        this.price = price;
        this.wheels = w;
    }
}
    class fourwheeler extends car{

        void aboutFourWheelers() {
            System.out.println("Color :" + color);
            System.out.println("Model :" + model);
            System.out.println("Company :" + company);
            System.out.println("Price :" + price);
            System.out.println("Wheels :" + wheels);
        }
    }

    class bike extends car {

        void aboutBike() {
            System.out.println("Color :" + color);
            System.out.println("Model :" + model);
            System.out.println("Company :" + company);
            System.out.println("Price :" + price);
            System.out.println("Wheels :" + wheels);
        }
    }

public class Showroom {
    public static void main(String[] args) {

           bike b1 = new bike();
           b1.car("blue", "HXl45", "Honda" , 50000 ,2);
           b1.aboutBike();
        System.out.println();

           bike b2 = new bike();
           b2.car("blue", "HMlD67", "Hero-Honda" , 70000 ,2);
           b2.aboutBike();
        System.out.println();

           fourwheeler f1 = new fourwheeler();
           f1.car("black", "CR14" ,"BMW", 100000, 4);
           f1.aboutFourWheelers();
        System.out.println();

        f1.car("Grey", "S-RA24" ,"BMW", 280000, 4);
        f1.aboutFourWheelers();
        System.out.println();

        f1.car("black", "Punch23" ,"TATA", 170000, 4);
        f1.aboutFourWheelers();
        System.out.println();

        f1.car("black", "G-W16" ,"Mercedes", 250000, 4);
        f1.aboutFourWheelers();
        System.out.println();

        f1.car("white", "C-G14" ,"Mercedes", 230000, 4);
        f1.aboutFourWheelers();
    }
}
