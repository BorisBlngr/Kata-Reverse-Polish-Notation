package fr;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ReversePolishNotationTest {
    @Test
    public void zero_plus_one_return_one() {
        String result = ReversePolishNotation.compile("1 0 +");
        Assertions.assertThat(result).isEqualTo("1");
    }
}