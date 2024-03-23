package P04_Okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Islemler {
    static String kisiTuru;//istenen meth call edilebilmesi için static tanımlandı
    static Scanner input = new Scanner(System.in);
    static List<Ogretmen> ogretmenList = new ArrayList<>();//ogretmen obj depolayacak bos list tanımlandı
    static List<Ogrenci> ogrenciList = new ArrayList<>();//ogrenci obj depolayacak bos list tanımlandı

    public static void girisPaneli() {
        System.out.println("**********************************      \nOGRENCI VE OGRETMEN ANA MENU " +
                "\n**********************************\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS \nLutfen yapmak istediginiz islemi giriniz : ");
        String islemSecim = input.next().toUpperCase();
        switch (islemSecim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenu();
                // ogrenciIslemleri();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz ");
                girisPaneli();//recursive meth->cısss !
                break;
        }

    }

    public static void islemMenu() {
        System.out.println("Sectiginiz kisi turu: " + kisiTuru + "\nISLEM MENU\nLutfen asagidaki islemlerden tercih yapiniz.\n"
                + "*********** " + kisiTuru + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                "Islem Tercihinizi giriniz : ");

        String islemTercih = input.next();
        switch (islemTercih) {
            case "1":
                ekle();
                break;
            case "2":
                ara();
                break;
            case "3":
                listele();

                break;
            case "4":
                sil();
                break;
            case "0":
                girisPaneli();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz ");
                islemMenu();//recursive meth->cısss !
                break;

        }
    }

    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " SİLME sayafası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci secimi
            System.out.println("silinecek OGRENCİNİN  kimlikNo giriniz : ");
            String silinecekOgrcKimlikNo = input.next();
            for (Ogrenci k : ogrenciList) {//oğrc listteki herbir ogc obj tekrara alındı
                if (k.getKimlikNo().equals(silinecekOgrcKimlikNo)) {//silinecek ogrc kimlikNO ogrcList teki varlık kontrolu
                    ogrenciList.remove(k);//ogrc Liste varlığı kontrol edilen ogrc obj ogrcList ten silindi
                    System.out.println("Silinecek  öğrenci  listemizden SİLİNDİ...");
                    break;
                } else {
                    System.out.println("Silinecek öğrenci  listemizde kayıtlı değil ");

                }
            }


            islemMenu();
        } else {//oğretmen secimi
            System.out.println("Maalesef silinecek MUHTEŞEM OGRETMENİN  kimlikNo giriniz : ");
            String silinecekOgrtKimlikNo = input.next();
            for (Ogretmen k : ogretmenList) {
                if (k.getKimlikNo().equals(silinecekOgrtKimlikNo)) {
                    ogretmenList.remove(k);
                    System.out.println("Maalesef silinecek MUHTEŞEM OGRETMEN listemizden SİLİNDİ...");
                    break;
                } else {
                    System.out.println("Maalesef silinecek MUHTEŞEM OGRETMEN  listemizde kayıtlı değil ");

                }
            }
            islemMenu();

        }

    }

    private static void listele() {
        System.out.println("   ***   " + kisiTuru + " LİSTELEME sayafası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci secimi
            System.out.println(ogrenciList);


            islemMenu();
        } else {//oğretmen secimi
            System.out.println(ogretmenList);
        }
        islemMenu();
    }

    private static void ara() {
        System.out.println("   ***   " + kisiTuru + " ARAMA sayafası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci secimi
            System.out.println("aradıgınız OGRENCİNİN  kimlikNo giriniz : ");
            String arananOgrcKimlikNO = input.next();
            for (Ogrenci k : ogrenciList) {
                if (k.getKimlikNo().equals(arananOgrcKimlikNO)) {
                    System.out.println("Aradıgınız öğrenci " + k.getAdSoyad() + " listemizde kayıtlı");
                    break;
                } else {
                    System.out.println("Aradıgınız öğrenci  listemizde kayıtlı değil ");

                }
            }


            islemMenu();
        } else {//oğretmen secimi
            System.out.println("aradıgınız MUHTEŞEM OGRETMENİN  kimlikNo giriniz : ");
            String muhtesemOgretmenKimlikNo = input.next();
            for (Ogretmen k : ogretmenList) {
                if (k.getKimlikNo().equals(muhtesemOgretmenKimlikNo)) {
                    System.out.println("Aradıgınız MUHTEŞEM OGRETMEN " + k.getAdSoyad() + " listemizde kayıtlı");
                    break;
                } else {
                    System.out.println("Aradıgınız MUHTEŞEM OGRETMEN  listemizde kayıtlı değil ");

                }
            }
            islemMenu();
        }
    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " EKLEME sayafası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci secimi
            System.out.println("OGRENCİ ad-soyad giriniz : ");
            String adSoyad = new Scanner(System.in).nextLine();
            System.out.println("OGRENCİ kimlikNO  giriniz : ");
            String kimlikNo = input.next();
            System.out.println("OGRENCİ yas  giriniz : ");
            int ogrcYas = input.nextInt();
            System.out.println("OGRENCİ numara  giriniz : ");
            String ogrcNo = input.next();
            System.out.println("OGRENCİ sinifi  giriniz : ");
            String ogrcSinif = input.next();
            Ogrenci ogrc = new Ogrenci(adSoyad, kimlikNo, ogrcYas, ogrcNo, ogrcSinif);//p'li const ile obj uretildi
            ogrenciList.add(ogrc);//uretilen obj ogrcList e eklendi
            System.out.println("Ogrenciniz " + ogrc.getAdSoyad() + " basarı ile eklenmiştir..." +
                    "\nOGRENCİ İSLEM MENUYE yönlendiriliyorsunuz...");
            islemMenu();
        } else {//oğretmen secimi
            System.out.println("OGRETMEN ad-soyad giriniz : ");
            String adSoyad = new Scanner(System.in).nextLine();
            System.out.println("OGRETMEN kimlikNO  giriniz : ");
            String kimlikNo = input.next();
            System.out.println("OGRETMEN yas  giriniz : ");
            int ogrtYas = input.nextInt();
            System.out.println("OGRETMEN sicilNo  giriniz : ");
            String sicilNo = input.next();
            System.out.println("OGRETMEN bolumunu  giriniz : ");
            String ogrtBolum = input.next();
            Ogretmen ogrt = new Ogretmen(adSoyad, kimlikNo, ogrtYas, sicilNo, ogrtBolum);//p'li const ile obj uretildi
            ogretmenList.add(ogrt);//uretilen obj ogrcList e eklendi
            System.out.println("Muhteşem OGRETMENIMIZ " + ogrt.getAdSoyad() + " basarı ile eklenmiştir..." +
                    "\nOGRETMEN İSLEM MENUYE yönlendiriliyorsunuz...");
            islemMenu();
        }


    }

    private static void cikis() {
        System.out.println("Agam yine bekleriz SELAMETLEEE :)");
        System.exit(0);
    }
}