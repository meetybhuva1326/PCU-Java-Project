package ArrayTask;

public class FindMissingNumberArrayTask {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6, 7};
        int n = 7;

        int sum = (n * (n+1))/2;
        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1+= a[i];
        }

        System.out.println("Missing = " + (sum-sum1));
    }

}
