import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y"))
        {
            String playerA = "";
            String playerB = "";

            System.out.print("Enter move for Player A: ");
            playerA = in.nextLine();
            playerA = playerA.toUpperCase();

            System.out.print("Enter move for Player B: ");
            playerB = in.nextLine();
            playerB = playerB.toUpperCase();

            System.out.println("Player A: " + playerA + "   Player B: " + playerB);

            if (!playerA.matches("[RPS]") || !playerB.matches("[RPS]"))
            {
                System.out.println("Illegal: Player A: " + playerA + " Player B: " + playerB);
            }
            else
            {
                if (playerA.equals("R"))
                {
                    if (playerB.equals("R"))
                    {
                        System.out.println("Rock vs Rock: It's a Tie");
                    }
                    else
                    {
                        if (playerB.equals("P"))
                        {
                            System.out.println("Paper covers Rock: Player B Wins!");
                        }
                        else
                        {
                            System.out.println("Rock breaks Scissors: Player A Wins!");
                        }
                    }
                }
                else if (playerA.equals("P"))
                {
                    if (playerB.equals("R"))
                    {
                        System.out.println("Paper covers Rock: Player A Wins!");
                    }
                    else
                    {
                        if (playerB.equals("P"))
                        {
                            System.out.println("Paper vs Paper: It's a Tie!");
                        }
                        else
                        {
                            System.out.println("Scissors cuts Paper: Player B Wins");
                        }
                    }
                }
                else
                {
                    if (playerB.equals("R"))
                    {
                        System.out.println("Rock breaks Scissors: Player B Wins!");
                    }
                    else
                    {
                        if (playerB.equals("P"))
                        {
                            System.out.println("Scissors cuts Paper: Player A Wins!");
                        }
                        else
                        {
                            System.out.println("Scissors vs Scissors: It's a Tie");
                        }
                    }
                }
            }

            System.out.print("Play again? (Y/N): ");
            playAgain = in.nextLine();
            System.out.println();
        }

        System.out.println("Thanks for playing!");
    }
}
