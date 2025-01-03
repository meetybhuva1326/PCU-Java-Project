package ArrayTask;

public class FindLargeConitinueSumArrayTask {

    public static void main(String[] args) {
        int[] arr = {1,2,9,-6,-2,1};

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum){
                maxSum = currentSum;
            }

            if (currentSum < 0){
                currentSum = 0;
            }
        }

        System.out.println("Max sum = " + maxSum);

    }

}
