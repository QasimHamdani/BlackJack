import java.lang.reflect.Constructor;

public class Cards {
    public int cardNum, suitNum, cardValue;
    public String suitName, cardName;

    //Constructor
    //two parameters Card Num and Suit Num
    //if statementsassign card name and suit name based on their nums
    //suit num 0=spade, 1=heart, 2=clubs, 3=dimaonds

    public Cards(int pCardNum, int pSuitNum) {
        cardNum = pCardNum;
        suitNum = pSuitNum;
        if (suitNum == 0) {
            suitName = "Spades";
        }
        if (suitNum == 1) {
            suitName = "Hearts";
        }
        if (suitNum == 2) {
            suitName = "Clubs";
        }
        if (suitNum == 3) {
            suitName = "Diamonds";
        }

            if (cardNum > 1 && cardNum < 11) {
                cardName = Integer.toString(cardNum);
            }
            if (cardNum==1){
                cardName = "Ace";
            }
            if (cardNum==11){
                cardName="Jack";
            }
            if (cardNum==12){
                cardName="Queen";
            }
            if (cardNum==13){
                cardName="King";
            }

        }

    public void printInfo(){
        System.out.println(cardName + " of " + suitName);

    }
}
