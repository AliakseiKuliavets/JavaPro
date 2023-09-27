package homeWork._21;

import java.util.HashMap;
import java.util.Map;

public class Cards {
    public Map<String, Integer> createCards() {
        Map<String, Integer> cards = new HashMap<>();
        cards.put("SixHearts", 6);
        cards.put("SixClubs", 6);
        cards.put("SixDiamonds", 6);
        cards.put("SixSpades", 6);

        cards.put("SevenHearts",7);
        cards.put("SevenClubs",7);
        cards.put("SevenDiamonds",7);
        cards.put("SevenSpades",7);

        cards.put("EightHearts",8);
        cards.put("EightClubs",8);
        cards.put("EightDiamonds",8);
        cards.put("EightSpades",8);

        cards.put("NineHearts",9);
        cards.put("NineClubs",9);
        cards.put("NineDiamonds",9);
        cards.put("NineSpades",9);

        cards.put("TenHearts",10);
        cards.put("TenClubs",10);
        cards.put("TenDiamonds",10);
        cards.put("TenSpades",10);

        cards.put("JackHearts",8);
        cards.put("JackClubs",8);
        cards.put("JackDiamonds",8);
        cards.put("JackSpades",8);

        cards.put("QueenHearts",9);
        cards.put("QueenClubs",9);
        cards.put("QueenDiamonds",9);
        cards.put("QueenSpades",9);

        cards.put("KingHearts",10);
        cards.put("KingClubs",10);
        cards.put("KingDiamonds",10);
        cards.put("KingSpades",10);

        cards.put("AceHearts",11);
        cards.put("AceClubs",11);
        cards.put("AceDiamonds",11);
        cards.put("AceSpades",11);
        return cards;
    }
}
