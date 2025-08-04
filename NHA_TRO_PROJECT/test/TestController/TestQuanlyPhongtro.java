import java.util.List;
import java.util.ArrayList;
public class TestQuanlyPhongtro {
    public static void test(){
        Phongtro p1 = new Phongtro("ha noi", "101", "35m2","tu, giuong, ban");
        Phongtro p2 = new Phongtro("ha nam", "102", "30m2","ghe, giuong, ban");
    
    List<Phongtro> Listphongtro = new ArrayList<Phongtro>();
    Listphongtro.add(p1);
    Listphongtro.add(p2);
    Listphongtro lpt = new Listphongtro(Listphongtro);
    lpt.edit("103","hai phong");
    lpt.printphongtro();
    
    }
}

