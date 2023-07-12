package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    private InputReader inputReader;

    @BeforeEach
    void setUp(){
        inputReader = new InputReader();
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

    }
}
