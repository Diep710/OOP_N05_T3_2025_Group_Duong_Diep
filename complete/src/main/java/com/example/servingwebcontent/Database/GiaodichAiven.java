package com.example.servingwebcontent.Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import com.example.servingwebcontent.Model.Giaodich;

@Controller
public class GiaodichAiven {
             ArrayList<Giaodich> items = new ArrayList<Giaodich>();

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
                giaodich.setMaphongtro(maphong);
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
    
}
