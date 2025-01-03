package ArrayTask;

public class PrintAllUniqueNumArrayTask {

    public static void main(String[] args){

        int[] array = {10,20,3,56,20,58,92,10,3,76,20};

        //o(n2)
        for (int i = 0; i < array.length; i++) {
            int isUnique = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                    isUnique++;
                    if (isUnique > 1){
                        break;
                    }
                }
            }

            if (isUnique <= 1) {
                System.out.println(array[i] + " is unique");
            }
        }
    }

}
