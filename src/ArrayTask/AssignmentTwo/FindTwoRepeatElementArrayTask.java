package ArrayTask.AssignmentTwo;

public class FindTwoRepeatElementArrayTask {

    public static void main(String[] args) {
        int[] arr = {7,33,2,6,10,33,17,2};
        int firstElement = Integer.MIN_VALUE;
        int secondElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    if (count == 2){
                        break;
                    }
                }
            }
            if (count == 2){
                if (firstElement == Integer.MIN_VALUE){
                    firstElement = arr[i];
                }else{
                    secondElement = arr[i];
                    break;
                }
            }
        }

        System.out.println(firstElement + " " + secondElement);
    }

}
