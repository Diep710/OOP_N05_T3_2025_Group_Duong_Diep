public class NNCollection {
    private NameNumber[] nnArray = new NameNumber[100];
    private int free;

    public NNCollection() {
        free = 0;
    }

    // Phương thức
    public void insert(NameNumber n) {
        int index = 0;
        for (int i = free++; i != 0 && nnArray[i - 1].getLastName().compareTo(n.getLastName()) > 0; i--) {
            nnArray[i] = nnArray[i - 1];
            index = i;
        }
        System.out.println("index:" + index);
        nnArray[index] = n;
    }

    public String findNumber(String lName) {
        for (int i = 0; i < free; i++) {
            if (nnArray[i].getLastName().equals(lName)) {
                return nnArray[i].getTelNumber();
            }
        }
        return new String("Name not found");
    }

    public void print() {
        System.out.println("Size:" + nnArray.length);

        for (int i = 0; i < nnArray.length; i++) {
            System.out.print("Name: " + nnArray[i].getLastName());
            System.out.print("Number:" + nnArray[i].getTelNumber());

        }
    }
}