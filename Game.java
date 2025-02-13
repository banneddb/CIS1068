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
            PlayerMove(args);        
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
        int playerMove = console.nextInt();
        while (playerMove < 1 || playerMove > 5) {
            System.out.println("Invalid number. Please pick 1,2,3,4 or 5.");
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
        int randnum[] = {1,2,3,4,5};
        

    }
}
