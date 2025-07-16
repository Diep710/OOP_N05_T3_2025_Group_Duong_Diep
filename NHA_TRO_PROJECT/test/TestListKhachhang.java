import java.util.List;
import java.util.ArrayList;
public class TestListKhachhang {
    public static void test(){
        khachhang kh1 = new khachhang("Nguyen Van A", "20", "0987654321", "ha noi", "nam", "123456");
        khachhang kh2 = new khachhang("Nguyen Van B", "30", "0988776655", "da nang", "nam", "654321");
    
    List<khachhang> ListKhachhang = new ArrayList<khachhang>();
    ListKhachhang.add(kh1);
    ListKhachhang.add(kh2);
    ListKhachhang lkh = new ListKhachhang(ListKhachhang);
    lkh.Edit("Nguyen Van C");
    lkh.printkhachhang();
    }
}
