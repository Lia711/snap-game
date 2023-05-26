import java.util.Scanner;

public class SnapTwoPlayer extends Snap {
    Scanner scanner = new Scanner(System.in);

    public boolean snapOpportunity() {
        System.out.println("Snap Opportunity! Enter \"snap\" into the keyboard!");
        String snap = scanner.nextLine();
        if (snap.equals("snap")) {
            System.out.println("Congratulations! " + playerTurn + " has won.");
            return true;
        }
        System.out.println("Incorrect! Continuing game...");
        return false;
    }

    boolean gamePlay = false;
    String playerTurn = "";
    String playerName1 = "";
    String playerName2 = "";

    public void playGame() {
        boolean playAgain = true;
        while (playAgain) {
            boolean gamePlay = false;
            makeDeck();
            boolean noBegin = true;
            System.out.println("Enter player 1 name:");
            playerName1 = scanner.nextLine();
            System.out.println("Enter player 2 name:");
            playerName2 = scanner.nextLine();
            while (noBegin) {
                System.out.println("Press 1 to shuffle deck.");
                String begin = scanner.nextLine();
                if (begin.equals("1")) {
                    System.out.println(shuffleDeck());
                    gamePlay = true;
                    noBegin = false;
                } else {
                    System.out.println("Incorrect character, try again!");
                }
            }
            String currentSuitP1 = "";
            String nextSuitP1 = " ";
            String currentSuitP2 = "";
            String nextSuitP2 = " ";
            while (gamePlay) {
                System.out.println(playerName1 + ", press enter to deal card.");
                String inputP1 = scanner.nextLine();
                if (inputP1.equals("")) {
                    System.out.println(dealCard());
                    currentSuitP1 = returnSuit();
                    playerTurn = playerName1;
                    if (currentSuitP1 != nextSuitP1) {
                        nextSuitP1 = currentSuitP1;
                        currentSuitP1 = "";
                    } else {
                        boolean isSnap = snapOpportunity();
                        if (isSnap) {
                            this.gamePlay = false;
                            break;
                        }
                    }
                }
                System.out.println(playerName2 + ", press enter to deal card.");
                String inputP2 = scanner.nextLine();
                if (inputP2.equals("")) {
                    System.out.println(dealCard());
                    currentSuitP2 = returnSuit();
                    playerTurn = playerName2;
                    if (currentSuitP2 != nextSuitP2) {
                        nextSuitP2 = currentSuitP2;
                        currentSuitP2 = "";
                    } else {
                        boolean isSnap = snapOpportunity();
                        if (isSnap) {
                            this.gamePlay = false;
                            break;
                        }
                    }
                }
            }
            boolean noNewGame = true;
            while (noNewGame) {
                System.out.println("Press 1 to play again. Press 2 to go back to main menu.");
                String playerAnswer = scanner.nextLine();
                if (playerAnswer.equals("1")) {
                    playAgain = true;
                    noNewGame = false;
                } else if (playerAnswer.equals("2")) {
                    playAgain = false;
                    noNewGame = false;
                }
            }
        }
    }
}





