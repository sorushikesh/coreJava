package org.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AtoiFunction {

  private static final Logger logger = LogManager.getLogger(AtoiFunction.class);

  public static void main(String[] args) {
    String str = "  -42 with text";
    logger.info("ATOI function value: {}", myAtoi(str));
  }

  public static int myAtoi(String str) {
    logger.info("Finding ATOI value for '{}'", str);

    if (str == null || str.isEmpty()) {
      return 0;
    }

    str = str.trim();
    if (str.isEmpty()) return 0;

    int i = 0;
    int sign = 1;
    long result = 0;

    // Handle sign
    if (str.charAt(i) == '+' || str.charAt(i) == '-') {
      sign = str.charAt(i) == '-' ? -1 : 1;
      i++;
    }

    // Convert digits
    while (i < str.length() && Character.isDigit(str.charAt(i))) {
      int digit = str.charAt(i) - '0';
      result = result * 10 + digit;

      if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
      if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

      i++;
    }

    return (int) (sign * result);
  }
}
