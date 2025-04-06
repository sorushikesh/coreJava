package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayScenarios {

  private static final Logger logger = LogManager.getLogger(ArrayScenarios.class);

  public static void main(String[] args) {

    // Array declaration
    int[] numbers = {1, 3, 5, 7, 9, 11, 13, 8999, -1};

    // Accessing elements from array
    logger.info("Element at 1st : {}", numbers[0]);

    // Modifying elements
    numbers[0] = 23;
    logger.info("Element at 1st : {}", numbers[0]);

    // Iterating through array
    int i = 0;
    for (int num : numbers) {
      logger.info("Element at {} position is {}", i, num);
      i++;
    }

    // Finding maximum and minimum
    int max = numbers[0];
    int min = numbers[0];
    for (int num : numbers) {
      if (num > max) {
        max = num;
      }

      if (num < min) {
        min = num;
      }
    }
    logger.info("Maximum int value in num array {} is {}", numbers, max);
    logger.info("Minimum int value in num array {} is {}", numbers, min);

    // Cloning array
    int[] cloned = numbers.clone();

    // Copying array
    int[] copy1 = new int[numbers.length];
    System.arraycopy(numbers, 0, copy1, 0, numbers.length);

    int[] copy2 = Arrays.copyOf(numbers, numbers.length);

    logger.info("Original array: {}", Arrays.toString(numbers));
    logger.info("Cloned array  : {}", Arrays.toString(cloned));
    logger.info("Copy1 (arraycopy): {}", Arrays.toString(copy1));
    logger.info("Copy2 (Arrays.copyOf): {}", Arrays.toString(copy2));

    // Print hash codes (memory identity)
    logger.info("\n--- Hash Codes (memory location approx) ---");
    logger.info("Original hash: {}", System.identityHashCode(numbers));
    logger.info("Cloned hash  : {}", System.identityHashCode(cloned));
    logger.info("Copy1 hash   : {}", System.identityHashCode(copy1));
    logger.info("Copy2 hash   : {}", System.identityHashCode(copy2));

    // Extra check: same content but different memory
    logger.info("\n--- Are they pointing to the same object? ---");
    logger.info("original == cloned: {}", numbers == cloned);
    logger.info("original == copy1 : {}", numbers == copy1);
    logger.info("original == copy2 : {}", numbers == copy2);
    logger.info(
        "All copies have different hash codes, confirming they are stored in different memory locations.");

    // Sorting array
    Arrays.sort(numbers);
    logger.info("Sorted array {}", numbers);
  }
}
