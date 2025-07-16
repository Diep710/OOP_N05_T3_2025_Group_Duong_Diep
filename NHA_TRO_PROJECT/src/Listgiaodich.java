import java.util.List;
import java.util.Scanner;
public class Listgiaodich {

    public List<giaodich> gd;

    public Listgiaodich(List<giaodich> g) {
        this.gd = g;
    }
     public List<giaodich> getList() {
        return gd;
    }

    public List<giaodich> Create(giaodich g) {
        gd.add(g);
        return gd;
    }

    public List<giaodich> Delete(String name) {
        for (int i = 0; i < gd.size(); i++) {
            if (gd.get(i).hovaten.equals(name)) {
                gd.remove(i);
            }
        }
        return gd;

}
 public List<giaodich> Edit(String name) {

        for (int i = 0; i < gd.size(); i++) {
            if (gd.get(i).hovaten.equals(name)) {
                // to do
                System.out.println("Nhap ten khach hang muon sua doi: ");
                Scanner scanName = new Scanner(System.in);
                String newName = scanName.nextLine();
                gd.get(i).hovaten = newName;

            }
        }

        return gd;
    }
       public void printgiaodich() {
        for (int i = 0; i < gd.size(); i++) {

            System.out.println("Giao dich :" + gd.get(i).hovaten + " " + gd.get(i).hovaten);

        }
    }
}
