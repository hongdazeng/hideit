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
    
    public String randomString(int length){
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
}