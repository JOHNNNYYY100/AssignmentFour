package assign3;

import java.util.Random;


/*
 * For resource management purposes, instead of allocating and deallocating memory constantly (an
 * expensive operation), we use the same 52 cards and keep them in memory.
 *
 * This class holds 52 cards and when asked, returns one at random. No card is ever removed
 * from the Deck, so you may receive the same card on subsequent calls.
 */
public class Deck {

    Card[] deck;
    Random random;

    public Deck() {
        random = new Random();
        deck = new Card[52];
        int count = 0;
        for(int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j ++) {
                deck[count++]= new Card(i,j);
            }
        }
    }

    public Card dealCard() {
        return deck[random.nextInt(52)];
    }

}
