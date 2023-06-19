import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String PlayerA = " ";
        String PlayerB = " ";
        String playAgain = " ";
        boolean run = true;
        do {
            System.out.println("Do you want to play a game [Y/N]");
            playAgain = in.nextLine();

            System.out.print("Player A enter R,P,S ");
            PlayerA = in.nextLine();
            System.out.println("Player A: " + PlayerA);
            System.out.print("Player B enter R,P,or S ");
            PlayerB = in.nextLine();
            System.out.println("Player B : " + PlayerB);

            //Enter code for playing again
            //while (playAgain) = "Y";
            if (PlayerA.equalsIgnoreCase("R")) {
                if (PlayerB.equalsIgnoreCase("R")) {
                    System.out.println("It is a Tie Rock x Rock");
                } else if (PlayerB.equalsIgnoreCase("P")) {
                    System.out.println("Player B wins Paper covers Rock");
                } else if (PlayerB.equalsIgnoreCase("S"))
                    System.out.println("Player A wins Rock breaks Scissors");
            } else if (PlayerA.equalsIgnoreCase("P")) {
                if (PlayerB.equalsIgnoreCase("R")) {
                    System.out.println("Player A wins Paper covers Rock");
                } else if (PlayerB.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie Paper x Paper");
                } else if (PlayerB.equalsIgnoreCase("S"))
                    System.out.println("Player B wins Scissors cuts Paper");
            } else if (PlayerA.equalsIgnoreCase("S")) ;
            if (PlayerB.equalsIgnoreCase("R")) {
                System.out.println("Player B wins Rock breaks Scissors");
            } else if (PlayerB.equalsIgnoreCase("P")) {
                System.out.println("Player A wins Scissors cuts Paper");
            } else if (PlayerB.equalsIgnoreCase("S"))
                System.out.println("It's a tie Scissors x Scissors");
            System.out.println("Would you like to play again? ");
            run = in.nextBoolean();
        } while (run);
    }
        //End the while
}
