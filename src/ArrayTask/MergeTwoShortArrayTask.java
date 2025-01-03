package ArrayTask;

import java.util.Arrays;

public class MergeTwoShortArrayTask {

    public static void main(String[] args) {
        int[] a = {0,1,5,8,9,15,67,87,100};
        int[] b = {-1,1,2,3,4,8,9,10};
        int[] c = new int[a.length + b.length];

        int aPointer = 0;
        int bPointer = 0;
        int cPointer = 0;

        while (aPointer < a.length && bPointer < b.length){
            if (a[aPointer] < b[bPointer]){
                c[cPointer] = a[aPointer];
                aPointer++;
            }else {
                c[cPointer] = b[bPointer];
                bPointer++;
            }
            cPointer++;
        }

        while (aPointer < a.length){
            c[cPointer] = a[aPointer];
            aPointer++;
            cPointer++;
        }

        while (bPointer < b.length){
            c[cPointer] = b[bPointer];
            bPointer++;
            cPointer++;
        }

        System.out.println(Arrays.toString(c));
    }

}
