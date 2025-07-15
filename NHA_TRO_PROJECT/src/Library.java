import java.util.List;
public class Library {
    private final List<Book> books;

    Library(List<Book> b) {
        this.books = b;
    }

    public List<Book> getList() {
        return books;
    }
}
