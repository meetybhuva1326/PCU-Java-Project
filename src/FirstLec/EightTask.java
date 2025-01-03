package FirstLec;

public class EightTask {

    public static void main(String[] args) {
        int num = 4564564;
        int year = 0;
        int month = 0;
        int day = 0;

        year = num / 365;
        num = num % 365;
        month = num / 30;
        num = num % 30;
        day = num;

        System.out.println(year + "/" + month + "/" + day);
    }

}
