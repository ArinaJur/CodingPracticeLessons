package challenge;

import java.util.ArrayList;
import java.util.List;

public class PracticeJun8th {

//    Число делится на 6 только в случае соблюдения двух условий:

//    последняя его цифра четная,
//    а сумма всех цифр делится на 3.

//    Напишите метод isDivisibleBy6(int number), который возвращает
//    «Число number делится на 6» или «Число number неделимо на 6»
//    в зависимости от того, можно ли его разделить на 6.
//    В качестве аргумента может быть передано любое целое число.

//-2147483648 - min int 2147483647

    public static boolean isDivisibleBy6Boolean(int number) {
        //перевели number в тип String
        String numberString = String.valueOf(number);
        int sumOfAllDigits = 0;

        for(int i = 0; i < numberString.length(); i ++) {
            sumOfAllDigits += ((int) numberString.charAt(i) - 48);
        }

        //считаем количество разрядов в number
        //int digitsCount = numberString.length();

        //0 ... 2147483647 - как минимум одна последняя цифра должна быть,
        // поэтому мы легко вычисляем lastNumber
        //int lastNumber = number % 10;
        int lastNumber = (int)numberString.charAt(numberString.length() - 1) - 48;

        if (lastNumber % 2 == 0 && sumOfAllDigits % 3 == 0) {
            //we can reach this point only if lastNumber is even
            System.out.println("Число number делится на 6");
            return true;
        }
        //next step if lastNumber is not even
        System.out.println("Число number неделимо на 6");

        return false;
    }

    public static String isDivisibleBy6String(int number) {
        int sumOfAllDigits = 0;
        int lastDigit;

        //i = 0, int number = 2147483646;
        //i == 1, int newNumber = 214748364;

        for (int i = number; i > 0; i = i / 10) {
            lastDigit = i % 10;
            sumOfAllDigits += lastDigit;
        }

        if ((number % 10) % 2 == 0 && sumOfAllDigits % 3 == 0) {
            //we can reach this point only if lastNumber is even
            return "Число number делится на 6";
        }
        //next step if lastNumber is not even

        return "Число number неделимо на 6";
    }




    public static void main(String[] args) {
        //положили число в int number

        int number = 2147483646;
        System.out.println(isDivisibleBy6String(number));

//        isDivisibleBy6Boolean(number);
//        System.out.println(number / 6);


        //мы пытаемся избежать длинной проверки на много шагов, чтобы посчитать количество разрядов в числе int
//        if () {
//
//        } else if() {
//
//        } else if() {
//
//        } else if() {
//
//        } else if() {
//
//        }

        //перевели число int в String
        String numberString1 = String.valueOf(number);




        //*************** Необязательные действия!!!*************************
        //создали список, куда мы будем складывать каждую цифру из числа number
        List<Character> digits = new ArrayList<>();

        // прошли циклом for по строке numberString и методом charAt() взяли каждую БУКВУ и положили буквы в List digits
        for (int i = 0; i < numberString1.length(); i++) {
            digits.add(numberString1.charAt(i));
        }

        //как перевести строку в array
        numberString1.toCharArray();
        //***********************************************************************


        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Эту часть нужно знать !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //перевели число int в String
        String numberString = String.valueOf(number);

        //мы берем конкретную БУКВУ(цифра в виде буквы) по ее индексу в строке numberString
        numberString.charAt(0); // --> char


        // получаем       char value        цифры 2 (смотрим таблицуASCII и видим, что 2 в char имеет значение 50)
        int number2Integer = Integer.valueOf(numberString.charAt(0));// = 50
        int numberTWOInteger = (int) numberString.charAt(0);// = 50


        //цифра 0 в char имеет значение 48, поэтому любое число (его     int value    ) из char value
        // можно посчитать, отняв 48
        int number2 = number2Integer - 48;

        System.out.println(number2);
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Эту часть нужно знать !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    }
}

// Шаблоны методов
//    public List<String> isDivisibleBy6SList(int number) {
//        List<String> list = new ArrayList<>();
//
//        return list;
//    }
//
//    public int[] isDivisibleBy6SArrayInt(int number) {
//        int[] array = new int[6];
//
//        return array;
//    }
//
//    public String[] isDivisibleBy6SArrayString(int number) {
//        String[] array = new String[6];
//
//        return array;
//    }
