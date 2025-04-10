package org.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinElementArrayTest {

  private final MinElementArray minElementArray = new MinElementArray();

  @Test
  public void testFindMin_positiveNumbers() {
    int[] arr = {5, 3, 9, 1, 6};
    int min = minElementArray.findMin(arr);
    assertEquals(1, min);
  }

  @Test
  public void testFindMin_negativeNumbers() {
    int[] arr = {-5, -9, -3, -1};
    int min = minElementArray.findMin(arr);
    assertEquals(-9, min);
  }

  @Test
  public void testFindMin_mixedNumbers() {
    int[] arr = {-2, 4, 0, -7, 5};
    int min = minElementArray.findMin(arr);
    assertEquals(-7, min);
  }

  @Test
  public void testFindMin_singleElement() {
    int[] arr = {99};
    int min = minElementArray.findMin(arr);
    assertEquals(99, min);
  }

  @Test
  public void testFindMin_allSame() {
    int[] arr = {4, 4, 4, 4};
    int min = minElementArray.findMin(arr);
    assertEquals(4, min);
  }

  @Test
  public void testFindMin_emptyArray() {
    int[] arr = {};
    int min = minElementArray.findMin(arr);
    assertEquals(Integer.MAX_VALUE, min);
  }
}
