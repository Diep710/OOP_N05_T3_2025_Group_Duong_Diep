package com.example.servingwebcontent.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;

import com.example.servingwebcontent.Model.Phongtro;

@Controller
public class PhongtroAiven {
         ArrayList<Phongtro> items = new ArrayList<Phongtro>();

//READ- LẤY DANH SÁCH PHÒNG TRỌ

    public ArrayList<Phongtro> phongtroAivenList() {

        try {

            myDBConnection my = new myDBConnection();
            Statement sta = my.getMyConn();

            ResultSet setdata = sta.executeQuery("select * from quanLyNhaTro.phongtrolist");
            int index = 0;
            int columnCount = setdata.getMetaData().getColumnCount();
            System.out.println("column #" + columnCount);

            while (setdata.next()) {
                Phongtro phongtro = new Phongtro();

                String maphong = setdata.getString("maphong");

                String diachicuthe = setdata.getString("diachicuthe");

                String dientich = setdata.getString("dientich");

                String noithat = setdata.getString("noithat");

                System.out.println("Phongtro AIVEN TEST:");
                System.out.println(maphong + " " + diachicuthe + " " + dientich + " " + noithat);

                phongtro.setMaphong(maphong);
                phongtro.setDiachicuthe(diachicuthe);
                phongtro.setDientich(dientich);
                phongtro.setNoithat(noithat);

                System.out.println("Get Phongtro in phongtro Aiven");
                System.out.println(phongtro.getMaphong());
                System.out.println(index);

                items.add(phongtro);
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
    //CREATE- THÊM PHÒNG TRỌ MỚI
    public boolean createPhongtro(Phongtro pt) {
        try {
            myDBConnection my = new myDBConnection();
            PreparedStatement ps = my.getMyConnPrepared(
                "INSERT INTO quanLyNhaTro.phongtrolist (maphong, diachicuthe, dientich, noithat) VALUES (?, ?, ?, ?)"
            );
            ps.setString(1, pt.getMaphong());
            ps.setString(2, pt.getDiachicuthe());
            ps.setString(3, pt.getDientich());
            ps.setString(4, pt.getNoithat());

            int rows = ps.executeUpdate();
            ps.close();
            return rows > 0;
        } catch (Exception e) {
            System.out.println("Error in CREATE Phongtro: " + e);
            e.printStackTrace();
            return false;
        }
    }

    // UPDATE - Cập nhật thông tin phòng trọ
    public boolean updatePhongtro(Phongtro pt) {
        try {
            myDBConnection my = new myDBConnection();
            PreparedStatement ps = my.getMyConnPrepared(
                "UPDATE quanLyNhaTro.phongtrolist SET  diachicuthe=?, dientich=?, noithat=? WHERE maphong=?"
            );
            ps.setString(1, pt.getDiachicuthe());
            ps.setString(2, pt.getDientich());
            ps.setString(3, pt.getNoithat());
            ps.setString(4, pt.getMaphong());


            int rows = ps.executeUpdate();
            ps.close();
            return rows > 0;
        } catch (Exception e) {
            System.out.println("Error in UPDATE Phongtro: " + e);
            e.printStackTrace();
            return false;
        }
    }

    // DELETE - Xóa phòng trọ
    public boolean deletePhongtro(String maphong) {
        try {
            myDBConnection my = new myDBConnection();
            PreparedStatement ps = my.getMyConnPrepared(
                "DELETE FROM quanLyNhaTro.phongtrolist WHERE maphong=?"
            );
            ps.setString(1, maphong);

            int rows = ps.executeUpdate();
            ps.close();
            return rows > 0;
        } catch (Exception e) {
            System.out.println("Error in DELETE Phongtro: " + e);
            e.printStackTrace();
            return false;
        }
    }
    
}
