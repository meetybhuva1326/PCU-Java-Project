package ArrayTask;

public class SumArrayTask {

    public static void main(String[] args) {
        int[] a = {5,3,7,5,2};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }

        System.out.println(sum);
    }

}
