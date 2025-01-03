package ArrayTask.AssignmentTwo;

public class SearchElementRotateArrayTask {

    public static void main(String[] args) {
        int[] arr = {7, 10, 17, 22, 40, 1, 3, 5};
        int num = 3;

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                System.out.println("Present");
                return;
            }

            if (arr[start] < arr[mid]) {
                if (arr[start] >= num && arr[mid] <= mid) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (arr[start] >= num && arr[mid] <= mid) {
                    start = mid + 1;
                } else {
                    end = mid + 1;
                }
            }
        }

        System.out.println("Not Present");
    }

}
