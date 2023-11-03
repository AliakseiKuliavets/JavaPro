package summarySession.friday061023;

public class AnonimVSLambdaExample {
    public static void main(String[] args) {
        Playebale fotboolPlayer = new FotboolPlayer();
        Playebale basketBallPlayer = new BasketBallPlayer();

        Playebale chessPlayer = new Playebale() {
            @Override
            public void play() {
                System.out.println("Playing Chess");
            }
        };

        fotboolPlayer.play();
        basketBallPlayer.play();

        playAll(fotboolPlayer,basketBallPlayer,chessPlayer);
    }

    private static void playAll(Playebale... players) {
        for (Playebale p: players) {
            p.play();
        }
    }
}
