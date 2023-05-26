import java.util.Scanner;

public class MainGame {

    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        SnapTwoPlayer snap2 = new SnapTwoPlayer();
        Snap snap = new Snap();
        boolean noBegin = true;
        while (noBegin) {
            System.out.println("Press 1 to generate a deck.");
            String generate = scanner.nextLine();
            if (generate.equals("1")) {
                snap.makeDeck();
                System.out.println(snap.getDeck());
                noBegin = false;
            } else {
                System.out.println("Incorrect character, try again!");
            }
        }

        boolean noGame = true;
        while (noGame) {
            System.out.println("Options:\nPress 1 to shuffle deck.\nPress 2 to sort cards by value.\nPress 3 to sort cards by suit.\nPress 4 to play a single player game of snap.\nPress 5 to play a two player game of snap.");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println(snap.shuffleDeck());
            } else if (input.equals("2")) {
                System.out.println(snap.sortCardsByValue());
            } else if (input.equals("3")) {
                System.out.println(snap.sortCardsBySuit());
            } else if (input.equals("4")) {
                noGame = false;
                snap.playGame();
                noGame = true;
            } else if (input.equals("5")) {
                noGame = false;
                snap2.playGame();
                noGame = true;
            } else System.out.println("Please enter a number between 1 and 5.");
        }
    }

}


