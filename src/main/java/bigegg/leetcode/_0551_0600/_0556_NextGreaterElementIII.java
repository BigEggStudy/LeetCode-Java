//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 35.7 MB
// Link: https://leetcode.com/submissions/detail/433800597/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0551_0600;

public class _0556_NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        char[] a = String.valueOf(n).toCharArray();
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1])
            i--;
        if (i < 0)
            return -1;

        int j = a.length - 1;
        while (j >= 0 && a[j] <= a[i])
            j--;
        swap(a, i, j);
        reverse(a, i + 1);

        try {
            return Integer.parseInt(new String(a));
        } catch (Exception e) {
            return -1;
        }
    }

    private void reverse(char[] a, int start) {
        int i = start, j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    private void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
