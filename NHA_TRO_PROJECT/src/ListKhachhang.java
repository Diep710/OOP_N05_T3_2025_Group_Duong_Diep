import java.util.List;
import java.util.Scanner;
public class ListKhachhang {

    public List<khachhang> kh;

    public ListKhachhang(List<khachhang> b) {
        this.kh = b;
    }
     public List<khachhang> getList() {
        return kh;
    }

    public List<khachhang> Create(khachhang b) {
        kh.add(b);
        return kh;
    }

    public List<khachhang> Delete(String name) {
        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).hovaten.equals(name)) {
                kh.remove(i);
            }
        }
        return kh;

}
public class Listkhachhang {
    private final Scanner scanner = new Scanner(System.in);

    public List<khachhang> Edit(String name) {
        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).hovaten.equals(name)) {
                System.out.print("Nhap ten khach hang muon sua doi: ");
                String newName = scanner.nextLine();
                kh.get(i).tuoi = newName;
            }
        }
        return kh;
    }
}
       public void printkhachhang() {
        for (int i = 0; i < kh.size(); i++) {

            System.out.println("Khachhang :" + kh.get(i).hovaten + " " + kh.get(i).tuoi + " "  );

        }
    }
}
