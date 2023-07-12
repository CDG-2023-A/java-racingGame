package calculator;

import java.io.IOException;
import java.util.List;

public class DongwooCalculator {

    private StringParser stringParser = new StringParser();
    private Calculator calculator = new Calculator();

    public void start() throws IOException {

        stringParser.parse();

        List<String> parsingResult = stringParser.getParsingResult();

        double result = calculator.calculate(parsingResult);

        System.out.println(result);

    }

}

