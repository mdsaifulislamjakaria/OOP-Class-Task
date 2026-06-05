// problem 6(a);

import java.util.*;
import java.time.LocalDate;

class Books {
    public int bookId; 
    public String bookName,bookAuthor,yearofPub,status; 
    public float price; 

    public void addNewBooks() {
        System.out.println("A new book is being added.");
    }

    public void deleteBooks() {
        System.out.println("A book is being deleted.");
    }

    public void displayBookDetails() {
        System.out.println("Book details : ID: " + bookId + "\nName : " + bookName + "\nAuthor : " + bookAuthor + "\nYear of Publication : " + yearofPub + "\nPrice : " + price + " Taka\nStatus : " + status);
    }

    public void inquiryBook() {
        System.out.println("An inquiry is being made about the book.");
    }
}

class Librarian {
    public int id;
    public String name; 

    public void searchBook(String name) {
        System.out.println("A book named '" + name + "' is being searched.");
    }

    public boolean verifyMember(int id) {
        System.out.println("A member with ID: " + id + " is being verified.");
        return true; 
    }

    public void orderBooks() {
        System.out.println("Books are being ordered from the publisher.");
    }

    public void sellBooks() {
        System.out.println("A book is being sold to the user.");
    }
}

class Publisher {
    public int id,phoneNo; 
    public String name,adress; 

    public void addPub() {
        System.out.println("A new publisher is being added.");
    }

    public void modifyPub() {
        System.out.println("Information about a publisher is being modified.");
    }

    public void deletePub() {
        System.out.println("A publisher is being deleted.");
    }

    public void orderStatus() {
        System.out.println("The order status of the publisher is being checked.");
    }
}

class User {
    public int userID,phoneNo; 
    public String userName,userAddress;

    public void returnBooks() {
        System.out.println("A borrowed book is being returned.");
    }

    public int payFine(LocalDate dt) {
        System.out.println("Fine is being paid on date: " + dt + ".");
        return 100;
    }

    public void addNewUser() {
        System.out.println("A new user is being added.");
    }

    public void deleteUser() {
        System.out.println("A user is being deleted.");
    }

    public void updateDetails() {
        System.out.println("User's information is being updated.");
    }

    public void bookPurchase() {
        System.out.println("A book is being purchased.");
    }
}

public class problem61 {
    public static void main(String[] args) {
        //try(Scanner sc=new Scanner(System.in)){
            Books book1 = new Books();
            book1.bookId = 101;
            book1.bookName = "Object Oriented Programming";
            book1.bookAuthor = "Rahman";
            book1.yearofPub = "2025";
            book1.price = 500.50f;
            book1.status = "Available";
            System.out.println("A book has been created: " + book1.bookName);
            book1.displayBookDetails();
            System.out.println();

            Librarian librarian1 = new Librarian();
            librarian1.id = 1;
            librarian1.name = "Mr. Karim";
            System.out.println("A librarian has been created: " + librarian1.name);
            librarian1.searchBook("Object Oriented Programming");
            boolean isMember = librarian1.verifyMember(1001);
            System.out.println("Member verification result : " + (isMember ? "Valid" : "Invalid"));
            System.out.println();

            Publisher publisher1 = new Publisher();
            publisher1.id = 50;
            publisher1.name = "Jonota Prokashoni";
            publisher1.adress = "Dhaka, Bangladesh";
            publisher1.phoneNo = 123456789;
            System.out.println("A publisher has been created: " + publisher1.name);
            publisher1.orderStatus();
            System.out.println();

            User user1 = new User();
            user1.userID = 1001;
            user1.userName = "Abdullah";
            user1.userAddress = "Sylhet, Bangladesh";
            user1.phoneNo = 987654321;
            System.out.println("A user has been created: " + user1.userName);
            user1.returnBooks();

            LocalDate fineDate = LocalDate.now();
            int fineAmount = user1.payFine(fineDate);
            System.out.println("Fine payment details: Date: " + fineDate + ", Amount: " + fineAmount + " Taka.");
        //}
    }
}