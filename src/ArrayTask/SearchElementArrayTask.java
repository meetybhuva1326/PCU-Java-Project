package ArrayTask;

public class SearchElementArrayTask {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 10, 17, 22, 40};
        int n = 40;

        int left = 0, right = a.length-1;

        while (left<=right){
            int mid = (left + right) / 2;
            if(a[mid] == n){
                System.out.println("Present");
                return;
            }else if(n < a[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        System.out.println("Not Present");
    }

}
