import java.util.List;
import java.util.Scanner;
public class Listphongtro {
    public List<phongtro> dsptro;
    public Listphongtro(List<phongtro> dsptro) {
        this.dsptro = dsptro;
    }
    public List<phongtro> getList() {
        return dsptro;
    }
    public void create(phongtro pt) {
        dsptro.add(pt);
        System.out.println("Đã thêm phòng trọ");
    }

    public void delete(String mp) {
        for (int i = 0; i < dsptro.size(); i++) {
            if (dsptro.get(i).maphong.equals(mp)) {
                dsptro.remove(i);
                System.out.println("Đã xoá phòng mã: " + mp);
                return;
            }
        }
         System.out.println(" Không tìm thấy mã phòng: " + mp);
    }
    public void edit(String mp, String diachimoi) {
        for (int i = 0; i < dsptro.size(); i++) {
             phongtro pt = dsptro.get(i);
            if (pt.maphong.equals(mp)) {
                pt.setdiachicuthe(diachimoi);
                System.out.println("Đã cập nhật phòng mã: " + mp);
                return;
            }
        }
        System.out.println(" Không tìm thấy phòng ");
                
    }

    public void printphongtro() {
        for (int i = 0; i < dsptro.size(); i++) {

            System.out.println("phong tro :" + dsptro.get(i).maphong + " " + dsptro.get(i).diachicuthe + " " );

        }
    }
    public phongtro timphongtro(String maPhong) {
    for (phongtro pt : dsptro) {
        if (pt.maphong.equals(maPhong)) {
            return pt;
        }
    }
    return null;
}

}
