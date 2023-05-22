public enum Values {
    _2("2", 2), _3("3", 3), _4("4", 4), _5("5", 5), _6("6", 6), _7("7", 7), _8("8", 8), _9("9", 9), _10("10", 10), _11("J", 11), _12("Q", 12), _13("K", 13), _14("A", 14);

    private String symbol;
    private int value;

    Values(String symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }


}
