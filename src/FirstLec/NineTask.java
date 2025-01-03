package FirstLec;

public class NineTask {

    public static void main(String[] args) {

        int num = 42380;
        int hour = 0;
        int minute = 0;
        int second = 0;

        hour = num / (60*60);
        num = num % (60*60);
        minute = num / 60;
        num = num % 60;
        second = num;

        System.out.println(hour + "/" + minute + "/" + second);

    }

}
