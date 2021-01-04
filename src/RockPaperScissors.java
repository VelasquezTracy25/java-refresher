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
        String randomElement = list.get(rand.nextInt(list.size()));

        if (playersResponse.equalsIgnoreCase(randomElement)) {
            System.out.println("Draw! I chose " + randomElement + " too. Shoot again.");
            rockPaperScissors();
        } else if (
                (playersResponse.equalsIgnoreCase("rock") && randomElement.equals("Scissors")) ||
                (playersResponse.equalsIgnoreCase("paper") && randomElement.equals("Rock")) ||
                (playersResponse.equalsIgnoreCase("scissors") && randomElement.equals("Paper"))) {
            System.out.println("Congrats, I chose " + randomElement + ". You win.");
        } else {
            System.out.println("Sorry, I chose " + randomElement + ". Try again.");
            rockPaperScissors();
        }
    }
}
