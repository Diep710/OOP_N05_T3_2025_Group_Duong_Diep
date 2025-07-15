import java.util.List;

public class Book {
    public String BookID;
    public String BookName;

    public Book() {
    }

    public Book(String id, String name) {
        BookID = id;
        BookName = name;
    }

    public void setID(String id) {
        BookID = id;
    }

    public String getID() {
        return BookID;
    }

    public void setName(String name) {
        BookName = name;
    }

    public String getName() {
        return BookName;
    }

}
