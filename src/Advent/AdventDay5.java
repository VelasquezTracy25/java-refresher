package Advent;//Reverse a provided string.
//"hello" returns "olleh"
//"Howdy" returns "ydwoH"

public class AdventDay5 {

    public static void main(String[] args) {
        System.out.println("Tracy backwards is " + reverseString("Tracy"));
        System.out.println("hello backwards is " + reverseString("hello"));
        System.out.println("Howdy backwards is " + reverseString("Howdy"));
    }

    public static StringBuilder reverseString(String str) {
        StringBuilder newStr = new StringBuilder();

        newStr.append(str);

        StringBuilder newString = newStr.reverse();

        return newString;
    }
}
