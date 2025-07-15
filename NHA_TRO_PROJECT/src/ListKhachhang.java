import java.util.List;
import java.util.ArrayList;
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

    public List<khachhang> Delete(String id) {
        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).id.equals(id)) {
                kh.remove(i);
            }
        }
        return kh;

}
 public List<khachhang> Edit(String id) {

        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).id.equals(id)) {
                // to do
                System.out.println("Nhap ten khach hang muon sua doi: ");
                Scanner scanName = new Scanner(System.in);
                String newName = scanName.nextLine();
                kh.get(i).name = newName;

            }
        }

        return kh;
    }
       public void printkhachhang() {
        for (int i = 0; i < kh.size(); i++) {

            System.out.println("Khachhang :" + kh.get(i).id + " " + kh.get(i).name);

        }
    }
}
