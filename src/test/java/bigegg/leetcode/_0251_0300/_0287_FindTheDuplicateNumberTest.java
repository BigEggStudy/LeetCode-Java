package bigegg.leetcode._0251_0300;

import bigegg.leetcode.testHelper;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _0287_FindTheDuplicateNumberTest {
    @Test
    public void testFindDuplicate()
    {
        _0287_FindTheDuplicateNumber solution = new _0287_FindTheDuplicateNumber();
        assertEquals(2, solution.findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
        assertEquals(3, solution.findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
    }
}
