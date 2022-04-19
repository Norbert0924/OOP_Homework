package hu.Homework;

import hu.Models.Book;
import hu.Models.Author;

public class Main {

    public static void main(String[] args) {

        Author authorNew1 = new Author("Helen Fielding", "United Kingdom", 1958);

        System.out.println("Author information: ");
        Author.printAuthor(authorNew1);








    }
}
