package org.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxElementArrayTest {

  private final MaxElementArray maxElementArray = new MaxElementArray();

  @Test
  public void testFindMax_positiveNumbers() {
    int[] arr = {3, 5, 1, 9, 2};
    int max = maxElementArray.findMax(arr);
    assertEquals(9, max);
  }

  @Test
  public void testFindMax_negativeNumbers() {
    int[] arr = {-10, -3, -7, -1};
    int max = maxElementArray.findMax(arr);
    assertEquals(-1, max);
  }

  @Test
  public void testFindMax_mixedNumbers() {
    int[] arr = {-2, 0, 4, -1, 8};
    int max = maxElementArray.findMax(arr);
    assertEquals(8, max);
  }

  @Test
  public void testFindMax_singleElement() {
    int[] arr = {42};
    int max = maxElementArray.findMax(arr);
    assertEquals(42, max);
  }

  @Test
  public void testFindMax_allSame() {
    int[] arr = {7, 7, 7, 7};
    int max = maxElementArray.findMax(arr);
    assertEquals(7, max);
  }

  @Test
  public void testFindMax_emptyArray() {
    int[] arr = {};
    int max = maxElementArray.findMax(arr);
    assertEquals(Integer.MIN_VALUE, max);
  }
}
