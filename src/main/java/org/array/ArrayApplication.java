package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayApplication {

  private static final Logger logger = LogManager.getLogger(ArrayApplication.class);

  public static void main(String[] args) {

    int[] integerArray1D = {1, -1, 156, 165655616, 5616516, 0, -1000, -654161651};

    logger.info("Finding max element value from array");
    MaxElementArray maxElementArray = new MaxElementArray();
    maxElementArray.findMax(integerArray1D);

    logger.info("Finding minimum element value from array");
    MinElementArray minElementArray = new MinElementArray();
    minElementArray.findMin(integerArray1D);
  }
}
