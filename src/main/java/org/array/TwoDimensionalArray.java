package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TwoDimensionalArray {

  private static final Logger logger = LogManager.getLogger(TwoDimensionalArray.class);

  public static void main(String[] args) {

    /*
      Declaration and initialization of a 2D array.
      A 2D array in Java is an array of arrays. It can be a rectangular array
      (all inner arrays have the same length) or a jagged array (each row has a different length).
      Here, we define a jagged array where each row has a different number of elements.
     */
    int[][] numbs = {{1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 1, 0, 9},          // Row 0
        {5454, 455, 545454, 455, 5662, 1151, 54545, 89898, 132}, // Row 1
        {654688, 354168, 31684, 316865, 64681}             // Row 2
    };

    /*
     * First traversal of the 2D array using enhanced for-loops.
     * We log each element using Log4j logger.
     *
     * Outer loop iterates over each row (int[]),
     * Inner loop iterates over each element (int) in the current row.
     */
    logger.info("Logging each element of the 2D array:");
    for (int[] row : numbs) {
      for (int element : row) {
        logger.info(element);
      }
    }

    /*
     * Second traversal of the 2D array to print all elements to console.
     * Each row is printed in a separate line using System.out.print.
     */
    System.out.println("\nPrinting the 2D array to the console:");
    for (int[] row : numbs) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
