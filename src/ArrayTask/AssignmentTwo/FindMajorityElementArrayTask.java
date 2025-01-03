package ArrayTask.AssignmentTwo;

public class FindMajorityElementArrayTask {

    public static void main(String[] args) {
        int[] arr = {1,3,3,7,4,3,2,3,3,2,7,7};
        int maxCountIndex = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                maxCountIndex = i;
            }
        }

        System.out.println("Highest " + arr[maxCountIndex]);
    }

}
