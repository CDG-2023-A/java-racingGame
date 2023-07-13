package study;

import java.util.ArrayList;

public class StringCalculator {
    //파싱한 문자열을 순서대로 처리하여 계산하는 책임
    private ValueOrderValidator valueOrderValidator;

    public StringCalculator() {
        valueOrderValidator = new ValueOrderValidator();
    }

    public int calculate(ArrayList<Object> values) {
        //숫자와 문자가 순서에 맞게 잘 들어가 있는지 검증
        valueOrderValidator.isValid(values);

        //계산 하기
        int result = (int) values.get(0);

        for (int i = 1; i < values.size(); i += 2) {
            int calculate_num = (int) values.get(i + 1);
            String operator = (String) values.get(i);

            switch (operator) {
                case "+":
                    result += calculate_num;
                    break;
                case "-":
                    result -= calculate_num;
                    break;
                case "*":
                    result *= calculate_num;
                    break;
                case "/":
                    result /= calculate_num;
                    break;
            }

        }

        return result;
    }
}
