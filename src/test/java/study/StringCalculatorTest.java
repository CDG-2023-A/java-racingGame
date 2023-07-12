package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    private InputReader inputReader;
    private StringParser stringParser;

    @BeforeEach
    void setUp(){
        inputReader = new InputReader();
        stringParser = new StringParser();
    }

    @Test
    void 사용자로부터_문자열을_입력_받는다() throws IOException {
        //given
        String input = "2 + 3 * 4 / 2";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        //when
        String actual = inputReader.read();

        //then
        assertThat(actual).isEqualTo(input);
    }


    @Test
    void 입력_받은_문자열을_파싱한다() {
        //given
        String input = "2 + 3 * 4 / 2";

        //when
        ArrayList<Object> values = stringParser.parse(input);

        //then
        ArrayList<Object> expected = new ArrayList<>(Arrays.asList(2, "+", 3, "*", 4, "/", 2));
        assertThat(values).isEqualTo(expected);

    }


    @Test
    void 파싱한_문자열을_순서대로_처리하여_계산한다() {
        //given


        //when


        //then
    }
}
