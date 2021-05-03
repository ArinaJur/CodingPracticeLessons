public class AscendingSequence {

    public int[] buildAscendingArray (int endNumber) {
        int[] array = new int[endNumber];

        for (int i = 1; i <= endNumber; i ++) {
            array[i - 1] = i;
        }
        return array;
    }
}
