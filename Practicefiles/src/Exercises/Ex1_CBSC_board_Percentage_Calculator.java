package Exercises;

import java.util.Scanner;

public class Ex1_CBSC_board_Percentage_Calculator {
    public static void main(str[] arg) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("!!Welcome to Marks Percentage Calculator!!");
        System.out.println("Enter Your Math MArks: ");
        float math = input.nextFloat();
        System.out.println("Enter Your Science MArks: ");
        float Science = input.nextFloat();
        System.out.println("Enter Your Physics MArks: ");
        float Physics = input.nextFloat();
        System.out.println("Enter Your Chemistry MArks: ");
        float Chem = input.nextFloat();
        System.out.println("Enter Your Bio MArks: ");
        float Bio = input.nextFloat();

        float sum = math + Science + Physics + Chem + Bio;

        System.out.println("Your Total MAkrs is: " + sum);
        float percentage = sum / 500;

        System.out.println("Your Percentage is: "+ percentage);


    }
}
