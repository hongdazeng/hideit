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
        for ( int i = 0; i < a.length(); i++ ) {
            result += "" + a.charAt(i) + b.charAt(i);
        }
        return result;
    }
    
    public static String demerge (String a) {
        String result = "";
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
        Scanner reader = new Scanner (System.in);
        System.out.println ("Welcome to Hideit 1.5");
        System.out.println ("This very simple application will receieve a string from the user"
                           + "and merge it with a randomly generated string");
        System.out.println ("Please enter your string: ");
        String userString = reader.nextLine();
        userString = userString.toLowerCase(); //force lower case
        userString = userString.replaceAll("\\s",""); // remove white spaces and non word characters
        int userLen = userString.length();
        String ranString = randomString(userLen);
        String newString = merge(userString, ranString);
        System.out.println ("-Your new string is: " + newString);
        System.out.println ("Demerging");
        System.out.println (demerge(newString));
    }
}