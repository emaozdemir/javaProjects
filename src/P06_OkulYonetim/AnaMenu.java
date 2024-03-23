package P06_OkulYonetim;

import java.util.Scanner;

import static P06_OkulYonetim.Islemler.islemlerMenu;

public class AnaMenu implements AnaMenuInterface {
    static Scanner scan = new Scanner(System.in);

    public void giris() {
        System.out.println("\n    ====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                ogrenciIslemleri();
            case "2":
                ogretmenIslemleri();
            case "Q":
                cikis();
            default:
                System.out.println("hatali giris yaptınız tekrar deneyin");
                giris();
        }
    }

    @Override
    public void ogrenciIslemleri() {
       // Islemler.islemlerMenu();//cağırmanın 1. yolu
        islemlerMenu(1);
    }

    @Override
    public void ogretmenIslemleri() {
        islemlerMenu(2);
    }

    @Override
    public void cikis() {

    }


}
