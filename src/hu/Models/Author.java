package hu.Models;

public class Author {

    private String name;
    private String country;
    private int birthYear;

    public Author(){} // default constructor

    public Author(String name, String country, int birthYear) {
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }

    public String toString() {
        return name + " " + country + " " + birthYear;
    }

    public static void main(String[] args) {
        Author author1 = new Author("Mario Puzo", "USA", 1920);
        System.out.println("Print");
        printAuthor(author1);

    }

    public static void printAuthor(Author author) {
        System.out.println("\n\t");
        System.out.println("Information:");

        System.out.println("\n\t" + "author: " + author.name + "\n\t" +
                "country: " + author.country + "\n\t" +
                "birthYear: " + author.birthYear);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCountry(String county){
        this.country = country;
    }
    public String getCountry(){
        return  country;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public int getBirthYear(){
        return birthYear;
    }
}