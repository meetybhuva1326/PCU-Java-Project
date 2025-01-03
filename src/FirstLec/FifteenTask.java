package FirstLec;

public class FifteenTask {

    public static void main(String[] args) {
        int a = 10;
        int continuePoint = 2;
        int breakPoint = 7;
        int returnPoint = 9;

        for (int i = 1; i <= a; i++) {
            if (continuePoint == i){
                System.out.println("Continue");
                continue;
            }
            if (breakPoint == i){
                System.out.println("Break");
                break;
            }
            if (returnPoint == i){
                System.out.println("Return");
                return;
            }
            System.out.println("For loop " + i);
        }

    }

}
