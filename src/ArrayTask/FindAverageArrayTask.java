package ArrayTask;

public class FindAverageArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 6, 7, 8};
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }

        System.out.println(sum/a.length);
    }

}
