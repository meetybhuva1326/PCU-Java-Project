package FirstLec;

public class ElevenTask {

    public static void main(String[] args) {

        int num = 42380;
        int originalNum = num;
        int reverseNum = 0;

        while (num > 0) {
            int temp = num % 10;
            if (temp != 0) {
                reverseNum = reverseNum * 10 + temp;
            }else{
                reverseNum = reverseNum * 10;
            }
            num = num / 10;
        }

        if (originalNum == reverseNum){
            System.out.println(originalNum + " is a palindrome");
        }else{
            System.out.println(originalNum + " is a not palindrome");
        }


    }

}
