package ArrayTask;

public class FindDuplicateNumberArrayTask {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 6, 7};
        int n = a.length-1;

        int sum = (n * (n+1))/2;
        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1+= a[i];
        }

        System.out.println("Duplicate = " + (sum1-sum));
    }

}
