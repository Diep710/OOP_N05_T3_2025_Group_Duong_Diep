package com.example.servingwebcontent.Model;

public class Phongtro {

    String maphong;
    String diachicuthe;
    String dientich;
    String noithat;
public Phongtro(){}
    public Phongtro(String Idpt, String dcct, String dt, String nt){
        this.maphong = Idpt;
        this.diachicuthe = dcct;
        this.dientich = dt;
        this.noithat = nt;

    }
    public String getMaphong(){
        return this.maphong;
    }
    public void setMaphong(String Idpt){
        this.maphong = Idpt;
    }
    public String getDiachicuthe(){
        return this.diachicuthe;
    }
    public void setDiachicuthe(String dcct){
        this.diachicuthe = dcct ;
    }
public String getDientich(){
        return this.dientich;
    }
    public void setDientich(String dt){
        this.dientich = dt;
    }
    public String getNoithat(){
        return this.noithat;
    }
    public void setNoithat(String nt){
        this.noithat = nt;
    }
    

}
    

