import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.StringSorter;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorterTest {
    @Test
    public void testSortStringsWithExceptionPrefixA() {
        StringSorter sorter = new StringSorter();
        String[] inputArr = {"apple", "banana", "grape", "avocado", "cherry"};
        String[] expectedArr = {"banana", "cherry", "grape", "avocado", "apple"};
        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        String exceptionPrefix = "a";
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        assertEquals(expected, sorter.sortStrings(input, exceptionPrefix));
    }

    @Test
    public void testSortStringsWithExceptionUpperCasePrefixA() {
        StringSorter sorter = new StringSorter();
        String[] inputArr = {"apple", "banana", "grape", "avocado", "cherry"};
        String[] expectedArr = {"banana", "cherry", "grape", "avocado", "apple"};
        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        String exceptionPrefix = "A";
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        assertEquals(expected, sorter.sortStrings(input, exceptionPrefix));
    }

    @Test
    public void testSortStringsWithExceptionPrefixH() {
        StringSorter sorter = new StringSorter();
        String[] inputArr = {"dog", "grape", "honey", "cherry", "hamburger", "elephant", "apple", "hockey", "horse", "banana"};
        String[] expectedArr = {"apple", "banana", "cherry", "dog", "elephant", "grape", "horse", "honey", "hockey", "hamburger"};
        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        String exceptionPrefix = "h";
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        assertEquals(expected, sorter.sortStrings(input, exceptionPrefix));
    }

    @Test
    public void testSortUpperCaseStringsWithExceptionPrefixH() {
        StringSorter sorter = new StringSorter();
        String[] inputArr = {"dOg", "GraPe", "honeY", "cheRRy", "hAmbuRger", "eLephanT", "aPPle", "hoCKey", "hORSe", "BANANA"};
        String[] expectedArr = {"aPPle", "BANANA", "cheRRy", "dOg", "eLephanT", "GraPe", "hORSe", "honeY", "hoCKey", "hAmbuRger"};
        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        String exceptionPrefix = "h";
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        assertEquals(expected, sorter.sortStrings(input, exceptionPrefix));
    }

    @Test
    public void testSortStringsWithEmptyInputList() {
        StringSorter sorter = new StringSorter();
        List<String> input = Arrays.asList();
        String exceptionPrefix = "a";
        List<String> expected = Arrays.asList();
        assertEquals(expected, sorter.sortStrings(input, exceptionPrefix));
    }

    @Test
    public void testSortStringsWithNoWordsStartingWithExceptionPrefix() {
        StringSorter sorter = new StringSorter();
        String[] inputArr = {"apple", "banana", "grape", "cherry"};
        String[] expectedArr = {"apple", "banana", "cherry", "grape"};
        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        String exceptionPrefix = "z";
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        assertEquals(expected, sorter.sortStrings(input, exceptionPrefix));
    }

    @Test
    public void testSortStringsWithAllWordsStartingWithExceptionPrefix() {
        StringSorter sorter = new StringSorter();
        String[] inputArr = {"apex", "apricot", "avocado", "apple"};
        String[] expectedArr = {"avocado", "apricot", "apple", "apex"};
        List<String> input = Arrays.stream(inputArr).collect(Collectors.toList());
        String exceptionPrefix = "a";
        List<String> expected = Arrays.stream(expectedArr).collect(Collectors.toList());
        assertEquals(expected, sorter.sortStrings(input, exceptionPrefix));
    }
}
