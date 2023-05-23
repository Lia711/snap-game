import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    public ArrayList<Card> cardsArr = new ArrayList<>();

    public void addCard(Card card) {
        cardsArr.add(card);
    }

    public ArrayList<Card> getDeck() {
        return cardsArr;
    }

    public ArrayList<Card>  shuffleDeck() {
        Collections.shuffle(cardsArr);
        return cardsArr;
    }

    public ArrayList<Card> sortCardsByValue() {
        Collections.sort(cardsArr, new SortByValue());
        return cardsArr;
    }

    public ArrayList<Card> sortCardsBySuit() {
        Collections.sort(cardsArr, new SortBySuit());
        return cardsArr;
    }

    public Card dealCard() {
        Card dealtCard = cardsArr.get(cardsArr.size()-1);
        cardsArr.remove(dealtCard);
        return dealtCard;
    }


}
