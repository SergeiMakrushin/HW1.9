package ObjectsHomeWork1;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author = new Author("Jonathan", "Swift");
        Author author1 = new Author("Корней", "Чуковский");
        Author author2 = new Author("name3", "lastname3");

        Book book = new Book("Gulliver", 1726, author);
        Book book1 = new Book("Мойдодыр", 1921, author1);
        Book book2 = new Book("3", 1726, author2);
        System.out.println("book.getNameBook() = " + book.getNameBook()+ " "+ book.getYearPublication() +" "+book.getAuthor() );
        System.out.println("book1.getNameBook() = " + book1.getNameBook()+" "+book1.getYearPublication()+" "+book1.getAuthor());
        System.out.println("book2.getNameBook() = " + book2.getNameBook()+" "+book2.getYearPublication()+" "+book2.getAuthor());
        book2.setYearPublication(2022);
        System.out.println("book2.getNameBook() = " + book2.getNameBook()+" "+book2.getYearPublication()+" "+book2.getAuthor());

    }
}
