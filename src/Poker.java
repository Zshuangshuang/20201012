import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:14:45
 **/
class Card{
    private String rank;
    private String  suit;
    public Card(String rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }
    public void setRank(){
        this.rank = rank;
    }
    public String  getRank(String rank){
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "["+this.rank+this.suit+"]";
    }
}
public class Poker {

    private static List<Card> makePoker(){
        List<Card> poker = new ArrayList<>();
        String[] suits = {"♥","♣","♦","♠"};
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(""+j,suits[i]));
            }
           poker.add(new Card("J",suits[i]));
            poker.add(new Card("Q",suits[i]));
            poker.add(new Card("K",suits[i]));
            poker.add(new Card("A",suits[i]));

        }
        return poker;
    }
    public static void main(String[] args) {
        List<Card> poker = makePoker();
        Collections.shuffle(poker);
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                List<Card> player = players.get(j);
                player.add(poker.remove(0));
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("玩家"+ i +" :" +players.get(i));
        }
    }

}
