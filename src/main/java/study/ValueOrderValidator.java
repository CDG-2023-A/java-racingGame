package study;

import java.util.ArrayList;

public class ValueOrderValidator {

    public void isValid(ArrayList<Object> values) {

        for (int i = 0; i < values.size(); i += 2) {
            if (!isNumeric(values.get(i))) {
                throw new IllegalArgumentException("입력받은 값이 올바르지 않습니다.");
            }
        }

        for (int i = 1; i < values.size(); i += 2) {
            if (!isString(values.get(i))) {
                throw new IllegalArgumentException("입력받은 값이 올바르지 않습니다.");
            }
        }
    }

    private boolean isNumeric(Object value) {
        return value instanceof Integer;
    }

    private boolean isString(Object value) {
        return value instanceof String;
    }

}
