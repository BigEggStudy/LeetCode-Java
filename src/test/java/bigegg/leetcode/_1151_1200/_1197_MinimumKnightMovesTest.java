package bigegg.leetcode._1151_1200;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1197_MinimumKnightMovesTest {
    @Test
    public void testMinKnightMoves_1()
    {
        _1197_MinimumKnightMoves solution = new _1197_MinimumKnightMoves();
        int result = solution.minKnightMoves(2, 1);
        assertEquals(1, result);
    }

    @Test
    public void testMinKnightMoves_2()
    {
        _1197_MinimumKnightMoves solution = new _1197_MinimumKnightMoves();
        int result = solution.minKnightMoves(5, 5);
        assertEquals(4, result);
    }
}
