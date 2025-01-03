package ArrayTask;

public class FindCountOEArrayTask {

    public static void main(String[] args) {
        int[] a = {5, 6, 8, 9, 2, 14};
        int odd = 0;
        int even = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Odd : " + odd);
        System.out.println("Even : " + even);
    }

}
