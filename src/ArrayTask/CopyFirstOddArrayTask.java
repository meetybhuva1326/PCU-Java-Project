package ArrayTask;

import java.util.Arrays;

public class CopyFirstOddArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int[] copyA = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 != 0){
                copyA[index] = a[i];
                index++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                copyA[index] = a[i];
                index++;
            }
        }

        System.out.println("Answer = " + Arrays.toString(copyA));
    }

}
