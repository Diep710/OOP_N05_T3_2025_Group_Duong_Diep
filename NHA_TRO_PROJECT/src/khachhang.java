public class khachhang {
    String hovaten;
    String tuoi;
    String sodienthoai;
    String diachi;
    String gioitinh;
    String cccd;
    public khachhang(String name, String tuoi, String sdt, String dc, String gt, String cccd){
        this.hovaten = name;
        this.tuoi = tuoi;
        this.sodienthoai = sdt;
        this.diachi = dc;
        this.gioitinh = gt;
        this.cccd = cccd;
    }
public void hienthi1(){
    System.out.println("Ho va ten:" + hovaten);
    System.out.println("Tuoi:" + tuoi);
    System.out.println("So dien thoai:" + sodienthoai);
    System.out.println("Dia chi:" + diachi);
    System.out.println("Gioi tinh:" + gioitinh);
    System.out.println("Can cuoc cong dan:" + cccd);
}

}
