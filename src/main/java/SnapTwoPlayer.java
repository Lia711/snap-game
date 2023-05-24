import java.util.Objects;
import java.util.Scanner;

public class SnapTwoPlayer extends Snap {
    boolean win = false;
    boolean gamePlay = false;

    int playerTurn=0;

    public void snapOpportunity() {
        System.out.println("Snap Opportunity! Enter \"snap\" into the keyboard!");
        Scanner snapObj = new Scanner(System.in);
        String snap = snapObj.nextLine();
        if (Objects.equals(snap, "snap")) {
                System.out.println("Congratulations! P" + playerTurn + " has won.");
                gamePlay = false;
            }

        }

    public void playGame() {
        makeDeck();

        System.out.println("Press 1 to shuffle deck.");
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        if (number == 1) {
            System.out.println(shuffleDeck());
            gamePlay = true;
        }
        String currentSuitP1 = "";
        String nextSuitP1 = " ";
        String currentSuitP2 = "";
        String nextSuitP2 = " ";
        while (gamePlay) {
            System.out.println("P1 press enter to deal card.");
            Scanner myObj2 = new Scanner(System.in);
            String inputP1 = myObj2.nextLine();
            if (inputP1.equals("")) {
                System.out.println(dealCard());
                currentSuitP1 = returnSuit();
                playerTurn=1;
                if (currentSuitP1 != nextSuitP1) {
                    nextSuitP1 = currentSuitP1;
                    currentSuitP1 = "";
                } else {
                    snapOpportunity();
                    //break;

                    //gamePlay = false;
                }
            }
            System.out.println("P2 press enter to deal card.");
            Scanner myObj3 = new Scanner(System.in);
            String inputP2 = myObj3.nextLine();
            if (inputP2.equals("")) {
                System.out.println(dealCard());
                currentSuitP2 = returnSuit();
                playerTurn=2;
                if (currentSuitP2 != nextSuitP2) {
                    nextSuitP2 = currentSuitP2;
                    currentSuitP2 = "";
                } else {
                    snapOpportunity();
                    //break;
                }


            }
        }
    }
}

