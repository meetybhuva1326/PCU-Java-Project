package unit1.CallRef;

public class CallByRef {

    public static void main(String[] args) {
        System.out.println("Hello");
        int a[] = {12,13,43,45,56};
        System.out.println(a[1]);
        change(a);
        System.out.println(a[1]);
    }

    private static void change(int[] a) {
        a[1] = 0;
    }

}
