package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Comparisons {

  private static final Logger logger = LogManager.getLogger(Comparisons.class);

  public static void main(String[] args) {
    String str1 = "Real Madrid CF";
    String str2 = "Real Madrid FC";

    compareString(str1, str2);
  }

  /**
   * <p>
   * The result of {@code str1.compareTo(str2)} will be:
   * <ul>
   *     <li>Zero if the strings are equal</li>
   *     <li>A negative integer if {@code str1} is lexicographically less than {@code str2}</li>
   *     <li>A positive integer if {@code str1} is lexicographically greater than {@code str2}</li>
   * </ul>
   * </p>
   *
   * @param str1 the first string to compare
   * @param str2 the second string to compare
   */
  public static void compareString(String str1, String str2) {
    int comparisonResult = str1.compareTo(str2);

    if (comparisonResult == 0) {
      logger.info("The strings '{}' and '{}' are equal.", str1, str2);
    } else if (comparisonResult < 0) {
      logger.info("The string '{}' comes before '{}' lexicographically.", str1, str2);
    } else {
      logger.info("The string '{}' comes after '{}' lexicographically.", str1, str2);
    }

    logger.info("Raw comparison result between '{}' and '{}': {}", str1, str2, comparisonResult);
  }
}

/*
Lexicographically means comparing words the way they appear in a dictionary. It’s alphabetical order — but based on character-by-character Unicode values.

It checks each letter from left to right. As soon as one letter is different, it decides based on which letter is "smaller" or "greater" alphabetically
(or by Unicode if cases differ).
If all letters are the same and one word is shorter, the shorter word is considered smaller.
*/
