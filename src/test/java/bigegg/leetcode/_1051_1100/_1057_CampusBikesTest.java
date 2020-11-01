package bigegg.leetcode._1051_1100;

import bigegg.leetcode.AssertHelper;
import org.junit.Test;

public class _1057_CampusBikesTest {
    @Test
    public void testAssignBikes_1()
    {
        _1057_CampusBikes solution = new _1057_CampusBikes();
        int[] result = solution.assignBikes(
                new int[][] {
                        new int[] {0, 0},
                        new int[] {2, 1}
                },
                new int[][] {
                        new int[] {1, 2},
                        new int[] {3, 3}
                });
        AssertHelper.assertArray(new int[] {1, 0}, result);
    }

    @Test
    public void testAssignBikes_2()
    {
        _1057_CampusBikes solution = new _1057_CampusBikes();
        int[] result = solution.assignBikes(
                new int[][] {
                        new int[] {0, 0},
                        new int[] {1, 1},
                        new int[] {2, 0}
                },
                new int[][] {
                        new int[] {1, 0},
                        new int[] {2, 2},
                        new int[] {2, 1}
                });
        AssertHelper.assertArray(new int[] {0, 2, 1}, result);
    }
}
