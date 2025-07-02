public class Flower {
    private int petalCount = 0;
    private String s = new String();

    Flower(int petals) {
        petalCount = petals;
    }

    Flower(String ss) {
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
    }

    Flower() {
        this("hi", 47);
    }

    public int getPetalCount() {
        return petalCount;
    }

    public void setPetalCount(int p) {
        petalCount = p;

    }
}