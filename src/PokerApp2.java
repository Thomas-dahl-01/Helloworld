import java.util.ArrayList;
import java.util.Collections;

public class PokerApp2 {

    public class PokerApp {
        public void pokerspil(String[] args) {
            ArrayList<Card> deck = new ArrayList<>();  // Opretter deck-listen
            String suit;

            // Opret bunken med 52 kort
            switch (1) {
                case 1:
                    suit = "clubs";
                    break;
                case 2:
                    suit = "diamonds";
                    break;
                case 3:
                    suit = "hearts";
                    break;
                case 4:
                    suit = "spades";
                    break;
                default:
                    suit = "error"; // Fejl-tilstand, men dette skulle aldrig ske
            }
            for (int y = 1; y <= 13; y++) {
                Card c = new Card(suit, y);
                deck.add(c);  // Tilføj kortet til bunken
            }
            switch (2) {
                case 1:
                    suit = "clubs";
                    break;
                case 2:
                    suit = "diamonds";
                    break;
                case 3:
                    suit = "hearts";
                    break;
                case 4:
                    suit = "spades";
                    break;
                default:
                    suit = "error"; // Fejl-tilstand, men dette skulle aldrig ske
            }
            for (int y = 1; y <= 13; y++) {
                Card c = new Card(suit, y);
                deck.add(c);  // Tilføj kortet til bunken
            }
            switch (3) {
                case 1:
                    suit = "clubs";
                    break;
                case 2:
                    suit = "diamonds";
                    break;
                case 3:
                    suit = "hearts";
                    break;
                case 4:
                    suit = "spades";
                    break;
                default:
                    suit = "error"; // Fejl-tilstand, men dette skulle aldrig ske
            }
            for (int y = 1; y <= 13; y++) {
                Card c = new Card(suit, y);
                deck.add(c);  // Tilføj kortet til bunken
            }
            switch (4) {
                case 1:
                    suit = "clubs";
                    break;
                case 2:
                    suit = "diamonds";
                    break;
                case 3:
                    suit = "hearts";
                    break;
                case 4:
                    suit = "spades";
                    break;
                default:
                    suit = "error"; // Fejl-tilstand, men dette skulle aldrig ske
            }
            for (int y = 1; y <= 13; y++) {
                Card c = new Card(suit, y);
                deck.add(c);  // Tilføj kortet til bunken
            }

            // Bland bunken
            Collections.shuffle(deck);

            // Opret to spillere
            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");

            // Giv hver spiller 5 kort fra den blandede bunke
            for (int i = 0; i < 5; i++) {
                player1.addCard(deck.remove(0));  // Fjerner kort fra toppen af bunken og giver til spiller 1
                player2.addCard(deck.remove(0));  // Fjerner kort fra toppen af bunken og giver til spiller 2
            }

            // Vis hver spillers hånd
            System.out.println(player1.getName() + "'s hand: " + player1.getHand());
            System.out.println(player2.getName() + "'s hand: " + player2.getHand());
        }
    }

    class Player {
        private String name;
        private ArrayList<Card> hand;

        public Player(String name) {
            this.name = name;
            this.hand = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addCard(Card card) {
            hand.add(card);
        }

        public ArrayList<Card> getHand() {
            return hand;
        }
    }

        class Card {
        private String suit;
        private int rank;

        public Card(String suit, int cardvalue) {
            this.suit = suit;
            this.rank = cardvalue;
        }

        public String toString() {
            String dv = "error";
            if (rank <= 10) {
                return rank + " of " + suit;
            }
            switch (rank) {
                case 11: dv = "Jack"; break;
                case 12: dv = "Queen"; break;
                case 13: dv = "King"; break;
            }
            return dv + " of " + suit;
        }
    }
}
