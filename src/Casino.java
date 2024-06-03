import org.w3c.dom.css.Counter;

import javax.smartcardio.Card;
import java.sql.SQLOutput;
import java.util.Collections;

public class Casino {

    public int dealCounter=0;
    //public Cards aceHearts;
    public Cards[] Deck;
    public int counter;
    public Cards parkinglot;
    public int randInt;
    public Player[] players;
    public Player dealer;

    public static void main(String[] args) {
        Casino vegas = new Casino();
        System.out.println("welcome to Vegas");

    }

    public Casino() {

        //aceHearts = new Card(1,1);
        //aceHearts.printInfo();

        Deck = new Cards[52];
        for (int k = 0; k < 4; k = k + 1) {
            for (int i = 1; i < 14; i = i + 1) {
                Deck[counter] = new Cards(i, k);
                counter = counter + 1;
            }
        }


        System.out.println("Our OG deck");
        for (int x = 0; x < 52; x = x + 1) {
            Deck[x].printInfo();
        }
        System.out.println("Our Shuffled Deck");
        shuffle();
        for (int x = 0; x < 52; x = x + 1) {
            Deck[x].printInfo();
        }
        dealer = new Player(0, "dealer");
        players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i + 1, "");
        }


        deal();
        dealer.printInfo();

        // Print each player's hand
        for (int i = 0; i < players.length; i++) {
            players[i].printInfo();
        }
    }

        public void shuffle(){
            parkinglot=Deck[0];
        Deck[0]=Deck[1];
        Deck[1]=parkinglot;
        for(int i=0 ; i <52; i=i+1) {
            randInt= (int) (Math.random()* (52));
            parkinglot = Deck[i];
            Deck[i] = Deck[randInt];
            Deck[randInt] = parkinglot;

        }
    }
    public void deal() {
        // Deal two cards to the dealer
        dealer.hand[0] = Deck[dealCounter];
        dealCounter=dealCounter+1;
        dealer.hand[1] = Deck[dealCounter+1];
        dealCounter=dealCounter+1;

        // Deal two cards to each player
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].hand.length; j++) {
                players[i].hand[j] = Deck[dealCounter];
                dealCounter=dealCounter+1;
            }
        }
    }

}