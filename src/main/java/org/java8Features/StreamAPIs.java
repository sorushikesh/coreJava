package org.java8Features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIs {

  private static final Logger logger = LogManager.getLogger(StreamAPIs.class);

  public static void main(String[] args) {
    filterAndSumEvenNumbers();
    mapExample();
    sortExample();
    distinctExample();
    collectExample();
    reduceExample();
  }

  /**
   * Example: Filter even numbers and sum them
   */
  public static void filterAndSumEvenNumbers() {
    int[] arr = {1, 2, 3, 3, 3, 5, 4, 6, 7, 8, 9, 8, 88, 44, 66, 22, 78, 48, 15, 26, 28, 24};

    int sum = 0;
    for (int num : arr) {
      if (num % 2 == 0) {
        sum += num;
      }
    }
    logger.info("Sum using traditional way: {}", sum);

    int streamSum = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();
    logger.info("Sum using Stream API: {}", streamSum);
  }

  /**
   * Example: Map each number to its square
   */
  public static void mapExample() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());

    logger.info("Squares: {}", squares);
  }

  /**
   * Example: Sort numbers in ascending order
   */
  public static void sortExample() {
    List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7);

    List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

    logger.info("Sorted Numbers: {}", sortedNumbers);
  }

  /**
   * Example: Remove duplicates using distinct
   */
  public static void distinctExample() {
    List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

    List<Integer> distinctNumbers =
        numbersWithDuplicates.stream().distinct().collect(Collectors.toList());

    logger.info("Distinct Numbers: {}", distinctNumbers);
  }

  /**
   * Example: Collect even numbers into a list
   */
  public static void collectExample() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    List<Integer> evenNumbers =
        numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

    logger.info("Even Numbers Collected: {}", evenNumbers);
  }

  /**
   * Example: Reduce to get product of all numbers
   */
  public static void reduceExample() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    int product = numbers.stream().reduce(1, (a, b) -> a * b);

    logger.info("Product of Numbers: {}", product);
  }
}
