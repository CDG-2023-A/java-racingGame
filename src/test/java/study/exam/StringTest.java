package study.exam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringTest {
    @Test
    @DisplayName("abc에서 b를 d로 대체했을 때 같은지 테스트하는 코드")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    // 요구사항 1
    @Test
    @DisplayName("특정 문자열로 분리하는 테스트 코드")
    public void split() {
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2");
        values = "1".split(",");
        assertThat(values).contains("1");
    }
    @Test
    @DisplayName("특정 문자열까지 읽어서 비교하는 테스트 코드")
    public void subString() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1); //문자열 인덱스 1부터 input의 길이 - 1 즉 2까지.
        assertThat(result).isEqualTo("1,2");
    }
    @Test
    @DisplayName("String의 특정 위치의 문자 가져오기")
    public void getIndexValue() {
        String values = "abc";
        assertEquals('a', values.charAt(0));
    }

    @Test
    @DisplayName("위치 값을 벗어났을 때의 예외")
    public void stringIndexOutOfBoundsException() {
        String values = "abc";
        assertThrows(StringIndexOutOfBoundsException.class, () -> values.charAt(-1));
        assertThrows(StringIndexOutOfBoundsException.class, () -> values.charAt(3));
    }
}
