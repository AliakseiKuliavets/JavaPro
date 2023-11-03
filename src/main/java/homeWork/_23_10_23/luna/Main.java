package homeWork._23_10_23.luna;

public class Main {
    public static void main(String[] args) {
        CardGenerate cardGenerate = new CardGenerate();
        String number = cardGenerate.returnNumberCard();
        System.out.println(number);
        Luna luna = new Luna();

        System.out.println(luna.getCardAccept(number) ? "Карта принята " : "Плохая карта нужна другая ");
    }
}
