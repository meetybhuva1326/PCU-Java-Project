package FirstLec;

public class SixteenTask {

    public static void main(String[] args) {
        int a = 9;
        int totalSum = 0;

        for (int i = 1; i <= a; i++) {
            totalSum+=i;
        }

        if (totalSum%3 == 0){
            System.out.println(totalSum + " is prime number");
        }

        System.out.println(totalSum);
    }

}
