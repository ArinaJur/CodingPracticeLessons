package challenge;

import java.util.ArrayList;
import java.util.List;

public class DidTogether {

    //Написать метод, который возвращает true, если массив - возрастающая последовательность чисел.
//    Иначе, возвращает false
//    Пример:
//    {1, 6, 9, 12} —> true
//    {1, 8, 10, 1, 20} —> false
    public static boolean isAscendingSequence(int[] array) {
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] < array[i + 1]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean isAscendingSequence1 (int[] array) {
        boolean isTrue = false;
        for (int i = 0; i < array.length - 1; i ++) {
            if (array[i] < array[i + 1]) {
                isTrue = true;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean isAscendingSequence3 (int[] array) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    //    Написать метод, который возвращает true,  если в массиве есть
//    хотя бы одно число, которое делится на 2,  3,  4 и  6 .
//    Если же в массиве есть хотя бы одно нечетное число, метод возвращает false
//
//    Пример:
//    {2, 6, 8, 12} —> true
//    {32, 8, 10, 31, 20, 7} —> false
    public static boolean isTrue(int[] array) {
        for (int element: array) {
            if (element % 2 == 0) {
                if (element % 12 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    //    Написать метод, который принимает на вход числа до 5, и распечатывает эти числа в виде строк:
//
//    Пример: method(3, 5, 2, 1, 0)
//    Распечатать: "three, five, two, one, zero"
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

        int[] array = {2, 6, 8, 12};
        int[] array1 = {32, 8, 10, 31, 20, 7};
        System.out.println(isTrue(array));
        System.out.println(isTrue(array1));

        int[] array2 = {1, 6, 9, 12};
        int[] array3 = {1, 8, 10, 1, 20};
        //System.out.println(isAscendingSequence1(array2));
        System.out.println(isAscendingSequence3(array3));

        printNumberToWords(3, 5, 2, 1, 0);
    }
}
