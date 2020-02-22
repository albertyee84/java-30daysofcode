import java.util.Random;

public class CoinToss {

    public String tossACoin(){
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        String result;
        if(toss == 1){
            result = "Heads";
        } else {
            result = "Tails";
        }
        return result;
    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
}