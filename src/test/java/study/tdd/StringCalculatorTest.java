package study.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringCalculatorTest {

    @Test
    public void 문자열을_입력받는다() {
        String input = "2 + 3 * 4 / 2";

        StringCalculator stringCalculator = new StringCalculator(input);

        Assertions.assertThat(stringCalculator.getText());
    }

    @Test
    public void 문자열을_파싱한다() {
        String input = "2 + 3 * 4 / 2";

        StringParser stringParser = new StringParser();

        List<String> parser = stringParser.parse(input);
        List<String> stringList = List.of("2", "+", "3", "*", "4", "/", "2");

        Assertions.assertThat(parser).isEqualTo(stringList);
    }
}
