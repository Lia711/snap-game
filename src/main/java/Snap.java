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


            boolean noBegin = true;
            while (noBegin) {
                try {
                    System.out.println("Press 1 to shuffle deck.");
                    Scanner myObj2 = new Scanner(System.in);
                    int begin = myObj2.nextInt();
                    if (begin == 1) {
                        System.out.println(shuffleDeck());
                        gamePlay = true;
                        noBegin=false;
                    }

                } catch (Exception e) {
                    System.out.println("You must enter a valid number.");
                }

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
            Scanner myObj5 = new Scanner(System.in);
            int playerAnswer = myObj5.nextInt();
            if (playerAnswer==1) {
                playAgain=true;
            } else if (playerAnswer==2){
                playAgain=false;
            }

        }

}
}
