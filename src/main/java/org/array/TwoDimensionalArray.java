package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TwoDimensionalArray {

    private static final Logger logger = LogManager.getLogger(TwoDimensionalArray.class);

    public static void main(String[] args) {

//        Declaration of 2D arrays
//        int[][] numbs = new int[5][5];

        int[][] numbs = {
                {1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 1, 0, 9},
                {5454, 455, 545454, 455, 5662, 1151, 54545, 89898, 132},
                {654688, 354168, 31684, 316865, 64681}
        };

        // Accessing 2D arrays elements
        for (int[] num : numbs) {
            for (int i : num) {
                logger.info(i);
            }
        }

        for (int[] num : numbs) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}