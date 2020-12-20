//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 38.9 MB
// Link: https://leetcode.com/submissions/detail/422409035/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0051_0100;

public class _0081_SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int loValue = nums[lo];
            int hiValue = nums[hi];
            if (loValue < hiValue && (target < loValue || target > hiValue))
                return false;

            while (lo < hi && nums[lo] == hiValue)
                lo++;
            loValue = nums[lo];

            int mid = lo + (hi - lo) / 2;
            int midValue = nums[mid];
            if (target == midValue) return true;

            if (loValue <= midValue) {
                if (loValue <= target && target < midValue)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else {
                if (target <= hiValue && midValue < target)
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }

        return false;
    }
}
