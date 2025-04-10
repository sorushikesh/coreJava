package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinElementArray {

  private static final Logger logger = LogManager.getLogger(MinElementArray.class);

  public int findMin(int[] arr) {

    logger.info("Finding the minimum value from array {}", arr);

    int min = Integer.MAX_VALUE;
    for (int ele : arr) {
      if (ele < min) {
        min = ele;
      }
    }

    logger.info("Minimum value from array {} is {}", arr, min);
    return min;
  }
}
