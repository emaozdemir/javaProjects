package P02;

import java.util.Arrays;

public class Task06_ElementUpdateList {
/* Task->
     If the list has 12 as element, change all 12s to 21
     Listteki 12 elemanını 21 olarak update eden code create ediniz
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

    public static void main(String[] args) {

        int[] arr={12, 11, 12, 15, 12, 34, 43};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==12){
                arr[i]=21;
            }
        }
        System.out.println(Arrays.toString(arr));



    }

}
