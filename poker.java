public class poker{

  public Deck shuffle(Deck d){
		for( int k = size - 1; k >= 0; k-- ) {
            int r = (int)(Math.random() * k);
            Card tmp = Deck.get(r);
            Deck.set(r, Deck.get(k));
            Deck.set(k, tmp);
        }
  }


  public static void main(String[] args) {
    Deck d = new Deck();



  }
}
