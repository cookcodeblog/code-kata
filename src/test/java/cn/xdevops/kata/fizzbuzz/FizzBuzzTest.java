package cn.xdevops.kata.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    @Test
    @DisplayName("should return 0 when 0")
    void shouldReturn0When0() {
        assertThat(FizzBuzz.of(0)).isEqualTo("0");
    }

    @Test
    @DisplayName("should return Fizz when divisible by 3")
    void shouldReturnFizzWhenDivisibleBy3() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    @DisplayName("should return Buzz when divisible by 5")
    void shouldReturnBuzzWhenDivisibleBy5() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    @DisplayName("should return FizzBuzz when divisible by 3 and 5")
    void shouldReturnFizzBuzzWhenDivisibleBy3And5() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @DisplayName("should return its string when not divisible by 3 and 5")
    @ValueSource(ints = {1, 2, 4, 7, 8})
    void shouldReturnItsStringWhenNotDivisibleBy3And5(int value) {
        assertThat(FizzBuzz.of(value)).isEqualTo(String.valueOf(value));
    }
}
