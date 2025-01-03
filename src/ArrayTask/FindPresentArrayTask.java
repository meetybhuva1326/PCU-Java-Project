package ArrayTask;

public class FindPresentArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int findNum = 9;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == findNum){
                System.out.println("present");
                return;
            }
        }

        System.out.println("not present");
    }

}
