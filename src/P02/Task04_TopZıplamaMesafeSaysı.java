package P02;

import java.util.Scanner;

class Task04_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiği ana kadar .
    topun aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("topu kaç metreden bırakacaksın? ");
        double yukseklik = scan.nextDouble();
        double toplamMesafe = 0;
        int topVurus = 0;

        do {
            yukseklik *= 0.75;
            toplamMesafe += yukseklik;
            topVurus++;

        } while (yukseklik >= 1);
        System.out.println(toplamMesafe+ " metre");
        System.out.println("topVurus = " + topVurus);


    }
}
