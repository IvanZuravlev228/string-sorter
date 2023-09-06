package string.sorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 *
 * Implement in single class.
 */
public class StringSorter {
    /**
     * The StringSorter class defines the contract for sorting strings based on
     * alphabetical order while skipping words that start with a specific prefix.
     *
     * Example:
     *  Input: ["apple", "banana", "grape", "avocado", "cherry"], Exception prefix: "a"
     *  Output: ["banana", "cherry", "grape", "avocado", "apple"]
     *
     *  Here, "banana", "cherry", and "grape" are sorted in alphabetical order
     *  whereas "avocado" and "apple" (that start with 'a') are sorted in reverse alphabetical order
     *  at the end of the list.
     */
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {
        if (unsortedStrings.isEmpty()) {
            return unsortedStrings;
        }
        exceptionChar = exceptionChar.toLowerCase();
        List<String> startWithExpChar = new ArrayList<>();
        for (int i = 0; i < unsortedStrings.size(); i++) {
            String curr = unsortedStrings.get(i);
            if (curr.startsWith(exceptionChar)) {
                startWithExpChar.add(curr);
                unsortedStrings.remove(i--);
            }
        }
        unsortedStrings.sort(Comparator.comparing(String::toLowerCase));
        startWithExpChar.sort((firstString, secondString) -> secondString.toLowerCase().compareTo(firstString.toLowerCase()));

        List<String> result = new ArrayList<>(unsortedStrings);
        result.addAll(startWithExpChar);
        return result;
    }
}