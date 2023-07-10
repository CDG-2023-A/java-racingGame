package study.tdd;

import java.util.List;

public class StringCalculator {

    private final String text;
    private final StringParser stringParser = new StringParser();

    public StringCalculator(String text) {
        this.text = text;
        StringParser stringParser = new StringParser();
        List<String> parseText = stringParser.parse(text);
    }

    public String getText() {
        return text;
    }

}
