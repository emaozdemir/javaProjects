package P04_Okul;

public class Ogrenci extends Kisi {//Kisi parnet Class'a extend child pojo Class
    //fields
    private String ogcNumara;// instance:obj variable
    private String sinif;

    //constructor...
    public Ogrenci() {//p'siz sefil cons.

    }
    public Ogrenci(String adSoyad, String kimlikNo, int yas, String OgrcNumara, String sinif) {//full p'li zengin const.
        super(adSoyad, kimlikNo, yas);
        this.ogcNumara = OgrcNumara;
        this.sinif = sinif;
    }

    //getter-setter meth..

    public String getOgcNumara() {
        return ogcNumara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
    //toString method..



    @Override
   public String toString() {
       return super.toString() +
               ", ogcNumara='" + ogcNumara + '\'' +
               ", sinif='" + sinif;
   }
}
