package P06_OkulYonetim;

import java.util.Scanner;

public class Islemler implements IslemlerInterface {
    static Scanner scan = new Scanner(System.in);
    static int secim = 0;

    public static void islemlerMenu(int i) {
        secim = i;
        Islemler obj = new Islemler();
        System.out.println(
                "============= ISLEMLER=============\n" +
                        "\t 1-EKLEME\n" +
                        "\t 2-ARAMA\n" +
                        "\t 3-LİSTELEME\n" +
                        "\t 4-SİLME\n" +
                        "\t 5-ANA MENÜ\n" +
                        "\t Q-CIKIS\n" +
                        "SECIMINIZ : ");
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
        System.out.println("Kimlik no giriniz");
        String kimlikID=scan.next();
        kimlikIDKontrol(kimlikID);
        if (secim==1){
            ogrenciBilgiAlKaydet(kimlikID);
            islemlerMenu(secim);
        }else {
            ogretmenBilgiAlKaydet(kimlikID);
            islemlerMenu(secim);
        }
    }

    private void ogretmenBilgiAlKaydet(String kimlikID) {
        Ogretmen ogretmen=new Ogretmen();
        System.out.println("Ad soyad giriniz");
        scan.nextLine();
//        String adSoyad=scan.nextLine();
//        ogretmen.setAdSoyad(adSoyad);
        ogretmen.setAdSoyad(scan.nextLine());
        System.out.println("Yasinizi giriniz");
        ogretmen.setYas(scan.nextInt());
        scan.nextLine();//dummy
        System.out.println("Bolumunuzu giriniz");
        ogretmen.setBolum(scan.nextLine());
        System.out.println("Sicilinizi giriniz");
        ogretmen.setSicilNo(scan.next());
        Ogretmen.ogretmenListesiMap.put(kimlikID,ogretmen);
        System.out.println("Ogretmen basariyla eklendi");
    }

    private void ogrenciBilgiAlKaydet(String kimlikID) {
        scan.nextLine();
        System.out.println("Adinizi ve soyadinizi giriniz");
        String adSoyad=scan.nextLine();
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("Numaranizi giriniz");
        int numara=scan.nextInt();
        System.out.println("Sinifinizi giriniz");
        String sinif=scan.next();
        Ogrenci ogrenci=new Ogrenci(adSoyad,yas,numara,sinif);
        Ogrenci.ogrenciListesiMap.put(kimlikID,ogrenci);
        System.out.println("Ogrenci basariyla eklendi");
    }

    private void kimlikIDKontrol(String kimlikID) {
        if (kimlikID.length()==11){
            if (Integer.parseInt(kimlikID.substring(kimlikID.length()-1))%2==0){
                try {
                    if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)||Ogretmen.ogretmenListesiMap.containsKey(kimlikID)){
                        throw new ConflictException("Bu kimlik nolu kisi zaten kayitli");
                    }
                }catch (ConflictException e){
                    System.out.println(e.getMessage());
                    islemlerMenu(secim);
                }
            }else {
                System.out.println("Okulumuz yabanci vatandas kabul etmiyor");
                ekleme();
            }
        }else {
            System.out.println("Kimlik no 11 rakamdan olusur");
            ekleme();
        }
    }

    @Override
    public void arama() {
        System.out.println("Kimlik no giriniz");
        String kimlikID=scan.next();
        if (secim==1){
            try {
                if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)){
                    System.out.println(Ogrenci.ogrenciListesiMap.get(kimlikID));
                }else {
                    throw new ResourceNotFoundException(kimlikID+ " kimlik nolu ogrenci kayitli degil");
                }
            }catch (ResourceNotFoundException e){
                System.out.println(e.getMessage());
                arama();
            }
        }else {
            try {
                if (Ogretmen.ogretmenListesiMap.containsKey(kimlikID)){
                    System.out.println(Ogretmen.ogretmenListesiMap.get(kimlikID));
                }else {
                    throw new ResourceNotFoundException(kimlikID+ " kimlik nolu ogretmen kayitli degil");
                }
            }catch (ResourceNotFoundException e){
                System.out.println(e.getMessage());
                arama();
            }
        }
    }

    @Override
    public void listeleme() {
        if (secim==1){
            System.out.println(Ogrenci.ogrenciListesiMap);
        }else {
            System.out.println(Ogretmen.ogretmenListesiMap);
        }
    }

    @Override
    public void silme() {
        System.out.println("Kimlik no giriniz");
        String kimlikID=scan.next();
        if (secim==1){
            try {
                if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)){
                    Ogrenci ogrenci=Ogrenci.ogrenciListesiMap.remove(kimlikID);
                    System.out.println(ogrenci.getAdSoyad()+" isimli ogrenciyi sildiniz");
                }else {
                    throw new ResourceNotFoundException(kimlikID+ " kimlik nolu ogrenci kayitli degil");
                }
            }catch (ResourceNotFoundException e){
                System.out.println(e.getMessage());
                silme();
            }
        }else {
            try {
                if (Ogretmen.ogretmenListesiMap.containsKey(kimlikID)){
                    Ogretmen ogretmen=Ogretmen.ogretmenListesiMap.remove(kimlikID);
                    System.out.println(ogretmen.getAdSoyad()+" isimli ogretmen artik bizimle calismiyor");
                }else {
                    throw new ResourceNotFoundException(kimlikID+ " kimlik nolu ogretmen kayitli degil");
                }
            }catch (ResourceNotFoundException e){
                System.out.println(e.getMessage());
                silme();
            }
        }
    }

    @Override
    public void anaMenu() {
        AnaMenu obj=new AnaMenu();
        obj.giris();
    }

    @Override
    public void cikis() {
        System.out.println("Cikis yapiyorsunuz. Tekrar bekleriz");
    }
}