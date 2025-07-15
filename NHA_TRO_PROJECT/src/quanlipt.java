import java.util.List;
import java.util.ArrayList;
public class quanlipt {
    List<phongtro>  danhsach = new ArrayList<>();
    public void themphongtro(phongtro pt){
        danhsach.add(pt);
        System.out.println("thêm phòng trọ:"+pt.getmaphong());
    }
    public void hienthiphongtro(){
        System.out.println("danh sách phòng trọ:");
        System.out.println("mã phòng:"+ pt.getmaphong());
    }
    public void suaphongtro(String maphongmoi){
        pt.setmaphong(maphongmoi);
        System.out.println("đã cập nhật");
        return;
    }
    public void xoaphongtro(String maphong){
        danhsach.removeIf(pt->pt.getmaphong().equals(maphong));
        System.out.println("đã xoa phong ma:" + maphong);
    }

}
