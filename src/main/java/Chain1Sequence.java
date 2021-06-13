import java.util.ArrayList;
import java.util.List;

public class Chain1Sequence  {

    public boolean isNumeric(String value){
        try {
            Long.parseLong(value);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    //2147483647 IntegerMax
    //4194303 число, которое все еще дает цепочку int

    public <T> T returnNumericValue(String value) {
        if (isNumeric(value)) {
            if (Long.parseLong(value) >= 0) {
                if (Long.parseLong(value) <= 4194303) {
                    return (T) Integer.valueOf(Integer.parseInt(value));
                } else {
                    return (T) Long.valueOf(Long.parseLong(value));
                }
            }

            return null;
        }

        return null;
    }


    public List<String> getExpectedValues(String value) {
        List <String> expectedValues = new ArrayList<>();

        if (returnNumericValue(value) instanceof Integer) {
            int valueInt = Integer.parseInt(value);

            expectedValues.add(0, String.valueOf(valueInt)); //expectedValues.get(0) -> F1

            for (int i = 1; i < 10; i ++) {
                valueInt = valueInt * 2;
                expectedValues.add(i, String.valueOf(valueInt)); //expectedValues.get(i) -> Fi+1 until F10
            }

            return expectedValues;

        } else if(returnNumericValue(value) instanceof Long) {
            long valueLong = Long.parseLong(value);
            expectedValues.add(0, String.valueOf(valueLong)); //expectedValues.get(0) -> F1

            for (int i = 1; i < 10; i ++) {
                valueLong = valueLong * 2;
                expectedValues.add(i, String.valueOf(valueLong)); //expectedValues.get(i) -> Fi+1 until F10
            }

            return expectedValues;
        }

        return null;
    }

    public List<String> getExpectedValuesLong(String value) {
        List<String> expectedValues = new ArrayList<>();

        if (isNumeric(value)) {
            long valueLong = Long.parseLong(value);

            if (valueLong >= 0) {
                expectedValues.add(0, String.valueOf(valueLong)); //expectedValues.get(0) -> F1

                for (int i = 1; i < 10; i ++) {
                    valueLong = valueLong * 2;
                    expectedValues.add(i, String.valueOf(valueLong)); //expectedValues.get(i) -> Fi+1 until F10
                }

                return expectedValues;
            }

            return null;
        }

        return null;
    }


}
