package study.tdd;

import java.util.List;

public class StringParser {

    public StringParser() { }

    static List<String> parse(String input) {
        return List.of(input.split(" "));
        // 알아둘 것. ArrayList로 만들면 가변 + null값 허용
        // List.of 메서드로 만들면 불변 + null값은 허용 X
    }
}
