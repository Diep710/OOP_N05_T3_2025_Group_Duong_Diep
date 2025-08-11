package com.example.servingwebcontent.Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import com.example.servingwebcontent.Model.Khachhang;

@Controller
public class KhachhangAiven {
     ArrayList<Khachhang> items = new ArrayList<Khachhang>();

    public ArrayList<Khachhang> khachhangAivenList() {

        try {

            myDBConnection my = new myDBConnection();
            Statement sta = my.getMyConn();

            ResultSet setdata = sta.executeQuery("select * from quanLyNhaTro.khachhanglist");
            int index = 0;
            int columnCount = setdata.getMetaData().getColumnCount();
            System.out.println("column #" + columnCount);

            while (setdata.next()) {
                Khachhang khachhang = new Khachhang();

                String makhachhang = setdata.getString("makhachhang");

                String hovaten = setdata.getString("hovaten");

                String tuoi = setdata.getString("tuoi");

                String sodienthoai = setdata.getString("sodienthoai");

                String diachi = setdata.getString("diachi");

                String gioitinh = setdata.getString("gioitinh");

                String cccd = setdata.getString("cccd");

                System.out.println("Khachhang AIVEN TEST:");
                System.out.println(makhachhang + " " + hovaten + " " + tuoi + " " + sodienthoai + " " + diachi + " " + gioitinh + " " +cccd);

                khachhang.setMakhachhang(makhachhang);
                khachhang.setHovaten(hovaten);
                khachhang.setTuoi(tuoi);
                khachhang.setSodienthoai(sodienthoai);
                khachhang.setDiachi(diachi);
                khachhang.setGioitinh(gioitinh);
                khachhang.setCccd(cccd);

                System.out.println("Get Khachhang in khachhang Aiven");
                System.out.println(khachhang.getMakhachhang());
                System.out.println(index);

                items.add(khachhang);
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
    
}
