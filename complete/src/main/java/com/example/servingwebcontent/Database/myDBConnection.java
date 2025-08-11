package com.example.servingwebcontent.Database;

import org.springframework.stereotype.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.Class;
import java.sql.Statement;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class myDBConnection {

    public myDBConnection() {
    };

    // @Value("${my.database.url}")
    // protected String myDatabaseURL;

    String myDatabaseURL = "jdbc:mysql://avnadmin:AVNS_DbvHWaBUrlYODvqhfWn@mysql-1acba087-ntduog11.b.aivencloud.com:17489/defaultdb?ssl-mode=REQUIRED:17489/defaultdb?ssl-mode=REQUIRED";

    // @Value("${my.database.driver}")
    // protected String myDatabaseDriver;

    String myDatabaseDriver = "com.mysql.cj.jdbc.Driver";

    public Connection conn = null;

    public Statement getMyConn() {

        try {

            Class.forName(myDatabaseDriver);
            conn = DriverManager.getConnection(myDatabaseURL);
            Statement sta = conn.createStatement();
            return sta;

        } catch (Exception e) {
            System.out.println("myDBConnection at 34" + e);
        }

        return null;

    }

    public Connection getOnlyConn() {
        try {
            Class.forName(myDatabaseDriver);

            conn = DriverManager.getConnection(myDatabaseURL);
            return conn;

        } catch (Exception e) {
            System.out.println("Database connection error: " + e);
        }

        return conn;

    }

}