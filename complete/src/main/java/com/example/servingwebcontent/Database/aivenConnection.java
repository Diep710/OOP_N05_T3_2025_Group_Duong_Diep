package com.example.servingwebcontent.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class aivenConnection {
  
    public void aivenConn() {
        Connection conn = null;
        try {

            myDBConnection mydb = new myDBConnection();

            conn = mydb.getOnlyConn();

             
            Statement sta = conn.createStatement();
            ResultSet reset = sta.executeQuery("select * from quanlyNhaTro");
            System.out.println("Display data from database: ");
            while (reset.next()) {
                String makhachhang = reset.getString("makhachhang");
                String hovaten = reset.getString("hovaten");
                String tuoi = reset.getString("tuoi");
                String sodienthoai = reset.getString("sodienthoai");
                String diachi = reset.getString("diachi");
                String gioitinh = reset.getString("gioitinh");
                String cccd = reset.getString("cccd");
                System.out.println(makhachhang + " " + hovaten + " " + tuoi + " " + sodienthoai + " " + diachi + " " + gioitinh + " " + cccd);

            }

            reset.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error in database connecion :" + e);

            e.printStackTrace();
        }
    }
}