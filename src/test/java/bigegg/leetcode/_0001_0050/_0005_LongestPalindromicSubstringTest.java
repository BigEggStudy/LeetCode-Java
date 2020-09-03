package bigegg.leetcode._0001_0050;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _0005_LongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindrome_Odd() {
        String input = "abcdefgfedcba";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("abcdefgfedcba", result);
    }

    @Test
    public void testLongestPalindrome_Even() {
        String input = "abcdefggfedcba";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("abcdefggfedcba", result);
    }

    @Test
    public void testLongestPalindrome_AllTheSame_Odd() {
        String input = "ccc";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("ccc", result);
    }

    @Test
    public void testLongestPalindrome_AllTheSame_Even() {
        String input = "aaaaaaaaaa";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("aaaaaaaaaa", result);
    }

    @Test
    public void testLongestPalindrome_EmptyString() {
        String input = "";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("", result);
    }

    @Test
    public void testLongestPalindrome_OneCharacter() {
        String input = "a";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("a", result);
    }

    @Test
    public void testLongestPalindrome_MultiplePalindrome_LongestAtStart() {
        String input = "aabccdccbaaeeggee";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("aabccdccbaa", result);
    }

    @Test
    public void testLongestPalindrome_MultiplePalindrome_LongestAtEnd() {
        String input = "eegffgeeaabcdcbaa";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("aabcdcbaa", result);
    }

    @Test
    public void testLongestPalindrome_MultipleMixPalindrome() {
        String input = "abcdcbbcd";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("dcbbcd", result);
    }

    @Test
    public void testLongestPalindrome_MultipleMixPalindrome_2() {
        String input = "abcddcbebcd";

        _0005_LongestPalindromicSubstring solution = new _0005_LongestPalindromicSubstring();
        String result = solution.longestPalindrome(input);

        assertEquals("dcbebcd", result);
    }
}
