public class Merger {
    public static String merge (String a, String b) {
        String result = "";
        for ( int i = 0; i < a.length(); i++ ) {
            result += "" + a.charAt(i) + b.charAt(i);
        }
        return result;
    }
}