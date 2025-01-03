package ArrayTask;

import java.util.Arrays;

public class StoreDoubleSizeArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int[] doubleA = new int[a.length*2];

        for (int i = 0; i < a.length; i++) {
            doubleA[i] = a[i];
            doubleA[i+a.length] = a[i];
        }

        System.out.println(Arrays.toString(doubleA));
    }

}
