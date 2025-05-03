package all.ex;

class Box{

    double width, height, depth;
    Box(double d, double w, double h){

        this.width = w ;
        this.depth = d ;
        this.height = h;
    }

    double volume(){

        return height * width * depth;
    }
}

public class NewThis{

    public static void main(String[] args){

        Box b1 = new Box(7,10,8);
        double r1 = b1.volume();
        System.out.println(r1);
    }
}
