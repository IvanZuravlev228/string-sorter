package string.sorter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorterTest {
    private final StringSorter sorter = new StringSorter();

    @Test
    public void testSortStringsWithExceptionPrefixA() {
        String[] inputArr = {"apple", "banana", "grape", "avocado", "cherry"};
        String[] expectedArr = {"banana", "cherry", "grape", "avocado", "apple"};
        String exceptionPrefix = "a";

        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSortStringsWithExceptionUpperCasePrefixA() {
        String[] inputArr = {"apple", "banana", "grape", "avocado", "cherry"};
        String[] expectedArr = {"banana", "cherry", "grape", "avocado", "apple"};
        String exceptionPrefix = "A";

        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSortStringsWithExceptionPrefixH() {
        String[] inputArr = {"dog", "grape", "honey", "cherry", "hamburger", "elephant", "apple", "hockey", "horse", "banana"};
        String[] expectedArr = {"apple", "banana", "cherry", "dog", "elephant", "grape", "horse", "honey", "hockey", "hamburger"};
        String exceptionPrefix = "h";

        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSortUpperCaseStringsWithExceptionPrefixH() {
        String[] inputArr = {"dOg", "GraPe", "honeY", "cheRRy", "hAmbuRger", "eLephanT", "aPPle", "hoCKey", "hORSe", "BANANA"};
        String[] expectedArr = {"aPPle", "BANANA", "cheRRy", "dOg", "eLephanT", "GraPe", "hORSe", "honeY", "hoCKey", "hAmbuRger"};
        String exceptionPrefix = "h";

        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSortStringsWithEmptyInputList() {
        String exceptionPrefix = "a";

        List<String> input = List.of();
        List<String> expected = List.of();
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSortStringsWithNoWordsStartingWithExceptionPrefix() {
        String[] inputArr = {"apple", "banana", "grape", "cherry"};
        String[] expectedArr = {"apple", "banana", "cherry", "grape"};
        String exceptionPrefix = "z";

        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSortStringsWithAllWordsStartingWithExceptionPrefix() {
        String[] inputArr = {"apex", "apricot", "avocado", "apple"};
        String[] expectedArr = {"avocado", "apricot", "apple", "apex"};
        String exceptionPrefix = "a";

        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        List<String> actual = sorter.sortStrings(input, exceptionPrefix);

        assertEquals(expected, actual);
    }
}
