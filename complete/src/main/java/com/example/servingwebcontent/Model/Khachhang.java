package com.example.servingwebcontent.Model;

public class Khachhang {

    public String makhachhang;
    public String hovaten;
    public String tuoi;
    public String sodienthoai;
    public String diachi;
    public String gioitinh;
    public String cccd;
    public Khachhang(){}

    public Khachhang(String Idkh, String name, String age, String sdt, String dc, String gt, String cc){
        this.makhachhang = Idkh;
        this.hovaten = name;
        this.tuoi = age;
        this.sodienthoai = sdt;
        this.diachi = dc;
        this.gioitinh = gt;
        this.cccd = cc;

    }
    public String getMakhachhang(){
        return this.makhachhang;
    }
    public void setMakhachhang(String Idkh){
        this.makhachhang = Idkh;
    }
public String getHovaten(){
        return this.hovaten;
    }
    public void setHovaten(String name){
        this.hovaten = name;
    }
public String getTuoi(){
        return this.tuoi;
    }
    public void setTuoi(String age){
        this.tuoi = age;
    }
    public String getSodienthoai(){
        return this.sodienthoai;
    }
    public void setSodienthoai(String sdt){
        this.sodienthoai = sdt;
    }
public String getDiachi(){
        return this.diachi;
    }
    public void setDiachi(String dc){
        this.diachi = dc;
    }
    public String getGioitinh(){
        return this.gioitinh;
    }
    public void setGioitinh(String gt){
        this.gioitinh = gt;
    }
    public String getCccd(){
        return this.cccd;
    }
    public void setCccd(String cc){
        this.cccd = cc;
    }
}
    

