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

        if (randomElement.equalsIgnoreCase(playersResponse)) {
            System.out.println("Draw! I chose " + randomElement + " too. Shoot again.");
            rockPaperScissors();
        } else if (
                randomElement.equalsIgnoreCase("rock") && rand.equals("Scissors") ||
                randomElement.equalsIgnoreCase("paper") && rand.equals("Rock") ||
                randomElement.equalsIgnoreCase("scissors") && rand.equals("Paper")) {
        } else {
            System.out.println("Sorry, I chose " + randomElement + ". Try again.");
            rockPaperScissors();
        }
    }
}
