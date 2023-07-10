package study.tdd;

import java.util.List;

public class StringParser {

    private List<String> actual;
    public List<String> parse(String input) {
        for (int i = 0; i < input.length(); i++) {
            actual = List.of(input.split(" "));
        }
        return actual;
    }
}
