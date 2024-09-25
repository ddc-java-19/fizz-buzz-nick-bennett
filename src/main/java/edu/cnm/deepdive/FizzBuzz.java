package edu.cnm.deepdive;

public class FizzBuzz {

  public String valueOf(int input) {
    if (input < 0) {
      throw new IllegalArgumentException("Input must not be negative.");
    }

    return switch (input % 15) {
      case 0 -> "FizzBuzz";
      case 3, 6, 9, 12 -> "Fizz";
      case 5, 10 -> "Buzz";
      default -> String.valueOf(input);
    };
  }

}
