package bigegg.leetcode._0801_0850;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class _0843_GuesstheWordTest {
    @Test
    public void testFindSecretWord()
    {
        String[] wordlist = new String[] { "acckzz", "ccbazz", "eiowzz", "abcczz" };
        _0843_GuesstheWord.Master master = new _0843_GuesstheWord.Master("acckzz", wordlist);

        _0843_GuesstheWord solution = new _0843_GuesstheWord();
        solution.findSecretWord(wordlist, master);

        assertTrue(master.guessCount <= 10);
    }
}
