package org.collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionBasics {

  private static final Logger logger = LogManager.getLogger(CollectionBasics.class);

  public static void main(String[] args) {

    Collection<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    logger.info("Fruits: {}", fruits);

    logger.info("Contains Mango? {}", fruits.contains("Mango"));

    fruits.remove("Banana");
    logger.info("After removing Banana: {}", fruits);

    logger.info("Size: {}", fruits.size());

    Iterator<String> iterator = fruits.iterator();
    logger.info("Iterating: ");
    while (iterator.hasNext()) {
      logger.info("{} ", iterator.next());
    }
  }
}

