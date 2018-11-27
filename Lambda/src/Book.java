import java.util.Comparator;

public class Book implements Comparable<Book> {


    String bookTitle;
    Author author;
    double bookPrice;

    public Book(String bookTitle, Author author, double bookPrice) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.bookPrice = bookPrice;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void print() {
        System.out.println("Book's name = " + bookTitle);
        System.out.println("Book's price = " + bookPrice);
        System.out.println("Book's author = " + author.firstName + " " + author.lastName);
    }

    @Override
    public int compareTo(Book o) {
        return Double.compare(o.bookPrice, this.bookPrice);
    }
}
