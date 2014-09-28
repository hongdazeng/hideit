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
    
    public static String randomString(int length){
        final String Pickline = "0123456789abcdefghijklmnopqrestuvwxyz";
        // The method will choose random characters from the above line
        Random randGen = new Random();
        // Create randomnese
        StringBuilder builder = new StringBuilder(length);
        for ( int i = 0; i < length; i++ ) {
            builder.append ( Pickline.charAt(randGen.nextInt(Pickline.length())));
        }
        return builder.toString();
    }
    
    public static void main (String[] args){
        Scanner reader = new Scanner (System.in);
        System.out.println ("Welcome to Hideit 1.0");
        System.out.println ("This very simple application will receieve a string from the user"
                           + "and merge it with a randomly generated string");
        System.out.println ("Please enter your string: ");
        String userString = reader.nextLine();
        int userLen = userString.length();
        String ranString = randomString(userLen);
        System.out.println ("-Your new string is: " + merge(userString,ranString));
    }
}