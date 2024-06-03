public class Player {
    public int playerNum;
    public String playerName;
    public int handSize;
    public Cards[] hand;


    public Player(int pPlayerNum) {
        playerNum = pPlayerNum;
        playerName = "Player " + pPlayerNum;
        hand = new Cards[2]; // Assuming each player gets 2 cards
    }

    public Player(int pPlayerNum, String pPlayerName) {
        playerNum = pPlayerNum;
        playerName = pPlayerName;
        hand = new Cards[2];
    }


    public void printInfo() {
        System.out.println("Player Number " + playerNum + " (" + playerName + ")");;

        for (int i = 0; i < hand.length; i++) {
            hand[i].printInfo();
        }
    }
}
