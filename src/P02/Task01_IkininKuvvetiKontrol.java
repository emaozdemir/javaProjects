package P02;

import java.util.Scanner;

public class Task01_IkininKuvvetiKontrol {
    public static void main(String[] args) {
        /* Task
        Girilen sayının 2'nin kuvveti olmasının kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("PowersofTwo(sayi) = " + PowersofTwo(sayi));

    }//main sonu

    private static boolean PowersofTwo(int sayi) {
        // Bir sayının 2'nin kuvveti olup olmadığını kontrol etmek için
        // sayının 2'nin kuvveti olup olmadığını belirlemek için bitwise işlemlerini kullanabiliriz.
        // Bir sayı 2'nin bir kuvveti ise, yalnızca bir tane biti 1 olur ve diğer bitler 0'dır.
        // Örneğin, 8 sayısının ikili temsili 1000'dir. Bu nedenle, 8 bir 2'nin kuvvetidir.
        // Diğer bir örnek olarak, 10 sayısının ikili temsili 1010'dur, bu nedenle 10 bir 2'nin kuvveti değildir.
        // Bu kontrolü yapmak için, sayının 2'nin kuvveti olup olmadığını belirlemek için bitwise işlemlerini kullanabiliriz.

        return (sayi > 0) && ((sayi & (sayi - 1)) == 0);//sayi'nin ikili temsili: 1000 . (sayi - 1)'in ikili temsili: 0111

        //2.yol
        // double log = Math.log(sayi) / Math.log(2);
        //    return (log == (int)log);
    }


}//Class sonu

