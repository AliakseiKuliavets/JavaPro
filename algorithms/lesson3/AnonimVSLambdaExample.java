package algorithms.lesson3;

public class AnonimVSLambdaExample {
    public static void main(String[] args) {
        Playebale fotboolPlayer = new FotboolPlayer();
        Playebale basketBallPlayer = new BasketBallPlayer();

        fotboolPlayer.play();
        basketBallPlayer.play();

        playAll(fotboolPlayer,basketBallPlayer);
    }

    private static void playAll(Playebale... players) {
        for (Playebale p: players) {
            p.play();
        }
    }
}
