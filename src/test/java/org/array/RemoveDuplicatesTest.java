package org.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

  private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

  @Test
  public void testRemoveDuplicates_allUnique() {
    int[] nums = {1, 2, 3, 4, 5};
    int uniqueCount = removeDuplicates.removeDuplicatesFromSortedArrayReturnIndex(nums);
    assertEquals(5, uniqueCount);
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, copyArray(nums, uniqueCount));
  }

  @Test
  public void testRemoveDuplicates_allSame() {
    int[] nums = {7, 7, 7, 7, 7};
    int uniqueCount = removeDuplicates.removeDuplicatesFromSortedArrayReturnIndex(nums);
    assertEquals(1, uniqueCount);
    assertArrayEquals(new int[] {7}, copyArray(nums, uniqueCount));
  }

  @Test
  public void testRemoveDuplicates_mixedDuplicates() {
    int[] nums = {1, 1, 2, 2, 3, 3, 4};
    int uniqueCount = removeDuplicates.removeDuplicatesFromSortedArrayReturnIndex(nums);
    assertEquals(4, uniqueCount);
    assertArrayEquals(new int[] {1, 2, 3, 4}, copyArray(nums, uniqueCount));
  }

  @Test
  public void testRemoveDuplicates_singleElement() {
    int[] nums = {10};
    int uniqueCount = removeDuplicates.removeDuplicatesFromSortedArrayReturnIndex(nums);
    assertEquals(1, uniqueCount);
    assertArrayEquals(new int[] {10}, copyArray(nums, uniqueCount));
  }

  @Test
  public void testRemoveDuplicates_emptyArray() {
    int[] nums = {};
    int uniqueCount = removeDuplicates.removeDuplicatesFromSortedArrayReturnIndex(nums);
    assertEquals(0, uniqueCount);
  }

  @Test
  public void testRemoveDuplicates_twoElementsWithOneDuplicate() {
    int[] nums = {2, 2};
    int uniqueCount = removeDuplicates.removeDuplicatesFromSortedArrayReturnIndex(nums);
    assertEquals(1, uniqueCount);
    assertArrayEquals(new int[] {2}, copyArray(nums, uniqueCount));
  }

  private int[] copyArray(int[] nums, int length) {
    int[] result = new int[length];
    System.arraycopy(nums, 0, result, 0, length);
    return result;
  }

  @Test
  public void testAllUnique() {
    int[] input = {1, 2, 3, 4, 5};
    int[] result = removeDuplicates.removeDuplicatesFromSortedArrayReturnArray(input);
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, result);
  }

  @Test
  public void testAllDuplicates() {
    int[] input = {7, 7, 7, 7};
    int[] result = removeDuplicates.removeDuplicatesFromSortedArrayReturnArray(input);
    assertArrayEquals(new int[] {7}, result);
  }

  @Test
  public void testMixedDuplicates() {
    int[] input = {1, 1, 2, 3, 3, 4, 5, 5};
    int[] result = removeDuplicates.removeDuplicatesFromSortedArrayReturnArray(input);
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, result);
  }

  @Test
  public void testSingleElement() {
    int[] input = {42};
    int[] result = removeDuplicates.removeDuplicatesFromSortedArrayReturnArray(input);
    assertArrayEquals(new int[] {42}, result);
  }

  @Test
  public void testEmptyArray() {
    int[] input = {};
    int[] result = removeDuplicates.removeDuplicatesFromSortedArrayReturnArray(input);
    assertArrayEquals(new int[] {}, result);
  }

  @Test
  public void testTwoDuplicates() {
    int[] input = {3, 3};
    int[] result = removeDuplicates.removeDuplicatesFromSortedArrayReturnArray(input);
    assertArrayEquals(new int[] {3}, result);
  }
}
