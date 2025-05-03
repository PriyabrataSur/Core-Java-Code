package collections.ex;

import java.util.ArrayList;

public class ArrLstIND {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<>();
        team.add("MS Dhoni");
        team.add("Sachin Tendulkar");
        team.add("Virat Kholi");
        team.add("KL Rahul");
        team.add("Rishiv Pant");
        team.add("Hardik Pandya");
        team.add("Jasprit Bumrah");
        team.add("Rabindra Jadeja");
        team.add("R. Aswin");
        team.add("M. Siraj");
        team.add("Y. Jaiswal");
        System.out.println(team);
        System.out.println(team.size());
        team.addFirst("Rohit Sharma");
        team.removeLast();
        System.out.println(team);
        System.out.println(team.contains("KL Rahul"));
        System.out.println(team.size());
        System.out.println("__________________________________________");
        team.forEach(element -> System.out.println(element));
    }
}
