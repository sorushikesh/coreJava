package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySorting {

  private static final Logger logger = LogManager.getLogger(ArraySorting.class);

  public static void main(String[] args) {

    int[] arr = {1, 2, 5, 6, 3, 4, 8, 96, 3, 2, 2, 8, 55, 2, 3, 5, 100, 4, 5, 55, 6333, 66};
    sortNumber(arr);

    String[] cities =
        {"Madrid", "Barcelona", "Valencia", "Seville", "Zaragoza", "Málaga", "Murcia", "Palma",
            "Las Palmas de Gran Canaria", "Bilbao", "Alicante", "Córdoba", "Valladolid", "Vigo",
            "Gijón", "L'Hospitalet de Llobregat", "La Coruña", "Vitoria-Gasteiz", "Granada",
            "Elche"};
    sortString(cities);
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
}
