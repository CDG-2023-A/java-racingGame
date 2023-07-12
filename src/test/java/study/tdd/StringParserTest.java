package study.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringParserTest {

    @Test
    public void 하나의_문자열을_파싱해서_String_배열로_만든다() {
        String input = "2 + 3 * 4 / 2";

        List<String> stringList = List.of("2", "+", "3", "*", "4", "/", "2");

        Assertions.assertThat(StringParser.parse(input)).isEqualTo(stringList);
    }
}
