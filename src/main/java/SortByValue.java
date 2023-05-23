import java.util.Comparator;
    public class SortByValue implements Comparator<Card> {
        @Override
        public int compare(Card left, Card right) {
            if (left.getValue()== right.getValue()) {
                return left.getSuit().compareTo(right.getSuit());
            } else {
                return left.getValue()- right.getValue();
            }
        }
    }

