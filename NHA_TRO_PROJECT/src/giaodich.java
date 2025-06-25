public class giaodich {
    String ngaygiaodich;
    String thoihan;
    String tongtien;
    public giaodich(String ngd, String th, String tt){

        this.ngaygiaodich = ngd;
        this.thoihan = th;
        this.tongtien = tt;
    }
    public void hienthi2(){
        System.out.println("Ngay giao dich:" + ngaygiaodich);
        System.out.println("Thoi han:" + thoihan);
        System.out.println("Tong tien:" + tongtien);
    }

}
