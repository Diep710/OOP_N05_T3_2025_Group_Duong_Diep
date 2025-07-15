import java.util.List;
import java.util.ArrayList;
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
 public List<khachhang> Edit(String name) {

        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).hovaten.equals(name)) {
                // to do
                System.out.println("Nhap ten khach hang muon sua doi: ");
                Scanner scanName = new Scanner(System.in);
                String newName = scanName.nextLine();
                kh.get(i).hovaten = newName;

            }
        }

        return kh;
    }
       public void printkhachhang() {
        for (int i = 0; i < kh.size(); i++) {

            System.out.println("Khachhang :" + kh.get(i).hovaten + " " + kh.get(i).hovaten);

        }
    }
}
