package ObjectsHomeWork1;

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
}
