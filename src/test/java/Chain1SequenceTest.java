import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Chain1SequenceTest {

    @Test
    public void testChain1SequenceHappyPath1() {

        String value = "1";
        List<String> expectedValues = Arrays.asList("1", "2", "4", "8", "16", "32", "64", "128", "256", "512");

        Chain1Sequence chain1Sequence = new Chain1Sequence();
        List<String> actualValues = chain1Sequence.getExpectedValues(value);

        Assert.assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testChain1SequenceHappyPathZero() {

        String value = "0";
        List<String> expectedValues = Arrays.asList("0", "0", "0", "0", "0", "0", "0", "0", "0", "0");

        Chain1Sequence chain1Sequence = new Chain1Sequence();
        List<String> actualValues = chain1Sequence.getExpectedValues(value);

        Assert.assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testChain1SequenceHappyPathIntMax() {

        String value = "2147483647";
        List<String> expectedValues = Arrays.asList("2147483647", "4294967294", "8589934588", "17179869176",
                "34359738352", "68719476704", "137438953408", "274877906816", "549755813632", "1099511627264");

        Chain1Sequence chain1Sequence = new Chain1Sequence();
        List<String> actualValues = chain1Sequence.getExpectedValues(value);

        Assert.assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testChain1SequenceString() {

        String value = "kghsafd";
        List<String> expectedValues = null;

        Chain1Sequence chain1Sequence = new Chain1Sequence();
        List<String> actualValues = chain1Sequence.getExpectedValues(value);

        Assert.assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testChain1SequenceUnicode() {

        String value = "U+263A";
        List<String> expectedValues = null;

        Chain1Sequence chain1Sequence = new Chain1Sequence();
        List<String> actualValues = chain1Sequence.getExpectedValues(value);

        Assert.assertEquals(expectedValues, actualValues);
    }

    @Test
    public void testChain1SequenceZerosAtTheBeginning() {

        String value = "00700";
        List<String> expectedValues = List.of("700", "1400", "2800", "5600", "11200", "22400", "44800", "89600",
                "179200", "358400");

        Chain1Sequence chain1Sequence = new Chain1Sequence();
        List<String> actualValues = chain1Sequence.getExpectedValues(value);

        Assert.assertEquals(expectedValues, actualValues);
    }
}
