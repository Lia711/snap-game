public enum Suits {
    Hearts("heart"), Clubs("club"), Diamond("diamond"), Spades("spades");

    private String suit;

    Suits(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        String icon="";
        if (suit == "heart") {
            icon = "\u2661";
        } else if (suit == "club") {
            icon = "\u2663";
        } else if (suit == "diamond") {
            icon = "\u2662";
        } else if (suit == "spades") {
            icon = "\u2660";
        } return icon;
    }

}
