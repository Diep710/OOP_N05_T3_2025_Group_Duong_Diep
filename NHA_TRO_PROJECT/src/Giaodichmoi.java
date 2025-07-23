public class Giaodichmoi {
    public ListKhachhang qlkh;
    public Listphongtro qlpt;
    public Listgiaodich qlgd;

    public Giaodichmoi(ListKhachhang qlkh, Listphongtro qlpt, Listgiaodich qlgd) {
        this.qlkh = qlkh;
        this.qlpt = qlpt;
        this.qlgd = qlgd;
    }

    public void thuchiengd(String maKhachHang, String maPhong) {
        khachhang hovaten = qlkh.timphongtro(maKhachHang);
        phongtro maphong = qlpt.timphongtro(maPhong);

        if (hovaten == null) {
            System.out.println(" Khách hàng không tồn tại");
            return;
        }

        if (maphong == null || !maphong.Listgiaodich()) {
            System.out.println(" Phòng không có sẵn");
            return;
        }

        String maGiaoDich = "GD" + (qlgd.Listgiaodich().size() + 1);
        giaodich gd = new giaodich(maGiaoDich, LocalDate.now(), khachHang, phong);
        qlgd.themGiaoDich(gd);

        // Cập nhật trạng thái phòng
        phong.setTrangThai(false);

        System.out.println(" Giao dịch thuê trọ thành công!");
    }

}
