package ArrayTask;

import java.util.Arrays;

public class StoreReverseNewArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int[] copyA = new int[a.length];
        int index = 0;

        for (int i = a.length-1; i >= 0; i--) {
            copyA[index] = a[i];
            index++;
        }

        System.out.println("Answer = " + Arrays.toString(copyA));
    }

}
