package study.tdd;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringCalculatorTest {

    @Test
    public void 문자열을_입력받는다() {
        String input = "2 + 3 * 4 / 2";

        Assertions.assertThat(StringCalculator.getText(input));
    }

    @Test
    public void 수학적_계산이_아닌_문자열_인덱스_순서_대로_연산자와_피연산자를_나누어_계산한다() {
        String input = "2 + 3 * 4 / 2";

        Assertions.assertThat(StringCalculator.calculate(input)).isEqualTo(10);

    }

    @Test
    public void 잘못된_연산자가_입력됐을_때_예외가_발생한다() {
        String input = "2 + 3 * 4 & 2";

        Assertions.assertThatThrownBy(() -> {
            StringCalculator.calculate(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 나누는_숫자가_0이면_예외가_발생한다() {
        String input = "2 + 3 * 4 / 0";

        Assertions.assertThatThrownBy(() -> {
            StringCalculator.calculate(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
