package ArrayTask;

import java.util.Arrays;

public class FindSmallerNumCountArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int[] count = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]){
                    count[i]++;
                }
            }
        }

        System.out.println(Arrays.toString(count));
    }

}
