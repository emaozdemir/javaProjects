package P06_OkulYonetim;

public class Kisi {
    private String adSoyad;
    private int yas;

    public Kisi() {
    }

    public Kisi(String adSoyad, int yas) {
        this.adSoyad = adSoyad;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "adSoyad='" + adSoyad + '\'' +
                        ", yas=" + yas ;
    }
}
