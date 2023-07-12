package study.tdd;

import java.util.List;

public class StringCalculator {

    private StringCalculator() { }
    static int calculate(String text) {
        List<String> values = StringParser.parse(text);
        int number = Integer.parseInt(values.get(0));

        for (int i = 1; i < values.size(); i += 2) {

            int operand = Integer.parseInt(values.get(i + 1));
            String operator = values.get(i);

            number = getNumber(number, operand, operator);
        }

        return number;
    }

    private static int getNumber(int number, int operand, String operator) {
        if ("+".equals(operator)) return number + operand;
        if ("-".equals(operator)) return number - operand;
        if ("*".equals(operator)) return number * operand;
        if ("/".equals(operator)) {
            if (operand == 0) {
                throw new IllegalArgumentException();
            }
            return number / operand;
        }

        throw new IllegalArgumentException("잘못된 연산자 입니다.");
    }
}
