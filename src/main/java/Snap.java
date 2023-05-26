import java.util.Scanner;

public class Snap extends CardGame {
    Scanner scanner = new Scanner(System.in);

    public void makeDeck() {
        for (Suits suit : Suits.values()) {
            for (Values value : Values.values()) {
                Card card = new Card(suit.getSuit(), value.getSymbol(), value.getValue());
                addCard(card);
            }
        }
    }

    public void playGame() {
        boolean playAgain = true;
        while (playAgain) {
            boolean gamePlay = false;
            makeDeck();
            boolean noBegin = true;
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
            String currentSuit = "";
            String nextSuit = " ";
            int turnCount = 0;
            while (gamePlay) {
                System.out.println("Press enter to deal card.");
                String input = scanner.nextLine();
                if (input.equals("")) {
                    System.out.println(dealCard());
                    currentSuit = returnSuit();
                    if (currentSuit != nextSuit) {
                        nextSuit = currentSuit;
                        currentSuit = "";
                        turnCount++;
                    } else {
                        System.out.println("Congratulations! You've won after " + turnCount + " rounds.");
                        gamePlay = false;
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
                } else {
                    System.out.println("Incorrect character, try again!");
                }
            }
        }
    }
}
