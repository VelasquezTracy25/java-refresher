package Advent;

//Given a string, find the number of different characters in it.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AdventDay17 {
    public static void main(String[] args) {
        System.out.println(countChars("Tracy"));
        System.out.println(countChars("Marry"));
        System.out.println(countChars("eeeee"));

    }

    public static int countChars(String input){

        char inputArray[] = input.toCharArray();
        Arrays.sort(inputArray);

        Map<Character, Integer> map = new HashMap<>();

        for (char character : inputArray){
            if(map.containsKey(character)) {
                int counter = map.get(character);
                map.put(character, ++counter);
            } else {
                map.put(character, 1);
            }
        }

    return map.size();
    }
}
