package j100_javaProjects.P04_ogrcOgrtYonetimi;

import P04.Kisi;

public class Ogrenci extends Kisi {//Kisi parnet Class'a extend child pojo Class
    private String ogrenciNumara;
    private  String sinif;

    public Ogrenci() {
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNumara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNumara = ogrenciNumara;
        this.sinif = sinif;
    }

    public String getOgrenciNumara() {
        return ogrenciNumara;
    }

//    public void setOgrenciNumara(String ogrenciNumara) {
//        this.ogrenciNumara = ogrenciNumara;
//    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return
                "ogrenciNumara='" + ogrenciNumara + '\'' +
                ", sinif='" + sinif + '\'';
    }
}
