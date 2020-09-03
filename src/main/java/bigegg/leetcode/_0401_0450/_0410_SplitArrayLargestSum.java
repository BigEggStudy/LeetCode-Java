//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0401_0450;

public class _0410_SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int totalSum = 0, maxNum = 0;
        for (int num : nums) {
            totalSum += num;
            maxNum = Math.max(num, maxNum);
        }

        int lo = maxNum, hi = totalSum;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 1, currentSum = 0;
            for (int num : nums) {
                currentSum += num;
                if (currentSum > mid) {
                    count++;
                    if (count > m) break;;
                    currentSum = num;
                }
            }
            if (count <= m) hi = mid - 1;
            else lo = mid + 1;
        }

        return lo;
    }
}
