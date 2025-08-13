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
            
            String ur = kh.getMakhachhang();
            String ad = kh.getHovaten();
            String tu = kh.getTuoi();

            String reset = "INSERT INTO Khachhang(makhachhang, hovaten, tuoi) VALUES(?, ?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(reset)) {
                pst.setString(1, ur);
                pst.setString(2, ad);
                pst.setString(3, tu);
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