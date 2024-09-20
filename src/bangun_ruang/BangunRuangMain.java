package bangun_ruang;
public class BangunRuangMain {
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 4;
        int p = 3;
        int l = 2;
        int t = 5;
        BangunRuang kubus = new BangunRuang();
        BangunRuang balok = new BangunRuang();
        System.out.println("Kubus:");
        System.out.println("Besar Sisi Kubus\t: "+s+"cm");
        System.out.println("Volume Kubus\t\t: "+kubus.Volume(s)+"cm3");
        System.out.println("Luas Permukaan Kubus\t: "+kubus.LuasPermukaan(s)+"cm2\n");
        System.out.println("Balok:");
        System.out.println("Besar Panjang Balok\t: "+p+"cm");
        System.out.println("Besar Lebar Balok\t: "+l+"cm");
        System.out.println("Besar Tinggi Balok\t: "+t+"cm");
        System.out.println("Volume Balok\t\t: "+balok.Volume(p, l, t)+"cm3");
        System.out.println("Luas Permukaan Balok\t: "+balok.LuasPermukaan(p, l, t)+"cm2");
        
    }
}
