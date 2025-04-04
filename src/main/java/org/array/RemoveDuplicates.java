package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RemoveDuplicates {

    private static final Logger logger = LogManager.getLogger(RemoveDuplicates.class);

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        logger.info("Unique elements from array are {}", removeDuplicates(nums));

    }

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
     * each unique element appears only once. The relative order of the elements should be kept the same.
     * Then return the number of unique elements in nums.
     *
     * @param nums Integer Array
     * @return Number of unique elements
     */
    public static int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
