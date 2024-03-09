package P04;

public class Ogretmen extends Kisi {//Kisi parent Class'a extend child pojo Class
    //fields
    private String sicilNo; //obj variable/instance
    private String bolum;

    public Ogretmen() {//psiz const

    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {//full parametreli const
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

//    public void setSicilNo(String sicilNo) {//kritiktir değiştirilmemeli
//        this.sicilNo = sicilNo;
//    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    //toString meth

    @Override
    public String toString() {
        return   super.toString()+
                "sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum + '\'' ;
    }
}


































