package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySorting {

  private static final Logger logger = LogManager.getLogger(ArraySorting.class);

  public static void main(String[] args) {

    int[] arr = {888888, 56, 23, 89, 12, 91, 101, 901, 9901, 99901, 6666, 9999901};
    sortNumber(arr);
    sortBasedOnDigitsSum(arr);
    sortBasedOnLength(Arrays.stream(arr).boxed().toArray(Integer[]::new));

    String[] cities =
        {"Madrid", "Barcelona", "Valencia", "Seville", "Zaragoza", "Málaga", "Murcia", "Palma",
            "Las Palmas de Gran Canaria", "Bilbao", "Alicante", "Córdoba", "Valladolid", "Vigo",
            "Gijón", "L'Hospitalet de Llobregat", "La Coruña", "Vitoria-Gasteiz", "Granada",
            "Elche"};
    sortString(cities);
    sortBasedOnLength(cities);
  }

  public static void sortNumber(int[] arr) {

    logger.info("Sorting array of number {}", arr);
    Arrays.sort(arr);
    logger.info("Sorted array : {}", arr);
  }

  public static void sortString(String[] arr) {

    logger.info("Sorting String array : {}", Arrays.toString(arr));
    Arrays.sort(arr);
    logger.info("Sorted String array : {}", Arrays.toString(arr));
  }

  public static void sortBasedOnDigitsSum(int[] arr) {

    logger.info("Original array: {}", Arrays.toString(arr));

    // Step 1: Convert int[] to Integer[] because primitive arrays cannot be sorted with custom comparators
    Integer[] boxedArr = Arrays.stream(arr).boxed()  // box each int to Integer
        .toArray(Integer[]::new); // collect into Integer[]

    // Step 2: Sort the Integer[] array using a custom comparator
    Arrays.sort(boxedArr, (a, b) -> {
      int sumA = getDigitsSum(a); // Calculate sum of digits of a
      int sumB = getDigitsSum(b); // Calculate sum of digits of b

      if (sumA != sumB) {
        // If sums are different, sort by sum
        return Integer.compare(sumA, sumB);
      } else {
        // If sums are same, sort by actual number
        return Integer.compare(a, b);
      }
    });

    // Step 3: Copy the sorted Integer[] values back into the original int[] array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = boxedArr[i];
    }

    logger.info("Sorted array based on digits sum: {}", Arrays.toString(boxedArr));
  }

  /**
   * Sorts an array based on the "length" (number of digits or characters) of each element. Works
   * for Integer[] and String[] arrays.
   *
   * @param arr the array to sort
   * @param <T> the type of elements (should be Integer or String)
   */
  public static <T> void sortBasedOnLength(T[] arr) {

    logger.info("Sorting array based on length: {}", Arrays.toString(arr));

    Arrays.sort(arr, (a, b) -> {
      int lengthA = a.toString().length();
      int lengthB = b.toString().length();
      return Integer.compare(lengthA, lengthB);
    });

    logger.info("Sorted array based on length: {}", Arrays.toString(arr));
  }


  private static int getDigitsSum(int num) {
    num = Math.abs(num);
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

}
