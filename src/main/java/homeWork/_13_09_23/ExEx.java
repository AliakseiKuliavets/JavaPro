package homeWork._13_09_23;

import java.util.*;

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
        for (House house : list) {
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
            if (s.startsWith(letter)) {
                count++;
            }
        }
        return count;
    }

    //Перебрать LinkedList<String> и найти первое вхождение определенной строки.
    public void getFirstInputText(List<String> list, String myString) {
        for (String s : list) {
            if (s.equals(myString)) {
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

    //Уровень сложности 7 из 10:

    //Перебрать ArrayList<Integer> и удалить все четные числа.
    public void getOddInteger(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }

    //Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
    public void getConvertTreeToZero(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 3 == 0) {
                integer = 0;
                System.out.println(integer);
            } else {
                System.out.println(integer);
            }
        }
    }

    //Перебрать ArrayList<String> и объединить все элементы в одну строку.
    public void convertInOneString(List<String> list) {
        for (String s : list) {
            System.out.print(s);
        }
    }

    //Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
    public void deleteStringIfHaveThatString(List<String> list, String myString) {
        list.removeIf(str -> str.contains(myString));
        System.out.println(list);
    }

    //Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
    public void listConditions(List<House> list, String myString) {
        for (int i = list.size() - 1; i >= 0; i--) {
            House house = list.get(i);
            if (myString.equals(house.getCity())) {
                System.out.println(list.get(i));
            }
        }
    }

    // Уровень сложности 8 из 10:
    //Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
    public void getSquareInteger(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer * integer);
        }
    }

    // Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
    public int getMultiplyingAllNumbers(List<Integer> list) {
        int mult = 1;
        for (Integer integer : list) {
            mult = mult * integer;
        }
        return mult;
    }

    //Перебрать ArrayList<String> и найти самую короткую строку.
    public String getShortString(List<String> list) {
        int lenght = Integer.MAX_VALUE;
        String shortString = null;
        for (String s : list) {
            if (s.length() < lenght) {
                lenght = s.length();
                shortString = s;
            }
        }
        return shortString;
    }

    // Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
    public void replaceVowels(List<String> list) {
        for (String s : list) {
            StringBuilder result = new StringBuilder();
            for (char c : s.toCharArray()) {
                if ("AEIOUaeiou".contains(String.valueOf(c))) {
                    result.append('*');
                } else {
                    result.append(c);
                }
            }
            System.out.println(result);
        }
    }

    // Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
    public void sortInDescendingOrder(List<House> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    //Уровень сложности 9 из 10:
    //Перебрать ArrayList<Integer> и найти второй по величине элемент.
    public int getNextTheBigersNumber(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > secondMax && integer < max) {
                secondMax = integer;
            }
        }
        return secondMax;
    }

    //Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
    public void getReverseOrder(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    //Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
    public void containOnlyLetters(List<String> list) {
        for (String s : list) {
            boolean containsOnlyLetters = true;
            for (char c : s.toCharArray()) {
                if (!Character.isLetter(c)) {
                    containsOnlyLetters = false;
                    break;
                }
            }
            if (containsOnlyLetters) {
                System.out.println(s);
            }
        }
    }

    //Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
    public String longestStringNotContainingSpaces(List<String> list) {
        int maxLength = Integer.MIN_VALUE;
        String stringMaxLenght = null;
        for (String s : list) {
            if (!s.contains(" ")) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    stringMaxLenght = s;
                }
            }
        }
        return stringMaxLenght;
    }

    //Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
    public void filterOnlyUniqueElements(List<House> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean isDuplicate = false;
            for (int j = i; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                list.remove(i);
                i--;
            }
        }
        for (House house : list) {
            System.out.println(house);
        }
    }

    //Уровень сложности 10 из 10:
    //Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
    public void largestIncreasingSequenceOfElements(List<Integer> list) {
        List<Integer> newListLong = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();


        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i-1)) {
                newList.add(list.get(i));
            } else {
                newList = new ArrayList<>();
                newList.add(list.get(i));
            }
            if (newList.size() > newListLong.size()) {
                newListLong = new ArrayList<>(newList);
            }
        }
        for (Integer num : newListLong) {
            System.out.print(num + " ");
        }
    }
    //Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
    public int[] removeAllDuplicateElements(List<Integer> list) {
        HashSet<Integer> uniqueSet = new HashSet<>(list);

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (Integer num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

}
