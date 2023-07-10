package study.tdd;

import java.util.List;

public class StringCalculator {

    private String text;
    private final StringParser stringParser = new StringParser();

    public StringCalculator() { }
    public StringCalculator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void exception(String text) {
        List<String> values = stringParser.parse(text);

        for (int i = 1; i < values.size(); i += 2) {

            String operator = values.get(i);
            int operand = Integer.parseInt(values.get(i + 1));

            if (operator.equals("/") && operand == 0) {
                throw new IllegalArgumentException();
            }
        }
    }
    public int calculate(String text) {
        List<String> values = stringParser.parse(text);
        int number = Integer.parseInt(values.get(0));

        for (int i = 1; i < values.size(); i += 2) {

            int operand = Integer.parseInt(values.get(i + 1));
            String operator = values.get(i);

            if(operator.equals("+"))
                number += operand;
            else if (operator.equals("-"))
                number -= operand;
            else if (operator.equals("*"))
                number *= operand;
            else if (operator.equals("/")) {
                number /= operand;
            }
        }

        return number;
    }
}
