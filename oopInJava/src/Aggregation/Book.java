package Aggregation;

public class Book {

    String title;
    int pages;
    String author;

    Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    String getBookInfo() {
        return "Title: " + this.title + ", Pages: " + this.pages + ", Author: " + this.author;
    }
}
