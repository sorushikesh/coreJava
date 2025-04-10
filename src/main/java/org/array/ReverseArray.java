package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

  private static final Logger log = LogManager.getLogger(ReverseArray.class);

  protected int[] reverseArray(int[] arr) {

    log.info("Reverse the order of array {}", Arrays.toString(arr));

    int[] reverseArray = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      reverseArray[i] = arr[arr.length - 1 - i];
    }

    log.info("Reversed array {}", Arrays.toString(reverseArray));
    return reverseArray;
  }

  protected int[] reverseArrayUsingCollections(int[] arr) {

    log.info("Reverse the order of array using collections: {}", Arrays.toString(arr));

    // Converting int array to Integer array
    Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);

    Collections.reverse(Arrays.asList(integers));

    // Converting Integer array to int
    int[] reverseArray = Arrays.stream(integers).mapToInt(Integer::intValue).toArray();

    log.info("Reversed array using collections: {}", Arrays.toString(reverseArray));
    return reverseArray;
  }
}
