package org.java8Features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

  private static final Logger logger = LogManager.getLogger(LambdaExpression.class);

  public static void main(String[] args) {

    String[] cities =
        {"Madrid", "Barcelona", "Valencia", "Seville", "Zaragoza", "Málaga", "Murcia", "Palma",
            "Las Palmas de Gran Canaria", "Bilbao", "Alicante", "Córdoba", "Valladolid", "Vigo",
            "Gijón", "L'Hospitalet de Llobregat", "La Coruña", "Vitoria-Gasteiz", "Granada",
            "Elche"};

    // Example: Using Consumer to print each city
    Arrays.stream(cities).forEach(city -> logger.info("City: {}", city));

    // Example : Using Predicate to filter cities starting with "V"
    List<String> filteredCities =
        Arrays.stream(cities).filter(city -> city.startsWith("V")).toList();
    logger.info("Cities starting with 'V': {}", filteredCities);

    // Example : Using Function to get the length of each city name
    Arrays.stream(cities).map(city -> city.length())
        .forEach(length -> logger.info("City name length: {}", length));

    // Example : Using Runnable lambda
    Runnable helloLambda = () -> logger.info("Hello from Lambda!");
    helloLambda.run();
  }
}
