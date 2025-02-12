import java.util.Scanner;
public class Game {
    static Scanner console = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println(Rules(args));
        Start(args);
        if (Start(args).equals("y")) {
            System.out.println("Starting game.");
        }

        }
    public static String Rules(String[] args) {
        String Rules = "During each round, players choose a move, which may be either Kloven, Altappen, Utlangen, Begripa, or Revskar\n\nRevskar beats Utlangen, Kloven\n" + //
                        "Utlangen beats Altappen, Begripa\nAltappen beats Revskar, Kloven\nKloven Beats Begripa, Utlangen\nBegripa beats Revskar, Altappen\n\nThe computer wins in the event of a tie";
        return Rules;
    }
    public static String Start(String[] args) {
        //String data[] = {"Kloven","Altappen","Utlangen","Begripa","Revskar"};
        System.out.println("Would you like to play a round? Respond with 'y' or 'n'.");
        String Response = console.nextLine();
        while (!Response.equalsIgnoreCase("y") && !Response.equalsIgnoreCase("n")) {
            System.out.println("Invalid response. Please respond with 'y' or 'n' ");
            Response = console.nextLine();
        }
        return Response;
    }
}
