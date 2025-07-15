 import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class KhachHangManager {
    private List<khachhang> danhSach = new ArrayList<>();

    public void themKhachHang(khachhang kh) {
        danhSach.add(kh);
        System.out.println(" Đã thêm khách hàng: " + kh.gethovaten());
    }

    public void hienThiKhachHang() {
        System.out.println(" Danh sách khách hàng:");
        for (khachhang kh : danhSach) {
            System.out.println("Tên :" + kh.gethovaten() + " | CCCD: " + kh.getcccd());
        }
    }

    public void suaKhachHang(String cccd, String tenMoi) {
        for (khachhang kh : danhSach) {
            if (kh.getcccd().equals(cccd)) {
                kh.sethovaten(tenMoi);
                System.out.println(" Đã cập nhật tên khách hàng.");
                return;
            }
        }
        System.out.println(" Không tìm thấy khách hàng với CCCD: " + cccd);
    }

    public void xoaKhachHang(String cccd) {
        danhSach.removeIf(kh -> kh.getcccd().equals(cccd));
        System.out.println(" Đã xóa khách hàng có CCCD: " + cccd);
    }
}