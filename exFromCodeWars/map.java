package exFromCodeWars;

import java.util.Arrays;

public class map {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();
        
    }
}
