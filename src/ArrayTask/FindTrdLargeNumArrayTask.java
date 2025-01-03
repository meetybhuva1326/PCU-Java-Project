package ArrayTask;

public class FindTrdLargeNumArrayTask {

    public static void main(String[] args) {

        int[] array = {-1,0,1,2,3,4,5,6,7,8,9,7,8,9};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max3 = max2;
                max2 = max1;
                max1 = array[i];
            } else if (max2 < array[i] && max1 != array[i]) {
                max3 = max2;
                max2 = array[i];
            } else if (max3 < array[i] && max2 != array[i] && max1 != array[i]) {
                max3 = array[i];
            }
        }

        System.out.println(max3 + " is third largest value");
    }

}
