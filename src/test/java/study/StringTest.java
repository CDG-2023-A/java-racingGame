package study;

import calculator.DongwooCalculator;
import calculator.StringParser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    private static DongwooCalculator dwCalculator;
    private static StringParser stringParser;
    private static final String parsingErrormessage = "올바른 계산식을 입력해주세요.\n";

    @BeforeAll
    static void init() {
        dwCalculator = new DongwooCalculator();
        stringParser = new StringParser();
    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"1 + 2 * 3", "4 - 5", "7 * 8 - 9 / 3"})
    void 숫자를_입력_받는다() throws IOException {
        String input = "1 - 8 * 3";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        stringParser.insertString();
        String result = stringParser.getInsert();
        Assertions.assertThat(input).isEqualTo(result);
    }


    @Test
    void 연산자_구조를_검증_한다() {
        String validInput = "1 + 2 * 3";
        InputStream in = new ByteArrayInputStream(validInput.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        assertDoesNotThrow(() -> stringParser.parse());
    }


    @Test
    void 연산자_구조가_아닌_입력은_IllegalArgumentException() throws Exception {
        String invalidInput = "1 + 2 *";
        InputStream in = new ByteArrayInputStream(invalidInput.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        assertThrows(IllegalArgumentException.class, () -> {
            stringParser.parse();
        });

    }

    @Test
    void 연산을_수행할_수_있다() {

        String invalidInput = "1 + 2 * 3";
        InputStream in = new ByteArrayInputStream(invalidInput.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        int expect = calculator.calculate();

        assertEquals(expect, 9);
    }


}
