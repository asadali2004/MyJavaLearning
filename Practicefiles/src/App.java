import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Convert KiloMeters to Miles


        System.out.println("Enter Kilometer: ");
        float kilo = input.nextFloat();
        float miles = kilo * 0.62f;
        System.out.println("Distance in Miles: " + miles);
        

        // Validate Number for Integer

        System.out.println("Enter input: ");
        System.out.println(input.hasNextInt());


    }
}








