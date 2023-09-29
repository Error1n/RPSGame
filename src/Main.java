import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        String playerOne = "";
        String playerTwo ="";
        boolean done = false;
        boolean done2 = false;
        boolean done3 = false;
        boolean gameOver = false;
        String endGame = "";
        String trash = "";

        do
        {

            do
            {
                System.out.println("Player 1 enter your move [R P S]: ");
                if(in.hasNextLine())
                {
                    playerOne = in.nextLine();
                    if(playerOne.equalsIgnoreCase("R"))
                    {
                        System.out.println("You chose ROCK!");
                        done = true;
                    }

                    else if(playerOne.equalsIgnoreCase("P"))
                    {
                        System.out.println("You chose PAPER!");
                        done = true;
                    }
                    else if(playerOne.equalsIgnoreCase("S"))
                    {
                        System.out.println("You chose SCISSORS!");
                        done = true;
                    }
                    else
                    {
                        System.out.println("You entered: " + playerOne + ". Please enter an RPS move [R P S].");
                    }

                }

            }while(!done);


            do
            {
                System.out.println("Player 2 enter your move [R P S]: ");
                if(in.hasNextLine())
                {
                    playerTwo = in.nextLine();
                    if(playerTwo.equalsIgnoreCase("R"))
                    {
                        System.out.println("You chose ROCK!");
                        done2 = true;
                    }

                    else if(playerTwo.equalsIgnoreCase("P"))
                    {
                        System.out.println("You chose PAPER!");
                        done2 = true;
                    }
                    else if(playerTwo.equalsIgnoreCase("S"))
                    {
                        System.out.println("You chose SCISSORS!");
                        done2 = true;
                    }
                    else
                    {
                        System.out.println("You entered: " + playerTwo + ". Please enter an RPS move [R P S].");
                    }
                }


            }while(!done2);

            if(playerOne.equalsIgnoreCase("R"))
            {
                if (playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie!");
                }
                else if (playerTwo.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers rock; player 2 wins!");
                }
                else if (playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock crushes scissors; player 1 wins!");
                }

            }
            else if(playerOne.equalsIgnoreCase("P"))
            {
                if (playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers rock; player 1 wins!");
                }
                else if (playerTwo.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie!");
                }
                else if (playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors cuts paper; player 2 wins!");
                }

            }
            else if(playerOne.equalsIgnoreCase("S"))
            {
                if (playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock crushes scissors; player 2 wins");
                }
                else if (playerTwo.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts paper; player 1 wins!");
                }
                else if (playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.println("It's a tie!");
                }

            }

            do
            {
                System.out.println("Do you want to play again? [Y N]: ");
                if(in.hasNextLine())
                {
                    endGame = in.nextLine();
                    if(endGame.equalsIgnoreCase("Y"))
                    {
                        System.out.println("Let's play again!");
                        done3 = true;
                    }

                    else if(endGame.equalsIgnoreCase("N"))
                    {
                        System.out.println("You chose to not play another round.");
                        gameOver = true;
                    }
                    else
                    {
                        System.out.println("You entered: " + endGame + ". Please enter either Y or N.");
                    }

                }

            }while(!done3);

        }while(!gameOver);

    }
}