package study;

import java.io.IOException;
import java.util.ArrayList;

public class YeobCalculator {
    //유즈케이스 담당
    private InputReader inputReader;
    private StringParser stringParser;
    private StringCalculator stringCalculator;

    public YeobCalculator() {
        this.inputReader = new InputReader();
        this.stringParser = new StringParser();
        this.stringCalculator = new StringCalculator();
    }

    public void runCalculator() throws IOException {
        System.out.print("수식 입력 : ");
        String input = inputReader.read();
        ArrayList<Object> tokens = stringParser.parse(input);
        int result = stringCalculator.calculate(tokens);
        System.out.println("계산 결과: " + result);
    }

}
