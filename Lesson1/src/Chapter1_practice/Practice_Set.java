package Chapter1_practice;

import java.util.Scanner;

public class Practice_Set {
    public static void main() {
        Scanner input = new Scanner(System.in);
        //Programm to Sum three numbers

        int num1 = 4;
        int num2 = 5;
        int num4 = 6;
        int sum = num1 + num2 + num4;
        System.out.println("sum is " + sum);
        

        // Calculate CGPA of three subjects

        float marks1 = 85;
        float marks2 = 90;
        float marks3 = 100;

        float cgpa = (marks1 + marks2 + marks3) / 30;
        System.out.println("CGPA: " + cgpa);
        
        //Name and greet

        
        System.out.println("Enter Your Good Name: ");
        String name = input.nextLine();
        System.out.println("Hello Mr./Mss.  " + name);


        // Convert KiloMeters to Miles


        System.out.println("Enter Kilometer: ");
        float kilo = input.nextFloat();
        float miles = kilo * 0.62;
        System.out.println("Distance in Miles: " + miles);
        

        // Validate Number for Integer

        System.out.println("Enter input: ");
        System.out.println(input.hasNextInt());
    }
}
