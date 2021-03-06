package challenge;

public class BooleanTaskFromChallenge {

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
                if (element % 3 == 0 && element % 4 == 0 && element % 6 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 8, 12};
        int[] array1 = {32, 8, 10, 31, 20, 7};

        System.out.println(isTrue(array));
        System.out.println(isTrue(array1));
    }
}
