package P03.kahveMakinesi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kahve {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> kahveListesi = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Latte", "Espresso"));
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";
    //fields
    String coffeeName;
    String coffeeSize;
    String milk;
    String sugar;
    int price;

    //constructor
    public Kahve(String coffeeName, String coffeeSize, String milk, String sugar, int price) {
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
        this.milk = milk;
        this.sugar = sugar;
        this.price = price;
    }

    public Kahve() {

    }

    // toString -> obj print with fields
    @Override
    public String toString() {
        return
                "CoffeeName='" + coffeeName + '\'' +
                        ", CoffeeSize='" + coffeeSize + '\'' +
                        ", milk='" + milk + '\'' +
                        ", sugar='" + sugar + '\'' +
                        ", price=" + price;
    }

    // public static void kahveSec(){// -> static meth
    public void kahveSec() {


        System.out.println(BOLD + "JavaCAN Cafe'ye Hoşgeldiniz :-) \n                 Fiyat Menüsü:\n" +
                "\n" +
                BOLD + "                 Küçük        Orta        Büyük   \n" +
                c_RED + "1.Türk kahvesi   30Tl         40Tl          50Tl \n" +
                c_PURPLE + "2.Latte          35Tl         45Tl          55Tl \n" +
                c_GREEN + "3.Espresso       40Tl         50Tl          60Tl \n" +
                "\n" +
                "* İlave Süt 10Tl  ");

        System.out.println(BOLD + "Hangi Kahveyi istersiniz?Lütfen dilediğiniz kahve numarasını seçin :");
        System.out.println(c_RED + " 1.Türk kahvesi\n" +
                c_PURPLE + " 2.Latte\n" +
                c_GREEN + " 3.Espresso");

        int tercih = input.nextInt();
        if (tercih == 1) {//Turk kahvesitercih action kontrol
            System.out.println(kahveListesi.get(tercih - 1) + " hazırlanıyor");
            coffeeName = kahveListesi.get(tercih - 1);
            price = 30;
        } else if (tercih == 2) {//
            System.out.println(kahveListesi.get(tercih - 1) + " hazırlanıyor");
            coffeeName = kahveListesi.get(tercih - 1);
            price = 35;
        } else if (tercih == 3) {//
            System.out.println(kahveListesi.get(tercih - 1) + " hazırlanıyor");
            coffeeName = kahveListesi.get(tercih - 1);
            price = 40;
        } else {
            System.out.println("Hatalı secim yaptınız . tekrar deneyiniz.");
            kahveSec();
        }
        sutSec();


    }

    // todo....... SUT METHOD.....
    public void sutSec() {
        System.out.println(BOLD + "Kahvenize SÜT eklemek ister misiniz? \n"
                + c_GREEN + "sut tercihiniz EVET ise -> E\n"
                + c_RED + "sut tercihiniz Hayır  ise -> H\ngiriniz : ");
        String sutTercih = input.next().substring(0, 1);
        if (sutTercih.equalsIgnoreCase("E")) {
            System.out.println(BOLD + "Kahvenize SÜT ekleniyor");
            milk = "SÜTLÜ GAAVEEE :) ";
            price += 10;
        } else if (sutTercih.equalsIgnoreCase("H")) {
            System.out.println(BOLD + "Kahveniz SÜT süz hazırlanıyor");
            milk = "SADEli GAAVEE  :( ";
        } else {
            System.out.println("Hatalı secim yaptınız . tekrar deneyiniz.");
            sutSec();
        }
        sekerSec();
    }

    // todo....... SEKER METHOD.....
    public void sekerSec() {
        System.out.println(BOLD + "Kahvenize SEKER eklemek ister misiniz? \n"
                + c_GREEN + "seker tercihiniz EVET ise -> E\n"
                + c_RED + "seker tercihiniz Hayır  ise -> H\ngiriniz : ");
        String sekerTercih = input.next().substring(0, 1);
        if (sekerTercih.equalsIgnoreCase("E")) {
            System.out.println("Kac seker alırsınız : ");
            int sekerSayisi = input.nextInt();
            System.out.println(BOLD + "Kahvenize " + sekerSayisi + " tane seker  ekleniyor");
            sugar = "Sekerli GAAVEEE :( ";

        } else if (sekerTercih.equalsIgnoreCase("H")) {
            System.out.println(BOLD + "Kahveniz SEKERSİZ hazırlanıyor");
            sugar = "Sekersiz GAAVEEE :) ";
        } else {
            System.out.println("Hatalı secim yaptınız . tekrar deneyiniz.");
            sekerSec();
        }

        boyutSec();
    }
    // todo....... KAHVE SIZE METHOD.....

    public void boyutSec() {
        System.out.println(BOLD + "Kahvenize hangi boyda almak istersiniz? \n"
                + c_GREEN + "1.BUYUK ise -> B\n"
                + c_RED + "2.KÜÇÜK ise -> S\n"
                + c_PURPLE + "3.ORTA ise -> M\n" + BOLD + "giriniz : ");
        String boyTercih = input.next().substring(0, 1);
        if (boyTercih.equalsIgnoreCase("B")) {
            System.out.println(BOLD + "Kahveniz " + boyTercih + " Boy hazırlanıyor ");
            coffeeSize = "BUYUK BOY GAAVEEE :) ";
            price += 20;
        } else if (boyTercih.equalsIgnoreCase("M")) {
            System.out.println(BOLD + "Kahveniz " + boyTercih + " Boy hazırlanıyor ");
            coffeeSize = "ORTA BOY GAAVEEE :) ";
            price += 10;
        } else if (boyTercih.equalsIgnoreCase("S")) {
            System.out.println(BOLD + "Kahveniz " + boyTercih + " Boy hazırlanıyor ");
            coffeeSize = "KUCUK BOY GAAVEEE :) ";

        } else {
            System.out.println("Hatalı secim yaptınız . tekrar deneyiniz.");
            boyutSec();
        }
        ucretHesapla();
    }

    // todo....... KAHVE UCRET ODEME METHOD.....
    public void ucretHesapla() {
        System.out.println("Kahvenizin toplam ücreti : " + price + " TL hesaplanmıstır");
        int odeme = input.nextInt();
        System.out.println("Odeme için girilen tutar : " + odeme + " TL ");
        if (price > odeme) {
            System.out.println((price - odeme) + " TL kadar eksik odeme yaptınız");
            ucretHesapla();
        } else {
            System.out.println("odeme için teşekkürler :) \npara üstü : " + (odeme - price) + " TL");
        }
    }
}



