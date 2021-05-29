package challenge;

import java.util.ArrayList;
import java.util.List;

public class RecordingChallenge2 {

    //Написать метод, который принимает массив двузначных чисел и возвращает числа,
    // сумма цифр которых кратна двум.
    //Пример: {45,  34, 25, 68, 91}
    //Возвращает: (68, 91),  тк 6+8 = 14 % 2 == 0  и тд

    public static List<Integer> returnListEvenNumbers(int[] array) {
        List<Integer> list = new ArrayList<>();

        for(int number: array) {
            int firstNumber =  number/ 10;
            int secondNumber = number % 10;

            if ((firstNumber + secondNumber) % 2 == 0) {
                list.add(number);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        System.out.println(1234 / 1000);
        System.out.println(1234 / 100 % 10);
        System.out.println(1234 / 10 % 10);
        System.out.println(1234 % 10);

        int[] array = {45,  34, 25, 68, 91};

        System.out.println(returnListEvenNumbers(array));


    }
}
