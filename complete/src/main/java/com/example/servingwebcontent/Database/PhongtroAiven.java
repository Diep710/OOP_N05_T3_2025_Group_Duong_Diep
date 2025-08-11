package com.example.servingwebcontent.Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import com.example.servingwebcontent.Model.Phongtro;

@Controller
public class PhongtroAiven {
         ArrayList<Phongtro> items = new ArrayList<Phongtro>();

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
    
    
}
