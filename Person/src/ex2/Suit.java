package ex2;

public enum Suit {
    HEARTS("hearts"),
    SPADES("spades"),
    DIAMONDS("diamonds"),
    CLUBS("clubs");

    private final String suitText;

    private Suit(String suitText){
        this.suitText=suitText;
    }

    public String printSuit(){
        return suitText;
    }
}
