package P03.manav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav {
    ArrayList<String>musteriSecim=new ArrayList<>();

    String secim;
   static ArrayList<String> sebzeler=new ArrayList<>(Arrays.asList("domates-1\", \"biber-2\", \"marul-3\", \"roka-4\", \"avakado-5"));
   static ArrayList<Integer> fiat = new ArrayList<>(Arrays.asList(30, 40, 20, 40, 30));

   static Scanner scanner = new Scanner(System.in);

   public void girisMenu() {
        System.out.println("Manavaımıza hoşgeldiniz:");
       System.out.println("            Kilo/Fiyat\n" +
               " Domates :      30Tl\n" +
               " Biber   :      40Tl\n" +
               " Marul   :      20Tl\n" +
               " Roka    :      40Tl\n" +
               " Avakado :      30Tl");
       System.out.println("Hangi ürünü almak istersiniz: Yan tarafındaki kodu tuşlayınız ");
       System.out.println(  "           Giriş Kodları\n"+
               " Domates :      1\n" +
               " Biber   :      2\n" +
               " Marul   :      3\n" +
               " Roka    :      4\n" +
               " Avakado :      5");

       System.out.print("Giriş kodu:");
       secim=scanner.next();
       System.out.println(sebzeler.get(Integer.parseInt(secim)-1));


    }

}
