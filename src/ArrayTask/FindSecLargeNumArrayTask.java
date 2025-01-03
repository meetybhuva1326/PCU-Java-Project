package ArrayTask;

public class FindSecLargeNumArrayTask {

    public static void main(String[] args) {

        int[] array = {2,9,-5,0,13,8,10,13,10};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max2 = max1;
                max1 = array[i];
            } else if (max2 < array[i] && max1 != array[i]) {
                max2 = array[i];
            }
        }

        System.out.println(max2 + " is second largest value");
    }

}
