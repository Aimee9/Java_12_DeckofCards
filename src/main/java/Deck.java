import java.util.ArrayList;
import java.util.Random;

class Deck {
  private static final String[] SUITS = {"Hearts", "Spades", "Diamonds", "Clubs"};
  private static final String[] VALUES = {"Ace", "Two", "Three", "Four", "Five", "Six",
                            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

private ArrayList<Card> mCard;

public Deck() {
    mCard = new ArrayList<Card>();
     for (String suit : SUITS) {
       for (String value : VALUES) {
         Card newCard = new Card(suit, value);
         mCard.add(newCard);
       }
     }
   }

   public Card makeRandomCard(){
     Random myRandomGenerator = new Random();
     Integer randomCardIndex = myRandomGenerator.nextInt(51);
     Card randomCard = mCard.get(randomCardIndex);
     return randomCard;
   }
}
