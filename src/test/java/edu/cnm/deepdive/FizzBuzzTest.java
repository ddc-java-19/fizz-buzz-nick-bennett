package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {-1, -2, -15, Integer.MIN_VALUE})
  void valueOf_negativeInput(int value) {
    class NegativeFizzBuzzExecutable implements Executable {

      @Override
      public void execute() throws Throwable {
        FizzBuzz fb = new FizzBuzz();
        fb.valueOf(value);
      }

    }
    assertThrows(IllegalArgumentException.class, new NegativeFizzBuzzExecutable());
  }

}

