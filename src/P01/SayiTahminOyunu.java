package P01;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        sayiTahminEt();
    }

    public static void sayiTahminEt() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(101); // 0-100 arasında rastgele bir sayı
        int tahmin;
        int denemeSayisi = 0;

        System.out.println("0 ile 100 arasında bir sayıyı tahmin edin.");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
                continue; // Geçerli bir sayı girilene kadar döngüyü devam ettir
            }

            denemeSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz.");
            }

        } while (denemeSayisi < 3 && tahmin != rastgeleSayi);

        if (denemeSayisi == 3 && tahmin != rastgeleSayi) {
            System.out.println("Üzgünüm, hakkınız doldu. Doğru cevap: " + rastgeleSayi);
        }
    }
}
