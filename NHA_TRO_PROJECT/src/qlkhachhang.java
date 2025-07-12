 import java.util.*;

public class KhachHangManager {
    private List<KhachHang> danhSach = new ArrayList<>();

    public void themKhachHang(KhachHang kh) {
        danhSach.add(kh);
        System.out.println(" Đã thêm khách hàng: " + kh.getHoVaTen());
    }

    public void hienThiKhachHang() {
        System.out.println(" Danh sách khách hàng:");
        for (KhachHang kh : danhSach) {
            System.out.println("Tên: " + kh.getHoVaTen() + " | CCCD: " + kh.getCccd());
        }
    }

    public void suaKhachHang(String cccd, String tenMoi) {
        for (KhachHang kh : danhSach) {
            if (kh.getCccd().equals(cccd)) {
                kh.setHoVaTen(tenMoi);
                System.out.println(" Đã cập nhật tên khách hàng.");
                return;
            }
        }
        System.out.println(" Không tìm thấy khách hàng với CCCD: " + cccd);
    }

    public void xoaKhachHang(String cccd) {
        danhSach.removeIf(kh -> kh.getCccd().equals(cccd));
        System.out.println(" Đã xóa khách hàng có CCCD: " + cccd);
    }
}