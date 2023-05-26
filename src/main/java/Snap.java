import java.util.Scanner;
public class Snap extends CardGame {

    public void makeDeck() {
        for (Suits suit : Suits.values()) {
            for (Values value : Values.values()) {
                Card card = new Card(suit.getSuit(), value.getSymbol(), value.getValue());
                addCard(card);
            }
        }
    }

    public void playGame() throws Exception {
        boolean playAgain = true;
        while (playAgain) {
            boolean gamePlay = false;
            makeDeck();

            System.out.println("Press 1 to shuffle deck.");
            Scanner myObj = new Scanner(System.in);
            int number = myObj.nextInt();
            if (number == 1) {
                System.out.println(shuffleDeck());
                gamePlay = true;
            }
            String currentSuit = "";
            String nextSuit = " ";
            int turnCount = 0;
            while (gamePlay) {
                System.out.println("Press enter to deal card.");
                Scanner myObj2 = new Scanner(System.in);
                String input = myObj2.nextLine();
                if (input.equals("")) {
                    System.out.println(dealCard());
                    currentSuit= returnSuit();
                    if (currentSuit!=nextSuit) {
                        nextSuit=currentSuit;
                        currentSuit="";
                        turnCount++;
                    } else {
                        System.out.println("Congratulations! You've won after " + turnCount + " rounds.");
                        gamePlay=false;
                    }
                }

            }
            System.out.println("Press 1 to play again. Press 2 to go back to main menu.");
            int playerAnswer = myObj.nextInt();
            if (playerAnswer==1) {
                playAgain=true;
            } else if (playerAnswer==2){
                playAgain=false;
            }

        }

}
}
