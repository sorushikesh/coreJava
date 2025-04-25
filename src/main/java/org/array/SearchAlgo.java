package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SearchAlgo {

  private static final Logger logger = LogManager.getLogger(SearchAlgo.class);

  public static void main(String[] args) {

    int[] arr = {-20, -15, -10, -5, 0, 3, 8, 12, 15, 17, 19, 23, 27, 30, 33, 36, 40, 45, 49, 53};
    Arrays.sort(arr);
    int target = 27;

    logger.info("Sorted array: {}", Arrays.toString(arr));
    logger.info("Searching for: {}", target);

    logger.info("Linear Search: Index = {}", linearSearch(arr, target));
    logger.info("Binary Search: Index = {}", binarySearch(arr, target));
    logger.info("Jump Search: Index = {}", jumpSearch(arr, target));
    logger.info("Interpolation Search: Index = {}", interpolationSearch(arr, target));
    logger.info("Exponential Search: Index = {}", exponentialSearch(arr, target));
  }

  // 1. Linear Search - O(n)
  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target)
        return i;
    }
    return -1;
  }

  // 2. Binary Search - O(log n) for sorted arrays
  public static int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;

    while (low <= high) {
      // Finding mid-point
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }

  // 3. Jump Search - O(√n) for sorted arrays
  public static int jumpSearch(int[] arr, int target) {
    int length = arr.length;
    int blockSize = (int) Math.sqrt(length);
    int start = 0;
    int next = blockSize;

    while (start < length && arr[Math.min(next, length) - 1] < target) {
      start = next;
      next += blockSize;
    }

    for (int i = start; i < Math.min(next, length); i++) {
      if (arr[i] == target)
        return i;
    }

    return -1;
  }

  // 4. Interpolation Search - O(log log n) best case, O(n) worst case
  public static int interpolationSearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;

    while (low <= high && target >= arr[low] && target <= arr[high]) {
      if (low == high) {
        if (arr[low] == target)
          return low;
        return -1;
      }

      // Estimate position
      int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

      if (arr[pos] == target)
        return pos;
      if (arr[pos] < target)
        low = pos + 1;
      else
        high = pos - 1;
    }

    return -1;
  }

  // 5. Exponential Search - O(log i), i is position of target
  public static int exponentialSearch(int[] arr, int target) {
    if (arr[0] == target)
      return 0;

    int i = 1;
    while (i < arr.length && arr[i] <= target) {
      i *= 2;
    }

    return binarySearch(Arrays.copyOfRange(arr, i / 2, Math.min(i, arr.length)), target);
  }
}

