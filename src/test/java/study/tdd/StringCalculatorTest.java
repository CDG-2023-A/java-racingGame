package study.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void 문자열을_입력받는다() {
        String input = "2 + 3 * 4 / 2";

        StringCalculator stringCalculator = new StringCalculator(input);

        Assertions.assertThat(stringCalculator.getText());
    }
}
