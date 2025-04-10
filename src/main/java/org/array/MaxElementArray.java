package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaxElementArray {

  private static final Logger logger = LogManager.getLogger(MaxElementArray.class);

  public int findMax(int[] arr) {
    logger.info("Finding the max value from array {}", arr);

    int max = Integer.MIN_VALUE;
    for (int ele : arr) {
      if (ele > max) {
        max = ele;
      }
    }

    logger.info("Maximum value from array {} is {}", arr, max);
    return max;
  }
}

