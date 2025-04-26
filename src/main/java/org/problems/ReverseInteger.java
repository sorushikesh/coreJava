package org.problems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReverseInteger {

  private static final Logger logger = LogManager.getLogger(ReverseInteger.class);

  public static int reverseInteger(int num) {

    int revNum = 0;
    while (num != 0) {
      int digit = num % 10;
      num = num / 10;

      if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && digit > 7)) {
        logger.warn("Overflow detected! Returning 0.");
        return 0;
      }
      if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && digit < -8)) {
        logger.warn("Underflow detected! Returning 0.");
        return 0;
      }

      revNum = revNum * 10 + digit;
    }
    return revNum;
  }

  public static int reverseIntegerUsingString(int num) {

    boolean isNegative = num < 0;
    String numStr = Integer.toString(Math.abs(num));
    String reversedStr = new StringBuilder(numStr).reverse().toString();

    try {
      int reversed = Integer.parseInt(reversedStr);
      return isNegative ? -reversed : reversed;
    } catch (NumberFormatException e) {
      logger.warn("Overflow detected while parsing! Returning 0.");
      return 0;
    }
  }


  public static void main(String[] args) {
    int[] testNumbers = {951236, -951236, 120, 1534236469};

    for (int num : testNumbers) {
      logger.info("Original number : {}", num);
      logger.info("Reverse value of {} : {}", num, reverseInteger(num));
      logger.info("Reverse value of {} using string conversion: {}", num, reverseIntegerUsingString(num));
    }
  }
}
