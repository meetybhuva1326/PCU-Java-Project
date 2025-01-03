package ArrayTask;

public class FindNthArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int n = 2;
        n--;

        if (n < a.length && n >= 0) {
            System.out.println(a[n]);
        }else{
            System.out.println("Number not valid");
        }
    }

}
