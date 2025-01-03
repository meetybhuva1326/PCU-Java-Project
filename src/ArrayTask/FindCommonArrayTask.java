package ArrayTask;

public class FindCommonArrayTask {

    public static void main(String[] args) {
        int[] a = {21, 69, 34, 12, 42, 92};
        int[] b = {21, 45, 87, 67, 42, 23};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    System.out.println(a[i] + " is common");
                    break;
                }
            }
        }
    }

}
