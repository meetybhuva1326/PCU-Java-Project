package unit1.task;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        int a,b,c;

        //Input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        a = scanner.nextInt();
        System.out.print("Enter value of b : ");
        b = scanner.nextInt();
        System.out.print("Enter value of c : ");
        c = scanner.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("A is big");
            }else{
                System.out.println("C is big");
            }
        }else{
            if (b>c){
                System.out.println("B is big");
            }else{
                System.out.println("C is big");
            }
        }

    }



}
