package project.calculator;

import util.Utils;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Open calculator......");
        start();
        System.out.println("Close calculator......");
    }

    public static void start() {
        boolean exitFlag = false;

        do {
            System.out.println("Choose main menu option : ");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.println("3. Mathematical Calculator");
            System.out.println("-1. Exit");

            int userInput = Utils.inputIntFromUser("option number");
            switch (userInput) {
                case 1:
                    BasicCalculator basicCalculator = new BasicCalculator();
                    basicCalculator.start();
                    break;
                case 2:
                    ScientificCalculator scientificCalculator = new ScientificCalculator();
                    scientificCalculator.start();
                    break;
                case 3:
                    MathematicalCalculator mathematicalCalculator = new MathematicalCalculator();
                    mathematicalCalculator.start();
                    break;
                case -1:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!exitFlag);
    }

}

class BaseCalculation {

    public void printCalculation(String result) {
        System.out.println("Result = " + result);
    }

    public void printCalculation(int result) {
        System.out.println("Result = " + result);
    }

    public void printCalculation(double result) {
        System.out.println("Result = " + result);
    }

}

class BasicCalculator extends BaseCalculation {

    public void start() {
        boolean exitFlag = false;
        do {
            System.out.println("Choose basic calculator option : ");
            System.out.println("1. Sum");
            System.out.println("2. Minus");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("-1. Exit");

            int userInput = Utils.inputIntFromUser("option number");
            int[] arrNumber = null;

            if (userInput != -1) {
                arrNumber = Utils.inputArrayFromUser();
            }

            switch (userInput) {
                case 1:
                    sum(arrNumber);
                    break;
                case 2:
                    minus(arrNumber);
                    break;
                case 3:
                    multiply(arrNumber);
                    break;
                case 4:
                    divide(arrNumber);
                    break;
                case -1:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!exitFlag);
    }

    public void sum(int... num) {
        int result = 0;
        for (int j : num) {
            result += j;
        }
        printCalculation(result);
    }

    public void minus(int... num) {
        int result = num[0];
        for (int i = 1; i < num.length; i++) {
            result -= num[i];
        }
        printCalculation(result);
    }

    public void multiply(int... num) {
        int result = 1;
        for (int j : num) {
            result *= j;
        }
        printCalculation(result);
    }

    public void divide(int... num) {
        try {
            double result = num[0];
            for (int i = 1; i < num.length; i++) {
                result /= num[i];
            }
            printCalculation(result);
        } catch (Exception e) {
            printCalculation("Error: " + e.getMessage());
        }
    }

}

class ScientificCalculator extends BasicCalculator {
    public void start() {
        boolean exitFlag = false;
        do {
            System.out.println("Choose scientific calculator option:");
            System.out.println("1. Power");
            System.out.println("2. Square Root");
            System.out.println("3. Logarithm");
            System.out.println("4. Sin");
            System.out.println("-1. Exit");

            int userInput = Utils.inputIntFromUser("option number");

            switch (userInput) {
                case 1:
                    power();
                    break;
                case 2:
                    squareRoot();
                    break;
                case 3:
                    logarithm();
                    break;
                case 4:
                    sin();
                    break;
                case -1:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!exitFlag);
    }

    public void power() {
        double base = Utils.inputDoubleFromUser("base");
        double exponent = Utils.inputDoubleFromUser("exponent");
        printCalculation(Math.pow(base, exponent));
    }

    public void squareRoot() {
        double number = Utils.inputDoubleFromUser("number");
        printCalculation(Math.sqrt(number));
    }

    public void logarithm() {
        double number = Utils.inputDoubleFromUser("number");
        printCalculation(Math.log(number));
    }

    public void sin() {
        double angle = Utils.inputDoubleFromUser("angle in radians");
        printCalculation(Math.sin(angle));
    }
}


class MathematicalCalculator extends ScientificCalculator {
    public void start() {
        boolean exitFlag = false;
        do {
            System.out.println("Choose mathematical calculator option:");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("-1. Exit");

            int userInput = Utils.inputIntFromUser("option number");

            switch (userInput) {
                case 1:
                    factorial();
                    break;
                case 2:
                    fibonacci();
                    break;
                case -1:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!exitFlag);
    }

    public void factorial() {
        int number = Utils.inputIntFromUser("number");
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        printCalculation(result);
    }

    public void fibonacci() {
        int terms = Utils.inputIntFromUser("number of terms");
        int a = 0, b = 1;
        StringBuilder sequence = new StringBuilder("0");

        for (int i = 1; i < terms; i++) {
            sequence.append(", ").append(b);
            int temp = a + b;
            a = b;
            b = temp;
        }

        printCalculation(sequence.toString());
    }
}