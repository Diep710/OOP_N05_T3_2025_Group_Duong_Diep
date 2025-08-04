import java.util.List;
import java.util.Scanner;
public class QuanlyPhongtro {
    public List<Phongtro> dsptro;
    public QuanlyPhongtro() {
        dsptro = new Arraylist<>();
    }
    public void create(Phongtro pt) {
        dsptro.add(pt);
        System.out.println("Đã thêm phòng trọ");
    }
     public void read() {
        if (dsptro.isEmpty()) {
            System.out.println(" Danh sách phòng trọ đang trống.");
        } else {
            System.out.println(" Danh sách phòng trọ:");
            for (Phongtro pt : dsptro) {
                System.out.println(pt);
            }
        }
    }
    public void update(String maphong, String diachimoi, String dientichmoi, String noithatmoi) {
        for (Phongtro pt : dsptro) {
            if (pt.getMaphong().equals(maphong)) {
                pt.setDiachicuthe(diachimoi);
                pt.setDientich(dientichmoi);
                pt.setNoithat(noithatmoi);
                System.out.println("Đã cập nhật thông tin phòng trọ có mã: " + maphong);
                return;
            }
        }
        System.out.println(" Không tìm thấy phòng có mã: " + maphong);
    }
    public void delete(String maPhong) {
        for (int i = 0; i < dsptro.size(); i++) {
            if (dsptro.get(i).getMaphong().equals(maPhong)) {
                dsptro.remove(i);
                System.out.println(" Đã xóa phòng trọ có mã: " + maPhong);
                return;
            }
        }
        System.out.println(" Không tìm thấy phòng có mã: " + maPhong);
    }


}
