package edu.cnm.deepdive;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    for (int counter = 1; counter <= 100; counter++) {
      Set<FizzBuzz> result = FizzBuzz.valueOf(counter);
      System.out.println(result.isEmpty() ? counter : result);
    }
  }

}
