package FirstLec;

public class SixTask {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int c = 20;

        if (a>b && a>c){
            System.out.println("A is big");
        }else if(b>a && b>c){
            System.out.println("B is big");
        }else if(c>a && c>b){
            System.out.println("C is big");
        }else if(c>b && c==a){
            System.out.println("C & A is big");
        } else if(b>a && b==c){
            System.out.println("B & C is big");
        } else if(a>c && b==a){
            System.out.println("A & B is big");
        } else {
            System.out.println("All are same");
        }

    }

}
