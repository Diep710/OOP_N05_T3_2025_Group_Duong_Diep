public class giaodich {
    String hovaten;
    String maphong;
    String ngaygiaodich;
    String thoihan;
    String tongtien;
    public giaodich(String name, String mp, String ngd, String th, String tt){
        this.hovaten = name;
        this.maphong = mp;
        this.ngaygiaodich = ngd;
        this.thoihan = th;
        this.tongtien = tt;
    }
    public void hienthi2(){
        System.out.println("Ho va ten:" + hovaten);
        System.out.println("Ma phong:" + maphong);
        System.out.println("Ngay giao dich:" + ngaygiaodich);
        System.out.println("Thoi han:" + thoihan);
        System.out.println("Tong tien:" + tongtien);
    }
    public String sethovaten(String name){
    hovaten = name;
        return hovaten;
    }
    public void gethovaten(){
        System.out.println("Ten khach hang: " + hovaten);
    }
    public String setmaphong(String mp){
    maphong = mp;
        return maphong;
    }
    public void getmaphong(){
        System.out.println("Ma phong : " + maphong);
    }
    public String setngaygiaodich(String ngd){
        ngaygiaodich = ngd;
        return ngaygiaodich;
    }
    public void gethngaygiaodich(){
        System.out.println("Ngay giao dich : " + ngaygiaodich);
    }
    public String setthoihan(String th){
        thoihan = th;
        return thoihan;
    }
    public void getthoihan(){
        System.out.println("Thoi han : " + thoihan);
    }
    public String settongtien(String tt){
        tongtien = tt;
        return tongtien;
    }
    public void gettongtien(){
        System.out.println("Tong tien : " + tongtien);
    }
}

