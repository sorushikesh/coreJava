package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayOperations {

  private static final Logger logger = LogManager.getLogger(ArrayOperations.class);

  public static void main(String[] args) {

    int[] integerArray1D =
        {1, -1, 156, 165655616, 5616516, 0, -1000, -654161651, 654161651, -1000, 165655616,
            165655616, -1000, -10000};

    logger.info("Removing duplicate elements from array");
    Arrays.sort(integerArray1D);

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    int uniqueCount = removeDuplicates.removeDuplicatesFromSortedArrayReturnIndex(integerArray1D);
    int[] uniqueArray = removeDuplicates.removeDuplicatesFromSortedArrayReturnArray(integerArray1D);

    logger.info("Unique count: {}", uniqueCount);
    logger.info("Unique array: {}", Arrays.toString(uniqueArray));

    logger.info("Shuffling array elements");

    // Convert int[] to List<Integer> for shuffling
    List<Integer> shuffleList = new ArrayList<>();
    for (int num : integerArray1D) {
      shuffleList.add(num);
    }

    // Shuffle
    Collections.shuffle(shuffleList);

    // Convert back to int[]
    integerArray1D = shuffleList.stream().mapToInt(Integer::intValue).toArray();

    logger.info("Shuffled array: {}", Arrays.toString(integerArray1D));

    logger.info("Finding max element value from array");
    MaxElementArray maxElementArray = new MaxElementArray();
    maxElementArray.findMax(integerArray1D);

    logger.info("Finding minimum element value from array");
    MinElementArray minElementArray = new MinElementArray();
    minElementArray.findMin(integerArray1D);

    logger.info("Reverse array");
    ReverseArray reverseArray = new ReverseArray();
    integerArray1D = reverseArray.reverseArray(integerArray1D);
    logger.info("Array after reversing {}", integerArray1D);

    integerArray1D = reverseArray.reverseArrayUsingCollections(integerArray1D);
    logger.info("Array after reversing {}", integerArray1D);
  }
}
