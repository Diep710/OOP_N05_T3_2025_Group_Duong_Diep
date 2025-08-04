public class Book1 {
    private String bookID;
    private String bookName;
    public Book() {}
    public Book(String id, String name) {
        this.bookID = id;
        this.bookName = name;
    }

    public void setID(String id) {
        this.bookID = id;
    }
    public String getID() {
        return this.bookID;
    }
    public void setName(String name) {
        this.bookName = name;
    }
    public String getName() {
        return this.bookName;
    }
}