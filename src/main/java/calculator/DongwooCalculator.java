package calculator;

import java.io.IOException;
import java.util.List;

public class DongwooCalculator {

    private StringParser stringParser = new StringParser();

    public void calculate() throws IOException {

        stringParser.parse();

        List<String> parsingResult = stringParser.getParsingResult();


    }

}

