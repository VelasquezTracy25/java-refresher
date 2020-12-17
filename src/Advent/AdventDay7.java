package Advent;//You are given a string s that consists of only lowercase English letters. If vowels aeiou are given a value of one and consonants are given a value of 2, return the sum of all  the letters in the input string.


import java.util.Arrays;

public class AdventDay7 {

    public static void main(String[] args) {
        System.out.println(countVowelsConsonants("Tracy"));
        System.out.println(countVowelsConsonants("mom"));
        System.out.println(countVowelsConsonants("hello"));
        System.out.println(countVowelsConsonants("HELLO"));



    }

    public static int countVowelsConsonants(String string) {

        int count = 0;

//        String[] stringToArray = string.split("", 100); //is not case sensitive

        String[] stringToArray = string.toLowerCase().split("", 100);
//        System.out.println(Arrays.toString(stringToArray));

        for (String character : stringToArray) {
            if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")) {
                count++;
            } else {
                count += 2;
            }
//            System.out.println("count is " + count);
        }
        return count;
    }

}
