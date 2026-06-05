// problem 5(c);
import java.util.*;

class Book {
    String title,author;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class problem53 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String title=sc.nextLine();
            String author=sc.nextLine();

            Book book1=new Book(title);
            Book book2=new Book(title,author);
            book1.displayInfo();
            book2.displayInfo();
        }
    }
}
