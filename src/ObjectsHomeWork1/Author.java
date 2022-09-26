package ObjectsHomeWork1;

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
}
