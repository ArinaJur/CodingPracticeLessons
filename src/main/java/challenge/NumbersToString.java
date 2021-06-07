package challenge;

import java.util.ArrayList;
import java.util.List;

public class NumbersToString {
//    Написать метод, который принимает на вход числа до 5, и распечатывает эти числа в виде строк:
//
//    Пример: method(3, 5, 2, 1, 0)
//    Распечатать: “three, five, two, one, zero”

    public static void printNumberToWords(int a, int b, int c, int d, int e) {
        StringBuilder stringBuilder = new StringBuilder();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);

        for(Integer element: numbers) {
            if(element == 1) {
                stringBuilder.append("one, ");
            } else if(element == 2) {
                stringBuilder.append("two, ");
            } else if(element == 3) {
                stringBuilder.append("three, ");
            } else if(element == 4) {
                stringBuilder.append("four, ");
            } else if(element == 5) {
                stringBuilder.append("five, ");
            } else if(element == 0) {
                stringBuilder.append("zero, ");
            }
        }

        String result = String.valueOf(stringBuilder);
        result = result.substring(0, result.length() - 2);
        System.out.println(result);

    }

    public static void main(String[] args) {
        printNumberToWords(3, 5, 2, 1, 0);
    }
}
