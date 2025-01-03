package ArrayTask.AssignmentTwo;

import java.util.Arrays;

public class RotateArrayTask {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int k = 3 % arr.length;

        for (int i = 1; i <= k; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = temp;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("\n" + Arrays.toString(arr));
    }

}
