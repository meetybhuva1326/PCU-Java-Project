package ArrayTask;

public class PrintReverseArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 5, 2, 9, 2};

        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}
