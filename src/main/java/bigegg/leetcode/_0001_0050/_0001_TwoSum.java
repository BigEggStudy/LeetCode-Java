//-----------------------------------------------------------------------------
// Runtime: 324ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0001_0050;

import java.util.HashMap;
import java.util.Map;

public final class _0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> restMap = new HashMap<Integer, Integer>();
        int[] result = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            if (restMap.containsKey(nums[i])) {
                result[0] = restMap.get(nums[i]) + 1;
                result[1] = i + 1;
                break;
            } else {
                restMap.put(target - nums[i], i);
            }
        }
        return result;
    }
}
