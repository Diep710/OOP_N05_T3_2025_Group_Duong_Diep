package com.example.servingwebcontent.Model;

public class Giaodich {
    public String magiaodich;
    public String makhachhang;
    public String maphong;
    public String ngaygiaodich;
    public String thoihan;
    public String tongtien;
    public Giaodich(){}
    public Giaodich(String Idgd, String Idkh, String Idpt, String ngd, String th, String tt){
        this.magiaodich = Idgd;
        this.makhachhang = Idkh;
        this.maphong = Idpt;
        this.ngaygiaodich = ngd;
        this.thoihan = th;
        this.tongtien = tt;
    }
    public String getMagiaodich(){
        return this.magiaodich;
    }
    public void setMagiaodich(String Idgd){
        this.magiaodich = Idgd;
    }
    public String getMakhachhang(){
        return this.makhachhang;
    }
    public void setMakhachhang(String Idkh){
        this.makhachhang = Idkh;
    }
    public String getMaphongtro(){
        return this.maphong;
    }
    public void setMaphongtro(String Idpt){
        this.maphong = Idpt;
    }
    public String getNgaygiaodich(){
        return this.ngaygiaodich;
    }
    public void setNgaygiaodich(String ngd){
        this.ngaygiaodich = ngd;
    }
    public String getThoihan(){
        return this.thoihan;
    }
    public void setThoihan(String th){
        this.thoihan = th;
    }
    public String getTongtien(){
        return this.tongtien;
    }
    public void setTongtien(String tt){
        this.tongtien = tt;
    }

}

    

