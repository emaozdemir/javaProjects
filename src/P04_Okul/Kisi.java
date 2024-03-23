package P04_Okul;

public class Kisi {//parent pojo class
    //fields...
    private String adSoyad;
    private String kimlikNo;
    private int yas;



    //Constructor...
    public Kisi() {//p'Siz sefil cons
    }
    public Kisi(String adSoyad, String kimlikNo, int yas) {//Full p2li telescopic cons..
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = Math.abs(yas);
    }
    // getter-seter meth.

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    //toString


    @Override
    public String toString() {
        return
                "adSoyad='" + adSoyad + '\'' +
                        ", kimlikNo='" + kimlikNo + '\'' +
                        ", yas=" + yas;
    }
}






