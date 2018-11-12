public class Main {

    /*
    Objects Basics Practice #1: Author & Book
Write class Author with the following features:

Fields:

firstName
lastName
Constructor to initialize Author class fields.
Method to print out author’s full name in the console.

Write class Book with the following features:

Fileds:

title for the title of the book;
author of type Author;
price for the book price of type double.
Constructor to initialize Book class fields.
Method to print out book’s details to the screen
Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software”
 with authors Russel Winderand price 79.75. Prints the Book’s details to the console.
     */

    public static void main(String[] args) {

        //bookDemo book = new bookDemo();


        }

        public class bookAuthor {

        String firstName;
        String lastName;

        public bookAuthor(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public void printAuthor() {
                System.out.println("Book's author = " + firstName + " " + lastName);
            }
    }

    public class bookName {

        String bookTitle;
        bookAuthor author;
        double bookPrice;

        public bookName(String bookTitle, bookAuthor author, double bookPrice) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.bookPrice = bookPrice;
        }

        public void printBook() {
            System.out.println("Book's name = " + bookTitle);
            System.out.println("Book's price = " + bookPrice);
        }


    }

    public class bookDemo {
        bookAuthor author = new bookAuthor("Russel", "Winderand");
        bookName book = new bookName("Developing Java Software", author, 79.75);
    }
}





