package ArrayTask;

public class PrintAllDuplicateNumArrayTask {

    public static void main(String[] args){

        int[] array = {10,20,3,56,20,58,92,10,3,76,20}; //10,20,3

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0){
                int duplicateCount = 0;
                int v = array[i];

                for (int j = i+1; j < array.length; j++) {
                    if (v == array[j]){
                        array[j] = -1;
                        duplicateCount++;
                    }
                }

                if (duplicateCount > 0){
                    System.out.println(v + " is duplicate");
                }
            }
        }

    }

}
