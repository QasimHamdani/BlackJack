import org.w3c.dom.css.Counter;

import javax.smartcardio.Card;
import java.sql.SQLOutput;
import java.util.Collections;

public class Casino {
    //public Cards aceHearts;
    public Cards[] Deck;
    public int counter;
    public Cards parkinglot;

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


        System.out.println("Out OG deck");
        for (int x = 0; x < 52; x = x + 1) {
            Deck[x].printInfo();
        }
        System.out.println("Our Shuffled Deck");
        shuffle();
        for (int x = 0; x < 52; x = x + 1) {
            Deck[x].printInfo();
        }
    }
        public void shuffle(){
            parkinglot=Deck[0];
        Deck[0]=Deck[1];
        Deck[1]=parkinglot;
        for(int i = 51; i > 0; i=i-1) {
            

        }
    }



}