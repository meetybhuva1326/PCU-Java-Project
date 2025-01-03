package ArrayTask;

import java.util.Arrays;

public class StoreReverseMemoryArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        System.out.println("Answer = " + Arrays.toString(a));
    }

}
