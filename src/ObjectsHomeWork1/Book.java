package ObjectsHomeWork1;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

    public Book(String nameBook, int yearPublication, Author author) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }
    public String getNameBook() {
        return nameBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Название книги: " + nameBook + " дата публикации: " + yearPublication + " автор: " + author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Book book = (Book) obj;
        return this.yearPublication == book.yearPublication && nameBook.equals(book.nameBook) && author.equals(book.author);
    }
    @Override
    public int hashCode() {
        int c =  Objects.hash(nameBook, author);
        c = c + yearPublication;
        return  c;
    }

    }







