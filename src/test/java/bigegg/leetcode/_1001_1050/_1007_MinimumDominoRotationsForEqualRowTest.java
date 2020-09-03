package bigegg.leetcode._1001_1050;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1007_MinimumDominoRotationsForEqualRowTest {
    @Test
    public void testMinDominoRotations_1()
    {
        _1007_MinimumDominoRotationsForEqualRow solution = new _1007_MinimumDominoRotationsForEqualRow();
        int result = solution.minDominoRotations(new int[] { 2, 1, 2, 4, 2, 2 }, new int[] { 5, 2, 6, 2, 3, 2 });
        assertEquals(2, result);
    }

    @Test
    public void testMinDominoRotations_2()
    {
        _1007_MinimumDominoRotationsForEqualRow solution = new _1007_MinimumDominoRotationsForEqualRow();
        int result = solution.minDominoRotations(new int[] { 3, 5, 1, 2, 3 }, new int[] { 3, 6, 3, 3, 4 });
        assertEquals(-1, result);
    }
}
