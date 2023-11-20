package task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheckNumberTest {

    /**
     * Test numbers which are in range(25, 100)
     * @param n number which must be in internal area(25, 100)
     */
    @DisplayName("Test numbers which are in range(25, 100")
    @ParameterizedTest
    @ValueSource(ints = {25, 26, 27, 28, 53, 60, 55, 80, 90, 99, 100})
    public void testInternalNumbers(int n) {
        assertThat(CheckNumber.numberInInternal(n)).isEqualTo(true);
    }

    /**
     * Test numbers which are NOT in range(25, 100)
     * @param n number which mustn't be in internal area(25, 100)
     */
    @DisplayName("Test numbers which are NOT in range(25, 100")
    @ParameterizedTest
    @ValueSource(ints = {6, 2, -100, 200, 10000, 0})
    public void testNotInternalNumbers(int n) {
        assertThat(CheckNumber.numberInInternal(n)).isEqualTo(false);
    }
}
