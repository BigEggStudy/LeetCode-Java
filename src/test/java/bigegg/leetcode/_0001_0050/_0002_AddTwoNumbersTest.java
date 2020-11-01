package bigegg.leetcode._0001_0050;

import bigegg.leetcode.ListNode;
import org.junit.Test;

import static bigegg.leetcode.AssertHelper.assertList;
import static bigegg.leetcode.TestHelper.generateList;

public class _0002_AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers_General() throws Exception {
        ListNode link = generateList(new int[]{2, 4, 3});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link, link);

        assertList(result, new int[]{4, 8, 6});
    }

    @Test
    public void testAddTwoNumbers_General_2() throws Exception {
        ListNode link = generateList(new int[]{0});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link, link);

        assertList(result, new int[]{0});
    }

    @Test
    public void testAddTwoNumbers_HasCarry() throws Exception {
        ListNode link1 = generateList(new int[]{2, 4, 3});
        ListNode link2 = generateList(new int[]{5, 6, 4});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{7, 0, 8});
    }

    @Test
    public void testAddTwoNumbers_HasMultipleCarry() throws Exception {
        ListNode link1 = generateList(new int[]{1});
        ListNode link2 = generateList(new int[]{9, 9});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{0, 0, 1});
    }

    @Test
    public void testAddTwoNumbers_FirstNumCarry() throws Exception {
        ListNode link1 = generateList(new int[]{3, 4, 4});
        ListNode link2 = generateList(new int[]{3, 4, 6});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{6, 8, 0, 1});
    }

    @Test
    public void testAddTwoNumbers_L1Longer() throws Exception {
        ListNode link1 = generateList(new int[]{2, 4, 3, 1});
        ListNode link2 = generateList(new int[]{5, 6, 4});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{7, 0, 8, 1});
    }

    @Test
    public void testAddTwoNumbers_L1Longer_2() throws Exception {
        ListNode link1 = generateList(new int[]{1, 8});
        ListNode link2 = generateList(new int[]{0});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{1, 8});
    }

    @Test
    public void testAddTwoNumbers_L1Empty() throws Exception {
        ListNode link1 = generateList(null);
        ListNode link2 = generateList(new int[]{1, 8});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{1, 8});
    }

    @Test
    public void testAddTwoNumbers_L2Longer() throws Exception {
        ListNode link1 = generateList(new int[]{2, 4, 3});
        ListNode link2 = generateList(new int[]{5, 6, 4, 3});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{7, 0, 8, 3});
    }

    @Test
    public void testAddTwoNumbers_L2Longer_2() throws Exception {
        ListNode link1 = generateList(new int[]{0});
        ListNode link2 = generateList(new int[]{1, 8});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{1, 8});
    }

    @Test
    public void testAddTwoNumbers_L2Empty() throws Exception {
        ListNode link1 = generateList(new int[]{1, 8});
        ListNode link2 = generateList(null);

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(link1, link2);

        assertList(result, new int[]{1, 8});
    }
}
