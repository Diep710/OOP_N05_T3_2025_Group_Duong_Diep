import java.util.List;
import java.util.ArrayList;
public class TestListphongtro {
    public static void test(){
        phongtro p1 = new phongtro("ha noi", "101", "35m2","tu, giuong, ban");
        phongtro p2 = new phongtro("ha nam", "102", "30m2","ghe, giuong, ban");
    
    List<phongtro> Listphongtro = new ArrayList<phongtro>();
    Listphongtro.add(p1);
    Listphongtro.add(p2);
    Listphongtro lpt = new Listphongtro(Listphongtro);
    lpt.edit("103","hai phong");
    lpt.printphongtro();
    
    }
}

