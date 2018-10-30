import java.util.*;

public class Deck {

  ArrayList<Card> cards;
  ArrayList<Card> discard;

  public Card drawCard() {
    Card c = cards.get(0);
    cards.remove(0);
    discard.add(c);
    return c;
  }

  public void reset() {
    cards.addAll(discard);
    discard.clear();
  }

  public void shuffle() {
    Random r = new Random();
    ArrayList<Card> shuffled = new ArrayList<Card>();

    int[] ar = r.ints(5200, 0, 52).distinct().toArray();
    for (int i = 0; i < 52; i ++) {
      shuffled.add(cards.get(ar[i]));
    }
    cards = shuffled;
  }

  public Deck() {
    cards = new ArrayList<Card>();
    discard = new ArrayList<Card>();

    for (int i = 1; i <= 13; i++) {
      for (int j = 1; j <= 4; j++) {
        String num;
        String suit;
        if (i == 11) {
          num = "Jack";
        }
        else if (i == 12) {
          num = "Queen";
        }
        else if (i == 13) {
          num = "King";
        }
        else if (i == 1) {
          num = "Ace";
        }
        else {
          num = Integer.toString(i);
        }
        if (j == 1) {
          suit = "Diamonds";
        }
        else if (j == 2) {
          suit = "Clubs";
        }
        else if (j == 3) {
          suit = "Hearts";
        }
        else {
          suit = "Spades";
        }
        Card c = new Card();
        c.setName(num + " of " + suit);
        c.setValue(i);
        cards.add(c);
      }
    }

  }

}
