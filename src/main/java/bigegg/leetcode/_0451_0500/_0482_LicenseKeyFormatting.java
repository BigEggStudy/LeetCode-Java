//-----------------------------------------------------------------------------
// Runtime: 14ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0451_0500;

public class _0482_LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--)
            if (S.charAt(i) != '-') {
                if (sb.length() % (K + 1) == K) sb.append('-');
                sb.append(S.charAt(i));
            }
        return sb.reverse().toString().toUpperCase();
    }
}
