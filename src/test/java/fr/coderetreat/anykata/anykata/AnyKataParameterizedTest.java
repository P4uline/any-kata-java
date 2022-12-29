package fr.coderetreat.anykata.anykata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AnyKataParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"3", "6", "9", "33"})
    public void should_test_something_with(int multipleOf3) {
        Assertions.assertThat(multipleOf3 % 3).isEqualTo(0);
    }
}
