package ArrayTask;

import java.util.Arrays;

public class ShortArrayTask {

    public static void main(String[] args) {
        int[] arr = {9,10,2,1,86,6,5,0,4};
        int n = arr.length;

        //Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort = " + Arrays.toString(arr));

        //Selection Sort
        arr = new int[]{9, 10, 2, 1, 86, 6, 5, 0, 4};
        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println("Selection Sort = " + Arrays.toString(arr));

        //Immersion Sort
        arr = new int[]{9, 10, 2, 1, 86, 6, 5, 0, 4};
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println("Immersion Sort = " + Arrays.toString(arr));

    }

}
