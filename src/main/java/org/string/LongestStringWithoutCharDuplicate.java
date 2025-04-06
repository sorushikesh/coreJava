package org.string;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LongestStringWithoutCharDuplicate {

  private static final Logger logger =
      LogManager.getLogger(LongestStringWithoutCharDuplicate.class);

  public static int longestSubstringBruteForce(String s) {

    int maxLength = 0;

    for (int i = 0; i < s.length(); i++) {
      List<Character> seen = new ArrayList<>();
      for (int j = i; j < s.length(); j++) {
        if (seen.contains(s.charAt(j))) {
          break;
        }
        seen.add(s.charAt(j));
        maxLength = Math.max(maxLength, seen.size());
      }
    }

    return maxLength;
  }

  public static int longestSubstringSlidingWindow(String s) {
    int left = 0;
    int maxLength = 0;
    HashSet<Character> set = new HashSet<>();

    for (int right = 0; right < s.length(); right++) {
      while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
      }
      set.add(s.charAt(right));
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }

  public static int longestSubstringOptimized(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < s.length(); right++) {
      if (map.containsKey(s.charAt(right))) {
        left = Math.max(map.get(s.charAt(right)) + 1, left);
      }
      map.put(s.charAt(right), right);
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }

  public static void main(String[] args) {
    String testString = "pwwkew";
    logger.info("Starting computation for test string: {}", testString);
    int result = longestSubstringBruteForce(testString);
    logger.info("Result: {}", result);
  }
}
