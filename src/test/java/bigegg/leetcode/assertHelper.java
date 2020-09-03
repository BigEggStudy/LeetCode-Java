package bigegg.leetcode;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class assertHelper {
    public static <T> void assertArrayIgnoreLength(T[] expected, T[] actual) {
        for (int i = 0; i < expected.length; i++)
            assertEquals(expected[i], actual[i]);
    }

    public static <T> void assertArray(T[] expected, T[] actual) {
        assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++)
            assertEquals(expected[i], actual[i]);
    }

    public static void assertArrayIgnoreLength(int[] expected, int[] actual) {
        for (int i = 0; i < expected.length; i++)
            assertEquals(expected[i], actual[i]);
    }

    public static void assertArray(int[] expected, int[] actual) {
        assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++)
            assertEquals(expected[i], actual[i]);
    }

    public static <T> void assertList(T[] expected, List<T> actual)
    {
        assertEquals(expected.length, actual.size());

        for (int i = 0; i < expected.length; i++)
            assertEquals(expected[i], actual.get(i));
    }
}
