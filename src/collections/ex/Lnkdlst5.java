package collections.ex;

import java.util.LinkedList;
import java.util.ListIterator;

class Book{
    int id;
    String title;
    String author;

    Book(int id, String title, String author){
        this.id = id;
        this.title=title;
        this.author=author;
    }

    @Override
    public String toString(){
        return "ID:"+id+"    Title:"+title+"     Author:"+author;
    }
}
public class Lnkdlst5 {
    public static void main(String[] args) {

        LinkedList<Book> book = new LinkedList<>();
        book.add(new Book(1,"Java Basics", "John Doe"));
        book.add(new Book(2,"Advanced Java", "Jane Smith"));
        book.add(new Book(3,"Data Structure", "Tom Brown"));
        System.out.println(book);

        System.out.println("After removing index 2");
        book.removeIf(i -> i.id==2);

        ListIterator<Book> li = book.listIterator();
        while (li.hasNext()){
            Book i = li.next();
            System.out.println(i);

            //System.out.println(book);
        }
    }
}
