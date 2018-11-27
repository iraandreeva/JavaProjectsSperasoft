import java.util.*;
import java.util.stream.Collectors;

//1names should be selected only for persons with age between 20 and 30 years;
//all names should be unique;
//names in the list should be converted to upper-case;
//list of names should be sorted by the name length.

//2book with the highest price;
//String containing books titles separated by the space character containing all books written by an author;
//list of books sorted by the author's full name;
//sum of all books prices in the list.


public class Demo {

    public static void main(String[] args) {

        //Practice1
        List<Person> demo =  Arrays.asList(
        new Person("Valera", 23),
        new Person("Oleg", 45),
        new Person("Kirill", 65),
        new Person("Vitaly", 23),
        new Person("Mary", 20),
                new Person("Alexander", 23),
                new Person("Pavel", 29),
        new Person("Valera", 21));

        List<String> names = demo.stream()
                .filter( age -> age.getAge() >= 20 && age.getAge() <= 30)
                .map(Person::getName)
                .distinct()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        names.forEach(System.out::println);


        //Practice2
        List<Book> books = Arrays.asList(
                new Book("Harry Potter and the Philosopher Stone", new Author("Joanne", "Rowling"), 379),
                new Book("Harry Potter and the prizoner of Azkaban", new Author("Joanne", "Rowling"), 370),
                new Book("Fantastic Beats", new Author("Joanne", "Rowling"), 379.99),
                new Book("Guest", new Author("Stefany", "Mayer"), 156),
                new Book("The Tale of the Fisherman and the Gold Fish", new Author("Alexander", "Pushkin"), 99),
                new Book("Anna Karenina", new Author("Lev", "Tolstoy"), 400),
                new Book("War and Peace", new Author("Lev", "Tolstoy"), 500));


                 System.out.println("\nBook with highest price:");

                 books.stream()
                         .min(Book::compareTo)
                         .get().print();


        System.out.println("\nBooks of Joanne Rowling books:");
                 String booksJoanne = books.stream()
                         .filter(author -> author.author.lastName == "Rowling")
                         .map(b -> "\""+ b.bookTitle + "\"")
                         .reduce((s, s2) -> s+ "  " + s2)
                         .orElse("");

                 System.out.println(booksJoanne);

        System.out.println("\nBooks sorted by autors name:");

        List<String> bookSort = books.stream()
                .sorted( (a, b) -> a.author.lastName.compareTo(b.author.lastName) )
                .sorted( (a, b) -> a.author.firstName.compareTo(b.author.firstName) )
                .map(Book::getBookTitle)
                .collect(Collectors.toList());

        System.out.println(bookSort);




        Double price = books.stream()
                .map(book -> book.bookPrice)
                .reduce( (s1, s2) -> s1 + s2)
                .orElse(0.0);

        System.out.println("\nBooks price:" + price);



    }
}
