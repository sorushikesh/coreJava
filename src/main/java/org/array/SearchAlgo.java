package org.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SearchAlgo {

    private static final Logger logger = LogManager.getLogger(SearchAlgo.class);

    public static void main(String[] args) {

        int[] arr = {2084171847, -2006587196, -1979079119, -1893139696, -1891551907, -1840078287,
                -1833963477, -1741640953, -1663925889, -1594099665, -1578129846, -1566275253,
                -1462952686, -1396799060, -1294990203, -1290195443, -1254644668, -1216187311, -1161965643,
                -1114361304, -1053307034, -1047758998, -1035657773, -990473096, -929625187, -899933473,
                -841668302, -826432875, -768102790, -754565086, -709983047, -662229976, -601320950,
                -596955115, -546828619, -518893797, -312511216, -312396967, -188003382, -144205175,
                -124884050, -14756737, -3217584, 12132619, 43796544, 67816000, 108254119, 166638459,
                287880332, 320113196, 460671669, 513457157, 515660013, 609844307, 621962180, 649499138,
                733354995, 745259382, 840584643, 905067020, 912577816, 945422121, 985113575, 1024064431,
                1057344369, 1070481867, 1092962740, 1213998694, 1223599687, 1248025520, 1306813896,
                1329756864, 1354547699, 1413189316, 1420611027, 1420614176, 1467886164, 1487758880,
                1495695813, 1536910671, 1554881709, 1556457960, 1625638912, 1626013553, 1665829810,
                1679923463, 1698392575, 1701638984, 1714952003, 1716833443, 1743836291, 1777924278,
                1793086643, 1824886844, 1840808140, 1889339088, 1912999330, 1917647060, 1964406555,
                1974344984};

        // Sorting array as binary search need sorted array
        Arrays.sort(arr);

        int target = 1974344984;
        logger.info("Searching for value: {}", target);

        int linearResult = linearSearch(arr, target);
        if (linearResult != -1) {
            logger.info("Linear Search - Found at index: {}", linearResult);
        } else {
            logger.warn("Linear Search - Value not found!");
        }

        int binaryResult = binarySearch(arr, target);
        if (binaryResult != -1) {
            logger.info("Binary Search - Found at index: {}", binaryResult);
        } else {
            logger.warn("Binary Search - Value not found!");
        }
    }

    /**
     * Linear search algorithm - Time complexity: O(n)
     * Searches each element in the array sequentially.
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search algorithm - Time complexity: O(log n)
     * Searches in a sorted array by dividing search range in half each step.
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                low = mid + 1; // Look in the right half
            } else {
                high = mid - 1; // Look in the left half
            }
        }

        return -1; // Target not found
    }
}
