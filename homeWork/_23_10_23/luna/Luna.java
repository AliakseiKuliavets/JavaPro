package homeWork._23_10_23.luna;

import java.util.ArrayList;
import java.util.List;

public class Luna {
    public boolean getCardAccept(String number){
        return cardAccept(number);
    }
    private  boolean cardAccept(String number) {
        if (number.length() != 23) {
            return false;
        }
        List<Integer> newNumberList = lunaMethods(fromStringToListNumber(number));

        int sum = newNumberList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        return sum % 10 == 0;
    }

    private  List<Integer> fromStringToListNumber(String number) {
        List<Integer> integerList = new ArrayList<>(16);
        for (int i = 0; i < 16; i++) {
            char c = number.charAt(i);
            if (Character.isDigit(c)) {
                integerList.add(Character.getNumericValue(c));
            }
        }
        // просто для проверки можно удалить
        System.out.println(integerList);
        return integerList;
    }

    private  List<Integer> lunaMethods(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i += 2) {
            if (integerList.get(i) * 2 > 9) {
                integerList.set(i, (integerList.get(i) * 2) - 9);
            } else {
                integerList.set(i, integerList.get(i) * 2);
            }
        }
        // просто для проверки можно удалить
        System.out.println(integerList + " sum: "+ (integerList.stream().mapToInt(Integer::intValue).sum()));
        return integerList;
    }
}
