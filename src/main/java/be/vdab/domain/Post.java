package be.vdab.domain;

import be.vdab.domain.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String text;
    private LocalDateTime date;
    @ManyToOne
    private Author author;

    public Post(String title, String text, LocalDateTime date, Author author) {
        this.title = title;
        this.text = text;
        this.date = date;
        this.author = author;
    }
    public Post() {}

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime dateCreated) {
        this.date = dateCreated;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", author=" + author.getName() +
                '}';
    }
}
