import java.util.ArrayList;

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
}
