package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayElementSum {

  private static final Logger log = LogManager.getLogger(ArrayElementSum.class);

  protected int sumOfElements(int[] arr) {

    log.info("Doing sum of all elements of array {}", Arrays.toString(arr));
    int sum = 0;
    for (int ele : arr) {
      sum += ele;
    }

    log.info("Sum of all elements is {}", sum);
    return sum;
  }
}
