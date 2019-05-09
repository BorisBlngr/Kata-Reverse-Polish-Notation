package fr;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReversePolishNotationTest {
    @Test
    public void zero_plus_one_return_one() {
        String result = ReversePolishNotation.calculate("1 0 +");
        assertThat(result).isEqualTo("1");
    }
}