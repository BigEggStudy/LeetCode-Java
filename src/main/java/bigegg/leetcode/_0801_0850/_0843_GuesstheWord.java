//-----------------------------------------------------------------------------
// Runtime: 1ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._0801_0850;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class _0843_GuesstheWord {
    public void findSecretWord(String[] wordlist, Master master) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++)
        {
            String guess = wordlist[rand.nextInt(wordlist.length)];
            int x = master.guess(guess);
            List<String> wordlist2 = new ArrayList<>();
            for (String w : wordlist)
                if (computeWords(guess, w) == x)
                    wordlist2.add(w);
            wordlist = wordlist2.toArray(new String[wordlist2.size()]);
        }
    }

    private int computeWords(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++)
            if (word1.charAt(i) == word2.charAt(i))
                count++;

        return count;
    }

    public static class Master
    {
        private String secret;
        private HashSet<String> wordlist;

        public Master(String secret, String[] wordlist)
        {
            this.secret = secret;
            this.wordlist = new HashSet<String>();
            for (String word : wordlist) this.wordlist.add((word));

            guessCount = 0;
        }

        public int guessCount;

        public int guess(String word)
        {
            guessCount++;
            if (this.secret.length() != word.length()) { return -1; }
            if (!wordlist.contains(word)) { return -1; }

            int count = 0;
            for (int i = 0; i < word.length(); i++)
                if (word.charAt(i) == secret.charAt(i))
                    count++;

            return count;
        }
    }
}
