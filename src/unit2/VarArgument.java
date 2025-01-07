package unit2;

import util.Utils;

public class VarArgument {

    public static void main(String[] args) {
        int[] arr = Utils.inputArrayFromUser();

        //Variable Argument
        System.out.println(sum(arr));
        System.out.println(sum(10,20,48));

        //Overloading Variable Argument
        System.out.println(sum(10,20));

    }

    //Variable Argument
    public static int sum(int ...a){
        int result = 0;
        for (int j : a) {
            result += j;
        }
        System.out.println("Variable Argument");
        return result;
    }

    //Overloading Variable Argument
    public static int sum(int a, int b){
        System.out.println("Overloading Variable Argument");
        return a+b;
    }

}
