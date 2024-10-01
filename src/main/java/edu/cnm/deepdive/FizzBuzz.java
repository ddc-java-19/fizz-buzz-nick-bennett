package edu.cnm.deepdive;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {

  FIZZ, BUZZ;

  public static Set<FizzBuzz> valueOf(int input) {
    if (input < 0) {
      throw new IllegalArgumentException("Input must not be negative.");
    }

    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);

    if (input % 3 == 0) {
      result.add(FIZZ);
    }

    if (input % 5 == 0) {
      result.add(BUZZ);
    }

    return result;
  }

}
