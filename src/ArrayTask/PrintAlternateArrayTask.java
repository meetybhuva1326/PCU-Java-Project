package ArrayTask;

public class PrintAlternateArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};

        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

}
