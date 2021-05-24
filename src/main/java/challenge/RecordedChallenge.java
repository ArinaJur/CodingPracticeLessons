package challenge;

public class RecordedChallenge {

//    Написать метод, который принимает массив чисел и печатает вторую половину массива
//    Пример: {1, 2, 3, 4, 5, 6}
//    Распечатать: 4, 5, 6
//
//    Пример: {1, 2, 3, 4, 5}
//    Распечатать: 4, 5

    public static void printSecondHalfOfArray1(int[] array) {
        int startIndex = (array.length + 1) / 2;
        System.out.println(startIndex);

        for(int i = startIndex; i < array.length - 1; i ++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printSecondHalfOfArray2(int[] array) {
        int startIndex = array.length - array.length / 2;
        System.out.println(startIndex);

        for(int i = startIndex; i < array.length - 1; i ++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printSecondHalfOfArray3(int[] array) {
        if (array.length % 2 == 0) {
            for (int i = array.length / 2; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = array.length / 2 + 1; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    private static final String COMA_SPACE = ", ";

    public static void printSecondHalfOfArray4(int[] array){
        int startIndex = (array.length + 1) / 2;
        int endIndex = array.length - 1;

        for (int i = startIndex; i < endIndex; i++){
            System.out.print(array[i] + COMA_SPACE);
        }
        System.out.println(array[endIndex]);
    }



    public static void main(String[] args) {
        int[] arrayOdd = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayOdd1 = {1, 2, 3, 4, 5};
        int[] arrayOdd2 = {1, 2, 3, 4, 5, 6, 7};

        int[] arrayEven = {1, 2, 3, 4, 5, 6};

//        printSecondHalfOfArray1(arrayOdd);
//        System.out.println();
//        printSecondHalfOfArray1(arrayOdd1);
//        System.out.println();
//        printSecondHalfOfArray1(arrayOdd2);
//        System.out.println();
//        printSecondHalfOfArray1(arrayEven);

//        printSecondHalfOfArray2(arrayOdd);
//        printSecondHalfOfArray2(arrayEven);

        printSecondHalfOfArray3(arrayOdd);
        printSecondHalfOfArray3(arrayOdd1);
        printSecondHalfOfArray3(arrayOdd2);
        printSecondHalfOfArray3(arrayEven);

        printSecondHalfOfArray4(arrayOdd2);

    }


}
