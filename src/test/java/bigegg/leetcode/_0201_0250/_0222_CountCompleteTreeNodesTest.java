package bigegg.leetcode._0201_0250;

import bigegg.leetcode.TestHelper;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _0222_CountCompleteTreeNodesTest {
    @Test
    public void testCountNodes()
    {
        _0222_CountCompleteTreeNodes solution = new _0222_CountCompleteTreeNodes();
        assertEquals(2, solution.countNodes(TestHelper.GenerateTree(new Integer[] { 1, 2 })));
        assertEquals(3, solution.countNodes(TestHelper.GenerateTree(new Integer[] { 1, 2, 3 })));
        assertEquals(4, solution.countNodes(TestHelper.GenerateTree(new Integer[] { 1, 2, 3, 4 })));
        assertEquals(5, solution.countNodes(TestHelper.GenerateTree(new Integer[] { 1, 2, 3, 4, 5 })));
        assertEquals(6, solution.countNodes(TestHelper.GenerateTree(new Integer[] { 1, 2, 3, 4, 5, 6 })));
        assertEquals(7, solution.countNodes(TestHelper.GenerateTree(new Integer[] { 1, 2, 3, 4, 5, 6, 7 })));
    }

    @Test
    public void testCountNodes_Null()
    {
        _0222_CountCompleteTreeNodes solution = new _0222_CountCompleteTreeNodes();
        assertEquals(0, solution.countNodes(null));
    }

    @Test
    public void testCountNodes_JustRoot()
    {
        _0222_CountCompleteTreeNodes solution = new _0222_CountCompleteTreeNodes();
        assertEquals(1, solution.countNodes(TestHelper.GenerateTree(new Integer[] { 1 })));
    }
}
