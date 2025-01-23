package Chapter2_practice_set;

import java.util.Scanner;

public class PracticeSet {
    public static void main() {
        Scanner input = new Scanner(System.in);
       
        // result of float a = 7/4*9/2 = 4;

        System.out.println("Result is " + 7 / 4 * 9 / 2);
        

        // encript decript

        System.out.print("Enter Your Data: ");
        int data = input.nextInt();
        int encrypt = data + 8;
        System.out.println("Your extual Data : " + (encrypt - 8));
        
        // Given Number is greater than userinput or not
        
        int num = 20;
        System.out.println("Enter a Number: ");
        int userinput = input.nextInt();
        boolean result = num > userinput;
        System.out.println("Result: " + result);


         // write expression


        System.out.println("Enter inputs: ");
        int v = input.nextInt();
        int u = input.nextInt();
        int a = input.nextInt();

        int exp = ((v * v) - (u * u)) / (2 * a * 5);
        System.out.println("expression result: " + exp);


           // value
        
        float v = 7 * 49 / 7 + 35 / 7;
        System.out.println("Value: "+ v);
    }
}
