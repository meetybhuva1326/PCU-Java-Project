package ArrayTask;

import java.util.Arrays;

public class SetFirstEvenAndOddArrayTask {

    public static void main(String[] args) {
        int[] a = {2,3,1,9,2,8,6,2};

        int left = 0, right = a.length-1;

        while (left<right){
            if (a[left]%2 != 0){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                right--;
            }
            left++;
            /*if (a[left]%2 == 0){
                left++;
            } else if (a[right]%2 == 1) {
                right--;
            }else{
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }*/
        }

        System.out.println("Answer = " + Arrays.toString(a));
    }

}
