package FirstLec;

public class SeventeenTask {
    // 0 1 1 2 3 5 8 13 21

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n=6;
        for (int i=1; i<=n; i++){
            System.out.print(a +" ");
            int c = a+b;
            a=b;
            b = c;

        }

    }

}
