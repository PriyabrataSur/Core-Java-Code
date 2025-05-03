/*Write a Java program to demonstrate the use of an ArrayList with custom objects. Perform the following:

Create a class Student with the following fields:

int id
String name
double grade
Include a constructor to initialize these fields and a toString method to display the Student details.
Create an ArrayList of Student objects.

Add three Student objects to the ArrayList with the following details:

id: 1, name: "Alice", grade: 85.5
id: 2, name: "Bob", grade: 90.0
id: 3, name: "Charlie", grade: 78.2
Iterate over the ArrayList and print the details of each student.

Remove the student with id: 2 from the ArrayList.*/



package collections.ex;

import java.util.ArrayList;

class Student{
    int id;
    String name;
    double grade;

    Student(int id, String name,double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

//    @Override
    public String toString(){
        return "ID: "+id+";  Name: "+name+";    Grade: "+grade;
    }
}
public class Arrlst3 {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList();
        student.add(new Student(1,"Alica", 85.5));
        student.add(new Student(2,"Bob", 90.0));
        student.add(new Student(3, "Charlie",78.2));
        student.forEach(i -> System.out.println(i));
//        for( Student i: student){
//            System.out.println(i);
//        }
        System.out.println("After removing index 2");
        student.removeIf(st -> st.id==2);
        for( Student i: student){
            System.out.println(i);
        }
    }
}
