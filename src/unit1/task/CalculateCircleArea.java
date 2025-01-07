package unit1.task;

import java.util.Scanner;

public class CalculateCircleArea {

    public static void main(String[] args) {
        //PI value is constant so use final keyword
        final float PI = 3.14f;

        //Input radius from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle radius : ");

        float radius = sc.nextFloat();

        //Formula radius = PI * radius * radius
        float area = PI * radius * radius;

        //Output of total circle area
        System.out.println("The area of the circle is " + area);
    }

}
