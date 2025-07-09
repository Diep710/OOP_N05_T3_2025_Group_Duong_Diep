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

}
