package task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckNumberTest {

    /**
     * Test correct work of CheckNumber's method 'evenOddNumber' with even number as a parameter
     */
    @Test
    @DisplayName("Test method with even number as a parameter")
    public void testIfEven() {
        assertThat(CheckNumber.evenOddNumber(2)).isEqualTo(true);
    }

    /**
     * Test correct work of CheckNumber's method 'evenOddNumber' with NOT even number as a parameter
     */
    @Test
    @DisplayName("Test method with not even number as a parameter")
    public void testIfNotEven() {
        assertThat(CheckNumber.evenOddNumber(1)).isEqualTo(false);
    }
}
