package P06_OkulYonetim;

import java.util.HashMap;
import java.util.Map;

public class Ogrenci extends Kisi{
    static Map<String,Ogrenci> ogrenciListesiMap=new HashMap<>();
    private int numara;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String adSoyad, int yas, int numara, String sinif) {
        super(adSoyad, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return super.toString()+
                "numara=" + numara +
                ", sinif='" + sinif + '\'' ;
    }
}
