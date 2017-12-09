package librarybookingsystem;

import java.util.*;

public class LibraryBookingSystem {

    public static Scanner input = new Scanner(System.in);
    public static Object[] booksList = new Object[0];
    
    public static void main(String[] args) {
        boolean run = true;
        while(run){
            run = mainMenu();
        }
    }
    public static boolean mainMenu(){
        boolean exe = true;
        System.out.print("WELCOME TO THE LIBRARY SYSTEM\n1) Manage books\n2) Manage borrowers\n3) Quit\n\nEnter an option's number: ");
        int nChoice = input.nextInt();
        String lChoice;
        if (nChoice == 1){
            System.out.print("A) Add a book\nB) Edit a book\nC) Delete a book\nD) Exit\n\nEnter an option's letter: ");
            lChoice = input.next();
            bookManagement(lChoice);
        }
        if (nChoice == 2){
            System.out.print("A) Add a borrower\nB) Edit a borrower\nC) Delete a borrower\nD) Exit\n\nEnter an option's letter: ");
            lChoice = input.next();
            borrowerManagement(lChoice);
        }
        if (nChoice == 3){
            exe = false;
        }
        return exe;
    }
    public static void bookManagement(String option){
        if (option.equalsIgnoreCase("a")){
            Object[] newBooksList = new Object[booksList.length + 1];
            for (int i = 0; i < booksList.length; i++){
                newBooksList[i] = booksList[i];
            }
            Book book = new Book();
            System.out.print("Enter the title of the book: ");
            input.nextLine();
            book.title = input.nextLine();
            System.out.print("Enter the author of the book: ");
            book.author = input.nextLine();
            System.out.print("Enter the ISBN of the book: ");
            book.ISBN = input.nextLine();
            System.out.print("Enter the price of the book: ");
            book.price = input.nextFloat();
            newBooksList[booksList.length] = book;
            booksList = newBooksList;
            System.out.println("New book = " + book.title + " + " + book.author + " + " + book.ISBN + " + " + book.price);
            System.out.println(booksList.toString());
        }
        if (option.equalsIgnoreCase("b")){
            System.out.print("Enter the ISBN of the book you want to edit: ");
            String requestedISBN = input.next();
            boolean found = false;
            int j = 0;
            while((!found) || (j < booksList.length)){
                if(booksList[j].ISBN.equals(requestedISBN)){
                    
                }
                j++;
            }
        }
    }
    public static void borrowerManagement(String option){
        
    }
}
