package P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavProject {//Class level

    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("domat->1", "balcan->2", "fujiElma->3", "çilek->4", "muz->5"));
    static ArrayList<Double> urunFiyatListesi = new ArrayList<>(Arrays.asList(20.5, 35.3, 40.2, 50.0, 85.7));
    static double toplamOdenecekMiktar = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {//main level
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        //  System.out.println(urunListesi);
        //  System.out.println(urunFiyatListesi);
        musteriSecim();
    }//main sonu

    private static void musteriSecim() {
        System.out.println("Agam marketime hoş geldin :) \n" +"sececeğiniz urun listesi : " +urunListesi + "\n" +"sececeğiniz urun fiyat listesi : "+ urunFiyatListesi);
        System.out.print("agam hangi urun istersin : ");

        int urunSecim = input.nextInt();

        if (urunSecim < 6 && urunSecim > 0) {//girlen urun kodunu 1,2,3..5 kontrolu yapıldı
            System.out.println("Agam sectiğiniz urunden kc kilo istersin : ");
            double kilo=input.nextDouble();
            toplamOdenecekMiktar+=kilo*urunFiyatListesi.get(urunSecim-1);
            System.out.println("Agam sectiğin urun :"+urunListesi.get(urunSecim-1)+"\n"+
                    "\n  istediğiniz kilo : "+ kilo +
                    " agam sectiğin urunun fiyatı : "+urunFiyatListesi.get(urunSecim-1)+"\n"+
                    " agam toplam odemeniz : " +toplamOdenecekMiktar);
            System.out.println("Agam alışverişe DEWAMKEEE için 1 KASA için için 2 giresen");
            int karar=input.nextInt();
            if (karar ==1) {
                musteriSecim();
            } else if (karar==2) {
                kasa();
            }else System.out.println("agam gelmim ora adam gibin bişey giresen ");

        } else{ System.out.println("agam gelmim ora adam gibin bişey giresen ");

            musteriSecim();}
    }

    private static void kasa() {


        System.out.println("Agam toplam ödemeniz gereken tutar :"+toplamOdenecekMiktar+" yine bekleriz SELAMKEEE :)");// 4. adım
    }


}//Class sonu