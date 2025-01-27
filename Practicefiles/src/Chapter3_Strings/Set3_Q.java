package Chapter3_Strings;

import java.util.Scanner;

public class Set3_Q {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Q1 String into Lower Care

        String str = "My Name is ASAD Ali";
        String lstr = str.toLowerCase();
        System.out.println(str); //My Name is ASAD Ali
        System.out.println(lstr); //my name is asad ali

        // Q2 Replace space into underscore

        System.out.println(str.replace(" ", "_")); //My_Name_is_ASAD_Ali

        // Q3 letter template

        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "Asad")); //Dear Asad, Thanks a lot

        // Q4 detect double or triple space

        String strr = "this is  double space and this is   triple space";
        System.out.println(strr.indexOf("  ")); //7 // if there is not double space then it will return -1
        System.out.println(strr.indexOf("   ")); // 33

        // Q5 
        System.out.println("\"Dear Asad, This java course is nice\""); //"Dear Asad, This java course is nice"

        

    }
}
