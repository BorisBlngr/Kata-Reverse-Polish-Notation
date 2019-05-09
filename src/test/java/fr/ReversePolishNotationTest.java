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
    public void two_plus_zero_return_two() {
        String result = ReversePolishNotation.calculate("2 0 +");
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void three_plus_zero_return_three() {
        String result = ReversePolishNotation.calculate("3 0 +");
        assertThat(result).isEqualTo("3");
    }
}