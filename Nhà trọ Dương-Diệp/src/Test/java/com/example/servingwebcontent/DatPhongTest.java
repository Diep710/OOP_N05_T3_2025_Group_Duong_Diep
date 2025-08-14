package com.example.servingwebcontent.Controller;

import com.example.servingwebcontent.Database.KhachhangAiven;
import com.example.servingwebcontent.Database.PhongtroAiven;
import com.example.servingwebcontent.Database.GiaodichAiven;
import com.example.servingwebcontent.Model.Khachhang;
import com.example.servingwebcontent.Model.Phongtro;
import com.example.servingwebcontent.Model.Giaodich;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class DatPhongControllerTest {

    private DatPhongController controller;
    private PhongtroAiven phongtroMock;
    private KhachhangAiven khachhangMock;
    private GiaodichAiven giaodichMock;

    @BeforeEach
    public void setup() {
        phongtroMock = Mockito.mock(PhongtroAiven.class);
        khachhangMock = Mockito.mock(KhachhangAiven.class);
        giaodichMock = Mockito.mock(GiaodichAiven.class);

        controller = new DatPhongController();
        controller.phongtroDB = phongtroMock;
        controller.khachhangDB = khachhangMock;
        controller.giaodichDB = giaodichMock;
    }

    @Test
    public void testDatPhong_KhachHangMoi_ThanhCong() {
        // Danh sách phòng có chứa phòng m1
        ArrayList<Phongtro> dsPhong = new ArrayList<>();
        dsPhong.add(new Phongtro("m1", "Phòng 101", 1000000));
        when(phongtroMock.phongtroAivenList()).thenReturn(dsPhong);

        // Danh sách khách rỗng
        when(khachhangMock.khachhangAivenList()).thenReturn(new ArrayList<>());

        String result = controller.datPhong("m1", "kh1", "Nguyen Van A", "0901234567",
                "Ha Noi", "25", "Nam", "123456789", "2025-08-13", "1 tháng", "1000000");

        assertTrue(result.contains("Đặt phòng thành công"));
        verify(khachhangMock, times(1)).createKhachhang(any(Khachhang.class));
        verify(giaodichMock, times(1)).createGiaodich(any(Giaodich.class));
    }

    @Test
    public void testDatPhong_KhachHangDaTonTai() {
        ArrayList<Phongtro> dsPhong = new ArrayList<>();
        dsPhong.add(new Phongtro("m1", "Phòng 101", 1000000));
        when(phongtroMock.phongtroAivenList()).thenReturn(dsPhong);

        ArrayList<Khachhang> dsKhach = new ArrayList<>();
        dsKhach.add(new Khachhang("kh1", "Nguyen Van A", "25", "Ha Noi", "0901234567", "Nam", "123456789"));
        when(khachhangMock.khachhangAivenList()).thenReturn(dsKhach);

        String result = controller.datPhong("m1", "kh1", "Nguyen Van A", "0901234567",
                "Ha Noi", "25", "Nam", "123456789", "2025-08-13", "1 tháng", "1000000");

        assertTrue(result.contains("Đặt phòng thành công"));
        verify(khachhangMock, never()).createKhachhang(any(Khachhang.class)); // không tạo mới
    }

    @Test
    public void testDatPhong_KhongCoPhong() {
        when(phongtroMock.phongtroAivenList()).thenReturn(new ArrayList<>());

        String result = controller.datPhong("m1", "kh1", "Nguyen Van A", "0901234567",
                "Ha Noi", "25", "Nam", "123456789", "2025-08-13", "1 tháng", "1000000");

        assertTrue(result.contains("Không còn phòng nào để đặt"));
    }
}
