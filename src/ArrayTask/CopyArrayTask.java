package ArrayTask;

import java.util.Arrays;

public class CopyArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int[] copyA = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            copyA[i] = a[i];
        }

        System.out.println("Answer = " + Arrays.toString(copyA));
    }

}
