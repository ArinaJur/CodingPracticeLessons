package print;

public class AscSeqNumbers {
    // 1. Print 1, 2, 3, 4, 5
    // Идеи:
    // конкатенация (а + b), печать строки ("1, 2..."), печать массива

    //If 1000? if 1000000?
    //for
    //
    //for c параметрами
    //особое условие для 5 - if
    //_______________________________________________________

    //Написать метод, печатающий 1, 2, 3, 4, 5

    static String str = ", ";

//    public static void numbers(int num, String str) {
//        for (int i = 1; i <= 5; i ++) {
//            if (i == 5) {
//                System.out.print(i);
//            } else {
//                System.out.print(i + str);
//            }
//        }
//    }

    public static void numbers (int num) {
        for (int i = 1; i < num; i ++) {
            System.out.print(i + str);
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        numbers(5);
        System.out.println();

    }
}
