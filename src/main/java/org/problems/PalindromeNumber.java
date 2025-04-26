package org.problems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PalindromeNumber {

  private static final Logger logger = LogManager.getLogger(PalindromeNumber.class);

  public static boolean isPalindrome(int x) {

    if (x < 0)
      return false;

    int original = x;
    int revNum = 0;

    while (x != 0) {
      int digit = x % 10;
      x = x / 10;
      revNum = revNum * 10 + digit;
    }
    return revNum == original;
  }

  public static void main(String[] args) {
    int num = 121;
    logger.info("Number is Palindrome? : {}", isPalindrome(num));
  }
}
