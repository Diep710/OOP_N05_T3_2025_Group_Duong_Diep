package com.example.servingwebcontent.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.Statement;

import com.example.servingwebcontent.Model.Khachhang;

import java.lang.System;

public class insertToAiven {
    public void insertToAivenDb(Khachhang kh) {
        Connection conn = null;
      

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://avnadmin:AVNS_DbvHWaBUrlYODvqhfWn@mysql-1acba087-ntduog11.b.aivencloud.com:17489/quanLyNhaTro?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_DbvHWaBUrlYODvqhfWn");

            /*
             * conn =
             * DriverManager.getConnection("jdbc:mysql://"+user+":"+password+"@"+host+":"+
             * port+"/"+databaseName+"?ssl-mode=REQUIRED", user, password);
             */
            Statement sta = conn.createStatement();

            //
            
            String mkh = kh.getMakhachhang();
            String hvt = kh.getHovaten();
            String t = kh.getTuoi();
            String sdt = kh.getSodienthoai();
            String dc = kh.getDiachi();
            String gt = kh.getGioitinh();
            String cc = kh.getCccd();

            String reset = "INSERT INTO Khachhang(makhachhang, hovaten, tuoi, sodienthoai, diachi, gioitinh, cccd) VALUES(?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(reset)) {
                pst.setString(1, mkh);
                pst.setString(2, hvt);
                pst.setString(3, t);
                pst.setString(4, sdt);
                pst.setString(5, dc);
                pst.setString(6, gt);
                pst.setString(7, cc);
                pst.executeUpdate();
            }
            System.out.println("Display data from database: ");

            sta.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error in database connecion");
            System.out.println(e);
            e.printStackTrace();
        }
    }

}