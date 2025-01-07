package unit1.task;

import util.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        //For user input
        Scanner scanner = new Scanner(System.in);
        int[] arr = Utils.inputArrayFromUser();

        SortUtils sortUtils = new SortUtils(arr);

        boolean exitFlag = false;
        do{
            System.out.println("Choose option : ");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    sortUtils.bubbleSort();
                    break;
                case 2:
                    sortUtils.selectionSort();
                    break;
                case 3:
                    sortUtils.insertionSort();
                    break;
                case 4:
                    sortUtils.mergeSort();
                    break;
                case 5:
                    sortUtils.quickSort();
                    break;
                case 6:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(!exitFlag);
    }

}

class SortUtils{

    int[] arr;
    int n;

    public SortUtils(int[] arr){
        this.arr = arr;
        this.n = arr.length;
    }

    //Bubble Sort
    public void bubbleSort(){
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
    }

    //Selection Sort
    public void selectionSort(){
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
    }

    //Insertion Sort
    public void insertionSort(){
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

    //Merge Sort
    public void mergeSort() {
        mergeSort(arr, 0, n-1);
        System.out.println("Merge Sort = " + Arrays.toString(arr));
    }
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }
    private void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[middle + 1 + j];
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    //Quick Sort
    public void quickSort(){
        quickSort(arr, 0, n-1);
        System.out.println("Quick Sort = " + Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
