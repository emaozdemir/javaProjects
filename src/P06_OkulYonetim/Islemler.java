package P06_OkulYonetim;

import java.util.Scanner;

public class Islemler implements IslemlerInterface {
    static Scanner scan = new Scanner(System.in);
    static int secim = 0;//ogretmeni sectiğinde 2 öğrenciyi sectiğinde 1 olacak ve ona gore calısacak

    public static void islemlerMenu(int i) {
        secim=i;
        Islemler obj=new Islemler();
        System.out.println(
                "=============  ISLEMLER =============\n" +
                        "\t 1-EKLEME\n" +
                        "\t 2-ARAMA\n" +
                        "\t 3-LİSTELEME\n" +
                        "\t 4-SİLME\n" +
                        "\t 5-ANA MENÜ\n" +
                        "\t Q-CIKIS\n" +
                        "\t SECIMINIZ: ");
        String scm = scan.next().toUpperCase();
        switch (scm) {
            case "1":
                obj.ekleme();
                islemlerMenu(secim);
                break;
            case "2":
                obj.arama();
                islemlerMenu(secim);
                break;
            case "3":
                obj.listeleme();
                islemlerMenu(secim);
                break;
            case "4":
                obj.silme();
                islemlerMenu(secim);
                break;
            case "5":
                obj.anaMenu();
                break;
            case "Q":
                obj.cikis();
                break;
            default:
                System.out.println("Hatali secim. Yeniden deneyiniz");
                islemlerMenu(secim);
        }
    }


    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }
}
