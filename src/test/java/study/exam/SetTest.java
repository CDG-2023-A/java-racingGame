package study.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    @DisplayName("HashSet에 값을 추가한다.")
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("집합의 크기를 확인할 수 있다.")
    void setSize() {
        int result = numbers.size();
        assertEquals(result, 3); // Set은 중복을 허용하지 않는다.
    }

    @Test
    @DisplayName("집합에 값이 포함되어있는지 비교할 수 있다.")
    void compareContains() {
        numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("ValueSource를 사용해 입력 받은 숫자가 각각 numbers에 포함되는지 확인한다.")
    void compareContains(int value) {
        numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        assertThat(numbers.contains(value)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "2, true",
            "3, true",
            "4, false",
            "5, false"
    })
    @DisplayName("CsvSource로 true 값만 비교하는 것이 아닌 false 값도 비교할 수 있다.")
    void compareContains(int value, boolean expected) {
        numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        assertThat(numbers.contains(value)).isEqualTo(expected);
    }
}