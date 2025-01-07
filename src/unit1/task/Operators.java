package unit1.task;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        //Input value form user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter value num2 : ");
        int num2 = scanner.nextInt();

        //Arithmetic Operator
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println("Sum : " + arithmeticOperators.sum(num1,num2));
        System.out.println("Minus : " + arithmeticOperators.minus(num1,num2));
        System.out.println("Multiply : " + arithmeticOperators.multiply(num1,num2));
        System.out.println("Divide : " + arithmeticOperators.divide(num1,num2));
        System.out.println("Modulo : " + arithmeticOperators.modulo(num1,num2));
        System.out.println("Num1 : " + num1++);
        System.out.println("Num2 : " + ++num2);

        //Relational Operator
        RelationalOperators relationalOperators = new RelationalOperators();
        System.out.println("Less than : " + relationalOperators.lessThen(num1,num2));
        System.out.println("Greater than : " + relationalOperators.greaterThen(num1,num2));
        System.out.println("Less than equal to : " + relationalOperators.lessThenEqual(num1,num2));
        System.out.println("Greater than equal to : " + relationalOperators.greaterThenEqual(num1,num2));
        System.out.println("Equal to : " + relationalOperators.equalTo(num1,num2));
        System.out.println("Not equal to : " + relationalOperators.notEqualTo(num1,num2));

        //Input value form user
        System.out.print("Enter value num3 : ");
        int num3 = scanner.nextInt();
        System.out.print("Enter value num4 : ");
        int num4 = scanner.nextInt();

        //Logical Operator
        LogicalOperators logicalOperators = new LogicalOperators();
        System.out.println("And : " + logicalOperators.andEqual(num1, num2, num3, num4));
        System.out.println("Or : " + logicalOperators.orEqual(num1, num2, num3, num4));
        System.out.println("Not : " + logicalOperators.notEqual(num1, num2, num3, num4));

        //Assignment Operator


    }

}

class ArithmeticOperators {

    // +
    public int sum(int a, int b){
        return a + b;
    }

    // -
    public int minus(int a, int b){
        return a - b;
    }

    // *
    public int multiply(int a, int b){
        return a * b;
    }

    // /
    public int divide(int a, int b){
        return a / b;
    }

    // %
    public int modulo(int a, int b){
        return a % b;
    }

}

class RelationalOperators {

    //Less than
    public boolean lessThen(int a, int b){
        return a < b;
    }

    //Greater than
    public boolean greaterThen(int a, int b){
        return a > b;
    }

    //Less than equal
    public boolean lessThenEqual(int a, int b){
        return a <= b;
    }

    //Less than
    public boolean greaterThenEqual(int a, int b){
        return a >= b;
    }

    //Less than
    public boolean equalTo(int a, int b){
        return a == b;
    }

    //Less than
    public boolean notEqualTo(int a, int b){
        return a != b;
    }

}

class LogicalOperators {

    //AND
    public boolean andEqual(int a, int b, int c, int d){
        return ((a == b) && (c == d));
    }

    //OR
    public boolean orEqual(int a, int b, int c, int d){
        return ((a == b) || (c == d));
    }

    //NOT
    public boolean notEqual(int a, int b, int c, int d){
        return (!(a == b) || (c == d));
    }

}

class AssignmentOperators {

    //Assign Value
    public boolean andEqual(int a, int b, int c, int d){
        return ((a == b) && (c == d));
    }

    //OR
    public boolean orEqual(int a, int b, int c, int d){
        return ((a == b) || (c == d));
    }

    //NOT
    public boolean notEqual(int a, int b, int c, int d){
        return (!(a == b) || (c == d));
    }

}