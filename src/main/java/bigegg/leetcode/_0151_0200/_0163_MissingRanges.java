//-----------------------------------------------------------------------------
// Runtime: 5ms
// Memory Usage: 37.5 MB
// Link: https://leetcode.com/submissions/detail/428699086/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0151_0200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _0163_MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int n = nums.length;
        if (n == 0)
            return Collections.singletonList(formatRange(lower, upper));

        List<String> missingRanges = new ArrayList<>();
        if (nums[0] > lower)
            missingRanges.add(formatRange(lower, nums[0] - 1));

        for (int i = 1; i < n; ++i)
            if (nums[i] - nums[i - 1] > 1)
                missingRanges.add(formatRange(nums[i - 1] + 1, nums[i] - 1));

        if (nums[n - 1] < upper)
            missingRanges.add(formatRange(nums[n - 1] + 1, upper));

        return missingRanges;
    }

    private String formatRange(int lower, int upper) {
        if (lower == upper)
            return String.valueOf(lower);
        else
            return lower + "->" + upper;
    }
}
