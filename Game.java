import java.util.Random;
import java.util.Scanner;

public class Game {
    static Scanner console = new Scanner(System.in);
    // Global variables (these are allowed).
    public static final int KLOVEN = 1;
    public static final int ALTAPPEN = 2;
    public static final int BEGRIPA = 3;
    public static final int REVSKAR = 4;
    public static final int UTLANGEN = 5;
    public static void main (String[] args){
        System.out.println(Rules(args));
        if (Start(args).equals("y")) {
            System.out.println("Starting game.");
            int[] results = {0,0,0};
            Winner(args, results);
            String continueGame = Redo();
            while(continueGame.equalsIgnoreCase("y")) {
                System.out.println("Continuing game.");
                Winner(args,results );
                continueGame = Redo();
            }
            if (continueGame.equalsIgnoreCase("n")) {
                System.out.println("Game has ended. Fetching results.");
                System.out.println("You won "+ results[0]+" times");
                System.out.println("The computer won "+ results[1]+" times");
                System.out.println("There was a total of "+ results[2]+" rounds played");
            }
        } 
            else {
            System.out.println("Quitting game.");
        }
    }
    public static String Rules(String[] args) {
        String Rules = "During each round, players choose a move, which may be either Kloven, Altappen, Utlangen, Begripa, or Revskar\n\nRevskar beats Utlangen, Kloven\n" + //
                        "Utlangen beats Altappen, Begripa\nAltappen beats Revskar, Kloven\nKloven Beats Begripa, Utlangen\nBegripa beats Revskar, Altappen\n\nThe computer wins in the event of a tie\n";
        return Rules;
    }
    public static String Start(String[] args) {
        System.out.println("Would you like to play a round? Respond with 'y' or 'n'.");
        String Response = console.nextLine();
        while (!Response.equalsIgnoreCase("y") && !Response.equalsIgnoreCase("n")) {
            System.out.println("Invalid response. Please respond with 'y' or 'n' ");
            Response = console.nextLine();
        }
        return Response;
    }
    public static int PlayerMove(String[] args) {
        System.out.println("It is your turn.");
        System.out.println("Type '1' for KLOVEN, '2' for ALTAPPEN, '3' for BEGRIPA, '4' for REVSKAR, '5' for UTLANGEN");
        System.out.println("What is your move?");
        int playerMove = 0;
        while (true) {
                if (console.hasNextInt()) {
                    playerMove = console.nextInt();
                    break;
                } else {
                    System.out.println("That is not a valid number. Please type a number between 1-5.");
                    console.next();
                }
        }
        while (playerMove < 1 || playerMove > 5) {
            System.out.println("That is not a valid number. Please type a number between 1-5");
            System.out.println("What is your move?");
            playerMove = console.nextInt();
        }
        switch (playerMove) {
            case 1:
                System.out.println("You have moved 'KLOVEN' ");
                break;
            case 2:
                System.out.println("You have moved 'ALTAPPEN' ");
                break;
            case 3:
                System.out.println("You have moved 'BEGRIPA' ");
                break;
            case 4:
                System.out.println("You have moved 'REVSKAR' ");
                break;
            case 5:
                System.out.println("You have moved 'UTLANGEN' ");
                break;                
                 }
        return playerMove;
                }
    public static int ComputerMove(String[] args) {
        Random random = new Random();
        int computerMove = random.nextInt(1,6);
        switch (computerMove) {
            case 1:
                System.out.println("The computer has moved 'KLOVEN' ");
                break;
            case 2:
                System.out.println("The computer has moved 'ALTAPPEN' ");
                break;
            case 3:
                System.out.println("The computer has moved 'BEGRIPA' ");
                break;
            case 4:
                System.out.println("The computer has moved 'REVSKAR' ");
                break;
            case 5:
                System.out.println("The computer has moved 'UTLANGEN' ");
                break;                
                 }
        return computerMove;
                }
    public static int[] Winner(String[] args, int[] results) {
        int playerMove = PlayerMove(args);
        int computerMove = ComputerMove(args);
        if (playerMove==REVSKAR && (computerMove == UTLANGEN || computerMove == KLOVEN)) {
            System.out.println("The player has won this round by moving REVSKAR!");
            results[0] += 1;
        }
        else if (playerMove == UTLANGEN && (computerMove == ALTAPPEN || computerMove == BEGRIPA)) {
            System.out.println("The player has won this round by moving UTLANGEN!");
            results[0] += 1;
        }
        else if (playerMove == ALTAPPEN && (computerMove == REVSKAR || computerMove == KLOVEN )) {
            System.out.println("The player has won this round by moving ALTAPPEN!");
            results[0] += 1;
        }
        else if (playerMove == KLOVEN && (computerMove == BEGRIPA || computerMove == UTLANGEN)) {
            System.out.println("The player has won this round by moving KLOVEN!");
            results[0] += 1;
        }
        else if (playerMove == BEGRIPA && (computerMove == REVSKAR || computerMove == ALTAPPEN)) {
            System.out.println("The player has won this round by moving BEGRIPA!");
            results[0] += 1;
        }
        else if (computerMove==REVSKAR && (playerMove == UTLANGEN || playerMove == KLOVEN)) {
            System.out.println("The computer has won this round by moving REVSKAR!");
            results[1] += 1;
        }
        else if (computerMove == UTLANGEN && (playerMove == ALTAPPEN || playerMove == BEGRIPA)) {
            System.out.println("The computer has won this round by moving UTLANGEN!");
            results[1] += 1;
        }
        else if (computerMove == ALTAPPEN && (playerMove == REVSKAR || playerMove == KLOVEN)) {
            System.out.println("The computer has won this round by moving ALTAPPEN!");
            results[1] += 1;
        }
        else if (computerMove == KLOVEN && (playerMove == BEGRIPA || playerMove == UTLANGEN)) {
            System.out.println("The computer has won this round by moving KLOVEN!");
            results[1] += 1;
        }
        else if (computerMove == BEGRIPA && (playerMove == REVSKAR || playerMove == ALTAPPEN)) {
            System.out.println("The computer has won this round by moving BEGRIPA!");
            results[1] += 1;
        }
        else if (computerMove == playerMove) {
            System.out.println("This round has ended in a tie. Point has been awarded to the computer.");
            results[1] += 1;
        }
    console.nextLine();
    results[2] += 1;
    return results;
    }
    public static String Redo() {
        System.out.println("Would you like to play another round? Please respond with 'y' or 'n'");
        String nextRound = console.nextLine();
        while (!nextRound.equalsIgnoreCase("y") && !nextRound.equalsIgnoreCase("n")) {
            System.out.println("Invalid response! Please respond with 'y' or 'n'.");
            nextRound = console.nextLine();
        }
        return nextRound;
    }
}
