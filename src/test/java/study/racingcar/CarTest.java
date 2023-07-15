package study.racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CarTest {

    private ByteArrayOutputStream outputStream;

    protected void systemIn(String input) {
        // 이 메서드를 실행하면 input 값의 바이트 배열을 스트림에 넣어 System.in에 할당해준다.
        // 참고한 링크 : https://steadyjay.tistory.com/10
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    protected String getOutput() {
        // ByteArrayOutputStream의 toString은 기본 문자 집합을 사용하여 버퍼의 내용을 문자열 디코딩 바이트로 변환해줍니다.
        return outputStream.toString();
    }

    void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
    }
    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void 자동차_수를_입력받는다() {
        String input = "3";
        systemIn(input);
        test();

        Assertions.assertThat(getOutput()).contains("3");
    }


}
