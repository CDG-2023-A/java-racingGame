package calculator;

import java.util.List;

public class Calculator {


    public double calculate(List<String> parsingResult) {
        double result = Double.parseDouble(parsingResult.get(0));

        for (int i = 1; i < parsingResult.size(); i += 2) {
            String operator = parsingResult.get(i);
            double operand = Double.parseDouble(parsingResult.get(i + 1));

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
            }
        }
        return result;
    }
}
