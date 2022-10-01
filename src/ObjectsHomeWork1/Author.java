package ObjectsHomeWork1;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String lastNameAutor;

    public Author(String nameAuthor, String lastNameAutor) {
        this.nameAuthor = nameAuthor;
        this.lastNameAutor = lastNameAutor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastNameAutor() {
        return lastNameAutor;
    }

    @Override
    public String toString() {

        return nameAuthor + " " + lastNameAutor;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (this.getClass()!=getClass()) return false;
        Author author = (Author) obj;
        return lastNameAutor.equals(author.lastNameAutor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lastNameAutor);
    }
}
