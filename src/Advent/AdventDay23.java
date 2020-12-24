// Count character from user input. Show characters used vs. characters remaining.

//Twitter max character count = 280

package Advent;

import java.util.Scanner;

public class AdventDay23 {

    public static void main(String[] args) {
//        tweetCharacterCount("This is my first tweet.");
//        tweetCharacterCount("This tweet should be longer than 280 characters. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam nec lorem interdum, luctus eros eget, gravida felis. Quisque ut interdum turpis. Vestibulum dolor arcu, luctus vel nibh sed, tempor convallis tortor. Fusce in diam blandit, fermentum quam ac, lobortis tortor integer.");
//        tweetCharacterCount("This is my final tweet ever!");

        tweetCharacterCount();
    }

    public static void tweetCharacterCount() {
        Scanner tweetInput = new Scanner(System.in);
        System.out.println("Keep it short and sweet: ");
        String tweet = tweetInput.nextLine();
        int characterLimit = 280;

        if (tweet.length() < 280) {
            System.out.println("Your tweet: " + tweet);
            System.out.println("Characters used: " + tweet.length());
            System.out.println("Characters left: " + (280 - tweet.length()));
        } else {
            System.out.println();
            System.out.println("Your tweet '" + tweet + "' exceeds the character limit.");
        }

    }

}
