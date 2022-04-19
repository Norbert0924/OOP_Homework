package hu.Models;

    public class Book {
        private String author;
        private String title;
        private int published;
        private String genre;

        //public Book() {} // default constructor

        public Book(String author, String title, int published, String genre) {
            this.author = author;
            this.title = title;
            this.published = published;
            this.genre = genre;
        }

        public String toString()
        {
            return author + " " + title + " " + published + " "
                    + genre;
        }

        public static void main(String[] args) {
            Book book1 = new Book("J. K. Rowling", "Harry Potter ", 1997, "fantasy");
            Book book2 = new Book("Mario Puzo", "The Godfather", 1969, "crime");
            Book book3 = new Book("Helen Fielding", "Bridget Jones's Diary", 1996, "diary");

            printInfo(book1);
            printInfo(book2);
            printInfo(book3);

            System.out.println("------------");
            System.out.println("book1");
            System.out.println(book1);
            System.out.println("------------");
            System.out.println("toString");
            System.out.println(book1.toString());
            System.out.println("------------");

            System.out.println("Only author: ");
            System.out.println(book1.getAuthor());
            System.out.println("------------");
            System.out.println("Only title: ");
            System.out.println(book1.getTitle());
            System.out.println("------------");
            System.out.println("Only published: ");
            System.out.println(book1.getPublished());
            System.out.println("------------");
            System.out.println("Only genre: ");
            System.out.println(book1.getGenre());
            System.out.println("\n\t");

            System.out.println("New author");
            book1.setAuthor("Karl Popper:");
            System.out.println(book1.getAuthor());

            System.out.println("New genre: ");
            book1.setGenre("horror");
            System.out.println(book1.getGenre());

        }

        public static void printInfo(Book book) {
            System.out.println("\n\t");
            System.out.println("Information:");
            System.out.println("\n\t" + "authorn : " + book.author + "\n\t" +
                    "title : " + book.title + "\n\t" +
                    "published : " + book.published + "\n\t" +
                    "genre : " + book.genre);
        }
        public String getAuthor() {
            return author;
        }
        public String getTitle() {
            return title;
        }
        public int getPublished() {
            return published;
        }
        public String getGenre() {
            return genre;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public void setPublished(int published) {
            this.published = published;
        }
        public void setGenre(String genre) {
            this.genre = genre;}
    }

