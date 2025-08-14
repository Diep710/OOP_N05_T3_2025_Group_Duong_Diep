package com.example.servingwebcontent.Model;

public class Giaodich {
    public String makhachhang;
    public String maphong;
    public String ngaygiaodich;
    public String thoihan;
    public String tongtien;
    public Giaodich(){}
    public Giaodich(String Idkh, String Idpt, String ngd, String th, String tt){
        this.makhachhang = Idkh;
        this.maphong = Idpt;
        this.ngaygiaodich = ngd;
        this.thoihan = th;
        this.tongtien = tt;
    }
    public String getMakhachhang(){
        return this.makhachhang;
    }
    public void setMakhachhang(String Idkh){
        this.makhachhang = Idkh;
    }
    public String getMaphong(){
        return this.maphong;
    }
    public void setMaphong(String Idpt){
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

    

