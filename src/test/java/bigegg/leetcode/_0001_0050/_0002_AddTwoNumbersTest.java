package bigegg.leetcode._0001_0050;

import bigegg.leetcode._0001_0050._0002_AddTwoNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class _0002_AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers_General() throws Exception {
        _0002_AddTwoNumbers.ListNode link = GenerateList(new int[]{2, 4, 3});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link, link);

        AssertList(result, new int[]{4, 8, 6});
    }

    @Test
    public void testAddTwoNumbers_General_2() throws Exception {
        _0002_AddTwoNumbers.ListNode link = GenerateList(new int[]{0});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link, link);

        AssertList(result, new int[]{0});
    }

    @Test
    public void testAddTwoNumbers_HasCarry() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{2, 4, 3});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{5, 6, 4});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{7, 0, 8});
    }

    @Test
    public void testAddTwoNumbers_HasMultipleCarry() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{1});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{9, 9});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{0, 0, 1});
    }

    @Test
    public void testAddTwoNumbers_FirstNumCarry() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{3, 4, 4});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{3, 4, 6});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{6, 8, 0, 1});
    }

    @Test
    public void testAddTwoNumbers_L1Longer() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{2, 4, 3, 1});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{5, 6, 4});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{7, 0, 8, 1});
    }

    @Test
    public void testAddTwoNumbers_L1Longer_2() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{1, 8});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{0});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{1, 8});
    }

    @Test
    public void testAddTwoNumbers_L1Empty() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(null);
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{1, 8});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{1, 8});
    }

    @Test
    public void testAddTwoNumbers_L2Longer() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{2, 4, 3});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{5, 6, 4, 3});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{7, 0, 8, 3});
    }

    @Test
    public void testAddTwoNumbers_L2Longer_2() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{0});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(new int[]{1, 8});

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{1, 8});
    }

    @Test
    public void testAddTwoNumbers_L2Empty() throws Exception {
        _0002_AddTwoNumbers.ListNode link1 = GenerateList(new int[]{1, 8});
        _0002_AddTwoNumbers.ListNode link2 = GenerateList(null);

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();
        _0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(link1, link2);

        AssertList(result, new int[]{1, 8});
    }

    private _0002_AddTwoNumbers.ListNode GenerateList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        _0002_AddTwoNumbers solution = new _0002_AddTwoNumbers();

        int i = 0;
        _0002_AddTwoNumbers.ListNode first = solution.new ListNode(nums[i]);
        _0002_AddTwoNumbers.ListNode current = first;

        while (++i < nums.length) {
            current.next = solution.new ListNode(nums[i]);
            current = current.next;
        }

        return first;
    }

    private void AssertList(_0002_AddTwoNumbers.ListNode first, int[] nums) {
        assertNotNull(first);
        assertNotNull(nums);
        assertTrue(nums.length > 0);

        _0002_AddTwoNumbers.ListNode current = first;
        for (int num : nums) {
            assertNotNull(current);
            assertEquals(num, current.val);
            current = current.next;
        }

        assertNull(current);
    }
}
