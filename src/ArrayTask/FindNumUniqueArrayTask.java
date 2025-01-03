package ArrayTask;

public class FindNumUniqueArrayTask {

    public static void main(String[] args) {
        int[] a = {21, 69, 34, 12, 42, 92, 21, 42};

        int findNum = 21;
        int duplicateNum = 0;

        for (int i = 0; i < a.length; i++) {
            if (findNum == a[i]){
                duplicateNum++;
            }
        }

        if (duplicateNum<=1){
            System.out.println(findNum + " this num is unique");
        }else{
            System.out.println(findNum + " this num is not unique");
        }
    }

}
