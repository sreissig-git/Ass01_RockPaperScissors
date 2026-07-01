import java.util.Scanner;

public class Ass01_RockPaperScissors {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        boolean playAgain = true;

        while (playAgain) {
            boolean validA = false;
            boolean validB = false;

            // Loop for Player A until valid input
            while (!validA)
            {
                System.out.print("Enter move for Player A [RPS]: ");
                playerA = in.nextLine().toUpperCase();
                if (playerA.matches("[RPS]"))
                {
                    validA = true;
                }
                else
                {
                    System.out.println("Invalid move. Please enter R, P, or S.\n");
                }
            }

            // Loop for Player B until valid input
            while (!validB) {
                System.out.print("Enter move for Player B [RPS]: ");
                playerB = in.nextLine().toUpperCase();
                if (playerB.matches("[RPS]")) {
                    validB = true;
                } else {
                    System.out.println("Invalid move. Please enter R, P, or S.\n");
                }
            }

            System.out.println("\nPlayer A: " + playerA + " Player B: " + playerB + "\n" );
            {
                if(playerA.equals("R")) //Player A is Rock
                {
                    if (playerB.equals("R"))
                    {
                        System.out.println("Draw, Rock VS Rock");
                    }
                    else if (playerB.equals("P"))
                    {
                        System.out.println("Player B wins, Paper covers Rock");
                    }
                    else
                    {
                        System.out.println("Player A wins, Rock Breaks Scissors");
                    }
                }
                else if (playerA.equals("P")) //Player A is Paper
                {
                    if (playerB.equals("R"))
                    {
                        System.out.println("Player A wins, Paper covers Rock");
                    }
                    else if (playerB.equals("P"))
                    {
                        System.out.println("Draw, Paper VS Paper");
                    }
                    else
                    {
                        System.out.println("Player B wins, Scissors cuts Paper");
                    }
                }
                else //Player A is Scissors
                {
                    if (playerB.equals("R"))
                    {
                        System.out.println("Player B wins, Rock Breaks Scissors");
                    }
                    else if (playerB.equals("P"))
                    {
                        System.out.println("Player A wins, Scissors cuts Paper");
                    } else
                    {
                        System.out.println("Draw, Scissors VS Scissors");
                    }
                }
            }

            // Prompt to play again (Y/N)
            String response = "";
            boolean validResponse = false;
            while (!validResponse)
            {
                System.out.print("\nPlay again? (Y/N): ");
                response = in.nextLine().toUpperCase();
                if (response.equals("Y"))
                {
                    validResponse = true; // continue loop
                }
                else if (response.equals("N"))
                {
                    validResponse = true;
                    playAgain = false;
                }
                else
                {
                    System.out.println("Please enter Y or N.");
                }
            }
        }


    }
}
