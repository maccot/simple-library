package pl.maccot.library.model;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int releaseDate;
    private int pages;

    //konstruktory
    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    public Book(String title, String author, int releaseDate,
                int pages, String publisher, String isbn) {
        this(title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
    }

    public void printinfo(){
        String info = title + "; " + author + "; "
                + releaseDate +"; " + pages +"; "
                + publisher +"; ";
        if (isbn != null){
            info = info + isbn;
        }
        System.out.println(info);
    }
}
