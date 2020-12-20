//-----------------------------------------------------------------------------
// Runtime: 0ms
// Memory Usage: 37.1 MB
// Link: https://leetcode.com/submissions/detail/432702688/
//-----------------------------------------------------------------------------

package bigegg.leetcode._0851_0900;

public class _0880_DecodedStringAtIndex {
    public String decodeAtIndex(String S, int K) {
        int N = S.length();
        long size = 0;

        for (int i = 0; i < N; ++i) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) size *= c - '0';
            else size++;
        }

        for (int i = N-1; i >= 0; i--) {
            char c = S.charAt(i);
            K %= size;
            if (K == 0 && Character.isLetter(c))
                return Character.toString(c);

            if (Character.isDigit(c))
                size /= c - '0';
            else
                size--;
        }

        return "";
    }
}
