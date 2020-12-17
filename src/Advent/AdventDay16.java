package Advent;

//insert dashes
// Transform a given sentence into a new on with dashes between every two consecutive letters

// "aba caba" returns "a-b-a c-a-b-a"

import java.util.Arrays;

public class AdventDay16 {
    public static void main(String[] args) {

        System.out.println(addDashes("Tracy is cool."));
    }

    public static String addDashes(String original){

    String[] splitString = original.split("");
        String newString = String.join("-", splitString);

    return newString;

    }
}
