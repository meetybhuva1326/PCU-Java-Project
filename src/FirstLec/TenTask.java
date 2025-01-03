package FirstLec;

public class TenTask {

    public static void main(String[] args) {

        int num = 42380;
        int reverseNum = 0;

        while (num > 0) {
            int temp = num % 10;
            reverseNum = reverseNum * 10 + temp;
            num = num / 10;
        }

        System.out.println("Reverse = " + reverseNum);

    }

}
