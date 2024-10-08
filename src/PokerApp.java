import java.util.ArrayList;

public class PokerApp {
    public static void main(String[] args) {
        ArrayList<Card> deck=new ArrayList<>();
        String suit="error";
        int cardvalue;
        for (int x=1; x<=4; x++){
            switch (x){
                case 1: suit="clubs"; break;
                case 2: suit="diamonds"; break;
                case 3: suit="hearts"; break;
                case 4: suit="spades"; break;
            }
            for (int y=1; y<=13; y++) {
                Card c = new Card(suit, y);
                System.out.println(c);

            }
        }


    }
}

class Player{
    String name;
    String name2;

}
class Card{
    String suit;
    int rank;
public Card(String suit,int cardvalue){
    this.suit=suit;
    this.rank=cardvalue;
//    System.out.println(suit+" "+rank);

}
public String toString(){
    String dv="error";
    if (rank<11) {
    return rank+" of "+suit;

    }
    switch(rank){
        case 11:
            dv="Knight"; break;
        case 12:
            dv="Queen"; break;
        case 13:
            dv="King"; break;
    }
    return dv+" of "+suit;
}

}
