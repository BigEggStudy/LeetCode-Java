//-----------------------------------------------------------------------------
// Runtime: 596ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0001_0050;

public class _0004_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length + nums2.length;
        if (m % 2 == 1) {
            return findKth(nums1, 0, nums2, 0, (m + 1) / 2);
        } else {
            return (findKth(nums1, 0, nums2, 0, (m + 1) / 2) + findKth(nums1, 0, nums2, 0, (m + 1) / 2 + 1)) / 2.0;
        }
    }

    private int findKth(int[] nums1, int startIndex1, int[] nums2, int startIndex2, int k) {
        int nums1Left = nums1.length - startIndex1;
        int nums2Left = nums2.length - startIndex2;

        if (nums1Left < nums2Left) {
            return findKth(nums2, startIndex2, nums1, startIndex1, k);
        }
        if (nums2Left <= 0) {
            return nums1[startIndex1 + k - 1];
        }
        if (k == 1) {
            return nums1[startIndex1] < nums2[startIndex2] ? nums1[startIndex1] : nums2[startIndex2];
        }

        int index1 = k / 2 < nums1Left ? k / 2 : nums1Left;
        int index2 = k - index1 < nums2Left ? k - index1 : nums2Left;
        if (nums1[startIndex1 + index1 - 1] > nums2[startIndex2 + index2 - 1]) {
            return findKth(nums1, startIndex1, nums2, startIndex2 + index2, k - index2);
        } else if (nums1[startIndex1 + index1 - 1] < nums2[startIndex2 + index2 - 1]) {
            return findKth(nums1, startIndex1 + index1, nums2, startIndex2, k - index1);
        } else {
            return nums1[startIndex1 + index1 - 1];
        }
    }
}
