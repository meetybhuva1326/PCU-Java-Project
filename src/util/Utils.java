package util;

import java.util.Scanner;

public class Utils {

    public static int[] inputArrayFromUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter value of " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int inputIntFromUser(String msj){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + msj + " : ");
        return scanner.nextInt();
    }

    public static double inputDoubleFromUser(String msj){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + msj + " : ");
        return scanner.nextDouble();
    }

}
