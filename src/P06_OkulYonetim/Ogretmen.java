package P06_OkulYonetim;

import java.util.HashMap;
import java.util.Map;

public class Ogretmen extends Kisi {
    static Map<String, Ogretmen> ogretmenListesiMap = new HashMap<>();
    private String bolum;
    private String sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, int yas, String bolum, String sicilNo) {
        super(adSoyad, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'';
    }
}
