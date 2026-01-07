public class Book { 
    private String title;
    private String author; 
    private int year;

    public Book(String title, String author, int year) { // constructor to initialize the book object
        this.title = title; 
        this.author = author;
        this.year = year;
    }

    public String getTitle() { // getter for title
        return title;
    }

    public String getAuthor() { // getter for author
        return author;
    }

    public int getYear() { // getter for year
        return year;
    }
}   