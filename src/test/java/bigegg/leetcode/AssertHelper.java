package bigegg.leetcode;

import java.util.List;

import static org.junit.Assert.*;

public class AssertHelper {
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

    public static void assertList(ListNode first, int[] nums) {
        assertNotNull(first);
        assertNotNull(nums);
        assertTrue(nums.length > 0);

        ListNode current = first;
        for (int num : nums) {
            assertNotNull(current);
            assertEquals(num, current.val);
            current = current.next;
        }

        assertNull(current);
    }
}
