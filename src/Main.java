import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String play = "";

        do { //Looping the whole program

            do { //Looping until Player A inputs R,P,S
                System.out.println("Player A enter your move [R,P,S]: ");
                playA = sc.nextLine();
            } while (!playA.equalsIgnoreCase("R") && !playA.equalsIgnoreCase("P") && !playA.equalsIgnoreCase("S"));

            do { //Looping until Player B inputs R,P,S
                System.out.println("Player B enter your move [R,P,S]: ");
                playB = sc.nextLine();
            } while (!playB.equalsIgnoreCase("R") && !playB.equalsIgnoreCase("P") && !playB.equalsIgnoreCase("S"));


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