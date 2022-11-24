package domain;

import java.util.ArrayList;

public class BookVO {
    private ArrayList<Integer> arrGenre;
    private int bno;
    private String title;
    private String publisher;
    private String author;
    private String genre;


    public int getBno() {
        return bno;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
