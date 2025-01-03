package ArrayTask;

public class FindLastNthArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int n = 1;
        n = a.length - n;

        if (n < a.length && n >= 0) {
            System.out.println(a[n]);
        }else{
            System.out.println("Number not valid");
        }
    }

}
