import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String currentString = s.substring(i, i + k);

            if (currentString.compareTo(largest) > 0) {
                largest = currentString;
            }
            if (currentString.compareTo(smallest) < 0) {
                smallest = currentString;

            }
        }


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
