public class App {
    public static void main(String[] args) throws Exception {
        Book.test();
        Flower f = new Flower();

        f.setPetalCount(4);
        System.out.println(f.getPetalCount());
     
    }
}
