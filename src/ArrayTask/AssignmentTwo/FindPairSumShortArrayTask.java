package ArrayTask.AssignmentTwo;

public class FindPairSumShortArrayTask {

    public static void main(String[] args) {
        int[] a = {2,4,6,7,9,10,11,19};
        int n = 19;

        int left = 0, right = a.length-1;

        while (left<right){
            int sum = a[left] + a[right];
            if (sum == n){
                System.out.println(a[left] + "+" + a[right] + " = " + (a[left] + a[right]));
                return;
            } else if (sum < n) {
                left++;
            }else if (sum > n){
                right--;
            }
        }

        System.out.println("Not present");
    }

}
