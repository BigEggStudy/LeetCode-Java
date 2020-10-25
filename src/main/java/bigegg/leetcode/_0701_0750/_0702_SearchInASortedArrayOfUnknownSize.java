//-----------------------------------------------------------------------------
// Runtime: 2ms
// Memory Usage: 40.1 MB
// Link: https://leetcode.com/submissions/detail/412135281/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0701_0750;

/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

public class _0702_SearchInASortedArrayOfUnknownSize {
    public int search(ArrayReader reader, int target) {
        if (reader.get(0) == target) {
            return 0;
        }

        int left = 0, right = 1;
        while (reader.get(right) < target) {
            left = right;
            right <<= 1;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = reader.get(mid);

            if (num == target) return mid;
            if (num > target) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }

    public class ArrayReader
    {
        private int[] arr;

        public ArrayReader(int[] arr)
        {
            this.arr = arr;
        }

        public int get(int index)
        {
            if (index >= arr.length) return Integer.MAX_VALUE;
            return arr[index];
        }
    }
}
