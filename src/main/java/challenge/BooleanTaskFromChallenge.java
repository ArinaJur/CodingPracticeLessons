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

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 12};
        int[] array1 = {1, 8, 10, 1, 20};

        //System.out.println(isAscendingSequence1(array));
        System.out.println(isAscendingSequence3(array1));


    }
}
