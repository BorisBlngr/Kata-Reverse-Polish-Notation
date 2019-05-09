package fr;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReversePolishNotationTest {
    @Test
    public void one_plus_zero_return_one() {
        String result = ReversePolishNotation.calculate("1 0 +");
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void zero_plus_one_return_one() {
        String result = ReversePolishNotation.calculate("0 1 +");
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void zero_plus_two_return_two() {
        String result = ReversePolishNotation.calculate("2 0 +");
        assertThat(result).isEqualTo("2");
    }
}