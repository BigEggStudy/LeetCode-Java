//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 40.6 MB
// Link: https://leetcode.com/submissions/detail/427726059/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0601_0650;

public class _0605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            if (count >= n) return true;
        }

        return false;
    }
}
