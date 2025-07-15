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
public String sethovaten(String name){
    hovaten = name;
        return hovaten;
    }
    public void gethovaten(){
        System.out.println("Ten user: " + hovaten);
    }
    public String settuoi(String tuoi){
    tuoi = tuoi;
        return tuoi;
    }
    public void gettuoi(){
        System.out.println("Tuoi user: " + tuoi);
    }
    public String sethsodienthoai(String sdt){
        sodienthoai = sdt;
        return sodienthoai;
    }
    public void gethsodienthoai(){
        System.out.println("Sdt user: " + sodienthoai);
    }
    public String setdiachi(String dc){
        diachi = dc;
        return diachi;
    }
    public void getdiachi(){
        System.out.println("Dia chi user: " + diachi);
    }
    public String setgioitinh(String gt){
        gioitinh = gt;
        return gioitinh;
    }
    public void getgioitinh(){
        System.out.println("Gioi tinh user: " + gioitinh);
    }
    public String setcccd(String cccd){
        cccd = cccd;
        return cccd;
    }
    public void getcccd(){
        System.out.println("Cccd user: " + cccd);
    }
}
