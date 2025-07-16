import java.util.List;
import java.util.ArrayList;
public class TestListgiaodich {
    public static void test(){
        giaodich gd1 = new giaodich("Nguyen Van A", "101", "01/01/2025", "6 thang", "15.000.000");
        giaodich gd2 = new giaodich("Nguyen Van B", "102", "02/02/2025", "12 thang", "30.000.000");
    
    List<giaodich> Listgiaodich = new ArrayList<giaodich>();
    Listgiaodich.add(gd1);
    Listgiaodich.add(gd2);
    Listgiaodich lgd = new Listgiaodich(Listgiaodich);
    lgd.Edit("Nguyen Van C");
    lgd.printgiaodich();
    }
}
