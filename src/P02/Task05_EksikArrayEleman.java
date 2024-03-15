package P02;

import java.util.Arrays;

public class Task05_EksikArrayEleman {
    /*
    Task-> 1 den 10 a kadar sayılardan oluşan dizide eksik olan sayıyı return eden  metod create ediniz..

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};
        System.out.println(Arrays.toString(arr));

        System.out.println("arr kontrol");
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] !=i+1) {
                System.out.print(i+1 );//4
                break;
            }

        }
        System.out.println();
        System.out.println("arr1 kontrol");
        System.out.println("eksikBul(arr1) = " + eksikBul(arr1));//6


    }//main sonu

    private static int eksikBul(int[] arr1) {
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] !=i+1) {
                return i+1;// Eksik olan sayıyı bulduk
            }
        }
        return arr1.length+1;//Eğer hiç eksik sayı yoksa, n + 1 döndür
    }


}//Class sonu

