public class Main {
    public static void main(String[] args) {
        CardGame game = new CardGame();
        for (Suits suit : Suits.values()) {
            for (Values value : Values.values()) {
                Card card = new Card (suit.getSuit(), value.getSymbol(), value.getValue());
                game.addCard(card);
            }
        }
        System.out.println(game.getDeck());
        System.out.println(game.shuffleDeck());
        System.out.println(game.sortCardsByValue());
        System.out.println(game.sortCardsBySuit());

    }
}
