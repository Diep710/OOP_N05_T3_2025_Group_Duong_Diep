package com.example.servingwebcontent.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import com.example.servingwebcontent.Model.Giaodich;

@Controller
public class GiaodichAiven {
             ArrayList<Giaodich> items = new ArrayList<Giaodich>();
<<<<<<< HEAD
             // READ - Lấy danh sách giao dịch

=======
//READ- LẤY DANH SACH GIAO DỊCH
>>>>>>> c8561b595adc7afa7fdb9a5b8604628239715a40
    public ArrayList<Giaodich> giaodichAivenList() {

        try {

            myDBConnection my = new myDBConnection();
            Statement sta = my.getMyConn();

            ResultSet setdata = sta.executeQuery("select * from quanLyNhaTro.giaodichlist");
            int index = 0;
            int columnCount = setdata.getMetaData().getColumnCount();
            System.out.println("column #" + columnCount);

            while (setdata.next()) {
                Giaodich giaodich = new Giaodich();

                String makhachhang = setdata.getString("makhachhang");

                String maphong = setdata.getString("maphong");

                String ngaygiaodich = setdata.getString("ngaygiaodich");

                String thoihan = setdata.getString("thoihan");

                String tongtien = setdata.getString("tongtien");

                System.out.println("Giaodich AIVEN TEST:");
                System.out.println(makhachhang + " " + maphong + " " + ngaygiaodich + " " + thoihan + " " + tongtien);

                giaodich.setMakhachhang(makhachhang);
                giaodich.setMaphong(maphong);
                giaodich.setNgaygiaodich(ngaygiaodich);
                giaodich.setThoihan(thoihan);
                giaodich.setTongtien(tongtien);

                System.out.println("Get Giaodich in giaodich Aiven");
                System.out.println(giaodich.getMakhachhang());
                System.out.println(index);

                items.add(giaodich);
            }

            setdata.close();
            sta.close();
            //my.close();

        } catch (Exception e) {
            System.out.println("Error in database connecion :" + e);
            e.printStackTrace();
        }

        return items;

    }
<<<<<<< HEAD
    // CREATE - Thêm giao dịch mới
=======
    //CREATE- THÊM GIAO DỊCH MỚI
>>>>>>> c8561b595adc7afa7fdb9a5b8604628239715a40
    public boolean createGiaodich(Giaodich gd) {
        try {
            myDBConnection my = new myDBConnection();
            PreparedStatement ps = my.getMyConnPrepared(
                "INSERT INTO quanLyNhaTro.giaodichlist (makhachhang, maphong, ngaygiaodich, thoihan, tongtien) VALUES (?, ?, ?, ?, ?)"
            );
            ps.setString(1, gd.getMakhachhang());
            ps.setString(2, gd.getMaphong());
            ps.setString(3, gd.getNgaygiaodich());
            ps.setString(4, gd.getThoihan());
            ps.setString(5, gd.getTongtien());

            int rows = ps.executeUpdate();
            ps.close();
            return rows > 0;
        } catch (Exception e) {
            System.out.println("Error in CREATE giaodich: " + e);
            e.printStackTrace();
            return false;
        }
    }

    // UPDATE - Cập nhật thông tin giao dịch
    public boolean updateGiaodich(Giaodich gd) {
        try {
            myDBConnection my = new myDBConnection();
            PreparedStatement ps = my.getMyConnPrepared(
                "UPDATE quanLyNhaTro.giaodichlist SET maphong=?, ngaygiaodich=?, thoihan=?, tongtien=? WHERE makhachhang=?"
            );
            ps.setString(1, gd.getMaphong());
            ps.setString(2, gd.getNgaygiaodich());
            ps.setString(3, gd.getThoihan());
            ps.setString(4, gd.getTongtien());
            ps.setString(5, gd.getMakhachhang());

            int rows = ps.executeUpdate();
            ps.close();
            return rows > 0;
        } catch (Exception e) {
            System.out.println("Error in UPDATE Giaodich: " + e);
            e.printStackTrace();
            return false;
        }
    }

    // DELETE - Xóa giao dịch
    public boolean deleteGiaodich(String makhachhang) {
        try {
            myDBConnection my = new myDBConnection();
            PreparedStatement ps = my.getMyConnPrepared(
                "DELETE FROM quanLyNhaTro.giaodichlist WHERE makhachhang=?"
            );
            ps.setString(1, makhachhang);

            int rows = ps.executeUpdate();
            ps.close();
            return rows > 0;
        } catch (Exception e) {
            System.out.println("Error in DELETE Giao dich: " + e);
            e.printStackTrace();
            return false;
        }
    }
    
}
