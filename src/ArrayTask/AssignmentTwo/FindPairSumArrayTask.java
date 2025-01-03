package ArrayTask.AssignmentTwo;

public class FindPairSumArrayTask {

    public static void main(String[] args) {
        int[] a = {9,2,6,8,17,29,16};
        int n = 10;

        //o(n^2)
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] + a[j] == n){
                    System.out.println(a[i] + "+" + a[j] + " = " + (a[i] + a[j]));
                    return;
                }
            }
        }

        System.out.println("Not present");
    }

}
