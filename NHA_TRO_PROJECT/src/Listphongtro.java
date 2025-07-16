import java.util.List;
import java.util.Scanner;
public class Listphongtro {
    public List<phongtro> ptro;
    public Listphongtro(List<phongtro> pt) {
        this.ptro = pt;
    }
    public List<phongtro> getList() {
        return ptro;
    }
    public List<phongtro> Create(phongtro pt) {
        ptro.add(pt);
        return ptro;
    }

    public List<phongtro> Delete(String mp) {
        for (int i = 0; i < ptro.size(); i++) {
            if (ptro.get(i).maphong.equals(mp)) {
                ptro.remove(i);
            }
        }
        return ptro;
    }
    public List<phongtro> Edit(String mp) {

        for (int i = 0; i < ptro.size(); i++) {
            if (ptro.get(i).maphong.equals(mp)) {
                // to do
                System.out.println("Nhap ma phong muon sua doi: ");
                Scanner scanName = new Scanner(System.in);
                String newName = scanName.nextLine();
                ptro.get(i).maphong = newName;

            }
        }

        return ptro;
    }

    public void printphongtro() {
        for (int i = 0; i < ptro.size(); i++) {

            System.out.println("Ma phong tro :" + ptro.get(i).maphong + " " );

        }
    }

}
