public class BookDemo{

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}

class Main {

    bookAuthor author;
    bookName bookDemo;
    double price = 79.75;

    public void run(){
        author = new bookAuthor("Russel", "Winderand");
        bookDemo = new bookName("Developing Java Software", author, price);
        author.print();
        bookDemo.print();
    }

    public class bookAuthor {

        String firstName;
        String lastName;

        public bookAuthor(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void print() {
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

        public void print() {
            System.out.println("Book's name = " + bookTitle);
            System.out.println("Book's price = " + bookPrice);
        }
    }
}