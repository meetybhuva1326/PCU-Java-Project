package ArrayTask;

public class FindLargeArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            if (answer < a[i]){
                answer = a[i];
            }
        }

        System.out.println("Answer = " + answer);
    }

}
