package com.nitro;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Avtor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Book> books;

    private String name;
    private String secondName;

    public Avtor() {
    }

    public Avtor(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {

        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String toString(){
        return "avtor [ "+getName()+" "+getSecondName()+" ]";
    }
    public void addBook(Book book){
        if (books == null) books=new HashSet<Book>();
        books.add(book);
    }



}
