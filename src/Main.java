import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {
            String playerA = "";
            String playerB = "";

            // Get move from Player A
            while (true) {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerA = scanner.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    break; // Valid input, exit loop
                }
                System.out.println("Invalid move. Please enter R, P, or S.");
            }

            // Get move from Player B
            while (true) {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerB = scanner.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    break; // Valid input, exit loop
                }
                System.out.println("Invalid move. Please enter R, P, or S.");
            }

            // Determine and display results
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a Tie! ");
            } else if ((playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) ||
                    (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) ||
                    (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))) {
                System.out.println("Player A wins! " + (playerA));
            } else {
                System.out.println("Player B wins! " + (playerB));
            }

            // Prompt to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine();
        }
    }
}