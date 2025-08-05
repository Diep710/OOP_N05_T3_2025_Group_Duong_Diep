public class Giaodich {
    String makhachhang;
    String maphong;
    String ngaygiaodich;
    String thoihan;
    String tongtien;
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
    public String getMaphongtro(){
        return this.maphongtro;
    }
    public void setMaphongtro(String Idpt){
        this.maphongtro = Idpt;
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

