package ArrayTask;

public class PrintFirstOddArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};

        System.out.println("Odd");

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 != 0){
                System.out.println(a[i]);
            }
        }

        System.out.println("Even");

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                System.out.println(a[i]);
            }
        }
    }

}
