import java.util.Scanner;

public class MainGame {
    public void startGame() {
        SnapTwoPlayer snap2 = new SnapTwoPlayer();
        Snap snap = new Snap();
        boolean noBegin = true;
        while (noBegin) {
            try {
                System.out.println("Press 1 to generate a deck.");
                Scanner myObj2 = new Scanner(System.in);
                int generate = myObj2.nextInt();
                if (generate == 1) {
                    snap.makeDeck();
                    System.out.println(snap.getDeck());
                    noBegin = false;
                }
            } catch (Exception e) {
                System.out.println("You must enter a valid number.");
            }
        }
        boolean noGame = true;
        while (noGame) {
            try {
                System.out.println("Options:\nPress 1 to shuffle deck.\nPress 2 to sort cards by value.\nPress 3 to sort cards by suit.\nPress 4 to play a single player game of snap.\nPress 5 to play a two player game of snap.");
                Scanner myObj2 = new Scanner(System.in);
                int number2 = myObj2.nextInt();
                if (number2 == 1) {
                    System.out.println(snap.shuffleDeck());
                } else if (number2 == 2) {
                    System.out.println(snap.sortCardsByValue());
                } else if (number2 == 3) {
                    System.out.println(snap.sortCardsBySuit());
                } else if (number2 == 4) {
                    noGame = false;
                    snap.playGame();
                    noGame = true;
                } else if (number2 == 5) {
                    noGame = false;
                    snap2.playGame();
                    noGame = true;
                } else System.out.println("Please enter a number between 1 and 5.");
            } catch (Exception e) {
                System.out.println("You must enter a valid number.");
            }
        }

    }

}
