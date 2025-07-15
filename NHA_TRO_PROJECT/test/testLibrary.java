public class testLibrary {
    public static void test(){
        Book obj1 = new Book("1", "test1");
        Book obj2 = new Book("2", "test2");
        List<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        Library lib = new Library(list);
        for (Book b : lib.getBooks()){
            System.out.println(b.getID() + "-" + b.getName());
        }
    }

}
