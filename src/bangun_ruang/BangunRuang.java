package bangun_ruang;
public class BangunRuang {
    protected int Volume(int s){
        return s*s*s;
    }
    
    protected int LuasPermukaan(int s){
        return 6*s*s;
    } 
    
    protected int Volume(int p, int l, int t){
        return p*l*t;
    }
    
    protected int LuasPermukaan(int p, int l, int t){
        return 2*((p*l)+(p*t)+(l*t));
    }
}
