package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class RemoveDuplicates {

  private static final Logger logger = LogManager.getLogger(RemoveDuplicates.class);

  /*
   * Given an integer array numbs sorted in non-decreasing order, remove the duplicates in-place such
   * that each unique element appears only once. The relative order of the elements should be kept
   * the same. Then return the number of unique elements in numbs.
   *
   * @param numbs Integer Array
   * @return Number of unique elements
   */
  public int removeDuplicatesFromSortedArrayReturnIndex(int[] numbs) {

    logger.info("Removing duplicate elements from sorted array and return array index {}", numbs);

    if (numbs == null || numbs.length == 0)
      return 0;
    int uniqueIndex = 1;

    for (int i = 1; i < numbs.length; i++) {
      if (numbs[i] != numbs[i - 1]) {
        numbs[uniqueIndex] = numbs[i];
        uniqueIndex++;
      }
    }

    return uniqueIndex;
  }

  /*
   * Given a sorted integer array, returns a new array with duplicates removed. The order of
   * elements is preserved.
   *
   * @param numbs Sorted integer array
   * @return Array of unique elements
   */
  public int[] removeDuplicatesFromSortedArrayReturnArray(int[] numbs) {

    logger.info("Removing duplicate elements from sorted array and return unique array {}", numbs);

    if (numbs == null || numbs.length == 0)
      return new int[0];

    int uniqueIndex = 1;

    for (int i = 1; i < numbs.length; i++) {
      if (numbs[i] != numbs[i - 1]) {
        numbs[uniqueIndex] = numbs[i];
        uniqueIndex++;
      }
    }

    int[] result = Arrays.copyOf(numbs, uniqueIndex);
    logger.info("Unique elements array: {}", Arrays.toString(result));
    return result;
  }
}
