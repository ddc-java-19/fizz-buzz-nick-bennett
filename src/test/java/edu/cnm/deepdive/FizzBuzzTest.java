package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;
import java.util.Set;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {-1, -2, -15, Integer.MIN_VALUE})
  void valueOf_invalid(int value) {
    assertThrows(IllegalArgumentException.class, () -> FizzBuzz.valueOf(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 11, Integer.MAX_VALUE, 97})
  void valueOf_neither(int value) {
    assertEquals(Set.of(), FizzBuzz.valueOf(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 99, Integer.MAX_VALUE - 4})
  void valueOf_fizz(int value) {
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {55, 100, 250, Integer.MAX_VALUE - 2})
  void valueOf_buzz(int value) {
    assertEquals(Set.of(FizzBuzz.BUZZ), FizzBuzz.valueOf(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 90, 255, Integer.MAX_VALUE - 7})
  void valueOf_fizzBuzz(int value) {
    assertEquals(EnumSet.allOf(FizzBuzz.class), FizzBuzz.valueOf(value));
  }


}

