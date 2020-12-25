//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 39.2 MB
// Link: https://leetcode.com/submissions/detail/429503192/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0051_0100;

public class _0080_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) count++;
            else count = 1;

            if (count <= 2)
                nums[j++] = nums[i];
        }
        return j;
    }
}
