package study.tdd;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    private String text;
    private final StringParser stringParser = new StringParser();

    public StringCalculator() { }
    public StringCalculator(String text) {
        this.text = text;
        StringParser stringParser = new StringParser();
        List<String> parseText = stringParser.parse(text);
    }

    public String getText() {
        return text;
    }

    public int calculate(String text) {
        String[] values = text.split(" ");
        // 0번째 인덱스에 있는 숫자만 넣어준다.
        int number = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            String operator = values[i];
            int operand = Integer.parseInt(values[i+1]);

            if(operator.equals("+"))
                number += operand;
            else if (operator.equals("-"))
                number -= operand;
            else if (operator.equals("*"))
                number *= operand;
            else if (operator.equals("/")) {
                if (operand == 0) {
                    throw new IllegalArgumentException();
                }
                number /= operand;
            }
        }

        return number;
    }
}
