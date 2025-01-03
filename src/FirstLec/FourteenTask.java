package FirstLec;

public class FourteenTask {

    public static void main(String[] args) {

        int a = 5;
        int answer = a;

        for (int i = a-1; i >= 1; i--) {
            answer*=i;
        }

        System.out.println(answer);
    }

}
