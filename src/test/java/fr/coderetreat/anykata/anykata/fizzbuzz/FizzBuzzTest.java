package fr.coderetreat.anykata.anykata.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    public void should_return_fizz(int value) {
        Assertions.assertThat(fizzBuzz.fizzbuzz(value)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 2365})
    public void should_return_buzz(int value) {
        Assertions.assertThat(fizzBuzz.fizzbuzz(value)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 60, 7095})
    public void should_return_fizz_buzz(int value) {
        Assertions.assertThat(fizzBuzz.fizzbuzz(value)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 17, 19})
    public void should_return_int_value(int value) {
        Assertions.assertThat(fizzBuzz.fizzbuzz(value)).isEqualTo(String.valueOf(value));
    }
}