package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class RemoveDuplicates {

  private static final Logger logger = LogManager.getLogger(RemoveDuplicates.class);

  /**
   * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
   * that each unique element appears only once. The relative order of the elements should be kept
   * the same. Then return the number of unique elements in nums.
   *
   * @param nums Integer Array
   * @return Number of unique elements
   */
  public int removeDuplicatesFromSortedArrayReturnIndex(int[] nums) {

    logger.info("Removing duplicate elements from sorted array and return array index {}", nums);

    if (nums == null || nums.length == 0)
      return 0;
    int uniqueIndex = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[uniqueIndex] = nums[i];
        uniqueIndex++;
      }
    }

    return uniqueIndex;
  }

  /**
   * Given a sorted integer array, returns a new array with duplicates removed. The order of
   * elements is preserved.
   *
   * @param nums Sorted integer array
   * @return Array of unique elements
   */
  public int[] removeDuplicatesFromSortedArrayReturnArray(int[] nums) {

    logger.info("Removing duplicate elements from sorted array and return unique array {}", nums);

    if (nums == null || nums.length == 0)
      return new int[0];

    int uniqueIndex = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[uniqueIndex] = nums[i];
        uniqueIndex++;
      }
    }

    int[] result = Arrays.copyOf(nums, uniqueIndex);
    logger.info("Unique elements array: {}", Arrays.toString(result));
    return result;
  }
}
