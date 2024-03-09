package P04;

import j100_javaProjects.P04_ogrcOgrtYonetimi.Ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static String kisiTuru;//istenen methoda call edilebilmesi için static olarak taımlandı
    static Scanner input = new Scanner(System.in);

    static List<Ogretmen> ogretmenList = new ArrayList<>();//Ogretmen obj depolayacak bos bir list tanımlandı
    static List<Ogrenci> ogrenciList = new ArrayList<>();//Ogrenci obj depolayacak bos bir list tanımlandı

    public static void girisPaneli() {
        System.out.println("**********************************      \nOGRENCI VE OGRETMEN ANA MENU" +
                " \n**********************************" +
                "\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS " +
                "\nLutfen yapmak istediginiz islemi giriniz : ");
        String islemSecimi = input.next().toUpperCase();
        switch (islemSecimi) {
            case "1":
                kisiTuru = "ogrenci";
                islemMenu();
                break;
            case "2":
                kisiTuru = "ogretmen";
                islemMenu();
                break;
            case "Q":
                //  cikis();
                break;
            default:
                System.out.println("hatali giriş yaptınız tekrar deneyin");
                girisPaneli();//recursive meth-> cıss cok tercih edilmez kullanimi
                break;
        }

    }

    public static void islemMenu() {
        System.out.println("Sectiginiz kisi turu: " + kisiTuru + "\nISLEM MENU\nLutfen asagidaki islemlerden tercih yapiniz.\n"
                + "*********** " + kisiTuru + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                "Islem Tercihinizi giriniz : ");
        String islemTercihi = input.next();
        switch (islemTercihi) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "Q":
                break;
            default:
                System.out.println("tekraar dene hatali");
                islemMenu();
                break;

        }


    }

    private static void ekle() {
        System.out.println(kisiTuru + " EKLEME SAYFASİ");
        if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {
            System.out.println("orenci ad-soyad giriniz : ");
            String adSoyad = input.nextLine();
            input.nextLine();
            System.out.println("orenci kimlik no giriniz : ");
            String kimlikNo = input.next();
            System.out.println("orenci YAS giriniz : ");
            int ogrenciYas = input.nextInt();
            System.out.println("orenci NUMARA giriniz : ");
            String ogrenciNo = input.next();
            System.out.println("orenci SİNİF giriniz : ");
            String ogrenciSinif = input.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, ogrenciYas, ogrenciNo, ogrenciSinif);//p li const ile obje uretildi
            ogrenciList.add(ogrenci);//uretilen obj orenciListe eklendi
            System.out.println("ogrenciniz : " + ogrenci.getAdSoyad() + " basariyla eklenmiştir..." + "\nOĞRENCİ İŞLEM MENÜYE YÖNLENDİRİLİYORSUNUZ..");
            islemMenu();


        } else {
            if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {
                System.out.println("ogretmen ad-soyad giriniz : ");
                String adSoyad = input.nextLine();
                input.nextLine();
                System.out.println("ogretmen kimlik no giriniz : ");
                String kimlikNo = input.next();
                System.out.println("ogretmen YAS giriniz : ");
                int ogretmenYas = input.nextInt();
                System.out.println("ogretmen sicilNo giriniz : ");
                String sicilNo = input.next();
                System.out.println("orenci bolum giriniz : ");
                String ogretmenBolum = input.next();
                Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, ogretmenYas, sicilNo, ogretmenBolum);//p li const ile obje uretildi
                ogretmenList.add(ogretmen);//uretilen obj orenciListe eklendi
                System.out.println("ogretmeniiz : " + ogretmen.getAdSoyad() + " basariyla eklenmiştir..." + "\nOĞREtmen İŞLEM MENÜYE YÖNLENDİRİLİYORSUNUZ..");
                islemMenu();

            }
        }

//        private static void cikis () {
//            System.out.println("cıkıs yaptınız.iyi gunler");
//            System.exit(0);
//        }


    }
}

