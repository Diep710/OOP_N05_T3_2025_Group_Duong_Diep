public class khachhang {
    String hovaten;
    String tuoi;
    String sodienthoai;
    String diachi;
    String gioitinh;
    String cccd;
    public khachhang(){}

    public khachhang(String name, String age, String sdt, String dc, String gt, String cc){
        this.hovaten = name;
        this.tuoi = age;
        this.sodienthoai = sdt;
        this.diachi = dc;
        this.gioitinh = gt;
        this.cccd = cc;

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
        System.out.println("Ten khach hang: " + hovaten);
    }
    public String settuoi(String age){
    tuoi = age;
        return tuoi;
    }
    public void gettuoi(){
        System.out.println("Tuoi khach hang: " + tuoi);
    }
    public String sethsodienthoai(String sdt){
        sodienthoai = sdt;
        return sodienthoai;
    }
    public void gethsodienthoai(){
        System.out.println("Sdt khach hang: " + sodienthoai);
    }
    public String setdiachi(String dc){
        diachi = dc;
        return diachi;
    }
    public void getdiachi(){
        System.out.println("Dia chi khach hang: " + diachi);
    }
    public String setgioitinh(String gt){
        gioitinh = gt;
        return gioitinh;
    }
    public void getgioitinh(){
        System.out.println("Gioi tinh khach hang: " + gioitinh);
    }
    public String setcccd(String cc){
        cccd = cc;
        return cccd;
    }
    public void getcccd(){
        System.out.println("Cccd khach hang: " + cccd);
    }
}
