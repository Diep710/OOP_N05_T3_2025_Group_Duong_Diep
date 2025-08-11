package com.example.servingwebcontent.Database;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
import org.springframework.stereotype.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.Class;
import java.sql.Statement;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class myDBConnection {

    public static Connection getConnection(){
        Connection c = null ;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://avnadmin:AVNS_DbvHWaBUrlYODvqhfWn@mysql-1acba087-ntduog11.b.aivencloud.com:17489/defaultdb?ssl-mode=REQUIRED:17489/defaultdb?ssl-mode=REQUIRED";
            String username = "avnadmin";
            String password = "";
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
             e.printStackTrace();

        }
    }
}


   