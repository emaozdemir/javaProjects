package P02;

import java.util.Arrays;
import java.util.Scanner;

public class Task08_TekrarlıListElememanPrint {
        /*
        Girilen bir listte tekararlı elemanları print eden  metod create ediniz.
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("kac elemanlı bir list istersin?");
            int sayi=scan.nextInt();
            int[]arr=new int[sayi];
            System.out.println(arr.length +" tane sayi giriniz");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=scan.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j <arr.length ; j++) {
                    if (arr[i] == arr[j]){
                        count++;
                        System.out.println("arr[i] = " + arr[i]);


                }
            }
            if (count!=0){

            }


    }



} }



