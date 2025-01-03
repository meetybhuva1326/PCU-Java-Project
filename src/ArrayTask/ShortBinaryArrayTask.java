package ArrayTask;

import java.util.Arrays;

public class ShortBinaryArrayTask {

    public static void main(String[] args) {
        int[] a = {0,0,1,0,1,1,0};

        int left = 0, right = a.length-1;

        while (left<right){
            if (a[left] == 0){
                left++;
            } else if (a[right] == 1) {
                right--;
            }else{
                a[left] = 0;
                a[right] = 1;
            }
        }

        System.out.println("Answer = " + Arrays.toString(a));
    }

}
