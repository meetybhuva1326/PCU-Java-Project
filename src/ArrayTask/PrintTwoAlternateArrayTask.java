package ArrayTask;

public class PrintTwoAlternateArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int[] b = {21, 69, 34, 12, 42, 92};

        for (int i = 0; i < a.length; i++) {
            if (i%2 == 0){
                System.out.println(a[i]);
            }else{
                System.out.println(b[i]);
            }
        }
    }

}
