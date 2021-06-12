import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //FizzBuzz

    //Print integers 1 to N,  N < 100,
    // but
    // print “Fizz” if an integer is divisible by 3,
    // “Buzz” if an integer is divisible by 5,
    // and “FizzBuzz” if an integer is divisible by both 3 and 5.

    public List<String> fizzBuzzList(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < n; i ++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }

    //FizzBuzzWoof

    //Print integers 1 to N, N < 100
    // but print:
    // “Fizz” if an integer is divisible by 3
    // “Fizz” if an integer contains 3,
    // “Buzz” if an integer is divisible by 5
    // “Buzz” if an integer contains 5,
    // “Woof” if an integer is divisible by 7
    // “Woof” if an integer contains 7
    
    //Fizz Buzz Woof: одна вариация расширилась до такой степени, 
    //что получила собственное имя. 
    //В этом случае число 3 становится Fizz, 
    //5 становится Buzz, 
    //а 7 становится Woof. 
    //Основные правила в этой игре: любое число, 
    //которое содержит число или делится на это число, заменяется вхождением слова. 
    //Если число имеет 2 экземпляра этого числа (т. Е. 33 или 55) и делится на это число, 
    //то слово произносится в этом примере три раза.

    public static String fizzBuzzWoof(int n) {
        String result = "";

        for (int i = 1; i < n; i ++) {
            int c = 0;

            if (i % 3 == 0) {
                result += "Fizz";
                c++;
            }
            if (i % 10 == 3) { //3, 13, 23, 33, 43...
                result += "Fizz";
                c++;
            }

            if (i / 10 % 10 == 3) { //30, 31, 32, 33, ... 39
                result += "Fizz";
                c++;
            }

            if (i % 5 == 0) {
                result += "Buzz";
                c++;
            }
            if (i % 10 == 5) { //5, 15, 25, 35..
                result += "Buzz";
                c++;
            }

            if (i / 10 % 10 == 5) { //50, 51, 52, 53, 54, 55...59
                result += "Buzz";
                c++;
            }

            if (i % 7 == 0) {
                result += "Woof";
                c++;
            }
            if (i % 10 == 7) { //7, 17, 27, 37..
                result += "Woof";
                c++;
            }

            if (i / 10 % 10 == 7) { //70, 71, 72, 73, 74, .. 77, 78, 79
                result += "Woof";
                c++;
            }

            if (c == 0) {
                result += i + ", ";
            } else {
                result += ", ";
            }
        }

        result = result.substring(0, result.length() - 2);
        System.out.println(result);
        
        return result;
    }

    public static void main(String[] args) {
        fizzBuzzWoof(100);
    }
}
