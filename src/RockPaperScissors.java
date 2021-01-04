import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        rockPaperScissors();
    }


    public static void rockPaperScissors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Rock, paper scissors, shoot!");
        String playersResponse = input.nextLine();
        List<String> list = Arrays.asList("Rock", "Paper", "Scissors");
        Random rand = new Random();
        //Picks random indexed element using rand - this is the games move/choice
        String randomElement = list.get(rand.nextInt(list.size()));


        //Checks for invalid input
        if (!playersResponse.equalsIgnoreCase("rock") && !playersResponse.equalsIgnoreCase("paper") && !playersResponse.equalsIgnoreCase("scissors")) {
            System.out.println("Invalid move. Please enter rock, paper, or scissors.");
            rockPaperScissors();
        //Rules out if both players choose the same thing.
        } else if (playersResponse.equalsIgnoreCase(randomElement)) {
            System.out.println("Draw! I chose " + randomElement + " too. Shoot again.");
            rockPaperScissors();
        //If player chooses winning move, congratulate them
        } else if (
                (playersResponse.equalsIgnoreCase("rock") && randomElement.equals("Scissors")) ||
                (playersResponse.equalsIgnoreCase("paper") && randomElement.equals("Rock")) ||
                (playersResponse.equalsIgnoreCase("scissors") && randomElement.equals("Paper"))) {
            System.out.println("Congrats, I chose " + randomElement + ". You win.");
        //Catches when player does not win
        } else {
            System.out.println("Sorry, I chose " + randomElement + ". Try again.");
            rockPaperScissors();
        }
    }
}
