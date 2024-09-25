package edu.cnm.deepdive;

public class FizzBuzz {

  public static final String FIZZ_RESULT = "Fizz";
  public static final String BUZZ_RESULT = "Buzz";
  public static final String FIZZ_BUZZ_RESULT = FIZZ_RESULT + BUZZ_RESULT;

  public String valueOf(int input) {
    if (input < 0) {
      throw new IllegalArgumentException("Input must not be negative.");
    }

    return switch (input % 15) {
      case 0 -> FIZZ_BUZZ_RESULT;
      case 3, 6, 9, 12 -> FIZZ_RESULT;
      case 5, 10 -> BUZZ_RESULT;
      default -> String.valueOf(input);
    };
  }

}
