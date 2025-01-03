package ArrayTask.AssignmentTwo;

import java.util.Arrays;

public class SetNextGreatElementArrayTask {

    public static void main(String[] args) {
        int[] arr = {50,2,5,7,3,6};

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (value < arr[j]){
                    arr[i] = arr[j];
                    break;
                }else{
                    arr[i] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
