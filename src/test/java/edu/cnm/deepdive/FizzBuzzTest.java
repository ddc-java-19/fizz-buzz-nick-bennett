package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FizzBuzzTest {

  @Test
  void valueOf_negativeInput() {
    assertThrows(IllegalArgumentException.class, new NegativeFizzBuzzExecutable());
  }

}

class NegativeFizzBuzzExecutable implements Executable {

  @Override
  public void execute() throws Throwable {
    FizzBuzz fb = new FizzBuzz();
    fb.valueOf(-1);
  }

}