public class Main {
    public static void main(String[] args) {
        boolean gamePlay = false;
        CardGame game = new CardGame();
        Interaction interaction = new Interaction();
        for (Suits suit : Suits.values()) {
            for (Values value : Values.values()) {
                Card card = new Card(suit.getSuit(), value.getSymbol(), value.getValue());
                game.addCard(card);
            }
        }

        System.out.println("Press 1 to shuffle deck.");
        int number = interaction.readNumber();
        if (number == 1) {
            System.out.println(game.shuffleDeck());
            gamePlay = true;
        }
        while (gamePlay) {
            System.out.println("Press enter to deal card.");
            String input = interaction.readInput();
            if (input.equals("")) {
                System.out.println(game.dealCard());
            }

            //}


            //System.out.println(game.getDeck());
            //System.out.println(game.shuffleDeck());
            //System.out.println(game.sortCardsByValue());
            //System.out.println(game.sortCardsBySuit());
            //System.out.println(game.dealCard());
            //System.out.println(game.returnCard());

        }
    }
}
