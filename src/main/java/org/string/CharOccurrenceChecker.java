package org.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrenceChecker {

    private static final Logger logger = LogManager.getLogger(CharOccurrenceChecker.class);

    public static boolean charOccurrencesEqualMap(String input) {
        logger.info("Checking character frequency equality using Map for input: '{}'", input);

        if (input == null || input.isEmpty()) {
            logger.warn("Input is null or empty. Returning true by default.");
            return true;
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        logger.debug("Character frequency map: {}", freqMap);

        int expectedCount = -1;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int count = entry.getValue();
            if (expectedCount == -1) {
                expectedCount = count;
            } else if (count != expectedCount) {
                logger.info("Character '{}' has a different frequency: {} (expected: {})",
                        entry.getKey(), count, expectedCount);
                return false;
            }
        }

        logger.info("All characters have equal occurrences.");
        return true;
    }

    public static boolean charOccurrencesEqualStream(String input) {
        logger.info("Checking character frequency equality using Streams for input: '{}'", input);

        if (input == null || input.isEmpty()) {
            logger.warn("Input is null or empty. Returning true by default.");
            return true;
        }

        Collection<Long> frequencies = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values();

        logger.debug("Frequencies: {}", frequencies);

        boolean result = frequencies.stream().distinct().count() == 1;

        if (result) {
            logger.info("All characters have equal occurrences.");
        } else {
            logger.info("Characters have varying frequencies.");
        }

        return result;
    }

    public static void main(String[] args) {
        String[] testCases = {"aabb", "abcabc", "aabbb", "", null, "aaaa"};

        for (String testCase : testCases) {
            logger.info("----");
            logger.info("Testing with input: '{}'", testCase);
            boolean resultMap = charOccurrencesEqualMap(testCase);
            logger.info("Result (Map method): {}", resultMap);

            boolean resultStream = charOccurrencesEqualStream(testCase);
            logger.info("Result (Stream method): {}", resultStream);
        }
    }
}
