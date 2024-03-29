package P06_OkulYonetim;

import java.util.Scanner;

public class TryCatch {// daha sonra incele

    static  Scanner scan = new Scanner(System.in);
    public static int intGirisi() {
        int giris = 0;
        boolean flag = true;
        boolean flag2 = false;
        do {
            giris = 0;
            try {
                if (flag2) { scan.nextLine(); }
                flag2 = true;
                giris = scan.nextInt();
                scan.nextLine();
                flag = false;
                flag2 = false;
            } catch (Exception e) {
                System.out.println("lütfen geçerli bir giris yapınız");
            }
        } while (flag);
        return giris;
    }

    public static String stringGirisi() {
        String giris = "";
        boolean flag = true;
        do {
            giris = "";
            try {
                giris = scan.nextLine();
                flag = false;
            } catch (Exception e) {
                System.out.println("Lütfen geçerli bir giris yapınız..");
            }
        } while (flag);
        return giris;
    }
}
