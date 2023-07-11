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
    public void 수학적_계산이_아닌_문자열_인덱스_순서_대로_연산자와_피연산자를_나누어_계산한다() {
        String input = "2 + 3 * 4 / 2";
        StringCalculator stringCalculator = new StringCalculator(input);

        int result = stringCalculator.calculate();
        Assertions.assertThat(result).isEqualTo(10);

    }

}
