package org.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LongestStringWithoutCharDuplicate {

  private static final Logger logger = LogManager.getLogger(LongestStringWithoutCharDuplicate.class);

  public static int longestStringWithoutCharDuplicate(String originalString) {
    logger.info("Received string: {}", originalString);

    int count = 0;
    List<Character> dummyArray = new ArrayList<>();

    for (Character str : originalString.toCharArray()) {
      if (!dummyArray.contains(str)) {
        dummyArray.add(str);
        count++;
        logger.debug("Added character: {}, Updated count: {}", str, count);
      }
    }

    logger.info("Longest substring length without duplicate characters: {}", count);
    return count;
  }

  public static void main(String[] args) {
    String testString = "abcabcbb";
    logger.info("Starting computation for test string: {}", testString);
    int result = longestStringWithoutCharDuplicate(testString);
    logger.info("Result: {}", result);
  }
}
