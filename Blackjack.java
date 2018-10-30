import java.util.*;//import scanner
import java.io.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;//create arraylist for user
  ArrayList<Card> compHand;//arraylist for dealer

  public Blackjack() {
    d = new Deck(); //
    userHand = new ArrayList<Card>();
    compHand = new ArrayList<Card>();

  }

  public Integer calculateHand(ArrayList<Card> h) { //calculate the value of cards
    int tol = 0;
    int x = 0;
    for (int i = 0; i < h.size(); i ++) {
      if ((h.get(i).getValue() == 11) || (h.get(i).getValue() == 12) || (h.get(i).getValue() == 13)) { // when it's J, Q or K
        x = 10;
      }
      else if (h.get(i).getValue() == 1) { // when it's A
        x = 11;
      }
      else{ // when it's other numbers
        x = h.get(i).getValue();
      }
      tol = tol + x;
    }
    return tol;

  }

  public String cardNames (ArrayList<Card> hand) { // create a method for the name of the card, so it can be easily printed out later
    String cardname = "";
    for (int i = 0; i < hand.size (); i++) {
      cardname = cardname + hand.get(i).getName()+ " ";
    }
    return cardname;
  }



  public static void main(String[] args) { //main method

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Welcome my good fellow, let's play some blackjack."); //welcome user
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    Blackjack b = new Blackjack();
    while(true){ //create an infinte loop
      b.d.reset(); //reset the deck
      b.d.shuffle(); //shuffle the deck
      boolean playGame = true;
      boolean busted = false;

      b.userHand.add(b.d.drawCard()); // 2 cards for user
      b.userHand.add(b.d.drawCard());
      b.compHand.add(b.d.drawCard()); // 2 cards for dealer
      b.compHand.add(b.d.drawCard());

        System.out.println("\nMay the odds be ever in your favor....and here are your cards!");
        System.out.println(b.cardNames(b.userHand));
        System.out.println("and the total value of these card is: ");
        System.out.println(b.calculateHand(b.userHand));

        if (b.calculateHand (b.userHand) == 21) { //if the user already has 21 at this point, the user wins
          System.out.println ("\nJeez, what are the odds? You won!");
          break;
        }
        else if (b.calculateHand (b.userHand) > 21) { // if the user already has more than 21, the user loses
          System.out.println ("\nUh-oh, you are busted!");
          break;
        }
          System.out.println("\nThis is what the dealer has: " + b.compHand.get(1).getName());
          int value = b.calculateHand (b.compHand); // calculate the value of the dealer's cards

           while (playGame) {
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println("\nWhat do you want to do now?\n 1. Hit (Draw another card)\n 2. Stay(Do nothing)\n 3. Quit\n");
             Scanner In1 = new Scanner(System.in); // scanner for 1, 2, or 3
             String answer = In1.nextLine();
             if (answer.equals("1")) { //if user wants to hit
               b.userHand.add(b.d.drawCard ()); //give the user another card
               System.out.println("Your new card is " + b.userHand.get(b.userHand.size()-1).getName());
               System.out.println("Here is your new hand:");
               b.cardNames(b.userHand);
               System.out.println("Total value: " + b.calculateHand(b.userHand));
               //check again if the user had already won/lose
               if (b.calculateHand (b.userHand) == 21) {
                 System.out.println ("\nJeez, what are the odds? You won!");
                 System.exit(0);
               }
               else if (b.calculateHand (b.userHand) > 21) {
                 System.out.println ("\nUh-oh, you are busted!");
                 System.exit(0);
               }
             }

             else if (answer.equals("2")) { //if user wants to stay
               System.out.println("The dealer has "); //show what dealer has
               for (int i = 0; i < b.compHand.size(); i++) {
                 System.out.println (b.compHand.get(i).getName());
               }
               System.out.print ("And his total value is ");
               System.out.println(b.calculateHand (b.compHand)); //calculate total value of dealer

               if (b.calculateHand(b.compHand) == 21) { //if dealer has 21 he wins
                 System.out.println("The dealer has 21! You lose ;)");
                 busted = true;
                 break;
               }

              if (b.calculateHand(b.compHand) > 21) { //if dealer has more than 21 he loses
                 System.out.println("The dealer has more than 21! You win :D");
                 busted = true;
                 break;
               }
              else if ((b.calculateHand(b.compHand) >= 17) && (b.calculateHand(b.compHand) < 21)){ // dealer has more than 17 and less than 21, he doesn't do anything
                System.out.println("The dealer stays.");
                break;
              }
              else{
                break;
              }
      }
      else if (answer.equals("3")){
        System.out.println("KBye");
        busted = true;
        System.exit(0);
      }

  }//playGame

  if (busted == false) { // if the user didn't go over 21, start this for the dealer
    while (b.calculateHand(b.compHand) <= 16) { // if dealer has less than 16, need more card
    b.compHand.add(b.d.drawCard());
    System.out.println("The dealer's new card is: " + b.compHand.get(b.compHand.size()-1).getName());
    System.out.println("His value is: ");
    System.out.println(b.calculateHand (b.compHand));

    if (b.calculateHand(b.compHand) > 21) { // if the dealer has more than 21, he lose
      System.out.println("Dealer has more than 21! You win!");
      busted = true;
    }

    if (b.calculateHand(b.compHand) == 21) { // if the dealer has exactly 21, he wins
      System.out.println("Dealer has 21! He wins.");
      busted = true;
    }

    else if ((b.calculateHand(b.compHand) >= 17) && (b.calculateHand(b.compHand) < 21)){ //dealer doesn't need to do anything
      System.out.println("The dealer stays");
    }
  }

    if ((b.calculateHand(b.userHand) <= b.calculateHand(b.compHand)) && (b.calculateHand(b.compHand) <= 21)) { // if user is smaller than dealer and dealer has less than 21
      System.out.println("Uh-oh, you lose!");
    }
    else if (b.calculateHand(b.userHand) > b.calculateHand(b.compHand)) { //if user is bigger than dealer
      System.out.println("Yes! You win!");
      }

  }

    }// while
  } // main

}
