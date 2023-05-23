import java.util.Comparator;
    public class SortByValue implements Comparator<Card> {
        @Override
        public int compare(Card left, Card right) {
            return left.getValue()- right.getValue();
        }
    }

