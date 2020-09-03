package bigegg.leetcode._0001_0050;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _0003_LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        String input = "abcabcbb";

        _0003_LongestSubstringWithoutRepeatingCharacters solution = new _0003_LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring(input);

        assertEquals(3, result);
    }

    @Test
    public void testLengthOfLongestSubstring_RepeatChars() throws Exception {
        String input = "bbbbb";

        _0003_LongestSubstringWithoutRepeatingCharacters solution = new _0003_LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring(input);

        assertEquals(1, result);
    }

    @Test
    public void testLengthOfLongestSubstring_EmptyInput() throws Exception {
        _0003_LongestSubstringWithoutRepeatingCharacters solution = new _0003_LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring("");

        assertEquals(0, result);
    }

    @Test
    public void testLengthOfLongestSubstring_LongString() throws Exception {
        String input = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

        _0003_LongestSubstringWithoutRepeatingCharacters solution = new _0003_LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring(input);

        assertEquals(26, result);
    }

    @Test
    public void testLengthOfLongestSubstring_LongString_HaveShortRepeat() throws Exception {
        String input = "abcdefghijklmnopqrstuvwxyzabcdefghijk  lmnopqrstuvwxyz";

        _0003_LongestSubstringWithoutRepeatingCharacters solution = new _0003_LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring(input);

        assertEquals(27, result);
    }
}
