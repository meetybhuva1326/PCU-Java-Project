package ArrayTask;

public class PrintAlternateReverseArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};

        for (int i = a.length-1; i >= 0; i -= 2) {
            System.out.println(a[i]);
        }
    }

}
