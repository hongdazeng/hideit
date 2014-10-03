/*
 *Hide It 
 * 
 * This application will hide a string within another string by merging it with randomly generated string.
 * 
 * @Hongda Zeng (hongda.code@gmail.com)
 * September 27, 2014
 */
import java.util.*;

public class Merger {
    public static String merge (String a, String b) {
        String result = "";
        // Build a string with every other character from alternating strings.
        for ( int i = 0; i < a.length(); i++ ) {
            result += "" + a.charAt(i) + b.charAt(i);
        }
        return result;
    }
    
    public static String demerge (String a) {
        String result = "";
        // Build a string with every other character starting from 0.
        for ( int i = 0; i < a.length(); i = i + 2 ) {
            result += a.charAt(i);
        }
        return result;
    }
    
    public static String randomString(int length) {
        final String pickline = "0123456789abcdefghijklmnopqrestuvwxyz";
        // The method will choose random characters from the above line
        Random randGen = new Random();
        // Create randomnese
        StringBuilder builder = new StringBuilder(length);
        for ( int i = 0; i < length; i++ ) {
            builder.append ( pickline.charAt(randGen.nextInt(pickline.length())));
        }
        return builder.toString();
    }
    
    public static void main (String[] args) {
        int option = 1;
        boolean keepgoing = true;
        
        Scanner reader = new Scanner (System.in);
        System.out.println ("Welcome to Hideit 1.5");
        System.out.println ("This very simple application will receieve a string from"
                                + "the user and merge it with a randomly generated string");
        while (keepgoing) {
            System.out.println ("Enter 1 to obfuscate\nEnter 2 to unobfuscate\nEnter 3 to quit ");
            // catching non-int input
            try {
                option = reader.nextInt();
            }
            catch (Exception e) {
                option = 4;
            }
            reader.nextLine();
                       
            if (option == 1) {
                System.out.println ("Please enter your string: ");
                String userString = reader.nextLine();
                userString = userString.toLowerCase(); //force lower case
                userString = userString.replaceAll("\\s", ""); // remove white spaces and non word characters
                int userLen = userString.length();
                String ranString = randomString(userLen);
                String newString = merge(userString, ranString);
                System.out.println ("-Your new string is: " + newString);
            }
            if (option == 2) {
                System.out.println ("Please enter a string to be unobfuscated: ");
                String userString = reader.nextLine();
                userString = userString.toLowerCase(); //force lower case
                userString = userString.replaceAll("\\s", ""); // remove white spaces and non word characters
                System.out.println (demerge(userString));
            }
            if (option == 3) {
                keepgoing = false;
            }            
            else {
                System.out.println ("Please enter an int between 1 and 3");
            }
        }
    }
}