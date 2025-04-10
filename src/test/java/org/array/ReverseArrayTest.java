package org.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseArrayTest {

  private final ReverseArray reverseArray = new ReverseArray();

  @Test
  void testReverseArray() {
    int[] original = {1, 2, 3, 4, 5};
    int[] expected = {5, 4, 3, 2, 1};

    int[] result = reverseArray.reverseArray(original);

    assertArrayEquals(expected, result, "The array should be reversed");
  }

  @Test
  void testReverseArray_SingleElement() {
    int[] original = {42};
    int[] expected = {42};

    int[] result = reverseArray.reverseArray(original);

    assertArrayEquals(expected, result, "A single element array should remain unchanged");
  }

  @Test
  void testReverseArray_Empty() {
    int[] original = {};
    int[] expected = {};

    int[] result = reverseArray.reverseArray(original);

    assertArrayEquals(expected, result, "An empty array should return empty");
  }

  @Test
  void testReverseArrayUsingCollections() {
    int[] original = {10, 20, 30, 40};
    int[] expected = {40, 30, 20, 10};

    int[] result = reverseArray.reverseArrayUsingCollections(original);

    assertArrayEquals(expected, result, "The array should be reversed using Collections");
  }
}
