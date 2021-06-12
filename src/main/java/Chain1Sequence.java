import java.util.ArrayList;
import java.util.List;

public class Chain1Sequence {

    public boolean isNumeric(String value){
        try {
            Integer.parseInt(value);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public List<String> getExpectedValues(String value) {
        List<String> expectedValues = new ArrayList<>();

        if (isNumeric(value)) {
            int valueInt = Integer.parseInt(value);

            if (valueInt >= 0) {
                expectedValues.add(String.valueOf(valueInt)); //expectedValues.get(0) -> F1

                for (int i = 1; i < 10; i ++) {
                    valueInt = valueInt * 2;
                    expectedValues.add(i, String.valueOf(valueInt)); //expectedValues.get(i) -> Fi+1 until F10
                }

                return expectedValues;
            }

            return null;
        }

        return null;
    }
}
