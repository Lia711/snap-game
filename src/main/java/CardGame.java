import java.util.ArrayList;
import java.util.Arrays;

public class CardGame {
    public ArrayList<Card> cardsArr = new ArrayList<>();

    public void addCard(Card card) {
        cardsArr.add(card);

    }

    public ArrayList<Card> getDeck() {
        return cardsArr;
    }
}
