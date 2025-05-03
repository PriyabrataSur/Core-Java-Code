package collections.ex;

class Details{
    private int rollNo ;
    private String name;

    public void setDetails(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public void getDetails(){
        System.out.println("Roll No. :"+ rollNo +"  |  Name : "+ name );
    }

}
public class EncpslEx {
    public static void main(String[] args) {
        Details obj1 = new Details();
        obj1.setDetails(1, "Priyabrata");
        obj1.getDetails();
    }
}
