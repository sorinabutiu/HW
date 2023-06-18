package ex2;

public class Card extends Hand{
    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;


    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        isFaceUp = true;
    }

    public String getSuit(){
        return suit.printSuit();
    }

    public int getRank(){
        return rank.getRank();
    }

    public String toString() {
        String str = "";
        if (isFaceUp) {
            str += rank.printRank() + " of " + suit.printSuit();
            return str;
        }
        return str;
    }
    }

