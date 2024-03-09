package P04;

public class Kisi {//parent pojo class (obje ureten en temel proje)
    //fields...
    private String adSoyad;
    private String kimlikNo;
    private int yas;

    //constructor
    public Kisi(String adSoyad, String kimlikNo, int yas) {//full parametrli telescopic constructor

        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = Math.abs(yas);
    }

    public Kisi() {//psiz cons
    }

    //getter setter method


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

//    public void setKimlikNo(String kimlikNo) {//kontrol amaclı silerim
//        this.kimlikNo = kimlikNo;
//    }

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
                        ", kimlikNo='" + kimlikNo + '\'' +
                        ", yas=" + yas;
    }
}





