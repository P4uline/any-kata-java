package fr.coderetreat.anykata.anykata;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(JUnitParamsRunner.class)
public class AnyKataParameterizedTest {

    @Test
    @Parameters({"3", "6", "9", "33"})
    public void should_test_something_with(int multipleOf3) {
        Assertions.assertThat(multipleOf3 % 3).isEqualTo(0);
    }
}
