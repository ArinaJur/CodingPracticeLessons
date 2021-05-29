import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AscendingSequenceTest {

    @Test
    public void testAscendingArrayHappyPath() {
        int startNumber = 1;
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingArrayZeroCase() {
        int startNumber = 0;
        int endNumber = 5;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingArrayNegativeNumbersCase() {
        int startNumber = -8;
        int endNumber = -4;
        int[] expectedResult = {-8, -7, -6, -5, -4};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingArrayNegativePositiveNumbersCase() {
        int startNumber = -2;
        int endNumber = 3;
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringHappyPath() {
        int startNumber = 1;
        int endNumber = 5;
        String expectedResult = "1, 2, 3, 4, 5";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringZeroCase() {
        int startNumber = 0;
        int endNumber = 5;
        String expectedResult = "0, 1, 2, 3, 4, 5";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringNegativeNumbers() {
        int startNumber = -8;
        int endNumber = -1;
        String expectedResult = "-8, -7, -6, -5, -4, -3, -2, -1";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringEndNumberLessThenStartNumber() {
        int startNumber = 5;
        int endNumber = 0;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringEndNumberEqualsStartNumber() {
        int startNumber = 5;
        int endNumber = 5;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringLargeNumbers() {
        int startNumber = -2147483648 - 1;
        int endNumber = 2147483647 + 1;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingListHappyPath() {
        int startNumber = 1;
        int endNumber = 5;
        int step = 1;
        List<Integer> expectedResults = List.of(1, 2, 3, 4, 5);
        //List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

        AscendingSequence ascendingSequence = new AscendingSequence();
        List<Integer> actualResults = ascendingSequence.buildAscendingList(startNumber, endNumber, step);

        Assert.assertEquals(expectedResults, actualResults);
    }

    @Test
    public void testAscendingListStep10() {
        int startNumber = 0;
        int endNumber = 100;
        int step = 10;
        List<Integer> expectedResults = List.of(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        AscendingSequence ascendingSequence = new AscendingSequence();
        List<Integer> actualResults = ascendingSequence.buildAscendingList(startNumber, endNumber, step);

        Assert.assertEquals(expectedResults, actualResults);
    }
}
