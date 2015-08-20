import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Set;

class Deck {
  private ArrayList<Card> mCard;
  private static final String[] SUITS = {"Hearts", "Spades", "Diamonds", "Clubs"};
  public static HashMap<String, Integer> scores = new HashMap<String, Integer>();


public Deck() {

  mCard = new ArrayList<Card>();

    //scores is a hashmap!
    scores.put("Ace", 1);
    scores.put("Two", 2);
    scores.put("Three", 3);
    scores.put("Four", 4);
    scores.put("Five", 5);
    scores.put("Six", 6);
    scores.put("Seven", 7);
    scores.put("Eight", 8);
    scores.put("Nine", 9);
    scores.put("Ten", 10);
    scores.put("Jack", 11);
    scores.put("Queen", 12);
    scores.put("King", 13);


    Set <String> values = scores.keySet();
     for (String suit : SUITS) {
       for (String value : values) {
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
