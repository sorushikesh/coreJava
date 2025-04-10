package org.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayElementSumTest {

  private final ArrayElementSum arrayElementSum = new ArrayElementSum();

  @Test
  void testSumOfElements_MultipleValues() {
    int[] arr = {1, 2, 3, 4, 5};
    int expectedSum = 15;
    assertEquals(expectedSum, arrayElementSum.sumOfElements(arr));
  }

  @Test
  void testSumOfElements_EmptyArray() {
    int[] arr = {};
    int expectedSum = 0;
    assertEquals(expectedSum, arrayElementSum.sumOfElements(arr));
  }

  @Test
  void testSumOfElements_NegativeValues() {
    int[] arr = {-1, -2, -3};
    int expectedSum = -6;
    assertEquals(expectedSum, arrayElementSum.sumOfElements(arr));
  }

  @Test
  void testSumOfElements_SingleElement() {
    int[] arr = {42};
    int expectedSum = 42;
    assertEquals(expectedSum, arrayElementSum.sumOfElements(arr));
  }
}
