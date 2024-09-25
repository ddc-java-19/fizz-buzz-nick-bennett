package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void valueOf_negativeInput() {
    try {
      FizzBuzz fb = new FizzBuzz();
      fb.valueOf(-1);
      fail();
    } catch (IllegalArgumentException e) {
      // Do nothing; exception is expected.
    }
  }

}