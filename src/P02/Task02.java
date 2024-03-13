package P02;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		 Task-> girilen sayıya kadar  tüm sayıların toplamını print eden METHOD create ediniz.
          Ornegin; 5, 4, 7, 0 ise 5+4+7=16

		  */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kaç tane elemanı toplamak istediğinizi giriniz: ");
        int arrLenght = scan.nextInt();
        int[] arr = new int[arrLenght];
        System.out.println("lütfen istediğiniz elemanları giriniz..");
        for (int i = 0; i < arrLenght; i++) {
            arr[i] = scan.nextInt();
        }


        System.out.println(Arrays.toString(arr));//[3, 2, 1]

        System.out.println("toplamHesapla(arr) = " + toplamHesapla(arr));


    }// main sonu

    private static int toplamHesapla(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        return toplam;

    }


}//Class sonu
