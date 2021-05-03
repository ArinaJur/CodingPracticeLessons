import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingArrayHappyPath () {
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
