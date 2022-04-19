package hu.Homework;

import hu.Models.Book;
import hu.Models.Author;

public class Main {

    public static void main(String[] args) {

        Author authorNew1 = new Author("Helen Fielding", "United Kingdom", 1958);
        System.out.println("\n");
        System.out.println("Author: ");
        Author.printAuthor(authorNew1);

        // default constructor
        Author authorNew2=new Author();
        authorNew2.setName("J. R. R. Tolkien");
        authorNew2.setCountry("Germany");
        authorNew2.setBirthYear(1892);
        System.out.println("\n");
        System.out.println("New Author: ");
        Author.printAuthor(authorNew2);

        System.out.println("------------------------");
        Book bookNew1 = new Book("Helen Fielding","Bridget Jones's Baby: The Diaries",2016,"diary");

        System.out.println("\n");
        System.out.println("Book: ");
        Book.printInfo(bookNew1);

        //public Book() {} // default constructor:
        Book bookNew2=new Book();
        bookNew2.setAuthor("J. R. R. Tolkien");
        bookNew2.setTitle("The Lord of the Rings");
        bookNew2.setPublished(1954);
        bookNew2.setGenre("fantasy");

        System.out.println("\n");
        System.out.println("New book: ");
        Book.printInfo(bookNew2);
    }
}
