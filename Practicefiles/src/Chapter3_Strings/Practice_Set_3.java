package Chapter3_Strings;

import java.util.Scanner;

public class Practice_Set_3 {
    public static void main(){
    Scanner input = new Scanner(System.in);

    // print formatting
        int a = 10;
        float b = 5.6582f;
        System.out.printf("The value of a is %d and value of b is %f", a, b); // The value of a is 10 and value of b is 5.658200
        System.out.printf("The value of a is %d and value of b is %.2f", a, b); //The value of a is 10 and value of b is 5.66
        System.out.printf("The value of a is %d and value of b is %5.2f", a, b); //The value of a is 10 and value of b is  5.66 //space 5 included


        // String

        String name = new String("Asad"); // String is a class so we create a object of it but we can also use as a data type
        String name1 = "Asad"; // here a datatype
        System.out.println(name); // Asad
        System.out.println(name1); // Asad

        // String Input

        System.out.println("Enter your Name: ");
        String nameinput = input.nextLine();
        System.out.println("Welcome " + nameinput);
        
        //.............String Methods...................
        
        String name2 = "Asad Ali";
        System.out.println(name2); // Asad Ali

        //Length method
        int len = name2.length();
        System.out.println("Length is " + len); //Length is 8

        //LowerCase
        String lsname = name2.toLowerCase();
        System.out.println("Name in Lower Case: " + lsname); //Name in Lower Case: asad ali

        // UpperCase
        String upname = name2.toUpperCase();
        System.out.println("Name in upper case: " + upname); //Name in upper case: ASAD ALI

        //Trim Method it return a new string after removing all the leading and trailing spaces fro original String
        String value = "      trying trim method       ";
        String trimName = value.trim();
        System.out.println("name trimed: " + trimName); //name trimed: trying trim method

        // SubString method
        String subs = name2.substring(2);
        String subs1 = name2.substring(1, 3);
        System.out.println(subs); //ad Ali
        System.out.println(subs1); //sa

        // Replace Method
        System.out.println(name2.replace('A', 'f')); //fsad fli Note: it is case sensitive for a and A different
        System.out.println(name2.replace("a", "abc")); //Asabcd Ali  here "" used and a replced with abc

        // Starts With 
        System.out.println(name2.startsWith("As")); // true bcz my name2 string is starting with As
        System.out.println(name2.startsWith("Ap")); // false bcz my name2 string is not starting with Ap

        // Ends with
        System.out.println(name2.endsWith("Ali")); // true
        System.out.println(name2.endsWith("kli")); //false


        //..... Character at
        System.out.println(name2.charAt(2)); // a  // bcz indexing start with zero(0) and at 2 a is there

        // Index of any character
        System.out.println(name2.indexOf('a')); // 2
        System.out.println(name2.indexOf("Ali")); // 5
        System.out.println(name2.indexOf("A")); // 0
        System.out.println(name2.indexOf("A", 3)); // 5 //bcz it will serach from 4th index
        System.out.println(name2.indexOf("as5244")); //-1

        // Last index
        System.out.println(name2.lastIndexOf("s")); //1 // bcz s at last time is on index 1
        System.out.println(name2.lastIndexOf("A")); //5 // bcz A last time 5 pe aaya hai
        System.out.println(name2.lastIndexOf("A", 3)); //0 // bcz index 3 se pahle A 0 index pe hai
        
        //Equals Method
        System.out.println(name2.equals("Asad")); // false
        System.out.println(name2.equals("Asad Ali")); // true
        System.out.println(name2.equals("Asad ali")); // false // bcz case sensitive

        // Case ignore equal
        System.out.println(name2.equalsIgnoreCase("asad ali")); // true // ignoring case
        System.out.println(name2.equalsIgnoreCase("Asad ali")); // true
        System.out.println(name2.equalsIgnoreCase("asad ali ali als")); // false


        // ............Escape Sequence.................
        //System.out.println("My name is "Asad"); // Error
        System.out.println("This is \" Double qoute"); // This is " Double qoute
        System.out.println("This is \\ BackSlash");  // This is \ BackSlash
        System.out.println("This is \' Single Qoute"); //This is ' Single Qoute
        System.out.println("This is \r backslash r"); // backslash r
        System.out.println("This is \f backslash f"); // This is
                                                        // backslash f

        // \n = new line
        // \t = Tab 
        // \b = insert Backsapce at this point
        //  \r= insert carriage return in the text at this point
        // \f = insert formfeed


    }    
}
