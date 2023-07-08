package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    // 요구사항 1
    @Test
    public void split() {
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2");
        values = "1".split(",");
        assertThat(values).contains("1");
    }
    @Test
    public void substring() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1); //문자열 인덱스 1부터 input의 길이 - 1 즉 2까지.
        assertThat(result).isEqualTo("1,2");
    }
    @Test
    @DisplayName("String의 특정 위치의 문자 가져오기")
    public void getindexvalue() {
        String values = "abc";
        assertEquals('a', values.charAt(0));
    }

    @Test
    @DisplayName("위치 값을 벗어났을 때의 예외")
    public void stringindexoutofboundsexception() {
        String values = "abc";
        assertThrows(StringIndexOutOfBoundsException.class, () -> values.charAt(-1));
        assertThrows(StringIndexOutOfBoundsException.class, () -> values.charAt(3));
    }
}
