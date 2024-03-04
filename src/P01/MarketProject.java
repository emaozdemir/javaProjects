package P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketProject {//Class level
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanc = new ArrayList<>(Arrays.asList());//2. adım
    static Scanner input = new Scanner(System.in);
    static double haftanınToplamKazancı = 0;


    public static void main(String[] args) {//main level

        // 3. adım
        int gun = 0;
        while (gun < 7) {
            System.out.print("Agam hele " + gunler.get(gun) + " gunu hasılatını giresen : ");
            double gununKazancı = input.nextDouble();
            haftanınToplamKazancı += gununKazancı;//loop dan gelen herbir gun hasılatı haftalık toplam kazanca eklendi
            gunlukKazanc.add(gununKazancı);//lopp dan gelen herbir gunun hasılatı gunluk kazanc listine ekledi
            gun++;
        }
        System.out.println("Agam bu haftalık toplam hasılat : " + haftanınToplamKazancı);
        System.out.println("Agam bu hafta  gunluk   hasılat : " + gunlukKazanc);
        System.out.println("Agam bu hafta ortalama kazanc :  = " + getOrtalamaKazanc());
        System.out.println("Agam bu hafta ortlamadan çok kazana gunler : " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("Agam bu hafta ortlamadan az kazana gunler : " + getOrtalamaninAltindaKazancGünleri());

    }//main sonu

    private static ArrayList<String> getOrtalamaninAltindaKazancGünleri() {

        ArrayList<String> ortlamanınAltıGunler = new ArrayList<>();//ortlamayı gecmeyen gunleri eklenceği bos list tanımlandı
        for (int i = 0; i < gunlukKazanc.size(); i++) {//gun sayısı kadar tekrar tanımlandı
            if (gunlukKazanc.get(i) < getOrtalamaKazanc()) {//tekrardan gelen herbir gunu hasılatı ortlamadan kucuklugu kontrol edildi
                ortlamanınAltıGunler.add(gunler.get(i));//ortlamadan kucuk olan gun lşste atandı
            }
        }

        return ortlamanınAltıGunler;

    }

    private static ArrayList<String> getOrtalamaninUstundeKazancGünleri() {// 5. adım
        ArrayList<String> ortlamanınUstuGunler = new ArrayList<>();//ortlamayı gecen gunleri eklenceği bos list tanımlandı
        for (int i = 0; i < gunlukKazanc.size(); i++) {//gun sayısı kadar tekrar tanımlandı
            if (gunlukKazanc.get(i) > getOrtalamaKazanc()) {//tekrardan gelen herbir gunu hasılatı ortlamadan buyuklugu kontrol edildi
                ortlamanınUstuGunler.add(gunler.get(i));//ortlamadan buyuk olan gun lşste atandı
            }
        }

        return ortlamanınUstuGunler;
    }

    private static double getOrtalamaKazanc() {//4 . adım


        return haftanınToplamKazancı / 7;
    }
}//Class sonu