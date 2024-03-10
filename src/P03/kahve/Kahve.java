package P03.kahve;

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
        if (tercih ==1) {//Turk kahvesitercih action kontrol
            System.out.println(kahveListesi.get(tercih-1)+" hazırlanıyor");
            coffeeName=kahveListesi.get(tercih-1);
            price=30;

        }
    }

}
