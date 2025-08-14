package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Database.KhachhangAiven;
import com.example.servingwebcontent.Database.PhongtroAiven;
import com.example.servingwebcontent.Database.GiaodichAiven;
import com.example.servingwebcontent.Model.Khachhang;
import com.example.servingwebcontent.Model.Phongtro;
import com.example.servingwebcontent.Model.Giaodich;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/datphong")
public class DatPhongController {

    PhongtroAiven phongtroDB = new PhongtroAiven();
    KhachhangAiven khachhangDB = new KhachhangAiven();
    GiaodichAiven giaodichDB = new GiaodichAiven();

    @PostMapping
    public String datPhong(@RequestParam String maphong,
                           @RequestParam String makhachhang,
                           @RequestParam String hovaten,
                           @RequestParam String sdt,
                           @RequestParam String diachi,
                           @RequestParam String tuoi,
                           @RequestParam String gioitinh,
                           @RequestParam String cccd,
                           @RequestParam String ngaygiaodich,
                           @RequestParam String thoihan,
                           @RequestParam String tongtien) {

        // 1. Lấy danh sách phòng trọ từ database Aiven
        ArrayList<Phongtro> dsPhong = phongtroDB.phongtroAivenList();

        // 2. Tìm phòng trùng với maphong
        Phongtro phongChon = null;
        for (Phongtro p : dsPhong) {
            if (p.getMaphong().equalsIgnoreCase(maphong)) {
                phongChon = p;
                break;
            }
        }

        // 3. Nếu phòng không tồn tại → đổi sang phòng khác
        if (phongChon == null) {
            if (dsPhong.isEmpty()) {
                return " Không còn phòng nào để đặt!";
            }
            phongChon = dsPhong.get(0); // Lấy phòng đầu tiên
            maphong = phongChon.getMaphong();
        }

        // 4. Kiểm tra khách hàng đã tồn tại chưa
        ArrayList<Khachhang> dsKhach = khachhangDB.khachhangAivenList();
        boolean khachTonTai = false;
        for (Khachhang k : dsKhach) {
            if (k.getMakhachhang().equalsIgnoreCase(makhachhang)) {
                khachTonTai = true;
                break;
            }
        }
// 4. Nếu chưa có khách → thêm mới
        if (!khachTonTai) {
            Khachhang kh = new Khachhang(makhachhang, hovaten, tuoi, sdt, diachi, gioitinh, cccd);
            khachhangDB.createKhachhang(kh);
        }
       
        Giaodich gd = new Giaodich(makhachhang, maphong, ngaygiaodich , thoihan, tongtien );
        giaodichDB.createGiaodich(gd);

        return " Đặt phòng thành công!\n"
                + "Khách: " + hovaten + "\n"
                + "Phòng: " + phongChon.getMaphong() + "\n";
    }
}
