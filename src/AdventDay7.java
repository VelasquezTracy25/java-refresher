//You are given a string s that consists of only lowercase English letters. If vowels aeiou are given a value of one and consonants are given a value of 2, return the sum of all  the letters in the input string.


public class AdventDay7 {

    public static void main(String[] args) {
        System.out.println(countVowelsConsonants("Tracy"));

    }

    public static int countVowelsConsonants(String string) {

        int count = 0;

        String[] stringToArray = string.split("", 100);

        for (String character : stringToArray) {
            if (character == "a" || (character == "e") || (character == "i") || (character == "o") || (character == "u")) {
                count++;
            } else {
                count += 2;
            }

        }
        return count;
    }

}
