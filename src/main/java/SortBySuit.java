import java.util.Comparator;
public class SortBySuit implements Comparator<Card> {
    @Override
    public int compare(Card left, Card right) {
        if (left.getSuit()==right.getSuit()) {
            return left.getValue()- right.getValue();
        } else {
            return left.getSuit().compareTo(right.getSuit());
        }
    }
}