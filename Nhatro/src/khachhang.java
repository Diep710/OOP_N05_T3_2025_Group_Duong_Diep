public class khachhang {
    String hovaten;
    String tuoi;
    String sodienthoai;
    String diachi;
    String gioitinh;
    String cmnd;
    public khachhang(String name, String tuoi, String sdt, String dc, String gt, String cmnd){
        this.hovaten = name;
        this.tuoi = tuoi;
        this.sodienthoai = sdt;
        this.diachi = dc;
        this.gioitinh = gt;
        this.cmnd = cmnd;
    }
public void hienthi1(){
    System.out.println("Ho va ten:" + hovaten);
}

}
