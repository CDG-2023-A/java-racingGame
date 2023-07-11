package study;

import calculator.DongwooCalculator;
import calculator.StringParser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

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
    void 숫자를_입력_받는다() throws IOException {
        String input = "1 + 2 * 3";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String result = stringParser.insertString();
        Assertions.assertThat(input).isEqualTo(result);
    }

    @Test
    void 숫자를_입력_받는다_실패() {

        String input = "1 + 2 a 3";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
//        stringParser.parse(input);
        Assertions.assertThat(parsingErrormessage).isEqualTo(out.toString());

    }


}
