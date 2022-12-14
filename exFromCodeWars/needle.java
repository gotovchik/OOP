package exFromCodeWars;

import java.util.Arrays;

public class needle {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle"); 
    }
}
