package edu.cnm.deepdive;

public class FizzBuzz {

  public String valueOf(int input) {
    if (input < 0) {
      throw new IllegalArgumentException("Input must not be negative.");
    }
    String output = "";
    if (input % 3 == 0) {
      output = "Fizz";
    } else {
      output = String.valueOf(input);
    }
    return output;
  }

}
