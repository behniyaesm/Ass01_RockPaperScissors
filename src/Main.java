import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String play = "";
        boolean done = false;

        do { //Looping the program

            do { //Looping until Player A inputs R,P,S
                System.out.println("Player A enter your move [R,P,S]: ");
                playA = sc.nextLine();
                if (playA.equalsIgnoreCase("R") || playA.equalsIgnoreCase("P") || playA.equalsIgnoreCase("S")){
                    done = true;
                } else {
                    System.out.println("\nInvalid move! Try again with [R,P,S]: ");
                }
            } while (!done);

            done = false;
            do { //Looping until Player B inputs R,P,S
                System.out.println("Player B enter your move [R,P,S]: ");
                playB = sc.nextLine();
                if (playB.equalsIgnoreCase("R") || playB.equalsIgnoreCase("P") || playB.equalsIgnoreCase("S")){
                    done = true;
                } else {
                    System.out.println("\nInvalid move! Try again with [R,P,S]: ");
                }
            } while (!done);


                if (playA.equalsIgnoreCase("R")) {
                    if (playB.equalsIgnoreCase("R")) {
                        System.out.println("Rock vs Rock it's a Tie!");
                    } else if (playB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers Rock, Player B Wins!");
                    } else if (playB.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks Scissors, Player A Wins!");
                    }
                } else if (playA.equalsIgnoreCase("P")) {
                    if (playB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers Rock Player A Wins!");
                    } else if (playB.equalsIgnoreCase("P")) {
                        System.out.println("Paper vs Paper, it's a Tie!");
                    } else if (playB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors cuts Paper, Player B Wins!");
                    }
                } else if (playA.equalsIgnoreCase("S")) {
                    if (playB.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks Scissors, Player B Wins!");
                    } else if (playB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cuts Paper Player A Wins!");
                    } else if (playB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors vs Scissors, it's a Tie!");
                    }
                }

                System.out.println("Do you want to play again? [Yes/No]: ");
                    play = sc.nextLine();

        } while (play.equalsIgnoreCase("Yes")); //Loop the program again if user inputs Yes
    }
}