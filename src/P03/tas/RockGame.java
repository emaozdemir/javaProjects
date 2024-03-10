package P03.tas;

import java.util.Scanner;

public class RockGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int userScore=0;
        int computerScore=0;
        System.out.println("Taş kağıt makas oyunumuza hoşgeldiniz");
        System.out.println("Taş-1, Kağıt-2, Makas-3");
        String isContinue="Yes";
        do {

//            if(user>3 || user <1){
//                System.err.println("Yanlış seçim yaptınız 1 ile 3 arasında rakam girmelisiniz");
//                System.exit(0);// Programı kapatır
//            }
            int user=scanner.nextInt();
            while (user>3 || user<1){
                System.err.println("Lütfen seçinizi kontrol ederek tekrar girin:");
                 user=scanner.nextInt();// Kullanıcıdan seçimi aldık
            }

            System.out.println("Oyuncunun seçiminiz: "+isim(user));
            System.out.println("Bilgisayar seçini yapıyor:");
            int computer= (int) (Math.random()*3+1);
            System.out.println("Bilgisayarın seçimi:"+isim(computer));
            if(user==computer){
                System.out.println("Berabere");// berabere kimseye puan eklenmedi
            }else{
                if(user==1){//taş
                    if (computer==2){//kağıt
                        computerScore++;
                        System.out.println("Kazanan bilgisayar: "+computerScore);
                    }else {
                        userScore++;
                        System.out.println("Kazanan oyuncu"+userScore);
                    }

                }
                if(user==2){//Kağıt
                    if (computer==3){//Makas
                        computerScore++;
                        System.out.println("Kazanan bilgisayar"+computerScore);
                    }else {
                        userScore++;
                        System.out.println("Kazanan oyuncu"+userScore);
                    }

                }
                if(user==3){//Makas
                    if (computer==1){//tas
                        computerScore++;
                        System.out.println("Kazanan bilgisayar"+computerScore);
                    }else {
                        userScore ++;
                        System.out.println("Kazanan oyuncu"+userScore);
                    }

                }
            }
            System.out.println("Tamam mı devam mı?");
            isContinue= scanner.next();


        }while(isContinue.equalsIgnoreCase("yes"));// cevabım yes olduğu sürece oyun tekar edecektir

        System.out.println("Bilgisayarın toplam puanı:"+computerScore);
        System.out.println("Oyuncunun toplam puanı:"+userScore);

        if(computerScore>userScore){
            System.out.println("Bilgisayar kazandı");
        }else if(computerScore==userScore){
            System.out.println("Berabere bitti");
        }else {
            System.out.println("Tebrikler siz kazandınız");
        }



    }

    private static String isim(int user) {
        if(user==1){
            return "Taş";
        } else if (user==2) {
            return "Kağıt";
        }else {
            return "Makas";
        }
    }
}
