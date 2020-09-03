package bigegg.leetcode._0401_0450;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _0410_SplitArrayLargestSumTest {
    @Test
    public void testSplitArray()
    {
        _0410_SplitArrayLargestSum solution = new _0410_SplitArrayLargestSum();
        assertEquals(18, solution.splitArray(new int[] {7, 2, 5, 10, 8}, 2));
    }

    @Test
    public void testSplitArray_EmptyArray()
    {
        _0410_SplitArrayLargestSum solution = new _0410_SplitArrayLargestSum();
        assertEquals(0, solution.splitArray(new int[] {}, 2));
    }

    @Test
    public void testSplitArray_OneItem()
    {
        _0410_SplitArrayLargestSum solution = new _0410_SplitArrayLargestSum();
        assertEquals(2, solution.splitArray(new int[] {2}, 1));
    }
}
