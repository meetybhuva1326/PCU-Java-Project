package unit1.task;

import java.util.Scanner;

public class ScannerTask {

    public static void main(String[] args) {
        //Input by user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = scanner.nextInt();

        //Print table
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

}
