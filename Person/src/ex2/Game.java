package ex2;

public class Game extends Hand{
    public static void main(String [] args){

        Deck d1=new Deck();
        d1.populate();
        System.out.println("The cards of the deck: " + d1.showHand());
    }
}
