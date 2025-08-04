public class phongtro {
    String diachicuthe;
    String maphong;
    String dientich;
    String noithat;
    public phongtro(String dcct, String mp, String dt, String nt){
        this.diachicuthe = dcct;
        this.maphong = mp;
        this.dientich = dt;
        this.noithat = nt;

    }

    public void hienthi3(){
        System.out.println("dia chi cu the:" + diachicuthe);
        System.out.println("ma phong:" + maphong);
        System.out.println("dien tich:" + dientich);
        System.out.println("noi that:" + noithat);
    }
public String setmaphong(String mp){
    maphong = mp;
        return maphong;
    }
    public void getmaphong(){
        System.out.println("Ma phong: " + maphong);
    }
    public String setdiachicuthe(String dcct){
    diachicuthe = dcct;
        return diachicuthe;
    }
    public void getdiachicuthe(){
        System.out.println("Dia chi: " + diachicuthe);
    }
    public String setdientich(String dt){
        dientich = dt;
        return dientich;
    }
    public void getdientich(){
        System.out.println("Dien tich: " + dientich);
    }
    public String setnoithat(String nt){
        noithat = nt;
        return noithat;
    }
    public void getnoithat(){
        System.out.println("Noi that: " + noithat);
    }

}
