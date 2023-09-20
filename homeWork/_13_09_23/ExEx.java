package homeWork._13_09_23;

import java.util.List;

public class ExEx {
    //Уровень сложности 5 из 10:

    //Найти сумму всех элементов ArrayList<Integer>.
    public int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }
    //Найти среднее значение элементов LinkedList<Integer>.
    public int getAvg(List<Integer> list) {
        int count = 0;
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
            count++;
        }
        return sum / count;
    }
    // Перебрать ArrayList<String> и вывести все элементы на экран.
    public void getSome(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
    //Перебрать LinkedList<String> и найти самую длинную строку.
    public String getSomeLong(List<String> list) {
        String word = null;
        int max = 0;
        for (String s : list) {
            if (s.length() > max) {
                word = s;
            }
        }
        return word;
    }
    //Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    public void getHouse5by10(List<House> list) {
        for (House house: list) {
            System.out.println(house);
        }
    }

    // Уровень сложности 6 из 10:

    //Перебрать ArrayList<Integer> и найти наименьший элемент.
    public int getIntegerMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }
    //Перебрать LinkedList<Integer> и найти наибольший элемент.
    public int getIntegerMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }
    //Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
    public int getWordStartWidthLeter(List<String> list, String letter) {
        int count = 0;
        for (String s : list) {
            if (s.startsWith(letter)){
                count++;
            }
        }
        return count;
    }
    //Перебрать LinkedList<String> и найти первое вхождение определенной строки.
    public void getFirstInputText(List<String> list, String myString) {
        for (String s : list) {
            if (s.equals(myString)){
                System.out.println(s);
                break;
            }
        }
    }
    //Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
    public void returnClearObject(List<House> list, String myString) {
        for (int i = list.size() - 1; i >= 0; i--) {
            House house = list.get(i);
            if (myString.equals(house.getCity())) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
