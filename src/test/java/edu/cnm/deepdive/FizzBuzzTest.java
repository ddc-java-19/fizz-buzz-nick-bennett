package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {-1, -2, -15, Integer.MIN_VALUE})
  void valueOf_negativeInput(int value) {
    Executable task = new Executable() {

      @Override
      public void execute() throws Throwable {
        FizzBuzz fb = new FizzBuzz();
        fb.valueOf(value);
      }

    };
    assertThrows(IllegalArgumentException.class, task);
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 11, Integer.MAX_VALUE, 97})
  void valueOf_neither(int value) {
    assertEquals(String.valueOf(value), new FizzBuzz().valueOf(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 99, Integer.MAX_VALUE - 4})
  void valueOf_fizz(int value) {
    assertEquals("Fizz", new FizzBuzz().valueOf(value));
  }


}

